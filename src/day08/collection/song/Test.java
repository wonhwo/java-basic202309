package day08.collection.song;

public class Test {
    public static void main(String[] args) {
        ArtistRepository ar=new ArtistRepository();
//        ar.Registrater("뉴진스","아름다운 구속");
//        ar.Registrater("뉴진스","슈퍼샤이");
//        ar.Registrater("뉴진스","ETA");

        System.out.println(ArtistRepository.getArtistList());
    }
}
