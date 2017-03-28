package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import interfejsMenjacnica.InterfejsMenjacnica;

public class Menjacnica implements InterfejsMenjacnica {
	public LinkedList<Valuta> valute = new LinkedList<Valuta>();
	
	
	
	@Override
	public void dodajKurs(String nazivValute, String skraceniNazivValute, GregorianCalendar datum, double prodajni,
			double kupovni, double srednji) {
		
		Valuta v = new Valuta();
		v.setDatum(datum);
		v.setNazivValute(nazivValute);
		v.setSkraceniNazivValute(skraceniNazivValute);
		v.setKupovni(kupovni);
		v.setProdajni(prodajni);
		v.setSrednji(srednji);
		valute.add(v);	

	}

	@Override
	public void izbrisiValutu(String nazivValute, GregorianCalendar datum) {
		// TODO Auto-generated method stub

	}

	@Override
	public Valuta nadjiValutu(String nazivValute, GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return null;
	}

}
