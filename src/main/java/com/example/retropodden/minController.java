package com.example.retropodden;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class minController {

    @Autowired
    private episodeRepository rep;

    @GetMapping("/hentEpisoder")
    public List<Episode> hentEpisodene() {
        return rep.hentEpisoder();
    }
}

