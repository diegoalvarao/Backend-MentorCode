package com.example.MentorCode.Service;

import com.example.MentorCode.Entity.Users;
import org.apache.catalina.User;

import java.util.List;
import java.util.Optional;

public interface UsersService {

    public List<Users> consultarUsers();

    public Users crearUsers (Users users);

    public Users modificarUsers(Users users);

    public Users buscarUsers(int ID_User);

    public void eliminarUsers(int ID_User);

    public Users buscarEmail(String Email);
}
