/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desb.DAO;

import com.desb.model.Cargo;
import com.desb.util.GenericDAO;

/**
 *
 * @author laoslcs
 */
public class CargoDAO extends GenericDAO<Cargo> {

    @Override
    public Class<Cargo> getClassType() {
        return Cargo.class;
    }
    
}
