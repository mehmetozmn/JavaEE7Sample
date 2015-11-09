/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.gov.teias.egitim.adresdefteri.entities;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author mehmet
 */
public class EntityManagerProducer {
    @PersistenceContext(name = "AdresDefteriPU")
    private EntityManager entityManager;
    @Produces
    public EntityManager productEntityManager(){
        return entityManager;
    }
    
}
