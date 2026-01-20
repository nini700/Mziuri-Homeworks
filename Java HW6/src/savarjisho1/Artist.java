package savarjisho1;

import java.util.ArrayList;
import java.util.List;

public class Artist {
    private String name;
    private List<Album> albums;

    public Artist(String name) {
        this.name = name;
        this.albums = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    public void addAlbum(Album album) {
        albums.add(album);
        System.out.println("ალბომი '" + album.getName() + "' დაემატა არტისტს '" + name + "'");
    }

    public void removeAlbum(Album album) {
        albums.remove(album);
        System.out.println("ალბომი '" + album.getName() + "' წაიშალა არტისტისგან '" + name + "'");
    }

    public void displayInfo() {
        System.out.println("\n      ");
        System.out.println("║ არტისტი: " + name);
        System.out.println("      ");

        if (albums.isEmpty()) {
            System.out.println("არტისტს არ აქვს ალბომები");
        } else {
            for (Album album : albums) {
                album.displayInfo();
            }
        }
    }
}