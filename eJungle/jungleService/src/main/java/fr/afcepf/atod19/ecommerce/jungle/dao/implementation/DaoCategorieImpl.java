package fr.afcepf.atod19.ecommerce.jungle.dao.implementation;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Component;

import fr.afcepf.atod19.ecommerce.jungle.dao.interfaces.IDaoCategorie;
import fr.afcepf.atod19.ecommerce.jungle.entity.Categorie;

@Component
public class DaoCategorieImpl extends GenericDaoImpl implements IDaoCategorie {

	@Override
	public List<Categorie> findAllCategorie() {
		Query query = getEntityManager().createQuery("From Categorie ", Categorie.class);
		return query.getResultList();
	}

	

}
