package org.quran.hafiz.web;
import org.quran.hafiz.crud.service.AyaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: duaazahi
 * Date: Sat 12 May, 2018
 * Time: 8:39 PM
 * Project: quran.hafiz
 * To change this template use File | Settings | File and Code Templates.
 */
@Controller
@RequestMapping("/api/aya")
public class AyaController {

    private static final Logger logger = LoggerFactory
            .getLogger(AyaController.class);

    @Autowired
    private AyaService ayaService;

    @ResponseBody
    @GetMapping
    public ResponseEntity<?> getAyas(){
        try {
            List ayas = ayaService.findAll();
            return new ResponseEntity<>(ayas, HttpStatus.OK);
        } catch (Exception e){
            logger.error("Exception GET getAyas ",e);
        }
        return new ResponseEntity<>( "Error GET getAyas", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ResponseBody
    @GetMapping(value = "sura/{id}")
    public ResponseEntity<?> getAyaForSura(@PathVariable("id") Integer id){
        try {
            if (id == null || id <1 || id > 114) {
                logger.error("getAyaForSura: Wrong sura id value: {}, should be between (0-114]", id);
                return new ResponseEntity<>("Sura id is wrong. should be between (0-114]", HttpStatus.BAD_REQUEST);
            }
            List ayas = ayaService.findAyasBySura((byte)id.intValue());
            return new ResponseEntity<>(ayas, HttpStatus.OK);
        } catch (Exception e){
            logger.error("Exception GET getAyaForSura ",e);
        }
        return new ResponseEntity<>( "Error GET getAyaForSura", HttpStatus.INTERNAL_SERVER_ERROR);
    }


    @ResponseBody
    @GetMapping(value="/lcount")
    public ResponseEntity<?> setLetterCount(){
        try {
            ayaService.setLetterCount();
            return ResponseEntity.ok("");
        } catch (Exception e){
            logger.error("Exception setLetterCount ",e);
        }
        return new ResponseEntity<>( "Error happened on server.", HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
