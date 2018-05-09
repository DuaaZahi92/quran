package org.quran.hafiz.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: duaazahi
 * Date: Sat 05 May, 2018
 * Time: 10:06 PM
 * Project: quran.hafiz
 * To change this template use File | Settings | File and Code Templates.
 */
@Entity
public class Sura implements Serializable {
    @Id
    private Byte id;

    private Short ayaCount;

    private String arName;

    private String enName;

    private String enTransliteration;

    @ManyToOne
    private SuraType suraType;

    private Byte order;

    public Sura() {
    }

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
