package com.jt24.curso.springboot.di.factura.springboot_difactura;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import com.jt24.curso.springboot.di.factura.springboot_difactura.models.Item;
import com.jt24.curso.springboot.di.factura.springboot_difactura.models.Product;

@Configuration
@PropertySource(value = "classpath:data.properties", encoding = "UTF-8")
public class AppConfig {
    @Bean
    List<Item> itemsInvoice() {
        Product p1 = new Product("GTA 6", 100);
        Product p2 = new Product("Age of Empires IV", 40);

        return Arrays.asList(new Item(p1, 3), new Item(p2, 1));
    }

    @Bean
    @Primary
    List<Item> itemsInvoiceOffice() {
        Product p1 = new Product("Office Desk", 750);
        Product p2 = new Product("Ergonomic Chair", 250);
        Product p3 = new Product("HP EliteBook Laptop", 890);
        Product p4 = new Product("Logitek Mouse", 30);

        return Arrays.asList(new Item(p1, 5), new Item(p2, 8), new Item(p3, 8), new Item(p4, 5));
    }
}
