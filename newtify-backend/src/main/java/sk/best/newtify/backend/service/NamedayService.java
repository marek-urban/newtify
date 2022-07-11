package sk.best.newtify.backend.service;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import sk.best.newtify.api.dto.NameDayDTO;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author Stanislav Blasko
 * Copyright © 2022 BEST Technická univerzita Košice.
 * All rights reserved.
 */
@Service
public class NamedayService {

    @Value("classpath:nameday.json")
    Resource resourceFile;

    public NameDayDTO retrieveNameDay(Integer month, Integer day) {

        JSONParser parser = new JSONParser();
        String name;

        // read JSON file and map/convert to java POJO
        try {
            Object obj = parser.parse(new FileReader(resourceFile.getFile()));
            JSONObject jsonObject = (JSONObject) obj;

            // retrieve name from json object
            String actualMonth = Integer.toString(month - 1);
            JSONObject nameDayMonthList = (JSONObject) jsonObject.get(actualMonth);
            name = (String) nameDayMonthList.get(Integer.toString(day));
        } catch (IOException | ParseException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        NameDayDTO nameDayDTO = new NameDayDTO();
        nameDayDTO.setMonth(month);
        nameDayDTO.setDay(day);
        nameDayDTO.setName(name);
        return nameDayDTO;
    }

}
