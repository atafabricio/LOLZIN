/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.dao;

import com.connection.ConnectionFactory;
import com.model.bean.Banimento;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class BanimentoDAO {

    public Banimento save(Banimento ban) {
        EntityManager em = new ConnectionFactory().getConnection();

        try {
            em.getTransaction().begin();
            em.persist(ban);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar " + e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

        return ban;
    }

    public List<Banimento> FindAll() {
        EntityManager em = new ConnectionFactory().getConnection();
        List<Banimento> ban = null;

        try {
            ban = em.createQuery("from Banimento v").getResultList();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar " + e);
        } finally {
            em.close();
        }

        return ban;
    }

    public Banimento findByID(Class<Banimento> clazz, Integer id) {

        EntityManager em = new ConnectionFactory().getConnection();
        Banimento ban = null;

        try {
            ban = em.find(Banimento.class, id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar " + e);
        } finally {
            em.close();
        }

        return ban;

    }

    public void update(Banimento ban) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void remove(Class<Banimento> clazz, Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
