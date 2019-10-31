/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Fabricio
 */
@Entity
public class Banimento implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idban;
    @ManyToOne
    private Gm gamemaster;
    @ManyToOne
    private Jogadores jogador;

    public Integer getIdban() {
        return idban;
    }

    public void setIdBan(Integer idban) {
        this.idban = idban;
    }

    public Gm getGm() {
        return gamemaster;
    }

    public void setGm(Gm gamemaster) {
        this.gamemaster = gamemaster;
    }

    public Jogadores getJogador() {
        return jogador;
    }

    public void setJogador(Jogadores jogador) {
        this.jogador = jogador;
    }
    
    
}
