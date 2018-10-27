package org.quran.hafiz.crud.service;

import org.quran.hafiz.crud.model.Aya;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: duaazahi
 * Date: Tue 15 May, 2018
 * Time: 10:20 PM
 * Project: quran.hafiz
 * To change this template use File | Settings | File and Code Templates.
 */
public interface AyaService<T extends Aya> {

    List<Aya> findAll();

    List<Aya> findAyasBySura(Byte suraId);


    void setLetterCount();
}
