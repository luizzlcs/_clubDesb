/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desb.DAO;

import com.desb.model.Estado;
import com.desb.util.GenericDAO;
import java.util.List;

/**
 *
 * @author laoslcs
 */
public class EstadoDAO extends GenericDAO<Estado> {

    @Override
    public Class<Estado> getClassType() {
        return Estado.class;
    }

    public List<Estado> buscarPorNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
