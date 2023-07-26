package org.example.service;

import org.example.model.Items;
import org.example.model.Objects;
import org.example.parser.ParserAddressObjects;
import org.example.parser.ParserObjectsItem;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.*;

public class PrintDataObjectsItem {

    public static void printDataObjectsItem() throws IOException, ParserConfigurationException, SAXException {

        ParserObjectsItem parserItems = new ParserObjectsItem();
        ParserAddressObjects parserObjects = new ParserAddressObjects();
        Items items = parserItems.parse();
        Objects objects = parserObjects.parse();
        List<Items> itemsArrayList = new ArrayList<>(items.getItemsList());
        List<Objects> objectsArrayList = new ArrayList<>(objects.getObjectsList());
        HashMap<String, String> data = new HashMap<>();

        for (Objects obj : objectsArrayList) {
            for (Items it : itemsArrayList) {
                if (it.getParentObjId().equals(obj.getObjectId()) && it.getIsActive().equals("1") && obj.getTypeName().equalsIgnoreCase("проезд")) {
                    data.put(obj.getName(), obj.getTypeName());
                }
            }
        }
        for (Map.Entry<String, String> entry : data.entrySet()) {
            String nameStreet = entry.getKey();
            String type = entry.getValue();
            System.out.println(type + " " + nameStreet);
        }
    }
}
