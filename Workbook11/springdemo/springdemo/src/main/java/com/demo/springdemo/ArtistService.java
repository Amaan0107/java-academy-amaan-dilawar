package com.demo.springdemo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistService {

    private final ArtistDao artistDao;

    public ArtistService(ArtistDao artistDao) {
        this.artistDao = artistDao;
    }

    public Artist getFavoriteArtist() {
        // for now just return the first artist from the DB
        List<Artist> all = artistDao.getAll();
        return all.isEmpty() ? null : all.get(0);
    }

    public List<Artist> getAllArtists() {
        return artistDao.getAll();
    }

    public Artist getArtistById(int id) {
        return artistDao.getById(id);
    }

    public int addArtist(Artist artist) {
        return artistDao.insert(artist);
    }

    public int updateArtist(int id, Artist artist) {
        return artistDao.update(id, artist);
    }

    public int deleteArtist(int id) {
        return artistDao.delete(id);
    }
}


//import org.springframework.stereotype.*;
//import java.util.List;
//
//@Service
//class ArtistService {
//    public Artist getFavoriteArtist() {
//        return new Artist("The Weekend",
//                "After Hours",
//                "Blinding Lights");
//    }
//
//    public List<Artist> getAllArtists() {
//        return List.of(
//                new Artist("The Weekend", "After Hours", "Blinding Lights"),
//                new Artist("Adele", "21", "Rolling in the Deep"),
//                new Artist("Coldplay", "Parachutes", "Yellow")
//        );
//    }
//
//
//    public Artist getArtistByName(String name) {
//
//        for (Artist artist : getAllArtists()) {
//            if (artist.name.equalsIgnoreCase(name)) {
//                return artist;
//
//            }
//        }
//        return null;
//    }
//}
