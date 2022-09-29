package com.example.retropodden;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class episodeRepository {

    @Autowired
    private JdbcTemplate db;

    public List<Episode> hentEpisoder() {
        String sql = "SELECT * FROM episoder";
        return (db.query(sql, new BeanPropertyRowMapper(Episode.class)));
    }
}
