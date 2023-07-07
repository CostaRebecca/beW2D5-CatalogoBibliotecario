
public abstract class Elementi {
    
    private Long ISBN;
    private String title;
    private int annoPubblicazione;
    private int pagine;
    
    public Elementi(Long ISBN, String title, int annoPubblicazione, int pagine) {
        this.ISBN = ISBN;
        this.title = title;
        this.annoPubblicazione = annoPubblicazione;
        this.pagine = pagine;
    }
    
    public Long getISBN() {
	return ISBN;
	
    }
    
    public String getTitle() {
	return title;
    }
    
    public int getAnnoPubblicazione() {
	return	annoPubblicazione;
    }
    
    public int getPagine() {
	return pagine;
    }
    
    public void setISBN(Long ISBN) {
	this.ISBN = ISBN;
    }
    
    public void setAnnoPubblicazione(int annoPubblicazione) {
	this.annoPubblicazione = annoPubblicazione;
    }
    
    public void setTitle(String title) {
	this.title = title;
    }
}
