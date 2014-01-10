package fr.afcepf.atod19.jungle.mbean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Commande {
	
	List<Integer> prices;
	int prix;
	
	public Commande() {
		prices = new ArrayList<Integer>();
		prices.add(new Integer(1));
		prices.add(new Integer(2));
		prices.add(new Integer(3));
		prices.add(new Integer(4));
	}

	public List<Integer> getPrices() {
		return prices;
	}

	public void setPrices(List<Integer> prices) {
		this.prices = prices;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}
	
	

}
