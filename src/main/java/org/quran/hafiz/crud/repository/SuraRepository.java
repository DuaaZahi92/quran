package org.quran.hafiz.crud.repository;

import org.quran.hafiz.crud.entity.Sura;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: duaazahi
 * Date: Sat 12 May, 2018
 * Time: 6:33 PM
 * Project: quran.hafiz
 * To change this template use File | Settings | File and Code Templates.
 */
public interface SuraRepository extends CrudRepository<Sura,Byte>{
    public List<Sura> findAllOrderById(PageRequest pr);
    public Sura findByOrder(Byte o);
}
