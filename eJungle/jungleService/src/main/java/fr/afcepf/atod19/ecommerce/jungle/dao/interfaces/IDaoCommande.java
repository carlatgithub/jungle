package fr.afcepf.atod19.ecommerce.jungle.dao.interfaces;

import java.util.List;

import fr.afcepf.atod19.ecommerce.jungle.entity.Commande;

public interface IDaoCommande extends IGenericDao {
	List<Commande> findCommandeByClient(Long idClient);
	List<Commande> findCommandeByAdresseFacturation(Long idAdresse);
	
}
