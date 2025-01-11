package vttp5_paf_day21l.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vttp5_paf_day21l.model.Game;
import vttp5_paf_day21l.repo.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository; 

    public List<Game> getGames() { 

        return gameRepository.getGames(5);

    }

    public List<Game> getGames(int count) {

        return gameRepository.getGames(count);

    }
    
}
