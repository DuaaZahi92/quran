package org.quran.hafiz.crud.model;

import lombok.Getter;
import lombok.Setter;
import org.quran.hafiz.crud.enums.SuraType;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: duaazahi
 * Date: Fri 08 Jun, 2018
 * Time: 4:14 PM
 * Project: quran.hafiz
 * To change this template use File | Settings | File and Code Templates.
 */
@Getter
@Setter
@XmlRootElement
public class Sura implements Serializable {
    private Byte id;

    private Short ayaCount;

    private String arName;

    private String enName;

    private String enTransliteration;

    private SuraType suraType;

    private Byte order;

    public Byte getId() {
        return id;
    }

    public void setId(Byte id) {
        this.id = id;
    }

    public Short getAyaCount() {
        return ayaCount;
    }

    public void setAyaCount(Short ayaCount) {
        this.ayaCount = ayaCount;
    }

    public String getArName() {
        return arName;
    }

    public void setArName(String arName) {
        this.arName = arName;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getEnTransliteration() {
        return enTransliteration;
    }

    public void setEnTransliteration(String enTransliteration) {
        this.enTransliteration = enTransliteration;
    }

    public SuraType getSuraType() {
        return suraType;
    }

    public void setSuraType(SuraType suraType) {
        this.suraType = suraType;
    }

    public Byte getOrder() {
        return order;
    }

    public void setOrder(Byte order) {
        this.order = order;
    }
}
