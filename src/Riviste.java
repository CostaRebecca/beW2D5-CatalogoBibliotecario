
public class Riviste extends Elementi {
    private Periodicita periodicita;
    
    public Riviste(Long ISBN, String title, int annoPubblicazione, int pagine, Periodicita periodicita) {
	super(ISBN, title, annoPubblicazione, pagine);
	// TODO Auto-generated constructor stub
	
	this.periodicita = periodicita;
    }
    
    
    public Periodicita getPeriodicita() {
	return periodicita;
}
    public void setPeriodicita(Periodicita periodicita) {
	this.periodicita = periodicita;
}
    
    @Override
	public String toString() {
		return this.getISBN() + "-" + this.getTitle() + "-" + this.getAnnoPubblicazione() + "-"
				+ this.getPagine() + "-" + this.getPeriodicita() + "-";
	}


    

}
