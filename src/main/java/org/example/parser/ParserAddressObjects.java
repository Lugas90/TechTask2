package org.example.parser;

import org.example.model.Objects;
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

public class ParserAddressObjects {

    public Objects parse() throws IOException, SAXException, ParserConfigurationException {

        String objectId;
        String name;
        String typeName;
        String startDate;
        String endDate;
        String isActual;
        String isActive;

        Objects addressObjects = new Objects();
        File file = new File("AS_ADDR_OBJ.XML");

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(file);

        NodeList nodeList = doc.getElementsByTagName("OBJECT");
        List<Objects> objectsList = new ArrayList<>();
        for (int i = 0; i < nodeList.getLength(); i++) {
            objectId = nodeList.item(i).getAttributes().getNamedItem("OBJECTID").getNodeValue();
            name = nodeList.item(i).getAttributes().getNamedItem("NAME").getNodeValue();
            typeName = nodeList.item(i).getAttributes().getNamedItem("TYPENAME").getNodeValue();
            startDate = nodeList.item(i).getAttributes().getNamedItem("STARTDATE").getNodeValue();
            endDate = nodeList.item(i).getAttributes().getNamedItem("ENDDATE").getNodeValue();
            isActual = nodeList.item(i).getAttributes().getNamedItem("ISACTUAL").getNodeValue();
            isActive = nodeList.item(i).getAttributes().getNamedItem("ISACTIVE").getNodeValue();

            Objects objects = new Objects(objectId, name, typeName, startDate, endDate, isActual, isActive);
            objectsList.add(objects);

        }

        addressObjects.setObjectsList(objectsList);
        return addressObjects;
    }
}
