package entity;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@Entity
@Table(name = "games")
public class GameEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Games_id")
    private int gameId;

    @Column(name = "games_name")
    private String gameName;

    @Column(name = "min_memory_size")
    private float gameMinMemorySize;

    @Column(name ="max_no_players")
    private int gameMaxNoPlayers;

    @Column(name = "details")
    private String gameDetails;

    @Column(name = "console_fk")
    private int gameConsoleId;
}
