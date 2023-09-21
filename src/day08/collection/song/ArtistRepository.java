package day08.collection.song;

import java.util.*;

public class ArtistRepository {
    //key: 가수이름, value: 가수객체
    private static Map<String ,Artist> artistList;

    static {
        artistList=new HashMap<>();
    }

    public int getSize() {
        return artistList.size();
    }

    public void Registrater(String singer, String singTitle) {
        Artist existingArtist = artistList.get(singer);

        // 이미 존재하는 가수인 경우
        if (existingArtist != null) {
            Set<String> s= artistList.get(singer).getSongList();
            if(s.contains(singTitle)){
                System.out.println(singTitle+"곡은 이미 등록된 노래입니다.");
                return;
            }
            // 기존 가수의 노래 목록에 추가
            existingArtist.getSongList().add(singTitle);

            System.out.println(s);
            System.out.println("#" + singer + "님의 노래목록에 " + singTitle + "곡이 추가되었습니다.");
        } else {
            // 새로운 가수라면 새 Artist 객체 생성하여 추가
            Set<String> title = new HashSet<>();

            title.add(singTitle);
            artistList.put(singer, new Artist(singer, title));
            System.out.println("#" + singer + "님이 신규 등록되었습니다.");
        }
    }

    public void search(String singer) {
        Artist existingArtist = artistList.get(singer);
        System.out.println("#" +singer+"님의 노래목록");
        System.out.println("=============================");

        try {
            Set<String> s = existingArtist.getSongList();
            String[] songArray = new String[s.size()];
            int index = 0;
            for (String song : s) {
                songArray[index++] = song;
            }
            for (int i = 0; i <songArray.length; i++) {
                System.out.printf("* %d. %s\n",i+1,songArray[i]);
            }

        }catch (NullPointerException e){
            System.out.println("해당 가수는 등록되지 않았습니다.");
        }



    }
}
