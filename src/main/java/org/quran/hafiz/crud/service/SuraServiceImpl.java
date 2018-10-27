package org.quran.hafiz.crud.service;

import org.modelmapper.ModelMapper;
import org.quran.hafiz.crud.entity.Sura;
import org.quran.hafiz.crud.enums.SuraType;
import org.quran.hafiz.crud.model.Aya;
import org.quran.hafiz.crud.model.SuraTempModel;
import org.quran.hafiz.crud.repository.SuraRepository;
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
 * Date: Sat 09 Jun, 2018
 * Time: 6:22 PM
 * Project: quran.hafiz
 * To change this template use File | Settings | File and Code Templates.
 */
@Service
public class SuraServiceImpl implements SuraService {

    private static final Logger logger = LoggerFactory
            .getLogger(SuraServiceImpl.class);

    @Autowired
    private SuraRepository suraRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<org.quran.hafiz.crud.model.Sura> findAll() {
        Iterable<org.quran.hafiz.crud.entity.Sura> all = suraRepository.findAll();
        return StreamSupport.stream(all.spliterator(), true)
                .map(this::convertEntityToModel).collect(Collectors.toList());
    }

    @Override
    public void setSuras(List<SuraTempModel> tempModels) {
        if (tempModels != null){
            tempModels.stream().forEach(m -> {
                Sura sura = new Sura();
                sura.setId(m.getIndex().byteValue());
                sura.setEnName(m.getEname());
                sura.setArName(m.getName());
                sura.setEnTransliteration(m.getTname());
                sura.setOrder(m.getOrder().byteValue());
                sura.setAyaCount(m.getAyas());
                sura.setSuraType(m.getType().equals("Meccan")? SuraType.MECCAN: SuraType.MEDINAN);
                suraRepository.save(sura);
                logger.info("Saved sura: {}, name: {}", sura.getId(),sura.getEnName());
            });
        }

    }


    private org.quran.hafiz.crud.model.Sura convertEntityToModel(org.quran.hafiz.crud.entity.Sura entity) {
        if (entity != null) {
            org.quran.hafiz.crud.model.Sura suraDTO = new org.quran.hafiz.crud.model.Sura();
            suraDTO.setId(entity.getId());
            suraDTO.setArName(entity.getArName());
            suraDTO.setEnName(entity.getEnName());
            suraDTO.setAyaCount(entity.getAyaCount());
            suraDTO.setEnTransliteration(entity.getEnTransliteration());
            suraDTO.setOrder(entity.getOrder());
            suraDTO.setSuraType(entity.getSuraType());
            return suraDTO;
        }
        return null;
    }
}
