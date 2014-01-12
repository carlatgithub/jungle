package fr.afcepf.atod19.jungle.mbean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;


//
//
//	THIS IS TEST CODE THAT MUST BE REMOVED !!!!!!!
//
@ManagedBean
public class Commande {
	
	List<Integer> quantities;
	int quantity;
	int total = 0;
	List<String> villes;
	String ville;
	
	public Commande() {
		quantities = new ArrayList<Integer>();
		quantities.add(new Integer(1));
		quantities.add(new Integer(2));
		quantities.add(new Integer(3));
		quantities.add(new Integer(4));
		quantities.add(new Integer(5));
	
		villes = new ArrayList<String>();
		villes.add("paris");
		villes.add("marseille");
		villes.add("lyon");
		villes.add("toulouse");
		villes.add("nice");
		villes.add("nantes");
		villes.add("strasbourg");
		villes.add("montpellier");
		villes.add("bordeaux");
		villes.add("lilles");
		villes.add("rennes");
		villes.add("reims");
		villes.add("le havre");
		villes.add("saint etienne");
		villes.add("toulon");
		villes.add("grenoble");
		villes.add("dijon");


	}

	public List<Integer> getQuantities() {
		return quantities;
	}

	public void setQuantities(List<Integer> quantities) {
		this.quantities = quantities;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public void inc() {
		total++;
		System.out.println("incremented, new value total=" + total);
	}
	
	public List<String> complete(String query) {
		return villes;  
	}

	public List<String> getVilles() {
		return villes;
	}

	public void setVilles(List<String> villes) {
		this.villes = villes;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
	
	
	
}
