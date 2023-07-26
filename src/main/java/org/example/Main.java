package org.example;

import org.example.service.PrintDataObjects;
import org.example.service.PrintDataObjectsItem;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
        System.out.println("Задача №1");
        PrintDataObjects.printDataObjects("1900-01-01", "1418203", "1459810", "1457388", "96129242");

        System.out.println(" ");
        System.out.println("Задача №2");
        PrintDataObjectsItem.printDataObjectsItem();

    }
}