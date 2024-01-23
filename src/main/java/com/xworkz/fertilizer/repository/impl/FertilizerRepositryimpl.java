package com.xworkz.fertilizer.repository.impl;

import com.xworkz.fertilizer.entity.FertilizerEntity;
import com.xworkz.fertilizer.repository.FertilizerRepositry;

import javax.persistence.*;

public class FertilizerRepositryimpl implements FertilizerRepositry {

    private EntityManagerFactory emf=Persistence.createEntityManagerFactory("fertilizer");


    @Override
    public Integer save(FertilizerEntity entity) {
        System.out.println("Starting save of FertilizerEntity :"+entity);
        EntityManager em=this.emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try{
            System.out.println("Starting ET");
            et.begin();
            System.out.println("Starting persist");
            em.persist(entity);
            System.out.println("persist success");
            et.commit();
            return entity.getId();

        }catch (PersistenceException pe){
            System.err.println("Persistence in save method of Fertilizer"+pe.getMessage());
            et.rollback();
        }finally {//System.exit():kill the jvm
            System.out.println("Persistence closing");
            em.close();//memory leakages is handles
        }

        return null;
    }
}
