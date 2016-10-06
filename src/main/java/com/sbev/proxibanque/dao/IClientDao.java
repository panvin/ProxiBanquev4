package com.sbev.proxibanque.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sbev.proxibanque.domaine.Client;
import com.sbev.proxibanque.domaine.Conseiller;

@Repository("clientDao")
public interface IClientDao extends JpaRepository <Client, Integer> {
	
	public Client findByIdClient (int id);
	public List<Client> findByConseiller (Conseiller conseiller);

}
