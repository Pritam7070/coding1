package REST10.bitcoin;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BitcoinRepo extends JpaRepository<BitcoinEntity,Integer> {

}
