package org.quran.hafiz.crud.repository;

import org.quran.hafiz.crud.entity.Aya;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: duaazahi
 * Date: Sat 12 May, 2018
 * Time: 6:25 PM
 * Project: quran.hafiz
 * To change this template use File | Settings | File and Code Templates.
 */
@Repository
public interface AyaRepository extends JpaRepository<Aya, Short> {

    public List<Aya> findBySuraId(Byte id);

    public Aya findByOrderInSura(Short ois);

}
