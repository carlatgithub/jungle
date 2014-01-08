package fr.afcepf.atod19.ecommerce.jungle.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import fr.afcepf.atod19.ecommerce.jungle.dao.interfaces.IDaoLivre;
import fr.afcepf.atod19.ecommerce.jungle.entity.Livre;
import fr.afcepf.atod19.ecommerce.jungle.services.interfaces.IGestionCatalogue;
@Transactional
public class GestionCatalogue implements IGestionCatalogue {

	@Autowired
	IDaoLivre daoLivre;
	
	@Override
	public List<Livre> livresSelonEditeur(Long idEditeur) {
		return daoLivre.getLivreByEditeur(idEditeur);
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
		daoLivre.persistNewEntity(unLivre);
	}

	@Override
	public List<Livre> allLivre() {
		return daoLivre.getAllLivre();
	}
	
}
