package com.desb.controller;

import com.desb.DAO.CargoDAO;
import com.desb.model.Cargo;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name = "cargoBean")
public class CargoBean {

    private Cargo cargo = new Cargo();

    public void salvar() {
        CargoDAO dao = new CargoDAO();
        if (this.cargo.getId() == 0) {
            dao.insert(this.cargo);
        } else {
            dao.update(this.cargo);
        }
        this.cargo = new Cargo();
    }
    
    public void editar(Cargo cargo) {
        this.cargo = cargo;
    }
    
    public void remover(Cargo cargo) {
        CargoDAO dao = new CargoDAO();
        dao.delete(cargo);
    }
    
    public List<Cargo> getCargos() {
        CargoDAO dao = new CargoDAO();
        return dao.selectAll();
    }
    
    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
    
}
