package challenge;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "scripts")
public class Quote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "actor")
    private String actor;
    
    @Column(name = "detail")
    private String quote;
    
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
	    this.id = id;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
	    this.actor = actor;
	}

	public String getQuote() {
		return this.quote;
	}

	public void setQuote(String quote) {
	    this.quote = quote;
	}

    @Override
    public String toString() {
        return "Quote [id=" + id + ", actor=" + actor + ", quote=" + quote
                + "]";
    }

}
