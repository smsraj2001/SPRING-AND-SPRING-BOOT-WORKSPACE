package com.tvsmotor.entity;

import java.util.List;
import java.util.Set;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Dealer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String city;
    private String type;

    @OneToMany(mappedBy = "dealer", cascade = CascadeType.ALL)
    private List<Vehicle> vehicles;  // A dealer can have multiple vehicles

    public Dealer() {}

    public Dealer(int id, String name, String city, String type, List<Vehicle> vehicles) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.type = type;
        this.vehicles = vehicles;
    }

    // Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    @Override
    public String toString() {
        return "Dealer [id=" + id + ", name=" + name + ", city=" + city + ", type=" + type + "]";
    }
}
