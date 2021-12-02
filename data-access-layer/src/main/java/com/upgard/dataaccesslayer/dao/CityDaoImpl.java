package com.upgard.dataaccesslayer.dao;

import com.upgard.dataaccesslayer.entities.City;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

@Repository
public class CityDaoImpl implements CityDao{
    private SessionFactory sessionFactory ;

    @Autowired
    public CityDaoImpl(EntityManagerFactory entityManagerFactory){
        this.sessionFactory = entityManagerFactory.unwrap(SessionFactory.class) ;
    }


    @Override
    public City save(City city) {

        // 1. Open a new session and start a database transaction
        Session session = this.sessionFactory.openSession() ;
        Transaction transaction = session.beginTransaction() ;

        // 2. Save the entity into the database
        session.save(city) ;

        // 3. Commit the transaction and close the session
        transaction.commit();
        session.close();

        return city ;


    }

    @Override
    public City findById(int id) {
        return null;
    }

    @Override
    public City update(City city) {
        return null;
    }

    @Override
    public void delete(City city) {

    }
}
