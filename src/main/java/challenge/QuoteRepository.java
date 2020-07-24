package challenge;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuoteRepository extends CrudRepository<Quote, Long>{
    
    List<Quote> findAll();
    
    Optional<Quote> findByActor(String actor);
}
