package com.example.parcialcorte2.service.impl;

import com.example.parcialcorte2.model.Client;
import com.example.parcialcorte2.service.ClientService;
import javafx.scene.control.Label;

import java.util.ArrayList;

public class ClientServiceImpl implements ClientService {

    ArrayList<Client> listClient = new ArrayList<Client>();

    public void createNewClient(String name, String id, String email, String phone, String age){
        Client client = new Client(name, id, email, phone,age);
        listClient.add(client);
    }

    public void showInformation(Label tableArray){
        String information = tableArray.getText();
        for(Client client : listClient){
            tableArray.setText(information+"\n"+client.getName()+"-"+client.getEmail()+"-"+client.getPhone()+"-"+client.getId()+"-"+client.getAge());
        }

    }

    public void showSearch(Label tableSearch){
        String search = tableSearch.getText();
        for(Client client : listClient){
            int age = Integer.parseInt(client.getAge());
            if (age >= 18){
                tableSearch.setText(search+"\n"+client.getName()+"-"+client.getEmail()+"-"+client.getPhone()+"-"+client.getId()+"-"+client.getAge());
            }
        }

    }


}
