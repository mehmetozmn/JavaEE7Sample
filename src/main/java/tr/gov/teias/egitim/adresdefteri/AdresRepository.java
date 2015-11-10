/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.gov.teias.egitim.adresdefteri;

import java.util.List;
import javax.enterprise.context.Dependent;
import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.Repository;

/**
 * Adres kayıtları için repository servsi
 * @author mehmet
 */
@Repository
@Dependent
public abstract class AdresRepository extends AbstractEntityRepository<Adres, Long> {

    /**
     * Verilen tckn'ye ait adres bilgisini döndürür.
     * @param tckn
     * @return eğer kayıt bulamazsa içi boş liste döner.
     */
    public abstract List<Adres> FindByTckn( String tckn);

}
