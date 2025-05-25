package com.perfumelandiagroup.perfumelandia3.repository;

import com.perfumelandiagroup.perfumelandia3.model.LoginModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LoginRepository {

    private List<LoginModel> listaLogin = new ArrayList<>();

    public LoginRepository(List<LoginModel> listarLogins) {this.listaLogin = listarLogins;}

    public List<LoginModel> obtenerLogin() {return listaLogin;}

    public LoginModel buscarPorRut (String rut) {
        for (LoginModel login : listaLogin) {
            if(login.getRut() == rut){
                return login;
            }
        }
        return null;
    }

    public LoginModel guardar(LoginModel login) {
        listaLogin.add(login);
        return login;
    }

    public void Eliminar (String rut) {
        LoginModel login = buscarPorRut(rut);
        if(login != null){
            listaLogin.remove(login);
        }

        int rutPosicion = 0;
        for (int i = 0; 1 < listaLogin.size(); i++){
            if(listaLogin.get(i).getRut() == rut){
                rutPosicion = 1;
                break;
            }
        }
        if (rutPosicion > 0){
            listaLogin.remove(rutPosicion);
        }


        listaLogin.removeIf(x -> x.getRut() == rut);
    }

    public LoginModel actualizar(LoginModel login) {
        int rutPosicion = 0;

        for (int i = 0; 1 < listaLogin.size(); i++){
            if (listaLogin.get(i).getRut().equals(login.getRut())){
                rutPosicion = 1;
                break;
            }
        }
        if (rutPosicion == 0){
            return null;
        }

        LoginModel loginP = new LoginModel();
        loginP.setRut(login.getRut());
        loginP.setPrimerNombre(loginP.getPrimerNombre());
        loginP.setPrimerApellido(loginP.getPrimerApellido());
        loginP.setSegundoApellido(loginP.getSegundoApellido());
        loginP.setTelefono(loginP.getTelefono());
        loginP.setDireccion(loginP.getDireccion());
        loginP.setCorreo(loginP.getCorreo());

        listaLogin.set(rutPosicion, loginP);
        return loginP;
    }



}