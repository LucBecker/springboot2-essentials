package academy.devdojo.springboot2essentials.repository;

import academy.devdojo.springboot2essentials.entity.Anime;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnimeRepository extends JpaRepository<Anime, Long> {

    List<Anime> findByName(String name);
}
