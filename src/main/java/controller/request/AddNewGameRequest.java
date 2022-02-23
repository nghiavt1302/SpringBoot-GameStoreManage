package controller.request;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class AddNewGameRequest {
    private String gameName;
    private float minMemorySize;
    private int maxNoPlayers;
    private String gameDetails;
    private int gameConsoleId;
}
