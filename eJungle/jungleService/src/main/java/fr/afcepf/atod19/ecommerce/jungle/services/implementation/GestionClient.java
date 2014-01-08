package fr.afcepf.atod19.ecommerce.jungle.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import fr.afcepf.atod19.ecommerce.jungle.dao.interfaces.IDaoClient;
import fr.afcepf.atod19.ecommerce.jungle.entity.Client;
import fr.afcepf.atod19.ecommerce.jungle.services.interfaces.IGestionClient;
@Transactional
public class GestionClient implements IGestionClient {
	@Autowired
	IDaoClient daoClient;
	
	@Override
	public Client login(String userName, String pwd) {
		return daoClient.findByName(userName, pwd);
	}

	@Override
	public List<Client> clientsSelonAdresse(Long idAdresse) {
		return daoClient.findClientByAdresse(idAdresse);
	}
	
	

}
