/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceInterface;

import com.model.bean.Banimento;
import java.util.List;

/**
 *
 * @author Fabricio
 */
public interface BanimentoService {

    public void save(Banimento carro);

    public void update(Banimento carro);

    public void remove(Class<Banimento> clazz, Integer id);

    public List<Banimento> findALL(String clazz);

    public Banimento FindByID(Class<Banimento> clazz, Integer id);

}
