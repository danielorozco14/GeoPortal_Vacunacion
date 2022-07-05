package com.nikolas.leaflet.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nikolas.leaflet.domain.InfoMunicipio;
import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@RestController
@RequestMapping("/data")
public class JsonController {
    @GetMapping("/json")
    public List<InfoMunicipio> JsonData(){
        ObjectMapper mapper = new ObjectMapper();
        TypeReference<List<InfoMunicipio>> typeReference = new TypeReference<List<InfoMunicipio>>(){};
        InputStream inputStream = TypeReference.class.getResourceAsStream("/static/csvjson.json");
        try {
            List<InfoMunicipio> infoMunicipioList = mapper.readValue(inputStream,typeReference);

            return infoMunicipioList;
        } catch (IOException e){
            System.out.println("Unable to load Info: " + e.getMessage());
        }
        return null;
    }
}
