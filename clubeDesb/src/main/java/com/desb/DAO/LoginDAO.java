/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desb.DAO;

import com.desb.model.Login;
import com.desb.util.GenericDAO;

/**
 *
 * @author laoslcs
 */
public class LoginDAO extends GenericDAO<Login> {

    @Override
    public Class<Login> getClassType() {
        return Login.class;
    }
    
}
