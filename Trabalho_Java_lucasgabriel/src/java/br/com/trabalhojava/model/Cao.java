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
public class Cao {
  private Integer id_cao;
  private String nome_cao;
  private Integer idade_cao;
  private Double peso_cao;
  private RacaCao racaCao;

    public Cao() {
    }

    public Cao(Integer id_cao) {
        this.id_cao = id_cao;
    }

    public Cao(Integer id_cao, String nome_cao, Integer idade_cao, Double peso_cao, RacaCao racaCao) {
        this.id_cao = id_cao;
        this.nome_cao = nome_cao;
        this.idade_cao = idade_cao;
        this.peso_cao = peso_cao;
        this.racaCao = racaCao;
    }

    public Integer getId_cao() {
        return id_cao;
    }

    public void setId_cao(Integer id_cao) {
        this.id_cao = id_cao;
    }

    public String getNome_cao() {
        return nome_cao;
    }

    public void setNome_cao(String nome_cao) {
        this.nome_cao = nome_cao;
    }

    public Integer getIdade_cao() {
        return idade_cao;
    }

    public void setIdade_cao(Integer idade_cao) {
        this.idade_cao = idade_cao;
    }

    public Double getPeso_cao() {
        return peso_cao;
    }

    public void setPeso_cao(Double peso_cao) {
        this.peso_cao = peso_cao;
    }

    public RacaCao getRacaCao() {
        return racaCao;
    }

    public void setRacaCao(RacaCao racaCao) {
        this.racaCao = racaCao;
    }

}
