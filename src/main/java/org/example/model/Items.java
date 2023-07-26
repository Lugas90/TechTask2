package org.example.model;

import java.util.List;
import java.util.Objects;

public class Items {

    private String objectId;
    private String parentObjId;
    private String startDate;
    private String endDate;
    private String isActive;

    private List<Items> itemsList;

    public Items(String objectId, String parentObjId, String startDate, String endDate, String isActive) {
        this.objectId = objectId;
        this.parentObjId = parentObjId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.isActive = isActive;
    }

    public Items() {
    }

    public String getParentObjId() {
        return parentObjId;
    }

    public String getIsActive() {
        return isActive;
    }

    public List<Items> getItemsList() {
        return itemsList;
    }

    public void setItemsList(List<Items> itemsList) {
        this.itemsList = itemsList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Items items = (Items) o;
        return Objects.equals(objectId, items.objectId) && Objects.equals(parentObjId, items.parentObjId) && Objects.equals(startDate, items.startDate) && Objects.equals(endDate, items.endDate) && Objects.equals(isActive, items.isActive) && Objects.equals(itemsList, items.itemsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectId, parentObjId, startDate, endDate, isActive, itemsList);
    }

    @Override
    public String toString() {
        return "Items{" +
                "objectId='" + objectId + '\'' +
                ", parentObjId='" + parentObjId + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", isActive='" + isActive + '\'' +
                '}';
    }
}
