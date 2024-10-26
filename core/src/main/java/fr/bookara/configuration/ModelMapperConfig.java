package fr.bookara.configuration;

import org.modelmapper.ModelMapper;

public class ModelMapperConfig {

    private static ModelMapper modelMapperInstance;

    public static ModelMapper getInstance() {
        if (modelMapperInstance == null) {
            modelMapperInstance = new ModelMapper();
        }
        return modelMapperInstance;
    }
}