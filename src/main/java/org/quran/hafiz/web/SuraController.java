package org.quran.hafiz.web;

import org.quran.hafiz.crud.service.AyaService;
import org.quran.hafiz.crud.service.SuraService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: duaazahi
 * Date: Sat 09 Jun, 2018
 * Time: 6:20 PM
 * Project: quran.hafiz
 * To change this template use File | Settings | File and Code Templates.
 */
@Controller
@RequestMapping("/api/sura")
public class SuraController {

    private static final Logger logger = LoggerFactory
            .getLogger(SuraController.class);

    @Autowired
    private SuraService suraService;

    @ResponseBody
    @GetMapping
    public ResponseEntity<?> getSuras(){
        try {
            List suras = suraService.findAll();
            return new ResponseEntity<>(suras, HttpStatus.OK);
        } catch (Exception e){
            logger.error("Exception GET getSuras ",e);
        }
        return new ResponseEntity<>( "Error GET getSuras", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ResponseBody
    @GetMapping(value = "sura/{id}")
    public ResponseEntity<?> getAyaForSura(@PathVariable("id") Integer id){
        try {
//            List ayas = suraService.findAyasBySura((byte)id.intValue());
//            return new ResponseEntity<>(ayas, HttpStatus.OK);
        } catch (Exception e){
            logger.error("Exception GET getAyaForSura ",e);
        }
        return new ResponseEntity<>( "Error GET getAyaForSura", HttpStatus.INTERNAL_SERVER_ERROR);
    }


}
