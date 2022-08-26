package br.com.up.listadepresentes.repositories;

import br.com.up.listadepresentes.models.Gift;

public class GiftRepository {

    private static GiftRepository repositor;

    public static GiftRepository getRepository(){

        if(repositor == null){
            repositor = new GiftRepository();
        }
        return repositor;
    }

    private GiftRepository(){}
}
