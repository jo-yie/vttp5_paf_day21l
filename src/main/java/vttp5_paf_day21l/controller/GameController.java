package vttp5_paf_day21l.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import vttp5_paf_day21l.model.Game;
import vttp5_paf_day21l.service.GameService;

@Controller
public class GameController {

    @Autowired
    private GameService gameService; 

    @GetMapping("/")
    public String getHomePage() {

        return "home";

    }
    

    @GetMapping("/games")
    public ModelAndView getGames(@RequestParam(defaultValue = "5") int count) { 

        List<Game> games = gameService.getGames(count);
        ModelAndView mav = new ModelAndView("games");
        mav.addObject("games", games);
        mav.setStatus(HttpStatusCode.valueOf(200));
        return mav;

    }
    
}