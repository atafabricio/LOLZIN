/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceInterface;

import com.model.bean.Jogadores;
import java.util.List;

/**
 *
 * @author Fabricio
 */
public interface JogadoresService {

    public void save(Jogadores carro);
    public void update(Jogadores carro);
    public void remove(Class<Jogadores> clazz, Integer id);
    public List<Jogadores> findALL(String clazz);
    public Jogadores FindByID(Class<Jogadores> clazz, Integer id);
    public void ChecaCadastro(Jogadores carro);
    public List<Jogadores> Paginacao(int inicio, int fim);
    public List<Jogadores> FindAllCB();
    public Long quantidadeRegistros();
    

}
