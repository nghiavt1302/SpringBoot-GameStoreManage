package services;

import controller.response.GameListResponse;
import entity.GameEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import repository.GameRepository;

import java.util.List;

@Service
public class GameServiee {
    @Autowired
    GameRepository gameRepo;

    public GameListResponse getGameByNameKeyword(String keyword, String order, String orderBy, int pgNum){
        Sort sort = Sort.by(Sort.Direction.ASC, orderBy);
        if(order.equals("DESC")){
            sort = Sort.by(Sort.Direction.DESC, orderBy);
        }
        PageRequest pageRequest = PageRequest.of(pgNum,3, sort);

        GameListResponse response = new GameListResponse();
        List<GameEntity> gameData = gameRepo.findAllByGameNameContaining(keyword, pageRequest);
        response.setGamesData(gameData);
        response.setCode(200);
        response.setMessage("Success!");
        return response;
    }

    public GameEntity addNewGame(GameEntity newGame){
        return gameRepo.save(newGame);
    }

    public String deleteGame(int gameId){
        GameEntity gameEntity = gameRepo.findById(gameId).orElse(null);
        if(gameEntity == null){
            System.out.println("Game ID not found: " + gameId);
            return null;
        }
        gameRepo.delete(gameEntity);
        return "Deleted " + gameEntity.getGameName() + ", ID: " + gameEntity.getGameId();
    }
}
