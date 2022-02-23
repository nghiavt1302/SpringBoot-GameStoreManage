package repository;

import entity.GameEntity;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface GameRepository extends JpaRepository<GameEntity, Integer> {
    List<GameEntity> findAllByGameConsoleId(int gameConsoleId, Pageable pageable);
    List<GameEntity> findAllByGameMaxNoPlayersIsLessThanEqual(int gameMaxNoPlayers, Pageable pageable);
    List<GameEntity> findAllByGameMinMemorySizeIsLessThanEqual(int gameMinMemorySize, Pageable pageable);
    List<GameEntity> findAllByGameNameContaining(String gameName, PageRequest pageable);
    @Query(nativeQuery = true, value = "SELECT * FROM games WHERE Games_id=?1")
    GameEntity findByGameId(int id);
}
