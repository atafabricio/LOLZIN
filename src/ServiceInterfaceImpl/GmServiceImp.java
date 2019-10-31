/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceInterfaceImpl;

import ServiceInterface.GmService;
import com.model.bean.Gm;
import com.model.dao.GmDAO;
import java.util.List;

/**
 *
 * @author Fabricio
 */
public class GmServiceImp implements GmService {

    GmDAO dao = new GmDAO();

    @Override
    public void save(Gm gm) {
        dao.save(gm);
    }

    @Override
    public void update(Gm gm) {
        dao.update(gm);
    }

    @Override
    public void remove(Class<Gm> clazz, Integer id) {
        dao.remove(id);
    }

    @Override
    public List<Gm> findALL(String clazz) {
        return dao.FindAll();
    }

    @Override
    public Gm FindByID(Class<Gm> clazz, Integer id) {
        return (Gm) dao.findByID(clazz, id);
    }

    @Override
    public List<Gm> FindAllCB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
