//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Adresse.java
//  @ Date : 27/12/2013
//  @ Author : 
//
//



package fr.afcepf.atod19.ecommerce.jungle.entity;
import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table
public class Adresse implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String rue;
	private String numeroDeRue;
	private String codePostal;
	private String ville;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@OneToMany(fetch=FetchType.LAZY, mappedBy="adresseClient")
	private List<Client> clients;
	@OneToMany(fetch=FetchType.LAZY, mappedBy="adresseEditeur")
	private List<Editeur> editeurs;
	
	
	public List<Editeur> getEditeurs() {
		return editeurs;
	}
	public void setEditeurs(List<Editeur> editeurs) {
		this.editeurs = editeurs;
	}
	public List<Client> getClients() {
		return clients;
	}
	public void setClients(List<Client> clients) {
		this.clients = clients;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getNumeroDeRue() {
		return numeroDeRue;
	}
	public void setNumeroDeRue(String numeroDeRue) {
		this.numeroDeRue = numeroDeRue;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
}
