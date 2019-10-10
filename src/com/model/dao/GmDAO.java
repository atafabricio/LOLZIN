/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.dao;

import com.model.bean.Jogadores;
import com.connection.ConnectionFactory;
import com.model.bean.Gm;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
/**
 *
 * @author fabricio
 */
public class GmDAO {
     public Gm save(Gm vendedor) {
        EntityManager em = new ConnectionFactory().getConnection();

        try {
            em.getTransaction().begin();
            em.persist(vendedor);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar " + e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

        return vendedor;
    }

    public Gm update(Gm vendedor) {
        EntityManager em = new ConnectionFactory().getConnection();

        try {
            em.getTransaction().begin();
            em.merge(vendedor);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar " + e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

        return vendedor;
    }

    public Gm findByID(Integer id) { //BUSCA OS USUARIOS CADASTRADOS

        EntityManager em = new ConnectionFactory().getConnection();
        Gm vendedor = null;

        try {
            vendedor = em.find(Gm.class, id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar " + e);
        } finally {
            em.close();
        }

        return vendedor;

    }

    public List<Gm> FindAll() {
        EntityManager em = new ConnectionFactory().getConnection();
        List<Gm> jogador = null;

        try {
            jogador = em.createQuery("from Gm v").getResultList();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar " + e);
        } finally {
            em.close();
        }

        return jogador;
    }

    public Gm remove(Integer id) {
        EntityManager em = new ConnectionFactory().getConnection();
        Gm jogador = null;
        try {
            jogador = em.find(Gm.class, id);
            em.getTransaction().begin();
            em.remove(jogador);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Removido com Sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao remover " + e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

        return jogador;
    }
}
