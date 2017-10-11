/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desb.DAO;

import com.desb.model.MeusDistintivos;
import com.desb.util.GenericDAO;

/**
 *
 * @author laoslcs
 */
public class MeusDistintivosDAO extends GenericDAO<MeusDistintivos> {

    @Override
    public Class<MeusDistintivos> getClassType() {
        return MeusDistintivos.class;
    }
    
}
