/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceInterfaceImpl;

import ServiceInterface.BanimentoService;
import com.model.bean.Banimento;
import com.model.dao.BanimentoDAO;
import java.util.List;

/**
 *
    * @author Fabricio
 */
public class BanimentoServiceImpl implements BanimentoService{
        BanimentoDAO dao = new BanimentoDAO();

    @Override
    public void save(Banimento ban) {
        dao.save(ban);
    }

    @Override
    public void update(Banimento ban) {
        dao.update(ban);
    }

    @Override
    public void remove(Class<Banimento> clazz, Integer id) {
        dao.remove(clazz, id);
    }

    @Override
    public List<Banimento> findALL(String clazz) {
        return dao.FindAll();
    }

    @Override
    public Banimento FindByID(Class<Banimento> clazz, Integer id) {
        return (Banimento) dao.findByID(clazz, id);
    }
}
