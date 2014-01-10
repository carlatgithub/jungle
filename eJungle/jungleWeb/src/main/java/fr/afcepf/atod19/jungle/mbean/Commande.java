package fr.afcepf.atod19.jungle.mbean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Commande {
	
	List<Integer> quantities;
	int quantity;
	
	public Commande() {
		quantities = new ArrayList<Integer>();
		quantities.add(new Integer(1));
		quantities.add(new Integer(2));
		quantities.add(new Integer(3));
		quantities.add(new Integer(4));
		quantities.add(new Integer(5));
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

	
}
