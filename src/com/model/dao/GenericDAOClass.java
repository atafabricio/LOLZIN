/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.dao;

import com.lolzin.daointerfaces.EntidadeBase;
import com.lolzin.daointerfaces.GenericDAO;
import com.connection.ConnectionFactory;
import java.awt.HeadlessException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Fabricio
 * @param <T>
 */
public class GenericDAOClass<T extends EntidadeBase> implements GenericDAO {

    @Override
    public void save(Object t) {
        EntityManager em = new ConnectionFactory().getConnection();
        try {
            em.getTransaction().begin();
            em.persist(t);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso");
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar " + e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    

    @Override
    public void update(Object t) {
        EntityManager em = new ConnectionFactory().getConnection();

        try {
            em.getTransaction().begin();
            em.merge(t);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso");
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar " + e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    @Override
    public void remove(Class clazz, Integer id) {
                EntityManager em = new ConnectionFactory().getConnection();
        Object t = null;
        try {
            t = em.find(clazz, id);
            em.getTransaction().begin();
            em.remove(t);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Removido com Sucesso");
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Erro ao remover " + e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    @Override
    public List findALL(String clazz) {
                EntityManager em = new ConnectionFactory().getConnection();
        List<T> t = null;

        try {
            t = em.createQuery("from " + clazz + " o").getResultList();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar " + e);
        } finally {
            em.close();
        }

        return t;
    }

    @Override
    public Object FindByID(Class clazz, Integer id) {
        EntityManager em = new ConnectionFactory().getConnection();
        Object t = null;

        try {
            t = em.find(clazz, id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar " + e);
        } finally {
            em.close();
        }

        return t;

    }



    
}
