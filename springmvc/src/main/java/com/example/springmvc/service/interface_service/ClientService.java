package com.example.springmvc.service.interface_service;

import com.example.springmvc.entity.Client;

import java.util.List;
import java.util.Optional;

public interface ClientService {
    public List<Client> getAllClients();

    public Optional<Client> getClientById(int id);

    public Client addClient(Client client);

    public Client updateClient(Client client);

    public Client deleteClientById(int id);
}
