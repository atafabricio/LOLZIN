/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceInterface;

import com.model.bean.Gm;
import java.util.List;

/**
 *
 * @author Fabricio
 */
public interface GmService {

    public void save(Gm carro);

    public void update(Gm carro);

    public void remove(Class<Gm> clazz, Integer id);

    public List<Gm> findALL(String clazz);

    public Gm FindByID(Class<Gm> clazz, Integer id);
    
    public List<Gm> FindAllCB();
}
