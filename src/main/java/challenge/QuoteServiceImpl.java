package challenge;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuoteServiceImpl implements QuoteService {

	@Autowired
	private QuoteRepository repository;

	@Override
	public Quote getQuote() {
	    Optional<List<Quote>> quotes = Optional.ofNullable(repository.findAll());
	    if (quotes.isPresent()) {
	        Collections.shuffle(quotes.get());
	        return quotes.get().get(0);
        }
	    return new Quote();
	}

	@Override
	public Quote getQuoteByActor(String actor) {
	    Optional<List<Quote>>  quotes =  Optional.ofNullable(repository.findByActor(actor));
	    if (!quotes.isPresent()) {
	        throw new ResourceNotFoundException("Quote not found");
	    }
	    Collections.shuffle(quotes.get());
	    return quotes.get().get(0);
	}

}
