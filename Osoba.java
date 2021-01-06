package sk.richard.uloha;

public class Osoba implements Meratelny {

	 private String meno;
	    private double vyska;
	    
	    /**
	     * vytvara osobu s menom a vyskou
	     * @param meno meno osoby
	     * @param vyska vyska osoby
	     */
		public Osoba(String meno, double vyska) {
			
			this.meno = meno;
			this.vyska = vyska;
		}
	
		

		/**
		 * vrati meno osoby
		 * @return meno
		 */
	    public String getMeno()
	    {
	        return meno;
	    }

	    /**
	       Vrati vysku osoby
	    */
	    public double getVyska()
	    {
	        return vyska;
	    }
		@Override
		public double getInfo() {
			// TODO Auto-generated method stub
			return vyska;
		}
		@Override
		public String toString() {
			return "Osoba [meno=" + meno + ", vyska=" + vyska + "]";
		}

}
