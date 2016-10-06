package com.sbev.proxibanque.service;

import com.sbev.proxibanque.domaine.Client;
import com.sbev.proxibanque.domaine.Conseiller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sbev.proxibanque.dao.IClientDao;

/**
 * Classe Client service
 * Permet de gérer l'ensemble des opérations liées aux clients en base.
 * Cette classe a pour paramètre la Dao client.
 * @author Vincent PANOUILLERES
 *
 */
@Service("clientService")
public class ClientService {

	@Autowired
	@Qualifier("clientDao")
	private IClientDao clientDao;
	
	/**
	 * Constructeur du service client
	 */
	public ClientService() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Méthode pour créer un client en base de données
	 * @param client Le client qu'on souhaite stocker en base de données (objet de type CLient)
	 * @return Le client qui a été sauvegardé en base de données (objet de type Client)
	 */
	public Client creerClient(Client client){
		return clientDao.save(client);
	}
	
	/**
	 * Méthode permettant d'appeler la DAoO pour modifier un client dans la base de données
	 * @param client Le client qu'on souhaite modifier en base de données
	 */
	public void modifierClient(Client client){
		clientDao.flush(client);
	}
	
	/**
	 * Méthode permettant de lire en client en conaissant son identifiant unique
	 * @param id L'identifiant du Cient (int)
	 * @return Le client correspondant à l'identifiant donné en paramètre
	 */
	public Client lireClient(int id){
		return clientDao.findByIdClient(id);
	}
	
	/**
	 * Méthode permettant de lire l'ensemble des clients en base
	 * @return La liste de tous les clients de ProxiBanque (objet de type List Client)
	 */
	public List<Client> lireToutClient(){
		return clientDao.findAll();
	}
	
	/**
	 * Méthode permettant de supprimer un client
	 * @param client Le client qu'on souhaite supprimer
	 */
	public void supprimerClient(Client client){
		clientDao.delete(client);
	}
	
	/** 
	 * Méthode pour récupérer les clients par conseiller
	 * @param conseiller Le conseiller auquel sont rattachés les clients recherchés (objet de type Conseiller)
	 * @return Une liste de client (objet de type List Client) 
	 */
	public List<Client> lireClientParConseiller(Conseiller conseiller){
		clientDao.findByConseiller(conseiller);
	}
	

}
