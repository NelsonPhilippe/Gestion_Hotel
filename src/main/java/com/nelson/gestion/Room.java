package com.nelson.gestion;

import java.util.ArrayList;
import java.util.List;

public class Room {

    private int id;
    private int category;
    private int capacity;
    private int price;

    private List<Options> options = new ArrayList<>();

    /**
     *
     * @param id Identifiant de la chambre
     * @param category Categorie (Nombre d'etoile) de la chambre
     * @param capacity Nombre de personne dans la chambre
     * @param price Prix de la chambre
     */
    public Room(int id, int category, int capacity, int price){
        this.category = category;
        this.capacity = capacity;
        this.price = price;
        this.id = id;
    }

    /**
     *
     * @param options Option a ajouter dans la chambre
     */
    public void addOptions(Options options){
        this.options.add(options);
    }

    /**
     *
     * @return Liste d'options
     */
    public List<Options> getOptions(){
        return options;
    }

    /**
     *
     * @return Categorie (Nombre d'etoile) de la chambre
     */
    public int getCategory(){
        return category;
    }

    /**
     *
     * @return Capacite de la chambre (nombre de personne)
     */
    public int getCapacity(){
        return capacity;
    }

    /**
     *
     * @return Prix de la chambre
     */
    public int getPrice(){
        return price;
    }

    /**
     *
     * @return Identifiant de la chambre
     */
    public int getId(){
        return id;
    }

}
