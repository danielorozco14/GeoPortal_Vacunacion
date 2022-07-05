package com.nikolas.leaflet.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InfoMunicipio {
    @JsonProperty("ID")
    private int id;
    @JsonProperty("NOM_DPTO")
    private String nom_DPTO;
    @JsonProperty("COD_DPTO")
    private int cod_DPTO;
    @JsonProperty("NOM_MUN")
    private String nom_MUN;
    @JsonProperty("POB_TOTAL")
    private int pob_TOTAL;
    @JsonProperty("CASOS_LOCALES")
    private int casos_LOCALES;


    public InfoMunicipio() {
    }

    public InfoMunicipio(int id, String nom_DPTO, int cod_DPTO, String nom_MUN, int pob_TOTAL, int casos_LOCALES) {
        this.id = id;
        this.nom_DPTO = nom_DPTO;
        this.cod_DPTO = cod_DPTO;
        this.nom_MUN = nom_MUN;
        this.pob_TOTAL = pob_TOTAL;
        this.casos_LOCALES = casos_LOCALES;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom_DPTO() {
        return nom_DPTO;
    }

    public void setNom_DPTO(String nom_DPTO) {
        this.nom_DPTO = nom_DPTO;
    }

    public int getCod_DPTO() {
        return cod_DPTO;
    }

    public void setCod_DPTO(int cod_DPTO) {
        this.cod_DPTO = cod_DPTO;
    }

    public String getNom_MUN() {
        return nom_MUN;
    }

    public void setNom_MUN(String nom_MUN) {
        this.nom_MUN = nom_MUN;
    }

    public int getPob_TOTAL() {
        return pob_TOTAL;
    }

    public void setPob_TOTAL(int pob_TOTAL) {
        this.pob_TOTAL = pob_TOTAL;
    }

    public int getCasos_LOCALES() {
        return casos_LOCALES;
    }

    public void setCasos_LOCALES(int casos_LOCALES) {
        this.casos_LOCALES = casos_LOCALES;
    }
}
