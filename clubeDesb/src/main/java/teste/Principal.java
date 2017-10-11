
package teste;

import com.desb.DAO.SexoDAO;
import com.desb.model.Sexo;
import com.desb.util.DataBase;


public class Principal {
    public static void main(String[] args) {
        Sexo sexo = new Sexo();
        sexo.setNome("Feminino");
        sexo.setSigla('F');
       new SexoDAO().insert(sexo);
    
       
    }
    
    
}
