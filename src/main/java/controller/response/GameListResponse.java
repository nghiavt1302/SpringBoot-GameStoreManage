package controller.response;

import entity.GameEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class GameListResponse {
    private int code;
    private String message;
    private List<GameEntity> gamesData;
}
