package br.com.carsoft.model;


public class Car {

    private String id;
    private String name;
    private String repeticao;
    private String carga;

    public Car(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Car(String id, String name, String repeticao, String carga) {
        this.id = id;
        this.name = name;
        this.repeticao = repeticao;
        this.carga = carga;
    }

    public String getCarga() {
        return carga;
    }

    public String getRepeticao() {
        return repeticao;
    }
}


