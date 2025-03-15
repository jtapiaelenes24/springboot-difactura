package com.jt24.curso.springboot.di.factura.springboot_difactura.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@RequestScope
public class Invoice {

    @Autowired
    private Client client;

    @Value("${invoice.description.office}")
    private String description;

    @Autowired
    private List<Item> items;

    public Invoice() {
        System.out.println("Creating the invoice component");
        System.out.println(client);
        System.out.println(description);
    }

    @PostConstruct
    public void init() {
        System.out.println("Creating the invoice component");
        client.setName(client.getName().concat(" Wild"));
        client.setLastname("Doe");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroing the invoice component/bean!");
    }

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

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public int getTotal() {
        int total = 0;
        for (Item item : items) {
            total += item.getAmount();
        }

        return total;
    }
}
