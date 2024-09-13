package com.tvsmotor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String colour;
    private int engine;

    @ManyToOne
    @JoinColumn(name = "dealer_id", referencedColumnName = "id")  // Foreign key to the Dealer table
    private Dealer dealer;

    public Vehicle() {}

    public Vehicle(int id, String name, String colour, int engine, Dealer dealer) {
        this.id = id;
        this.name = name;
        this.colour = colour;
        this.engine = engine;
        this.dealer = dealer;
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

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public Dealer getDealer() {
        return dealer;
    }

    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }

    @Override
    public String toString() {
        return "Vehicle [id=" + id + ", name=" + name + ", colour=" + colour + ", engine=" + engine + ", dealer=" + dealer + "]";
    }
}
