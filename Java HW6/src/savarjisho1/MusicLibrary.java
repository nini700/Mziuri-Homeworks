package savarjisho1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicLibrary {
    private List<Artist> artists;
    private List<Album> albums;
    private List<Music> songs;

    public MusicLibrary() {
        this.artists = new ArrayList<>();
        this.albums = new ArrayList<>();
        this.songs = new ArrayList<>();
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    public List<Music> getSongs() {
        return songs;
    }

    public void setSongs(List<Music> songs) {
        this.songs = songs;
    }

    public void addArtist(Artist artist) {
        artists.add(artist);
        System.out.println("არტისტი '" + artist.getName() + "' დაემატა ბიბლიოთეკაში");
    }

    public void removeArtist(Artist artist) {
        artists.remove(artist);
        System.out.println("არტისტი '" + artist.getName() + "' წაიშალა ბიბლიოთეკიდან");
    }

    public void addAlbum(Album album) {
        albums.add(album);
        for (Music music : album.getMusics()) {
            if (!songs.contains(music)) {
                songs.add(music);
            }
        }
        System.out.println("ალბომი '" + album.getName() + "' დაემატა ბიბლიოთეკაში");
    }

    public void removeAlbum(Album album) {
        albums.remove(album);
        System.out.println("ალბომი '" + album.getName() + "' წაიშალა ბიბლიოთეკიდან");
    }

    public void addSong(Music music) {
        songs.add(music);
        System.out.println("სიმღერა '" + music.getTitle() + "' დაემატა ბიბლიოთეკაში");
    }

    public void removeSong(Music music) {
        songs.remove(music);
        System.out.println("სიმღერა '" + music.getTitle() + "' წაიშალა ბიბლიოთეკიდან");
    }

    public Music searchMusic(String title) {
        for (Music music : songs) {
            if (music.getTitle().equalsIgnoreCase(title)) {
                System.out.println("სიმღერა ნაპოვნია!");
                return music;
            }
        }
        System.out.println("სიმღერა '" + title + "' ვერ მოიძებნა");
        return null;
    }

    public Music giveRandomMusic() {
        if (songs.isEmpty()) {
            System.out.println("ბიბლიოთეკა ცარიელია");
            return null;
        }
        Random random = new Random();
        int index = random.nextInt(songs.size());
        Music randomMusic = songs.get(index);
        System.out.println("შემთხვევითი სიმღერა: " + randomMusic.getTitle());
        return randomMusic;
    }

    public void displayAllInfo() {
        System.out.println("\n       ");
        System.out.println("█   მუსიკალური ბიბლიოთეკა   █");
        System.out.println("      ");
        System.out.println("არტისტები: " + artists.size());
        System.out.println("ალბომები: " + albums.size());
        System.out.println("სიმღერები: " + songs.size());

        for (Artist artist : artists) {
            artist.displayInfo();
        }
    }
}