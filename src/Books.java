
public class Books extends Elementi {

    
    private String autore;
    private String genere;
    
    
    public Books(Long ISBN, String title, int annoPubblicazione, int pagine, String autore, String genere) {
	super(ISBN, title, annoPubblicazione, pagine);
	// TODO Auto-generated constructor stub
	
	this.autore = autore;
	this.genere = genere;
    }
    
    public String getAutore() {
	return autore;
    }
    
    public String getGenere() {
	return genere;
    }
    
    public void setAutore(String autore) {
	this.autore = autore;
    }
    
    public void setGenere(String genere) {
	this.genere = genere;
    }
    
    @Override
	public String toString() {
		return this.getISBN() + "-" + this.getTitle() + "-" + this.getAnnoPubblicazione() + "-"
				+ this.getPagine() + "-" + this.getAutore() + "-" + this.getGenere() + "-";
	}
        

}
