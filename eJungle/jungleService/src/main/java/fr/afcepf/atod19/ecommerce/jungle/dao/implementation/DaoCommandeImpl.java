package fr.afcepf.atod19.ecommerce.jungle.dao.implementation;

import java.util.List;

import fr.afcepf.atod19.ecommerce.jungle.dao.interfaces.IDaoCommande;
import fr.afcepf.atod19.ecommerce.jungle.entity.Adresse;
import fr.afcepf.atod19.ecommerce.jungle.entity.Client;
import fr.afcepf.atod19.ecommerce.jungle.entity.Commande;

public class DaoCommandeImpl extends GenericDaoImpl implements IDaoCommande {

	@Override
	public List<Commande> findCommandeByClient(Long idClient) {
		Client client = getEntityByPk(Client.class, idClient);
		return client.getCommandes();
	}

	@Override
	public List<Commande> findCommandeByAdresseFacturation(Long idAdresse) {
		Adresse adresse = getEntityByPk(Adresse.class, idAdresse);
		return null;
	}

}
