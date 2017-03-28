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
		if (v == null)
			throw new RuntimeException("Nisu unete ispravno vrednosti!");
		if (valute.contains(v))
			throw new RuntimeException("Vec postoji!");
		valute.add(v);
	}

	@Override
	public void izbrisiValutu(String nazivValute, GregorianCalendar datum) {
		if (nazivValute == null || datum == null){
			throw new RuntimeException("Nisu unete ispravno vrednosti!");
		}
		for (int i = 0; i < valute.size(); i++){
			if (valute.get(i).getNazivValute().equals(nazivValute) && valute.get(i).getDatum() == datum)
				valute.remove(i);
			break;
		}
		throw new RuntimeException("Data valuta ne postoji!");
	}

	@Override
	public Valuta nadjiValutu(String nazivValute, GregorianCalendar datum) {
		if (nazivValute == null || datum == null){
			throw new RuntimeException("Nisu unete ispravno vrednosti!");
		}
		for (int i = 0; i < valute.size(); i++){
			if (valute.get(i).getNazivValute().equals(nazivValute) && valute.get(i).getDatum() == datum){
				return valute.get(i);
			}
		}
		return null;
	}

}
