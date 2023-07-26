package org.example.service;

import org.example.model.Objects;
import org.example.parser.ParserAddressObjects;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintDataObjects {

    public static void printDataObjects(String startDate, String... objectId) throws IOException, ParserConfigurationException, SAXException {

        String objId;
        String typeName;
        String name;

        ParserAddressObjects parser = new ParserAddressObjects();
        Objects objects = parser.parse();
        List<Objects> objectsArrayList = new ArrayList<>(objects.getObjectsList());
        List<String> objectsId = new ArrayList<>(Arrays.asList(objectId));

        for (Objects obj : objectsArrayList) {
            for (String i : objectsId) {
                if (startDate.equals(obj.getStartDate()) && i.equals(obj.getObjectId())) {
                    objId = i;
                    typeName = obj.getTypeName();
                    name = obj.getName();
                    Objects newObj = new Objects(objId, typeName, name);
                    System.out.println(newObj.getObjectId() + ": " + newObj.getTypeName() + " " + newObj.getName());
                }
            }
        }
    }
}
