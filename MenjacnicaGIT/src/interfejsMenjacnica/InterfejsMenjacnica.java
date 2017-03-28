package interfejsMenjacnica;

import java.util.GregorianCalendar;

import menjacnica.Valuta;

public interface InterfejsMenjacnica {

	public void dodajKurs(String nazivValute, String skraceniNazivValute, GregorianCalendar datum, double prodajni, double kupovni, double srednji);
	public void izbrisiValutu (String nazivValute, GregorianCalendar datum);
	public Valuta nadjiValutu (String nazivValute, GregorianCalendar datum);
	
}
