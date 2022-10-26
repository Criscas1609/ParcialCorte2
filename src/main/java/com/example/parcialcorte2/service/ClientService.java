package com.example.parcialcorte2.service;

import javafx.scene.control.Label;

public interface ClientService {
    void createNewClient(String name, String id, String email, String phone, String age);
    void showInformation(Label tableArray);
    void showSearch(Label tableSearch);
}
