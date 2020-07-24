package challenge;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/quote")
public class QuoteController {

	@Autowired
	private QuoteService service;

	@GetMapping
	public Quote getQuote() {
	    Optional<Quote> quote = Optional.ofNullable(service.getQuote()); 
		return quote.orElseThrow(() -> new ResourceNotFoundException("Quote not found"));
	}

	public Quote getQuoteByActor(String actor) {
		return service.getQuoteByActor(actor);
	}

}
