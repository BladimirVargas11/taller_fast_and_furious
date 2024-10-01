package com.taller.fast_and_furious.config;


import com.taller.fast_and_furious.models.factory.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VehicleFactoryConfig {

    @Bean
    public VehiculoFactory toyotaFactory() {
        return new ToyotaFactory();
    }

    @Bean
    public VehiculoFactory fordFactory() {
        return new FordFactory();
    }

    @Bean
    public VehiculoFactory mazdaFactory() {
        return new MazdaFactory();
    }
}
