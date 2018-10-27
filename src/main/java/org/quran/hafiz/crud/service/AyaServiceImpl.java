package org.quran.hafiz.crud.service;

import org.modelmapper.ModelMapper;
import org.quran.hafiz.crud.entity.Sura;
import org.quran.hafiz.crud.repository.AyaRepository;
import org.quran.hafiz.crud.model.Aya;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * Created by IntelliJ IDEA.
 * User: duaazahi
 * Date: Tue 15 May, 2018
 * Time: 10:18 PM
 * Project: quran.hafiz
 * To change this template use File | Settings | File and Code Templates.
 */
@Service
public class AyaServiceImpl implements AyaService<Aya> {

    private static final Logger logger = LoggerFactory
            .getLogger(AyaServiceImpl.class);

    @Autowired
    private AyaRepository ayaRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<Aya> findAll() {
        Iterable<org.quran.hafiz.crud.entity.Aya> all = ayaRepository.findAll();
        return StreamSupport.stream(all.spliterator(), true)
                .map(this::convertEntityToModel).collect(Collectors.toList());
    }

    @Override
    public List<Aya> findAyasBySura(Byte suraId) {
        List<org.quran.hafiz.crud.entity.Aya> ayas = ayaRepository.findBySuraId(suraId);
        return ayas.stream().map(this::convertEntityToModel).collect(Collectors.toList());
    }

    @Override
    public void setLetterCount() {
        Iterable<org.quran.hafiz.crud.entity.Aya> all = ayaRepository.findAll();
        StreamSupport.stream(all.spliterator(), true)
                .forEach(aya -> {
                    short lcount = (short) aya.getText().length();
                    aya.setLetterCount(lcount);
                    ayaRepository.save(aya);
                    logger.info("Set Letter cound for aya: {} to {}", aya.getText(), lcount);
                });
    }

    private Aya convertEntityToModel(org.quran.hafiz.crud.entity.Aya entity) {
        if (entity != null) {
            Aya ayaDTO = new Aya();
            ayaDTO.setId(entity.getId());
            ayaDTO.setText(entity.getText());
            ayaDTO.setLetterCount(entity.getLetterCount());
            ayaDTO.setOrderInSura(entity.getOrderInSura());
            Sura s = entity.getSura();
            if (s != null && s.getId() != null) {
                ayaDTO.setSura(s.getId());
            }
            return ayaDTO;
        }
        return null;
    }
}
