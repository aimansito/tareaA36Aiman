/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *
 * @author aiman
 */
public class JsonService {
    public static Object stringToPojo(String json, Class clase) throws JsonProcessingException {
        ObjectMapper mapeador = new ObjectMapper();

        return mapeador.readValue(json,clase);
    }
}
