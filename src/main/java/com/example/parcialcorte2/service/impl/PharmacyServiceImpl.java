package com.example.parcialcorte2.service.impl;

import com.example.parcialcorte2.service.ClientService;

public class PharmacyServiceImpl {

    private final ClientServiceImpl clientService;


    public PharmacyServiceImpl() {
        clientService = (ClientServiceImpl) new ClientServiceImpl();
    }

    public ClientServiceImpl getClientService() {
        return clientService;
    }
}
