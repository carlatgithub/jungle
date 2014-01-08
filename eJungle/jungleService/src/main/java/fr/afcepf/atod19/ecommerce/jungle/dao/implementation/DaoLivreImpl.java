package fr.afcepf.atod19.ecommerce.jungle.dao.implementation;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Component;

import fr.afcepf.atod19.ecommerce.jungle.dao.interfaces.IDaoLivre;
import fr.afcepf.atod19.ecommerce.jungle.entity.Auteur;
import fr.afcepf.atod19.ecommerce.jungle.entity.Categorie;
import fr.afcepf.atod19.ecommerce.jungle.entity.Editeur;
import fr.afcepf.atod19.ecommerce.jungle.entity.Livre;
@Component
public class DaoLivreImpl extends GenericDaoImpl implements IDaoLivre {

	@Override
	public List<Livre> getLivreByCategorie(Long idCategorie) {
		Categorie cat = getEntityByPk(Categorie.class, idCategorie);
		return cat.getLivres();
	}

	@Override
	public List<Livre> getLivreByEditeur(Long idEditeur) {
		Editeur edit = getEntityByPk(Editeur.class, idEditeur);
		return edit.getLivres();
	}

	@Override
	public List<Livre> getLivreByAuteur(Long idAuteur) {
		Auteur aut = getEntityByPk(Auteur.class, idAuteur);
		return aut.getLivres();
	}

	@Override
	public Livre getLivreByKey(String numeroISBN) {
		Livre unLivre = getEntityManager().find(Livre.class, numeroISBN);
		return unLivre;
	}

	@Override
	public List<Livre> getAllLivre() {
		Query query = getEntityManager().createQuery("From Livre ", Livre.class);
		return query.getResultList();
	}
	
	
		
}
