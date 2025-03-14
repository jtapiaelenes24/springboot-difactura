package com.jt24.curso.springboot.di.factura.springboot_difactura;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.jt24.curso.springboot.di.factura.springboot_difactura.models.Item;
import com.jt24.curso.springboot.di.factura.springboot_difactura.models.Product;

@Configuration
@PropertySource("classpath:data.properties")
public class AppConfig {

    @Bean
    List<Item> itemsInvoice() {
        Product p1 = new Product("GTA 6", 100);
        Product p2 = new Product("Age of Empires IV", 40);

        return Arrays.asList(new Item(p1, 3), new Item(p2, 1));
    }
}
