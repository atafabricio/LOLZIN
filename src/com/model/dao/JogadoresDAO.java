/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.dao;

import com.model.bean.Jogadores;
import com.connection.ConnectionFactory;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
/**
 *
 * @author fabricio
 */
public class JogadoresDAO {
     public Jogadores save(Jogadores vendedor) {
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

    public Jogadores update(Jogadores vendedor) {
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

    public Jogadores findByID(Integer id) { //BUSCA OS USUARIOS CADASTRADOS

        EntityManager em = new ConnectionFactory().getConnection();
        Jogadores vendedor = null;

        try {
            vendedor = em.find(Jogadores.class, id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar " + e);
        } finally {
            em.close();
        }

        return vendedor;

    }

    public List<Jogadores> FindAll() {
        EntityManager em = new ConnectionFactory().getConnection();
        List<Jogadores> jogador = null;

        try {
            jogador = em.createQuery("from Jogadores v").getResultList();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar " + e);
        } finally {
            em.close();
        }

        return jogador;
    }

    public Jogadores remove(Integer id) {
        EntityManager em = new ConnectionFactory().getConnection();
        Jogadores jogador = null;
        try {
            jogador = em.find(Jogadores.class, id);
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
