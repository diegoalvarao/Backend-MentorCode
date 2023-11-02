package com.example.MentorCode.Service;

import com.example.MentorCode.Entity.Users;
import com.example.MentorCode.Repositorio.UsersRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class USIMPL implements UsersService{

    @Autowired
    private UsersRepositorio usersRepositorio;


    @Override
    public List<Users> consultarUsers() {
        return (List<Users>) this.usersRepositorio.findAll() ;
    }

    @Override
    public Users crearUsers(Users users) {
        return this.usersRepositorio.save(users);
    }

    @Override
    public Users modificarUsers(Users users) {
        List<Users> usersList = consultarUsers();
        return this.usersRepositorio.save(users);
    }

    @Override
    public Users buscarUsers(int ID_User) {
        return this.usersRepositorio.findById(ID_User).get();
    }

    @Override
    public void eliminarUsers(int ID_User) {
        this.usersRepositorio.deleteById(ID_User);
    }
}
