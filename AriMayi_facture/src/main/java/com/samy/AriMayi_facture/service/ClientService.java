package com.samy.AriMayi_facture.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.samy.AriMayi_facture.model.Client;
import com.samy.AriMayi_facture.repository.ClientRepository;

import java.util.List;

@Service
public class ClientService {
    private final ClientRepository repo;

    @Autowired //Injecte ClientRepository automatiquement (merci JPA)
    public ClientService(final ClientRepository repo) {
        this.repo = repo;
    }

    public Client createClient(Client client) { //Créer un client et sauvegade auto dans la BDD
        return this.repo.save(client);
    }

    public List<Client> getAllClients() {
        return this.repo.findAll();
    }
}
