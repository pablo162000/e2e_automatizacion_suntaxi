package com.nttdata.utils;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;

public class JsonLoader {
    private static final ObjectMapper mapper = new ObjectMapper();

    public static <T> T fromClasspath(String path, Class<T> clazz) {
        try (InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream(path)) {
            if (is == null) throw new IllegalArgumentException("No existe el archivo en classpath: " + path);
            return mapper.readValue(is, clazz);
        } catch (Exception e) {
            throw new RuntimeException("Error leyendo JSON: " + path, e);
        }
    }
}
