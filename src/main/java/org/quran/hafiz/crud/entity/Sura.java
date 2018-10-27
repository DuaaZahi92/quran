package org.quran.hafiz.crud.entity;

import org.quran.hafiz.crud.enums.SuraType;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: duaazahi
 * Date: Sat 05 May, 2018
 * Time: 10:06 PM
 * Project: quran.hafiz
 * To change this template use File | Settings | File and Code Templates.
 */
@Entity
@Table(name = "sura")
public class Sura implements Serializable {
    @Id
    private Byte id;

    @Column(name="aya_count")
    private Short ayaCount;

    @Column(name="ar_name", length = 45)
    private String arName;

    @Column(name="en_name", length = 45)
    private String enName;

    @Column(name="en_transliteration", length = 45)
    private String enTransliteration;

    @Column(name = "sura_type")
    @Enumerated(EnumType.ORDINAL)
    private SuraType suraType;

    private Byte order;

    @OneToMany(fetch=FetchType.LAZY, mappedBy="sura")
    private Set<Aya> ayas = new HashSet<Aya>(0);

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

    public Set<Aya> getAyas() {
        return ayas;
    }

    public void setAyas(Set<Aya> ayas) {
        this.ayas = ayas;
    }
}
