package fr.afcepf.atod19.ecommerce.jungle.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import fr.afcepf.atod19.ecommerce.jungle.dao.interfaces.IDaoLivre;
import fr.afcepf.atod19.ecommerce.jungle.entity.Auteur;
import fr.afcepf.atod19.ecommerce.jungle.entity.Livre;
import fr.afcepf.atod19.ecommerce.jungle.services.interfaces.IGestionCatalogue;
@Component
@Transactional
public class GestionCatalogue implements IGestionCatalogue {

	@Autowired
	IDaoLivre daoLivre;
	
	@Override
	public List<Livre> livresSelonEditeur(Long idEditeur) {
		return daoLivre.getLivreByEditeur(idEditeur);
	}

	public IDaoLivre getDaoLivre() {
		return daoLivre;
	}

	public void setDaoLivre(IDaoLivre daoLivre) {
		this.daoLivre = daoLivre;
	}

	@Override
	public List<Livre> livresSelonAuteur(Long idAuteur) {
		return daoLivre.getLivreByAuteur(idAuteur);
	}

	@Override
	public List<Livre> livreSelonCategorie(Long idCategorie) {
		return daoLivre.getLivreByCategorie(idCategorie);
	}

	@Override
	public Livre livreSelonISBN(String numeroIBSN) {
		return daoLivre.getLivreByKey(numeroIBSN);
	}

	@Override
	public void ajouterLivre(Livre unLivre) {
		daoLivre.persistNewEntity(unLivre.getCategorie());
		daoLivre.persistNewEntity(unLivre.getEditeur().getAdresseEditeur());
		daoLivre.persistNewEntity(unLivre.getEditeur());
		for(Auteur unAuteur:unLivre.getAuteurs())
			daoLivre.persistNewEntity(unAuteur);
		daoLivre.persistNewEntity(unLivre);
	}

	@Override
	public List<Livre> allLivre() {
		return daoLivre.getAllLivre();
	}
	
}
