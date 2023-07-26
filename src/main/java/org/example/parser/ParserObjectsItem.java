package org.example.parser;

import org.example.model.Items;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ParserObjectsItem {

    public Items parse() throws IOException, SAXException, ParserConfigurationException {

        String objectId;
        String parentObjId;
        String startDate;
        String endDate;
        String isActive;

        Items items = new Items();
        File file = new File("AS_ADM_HIERARCHY.XML");

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(file);

        NodeList nodeList = document.getElementsByTagName("ITEM");
        List<Items> itemsList = new ArrayList<>();
        for (int i = 0; i < nodeList.getLength(); i++) {
            objectId = nodeList.item(i).getAttributes().getNamedItem("OBJECTID").getNodeValue();
            parentObjId = nodeList.item(i).getAttributes().getNamedItem("PARENTOBJID").getNodeValue();
            startDate = nodeList.item(i).getAttributes().getNamedItem("STARTDATE").getNodeValue();
            endDate = nodeList.item(i).getAttributes().getNamedItem("ENDDATE").getNodeValue();
            isActive = nodeList.item(i).getAttributes().getNamedItem("ISACTIVE").getNodeValue();

            Items items2 = new Items(objectId, parentObjId, startDate, endDate, isActive);
            itemsList.add(items2);
        }

        items.setItemsList(itemsList);
        return items;
    }
}
