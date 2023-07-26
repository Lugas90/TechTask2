package org.example.model;

import java.util.List;

public class Objects {
    private String objectId;
    private String name;
    private String typeName;
    private String startDate;
    private String endDate;
    private String isActual;
    private String isActive;

    private List<Objects> objectsList;

    public Objects(String objectId, String name, String typeName, String startDate, String endDate, String isActual, String isActive) {
        this.objectId = objectId;
        this.name = name;
        this.typeName = typeName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.isActual = isActual;
        this.isActive = isActive;
    }

    public Objects(String objectId, String typeName, String name) {
        this.objectId = objectId;
        this.typeName = typeName;
        this.name = name;
    }

    public Objects() {
    }

    public List<Objects> getObjectsList() {
        return objectsList;
    }

    public void setObjectsList(List<Objects> objectsList) {
        this.objectsList = objectsList;
    }


    public String getObjectId() {
        return objectId;
    }

    public String getName() {
        return name;
    }

    public String getTypeName() {
        return typeName;
    }

    public String getStartDate() {
        return startDate;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Objects objects = (Objects) o;
        return java.util.Objects.equals(objectId, objects.objectId) && java.util.Objects.equals(name, objects.name) && java.util.Objects.equals(typeName, objects.typeName) && java.util.Objects.equals(startDate, objects.startDate) && java.util.Objects.equals(endDate, objects.endDate) && java.util.Objects.equals(isActual, objects.isActual) && java.util.Objects.equals(isActive, objects.isActive);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(objectId, name, typeName, startDate, endDate, isActual, isActive);
    }

    @Override
    public String toString() {
        return "Object{" +
                "objectId='" + objectId + '\'' +
                ", name='" + name + '\'' +
                ", typeName='" + typeName + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", isActual='" + isActual + '\'' +
                ", isActive='" + isActive + '\'' +
                '}';
    }
}
