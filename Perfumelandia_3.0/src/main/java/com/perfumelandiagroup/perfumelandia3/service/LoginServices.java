package com.perfumelandiagroup.perfumelandia3.service;

import com.perfumelandiagroup.perfumelandia3.repository.LoginRepository;
import com.perfumelandiagroup.perfumelandia3.model.LoginModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class LoginServices {
    @Autowired
    private LoginRepository loginRepository;

    public List<LoginModel> getLogins() {return loginRepository.obtenerLogin();}

    public LoginModel saveLogin(LoginModel loginModel) {return loginRepository.guardar(loginModel);}

    public LoginModel updateLogin(LoginModel loginModel) {return loginRepository.actualizar(loginModel);}

    public LoginModel getRutModel(String rut) {return loginRepository.buscarPorRut(rut);}

    public String deleteLogin(String rut) {
        loginRepository.Eliminar(rut);
        return "Se ha eliminado el usuario";
    }

    public int totalLogins() {return loginRepository.obtenerLogin().size();}
}
