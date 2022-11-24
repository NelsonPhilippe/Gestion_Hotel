package com.nelson.gestion;

public class Client {

    private int id;
    private String name;
    private String lastName;
    // Chambre reserver par l'utilisateur
    private Room room;


    /**
     *
     * @param name Prenom de l'utilisateur
     * @param lastName Nom de l'utilisateur
     */
    public Client(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
        this.room = null;
    }

    /**
     *
     * @return Prenom du client
     */
    public String getName(){
        return this.name;
    }

    /**
     *
     * @return Nom du client
     */
    public String getLastName(){
        return this.lastName;
    }

    /**
     *
     * @return Identifiant de l'utilisateur
     */
    public int getId(){
        return this.id;
    }

    /**
     *
     * @param id Identifiant de l'utilisateur
     */
    public void setId(int id){
        this.id = id;
    }

    /**
     *
     * @return Chambre reserver par l'utilisateur
     */
    public Room getRoom(){
        return this.room;
    }

    /**
     *
     * @param room Chambre reserver par l'utilisateur
     */
    public void setRoom(Room room){
        this.room = room;
    }
}
