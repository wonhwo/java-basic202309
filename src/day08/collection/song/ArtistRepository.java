package day08.collection.song;

import day10.io.rw.FilePath;

import java.io.*;
import java.util.*;

public class ArtistRepository {
    //key: 가수이름, value: 가수객체
    private static Map<String, Artist> artistList;

    static {
        artistList = new HashMap<>();
    }

    public int getSize() {
        return artistList.size();
    }

    public void newRegistrater(String singer, String singTitle) {
        //신규가수 정보 생성
        Artist artist1 = new Artist(singer, new HashSet<>());
        //생성된 노래 목록에 전달받은 노래 추가
        artist1.getSongList().add(singTitle);
        //3. 가수 정보를 map에 저장
        artistList.put(singer, artist1);
    }

    /*
     * @param singer 사용자의 입력 가수이름
     * @param singtitme - 사용자의 입력 노래 이름
     * @return - 곡명 중복 여부
     */
    public boolean Register(String singer, String singTitle) {
        //1. Map에서 기존가수 객체를 가져옴
        Artist artist = getArtist(singer);

        // 기존 가수의 노래 목록에 추가
        boolean flag = artist.getSongList().add(singTitle);

        return flag;
    }

    private static Artist getArtist(String singer) {
        return artistList.get(singer);
    }

    //가수명을 전달받아 현재 등록된 가수인지 확인하는 기능
    public boolean isRegistered(String singer) {
        return artistList.containsKey(singer);
    }

    public void search(String singer) {
            Artist artist = getArtist(singer);
            Set<String> s = artist.getSongList();
            List<String> songArray = new ArrayList<>(s);
            for (int i = 0; i < s.size(); i++) {
                System.out.printf("* %d. %s\n", i+1, songArray.get(i));
            }
    }

    public static Map<String, Artist> getArtistList() {
        return artistList;
    }
    // 세이브 기능
    public void autoSave() {
        // 폴더 생성
        File f = new File(FilePath.path + "/music");
        if (!f.exists()) f.mkdir();

        try (FileOutputStream fos = new FileOutputStream(FilePath.path + "/music/song.sav")) {

            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(artistList);

        } catch (Exception e) {

        }
    }
    // 로드 기능
    public void loadFile() {

        // 세이브 파일이 있는지 확인
        File f = new File(FilePath.path + "/music/song.sav");

        if (f.exists()) { // 해당 세이브파일이 존재하면 로드 진행
            try (FileInputStream fis = new FileInputStream(FilePath.path + "/music/song.sav")) {

                ObjectInputStream ois = new ObjectInputStream(fis);

                artistList = (Map<String, Artist>) ois.readObject();

            } catch (Exception e) {

            }
        }
    }
}
