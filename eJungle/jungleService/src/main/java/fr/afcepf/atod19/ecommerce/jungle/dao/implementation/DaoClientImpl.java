package fr.afcepf.atod19.ecommerce.jungle.dao.implementation;

import java.util.List;

import fr.afcepf.atod19.ecommerce.jungle.dao.interfaces.IDaoClient;
import fr.afcepf.atod19.ecommerce.jungle.entity.Adresse;
import fr.afcepf.atod19.ecommerce.jungle.entity.Client;

public class DaoClientImpl extends GenericDaoImpl implements IDaoClient {

	@Override
	public List<Client> findClientByAdresse(Long idAdresse) {
		Adresse adresse = getEntityByPk(Adresse.class, idAdresse);
		return adresse.getClients();
	}

	@Override
	public Client findByName(String userName, String pwd) {
		Client unClient = getEntityManager().find(Client.class, userName);
		return pwd.equals(unClient.getPassword()) ? unClient : null;
	}
	
}
