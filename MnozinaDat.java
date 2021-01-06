package sk.richard.uloha;

public class MnozinaDat {
	private Meratelny maximum;
	private Meratelny minimum;
	private int pocetPrvkov;
	private double sucet;
	/**
	 * pridava osobu do mnoziny dat
	 * @param dataStudentov
	 */
	public void pridaj(Meratelny dataStudentov) {
		if(pocetPrvkov==0 || dataStudentov.getInfo()>maximum.getInfo()) {
			maximum = dataStudentov;
		}
		if (pocetPrvkov==0|| dataStudentov.getInfo()<minimum.getInfo()) {
			minimum= dataStudentov;
		}
		pocetPrvkov++;
		sucet+=dataStudentov.getInfo();
		
	}
	/**
	 * vracia maxima
	 * @return
	 */
	public Meratelny getMaximum() {
		return maximum;
		
	}
	/**
	 * vracia minima
	 * @return
	 */
	public Meratelny getMinimum() {
		return minimum;
	}
	/**
	 * vracia priemer vysok
	 * @return sucet deli pocetPrvkov
	 */
	public double getPriemer() {
		return sucet/pocetPrvkov;
		
	}
	


	
	
	

}
