/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.bean;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author fabricio
 */
@Entity
public class Gm implements Serializable{

    /**
     * @return the nick
     */

    /**
     * @return the cadastro
     */
    public String getCadastro() {
        return cadastro;
    }

    /**
     * @param cadastro the cadastro to set
     */
    public void setCadastro(String cadastro) {
        this.cadastro = cadastro;
    }

    /**
     * @return the championfav
     */
    public String getChampionfav() {
        return championfav;
    }

    /**
     * @param championfav the championfav to set
     */
    public void setChampionfav(String championfav) {
        this.championfav = championfav;
    }

    /**
     * @return the elomax
     */
    public String getElomax() {
        return elomax;
    }

    /**
     * @param elomax the elomax to set
     */
    public void setElomax(String elomax) {
        this.elomax = elomax;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idgm;
    private String nome;
    @Column(unique = true)
    private String sobrenome;
    private String cadastro;
    private String championfav;
    private String elomax;
    private boolean estadoatual;

    public Integer getidgm() {
        return idgm;
    }

    public void setidgm(Integer idgm) {
        this.idgm = idgm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public boolean isEstadoatual() {
        return estadoatual;
    }

    public void setEstadoatual(boolean estadoatual) {
        this.estadoatual = estadoatual;
    }

    @Override
    public String toString() {
        return getNome(); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the sobrenome
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * @param sobrenome the sobrenome to set
     */
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    
    
}
