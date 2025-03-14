package com.jt24.curso.springboot.di.factura.springboot_difactura.models;

import java.util.List;

public class Invoice {

    private Client client;
    private String description;
    private List<Item> list;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Item> geList() {
        return list;
    }

    public void setList(List<Item> list) {
        this.list = list;
    }
}
