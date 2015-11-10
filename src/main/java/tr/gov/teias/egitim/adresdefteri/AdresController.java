/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.gov.teias.egitim.adresdefteri;

import java.io.Serializable;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.lang.Long;

/**
 *
 * @author mehmet
 */
@Named
@SessionScoped
public class AdresController implements Serializable {

    @Inject
    private AdresRepository repository;
    
    private List<Adres> adresler;
    
    private Adres current;

    public Adres getCurrent() {
        return current;
    }

    public void setCurrent(Adres current) {
        this.current = current;
    }

    public List<Adres> getAdresler() {
        if (adresler == null){
            populateAdresler();
        }
        return adresler;
    }

    public void setAdresler(List<Adres> adresler) {
        this.adresler = adresler;
    }

    protected void populateAdresler() {
        adresler = repository.findAll();
      
    }
    
    public void newAdres(){
        current = new Adres();
    }
    
    @Transactional
    public void save(){
        repository.save(current);
    }
    
    @Transactional
    public void delete(){
        repository.remove(current);
        current = null;
    }
    
    public void edit(Long id){
        current = repository.findBy(id);
    }

}
