package savarjisho1;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String name;
    private int releaseYear;
    private List<Music> musics;

    public Album(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.musics = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public List<Music> getMusics() {
        return musics;
    }

    public void setMusics(List<Music> musics) {
        this.musics = musics;
    }

    public void addMusic(Music music) {
        musics.add(music);
        System.out.println("სიმღერა '" + music.getTitle() + "' დაემატა ალბომში '" + name + "'");
    }

    public void removeMusic(Music music) {
        musics.remove(music);
        System.out.println("სიმღერა '" + music.getTitle() + "' წაიშალა ალბომიდან '" + name + "'");
    }

    public void displayInfo() {
        System.out.println("\n=== ალბომი: " + name + " (" + releaseYear + ") ===");
        if (musics.isEmpty()) {
            System.out.println("ალბომი ცარიელია");
        } else {
            for (Music music : musics) {
                System.out.println("  - " + music.getTitle() +
                        " (" + music.getDuration() + " წთ, " +
                        music.getGenre() + ")");
            }
        }
    }
}