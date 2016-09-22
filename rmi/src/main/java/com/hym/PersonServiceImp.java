package com.hym;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by hongyongming on 2016/9/22.
 */
public class PersonServiceImp extends UnicastRemoteObject implements  PersonService {

    protected PersonServiceImp() throws RemoteException {
    }

    @Override
    public List<PersonEntity> GetList() throws RemoteException {
        // TODO Auto-generated method stub
        System.out.println("Get Person Start!");
        List<PersonEntity> personList=new LinkedList<PersonEntity>();

        PersonEntity person1=new PersonEntity();
        person1.setAge(25);
        person1.setId(0);
        person1.setName("Leslie");
        personList.add(person1);

        PersonEntity person2=new PersonEntity();
        person2.setAge(25);
        person2.setId(1);
        person2.setName("Rose");
        personList.add(person2);

        return personList;
    }
}
