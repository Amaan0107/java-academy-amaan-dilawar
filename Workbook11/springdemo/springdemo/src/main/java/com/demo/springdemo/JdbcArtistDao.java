package com.demo.springdemo;

import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcArtistDao implements ArtistDao {

    private final DataSource dataSource;

    public JdbcArtistDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<Artist> getAll() {
        List<Artist> artists = new ArrayList<>();
        String sql = "SELECT id, name, album_title, song_title FROM artistdb";

        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Artist artist = new Artist(
                        rs.getString("name"),
                        rs.getString("album_title"),
                        rs.getString("song_title")
                );
                artists.add(artist);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return artists;
    }

    // ----------------------------------------------------------
    // 1. GET BY ID
    // ----------------------------------------------------------
    @Override
    public Artist getById(int id) {
        String sql = "SELECT name, album_title, song_title FROM artistdb WHERE id = ?";

        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new Artist(
                            rs.getString("name"),
                            rs.getString("album_title"),
                            rs.getString("song_title")
                    );
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return null; // Not found
    }

    // ----------------------------------------------------------
    // 2. INSERT ARTIST
    // ----------------------------------------------------------
    @Override
    public int insert(Artist artist) {
        String sql = "INSERT INTO artistdb (name, album_title, song_title) VALUES (?, ?, ?)";

        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setString(1, artist.name);
            ps.setString(2, artist.albumTitle);
            ps.setString(3, artist.songTitle);

            int rows = ps.executeUpdate();

            // Optional: return generated ID
            try (ResultSet keys = ps.getGeneratedKeys()) {
                if (keys.next()) {
                    return keys.getInt(1);
                }
            }

            return rows;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // ----------------------------------------------------------
    // 3. UPDATE ARTIST
    // ----------------------------------------------------------
    @Override
    public int update(int id, Artist artist) {
        String sql = """
                UPDATE artistdb 
                SET name = ?, album_title = ?, song_title = ? 
                WHERE id = ?
                """;

        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, artist.name);
            ps.setString(2, artist.albumTitle);
            ps.setString(3, artist.songTitle);
            ps.setInt(4, id);

            return ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // ----------------------------------------------------------
    // 4. DELETE ARTIST
    // ----------------------------------------------------------
    @Override
    public int delete(int id) {
        String sql = "DELETE FROM artistdb WHERE id = ?";

        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            return ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}