package menjacnica;

import java.util.GregorianCalendar;

public class Valuta {

	private String nazivValute;
	private String skraceniNazivValute;
	private GregorianCalendar datum;
	private double prodajni, kupovni, srednji;
	
	public String getNazivValute() {
		return nazivValute;
	}
	public void setNazivValute(String nazivValute) {
		if(nazivValute == null || nazivValute.isEmpty())
			throw new RuntimeException("Naziv valute nije unet!");
		this.nazivValute = nazivValute;
	}
	public String getSkraceniNazivValute() {
		return skraceniNazivValute;
	}
	public void setSkraceniNazivValute(String skraceniNazivValute) {
		if (skraceniNazivValute == null || skraceniNazivValute.isEmpty())
			throw new RuntimeException("Skracen naziv valute nije unet!");
		this.skraceniNazivValute = skraceniNazivValute;
	}
	public GregorianCalendar getDatum() {
		return datum;
	}
	public void setDatum(GregorianCalendar datum) {
		if (datum == null)
			throw new RuntimeException("Datum nije ispravno unet!");
		this.datum = datum;
	}
	public double getProdajni() {
		return prodajni;
	}
	public void setProdajni(double prodajni) {
		if (prodajni <= 0){
			throw new RuntimeException("Kurs mora da bude veci od nule!");
		}
		this.prodajni = prodajni;
	}
	public double getKupovni() {
		return kupovni;
	}
	public void setKupovni(double kupovni) {
		if (kupovni <= 0){
			throw new RuntimeException("Kurs mora da bude veci od nule!");
		}
		this.kupovni = kupovni;
	}
	public double getSrednji() {
		return srednji;
	}
	public void setSrednji(double srednji) {
		if (srednji <= 0){
			throw new RuntimeException("Kurs mora da bude veci od nule!");
		}
		this.srednji = srednji;
	}
	
	@Override
	public String toString() {
		return "Valuta [nazivValute=" + nazivValute + ", skraceniNazivValute=" + skraceniNazivValute + ", datum="
				+ datum + ", prodajni=" + prodajni + ", kupovni=" + kupovni + ", srednji=" + srednji + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kupovni);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((nazivValute == null) ? 0 : nazivValute.hashCode());
		temp = Double.doubleToLongBits(prodajni);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((skraceniNazivValute == null) ? 0 : skraceniNazivValute.hashCode());
		temp = Double.doubleToLongBits(srednji);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valuta other = (Valuta) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (Double.doubleToLongBits(kupovni) != Double.doubleToLongBits(other.kupovni))
			return false;
		if (nazivValute == null) {
			if (other.nazivValute != null)
				return false;
		} else if (!nazivValute.equals(other.nazivValute))
			return false;
		if (Double.doubleToLongBits(prodajni) != Double.doubleToLongBits(other.prodajni))
			return false;
		if (skraceniNazivValute == null) {
			if (other.skraceniNazivValute != null)
				return false;
		} else if (!skraceniNazivValute.equals(other.skraceniNazivValute))
			return false;
		if (Double.doubleToLongBits(srednji) != Double.doubleToLongBits(other.srednji))
			return false;
		return true;
	}
	
	
	
	
	
	
}
