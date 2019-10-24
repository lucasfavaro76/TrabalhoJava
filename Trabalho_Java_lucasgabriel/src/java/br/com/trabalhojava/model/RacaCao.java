/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trabalhojava.model;

/**
 *
 * @author PC 05
 */
public class RacaCao {
    private Integer id_raca;
    private String desc_raca;

    public RacaCao() {
    }

    public RacaCao(Integer id_raca) {
        this.id_raca = id_raca;
    }

    public RacaCao(Integer id_raca, String desc_raca) {
        this.id_raca = id_raca;
        this.desc_raca = desc_raca;
    }

    public Integer getId_raca() {
        return id_raca;
    }

    public void setId_raca(Integer id_raca) {
        this.id_raca = id_raca;
    }

    public String getDesc_raca() {
        return desc_raca;
    }

    public void setDesc_raca(String desc_raca) {
        this.desc_raca = desc_raca;
    }
    
    
    
}
