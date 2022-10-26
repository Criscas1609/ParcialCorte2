package com.example.parcialcorte2.controller;

import com.example.parcialcorte2.service.ModelFactoryControllerService;
import com.example.parcialcorte2.service.impl.PharmacyServiceImpl;
import javafx.scene.control.Label;

public class ModelFactoryController implements ModelFactoryControllerService {

    PharmacyServiceImpl pharmacy;
    //------------------------------ Singleton ------------------------------------------------
// Clase estatica oculta. Tan solo se instanciara el singleton una vez
    private static class SingletonHolder {
        // El constructor de Singleton puede ser llamado desde aquí al ser protected
        private final static ModelFactoryController eINSTANCE = new ModelFactoryController();
    }
    // Método para obtener la instancia de nuestra clase
    public static ModelFactoryController getInstance() {
        return SingletonHolder.eINSTANCE;
    }
    public ModelFactoryController() {
        pharmacy = new PharmacyServiceImpl();
    }
    // Funciones
    public void createNewClient(String name, String id, String email, String phone, String age){
        pharmacy.getClientService().createNewClient(name, id, email, phone, age);
    }
    public void showInformation(Label tableArray){
        pharmacy.getClientService().showInformation(tableArray);
    }
    public void showSearch(Label tableSearch){
        pharmacy.getClientService().showSearch(tableSearch);
    }
}


