package com.example.findmydorm;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Document("dormitories")
public class Dorm {

    @Id
    private String id;
    private String name;
    private int distance ;
    private int price;
    private String tel;
    private String address;
    private List<String> images;
    private List<Obj> waterRate;
    private List<Obj> facilities;
    private List<Obj> security;


    public Dorm(String name, int distance, int price, String tel, String address, List<String> images, List<Obj> waterRate, List<Obj> facilities, List<Obj> security) {
        this.name = name;
        this.distance = distance;
        this.price = price;
        this.tel = tel;
        this.address = address;
        this.images = images;
        this.waterRate = waterRate;
        this.facilities = facilities;
        this.security = security;
    }

    public List<Obj> getFacilities() {
        return facilities;
    }

    public void setFacilities(List<Obj> facilities) {
        this.facilities = facilities;
    }

    public List<Obj> getSecurity() {
        return security;
    }

    public void setSecurity(List<Obj> security) {
        this.security = security;
    }

    public List<Obj> getWaterRate() {
        return waterRate;
    }

    public void setWaterRate(List<Obj> waterRate) {
        this.waterRate = waterRate;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
