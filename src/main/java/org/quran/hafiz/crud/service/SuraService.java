package org.quran.hafiz.crud.service;

import org.quran.hafiz.crud.model.Aya;
import org.quran.hafiz.crud.model.Sura;
import org.quran.hafiz.crud.model.SuraTempModel;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: duaazahi
 * Date: Sat 09 Jun, 2018
 * Time: 6:21 PM
 * Project: quran.hafiz
 * To change this template use File | Settings | File and Code Templates.
 */
public interface SuraService {

    List<Sura> findAll();

    void setSuras(List<SuraTempModel> tempModels);
}
