package sk.richard.uloha;

public class OsobaTester {
	
	 public static void main(String[] args)
	    {
	      
	
	        MnozinaDat data = new MnozinaDat();
	        
	        data.pridaj(new Osoba("Igor", 183));
	        data.pridaj(new Osoba("Peter", 158));
	        data.pridaj(new Osoba("Monika", 175));
	      //  data.pridaj(new Osoba("Antoan", 201));
	        
	        Osoba najvyssiaOsoba = (Osoba) data.getMaximum();
	        
	     
	        System.out.println("Meno najvyssej osoby: " + najvyssiaOsoba.getMeno() + " s vyskou " + najvyssiaOsoba.getVyska());
	 

	        System.out.println("Priemerna vyska osob " + data.getPriemer());
	        
	        Osoba najnizsia = (Osoba) data.getMinimum();
	        System.out.println("Najnizsia osoba je : " + najnizsia.getMeno() +" s  vyskou "+ najnizsia.getVyska());

	    }
	

}
