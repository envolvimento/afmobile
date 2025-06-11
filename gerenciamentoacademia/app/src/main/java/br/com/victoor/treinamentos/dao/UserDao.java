package br.com.thales.treinamentos.dao;

import com.google.firebase.firestore.FirebaseFirestore;

import br.com.thales.treinamentos.model.User;

public class UserDao {

    FirebaseFirestore db;
    private boolean result;

    public  void Insert(User user){
        db = FirebaseFirestore.getInstance();

    }

    public boolean getUserId(java.lang.String id){
        return true;
    }


}
