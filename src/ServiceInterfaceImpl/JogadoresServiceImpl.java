/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceInterfaceImpl;

import ServiceInterface.JogadoresService;
import com.model.bean.Jogadores;
import com.model.dao.JogadoresDAO;
import java.util.List;

/**
 *
 * @author Fabricio
 */
public class JogadoresServiceImpl implements JogadoresService{

    JogadoresDAO dao = new JogadoresDAO();
    
    
    @Override
    public void save(Jogadores player) {
        dao.save(player);
    }

    @Override
    public void update(Jogadores player) {
        dao.update(player);
    }

    @Override
    public void remove(Class<Jogadores> clazz, Integer id) {
        dao.remove(id);
    }
    @Override
    public Jogadores FindByID(Class<Jogadores> clazz, Integer id) {
        return (Jogadores)dao.findByID(id);
    }

    @Override
    public List<Jogadores> FindAllCB() {
        return dao.FindAll();
    }

    @Override
    public void ChecaCadastro(Jogadores player) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Jogadores> findALL(String clazz) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Jogadores> Paginacao(int inicio, int fim) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Long quantidadeRegistros() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
