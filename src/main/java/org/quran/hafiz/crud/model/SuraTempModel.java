package org.quran.hafiz.crud.model;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by IntelliJ IDEA.
 * User: duaazahi
 * Date: Sat 09 Jun, 2018
 * Time: 6:24 PM
 * Project: quran.hafiz
 * To change this template use File | Settings | File and Code Templates.
 */
@Getter
@Setter
@XmlRootElement(name="suras")
public class SuraTempModel {
    private Short index;
    private Short ayas;
    private Short start;
    private String name;
    private String tname;
    private String ename;
    private String type;
    private Short order;
    private Integer rukus;

    public Short getIndex() {
        return index;
    }

    public void setIndex(Short index) {
        this.index = index;
    }

    public Short getAyas() {
        return ayas;
    }

    public void setAyas(Short ayas) {
        this.ayas = ayas;
    }

    public Short getStart() {
        return start;
    }

    public void setStart(Short start) {
        this.start = start;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Short getOrder() {
        return order;
    }

    public void setOrder(Short order) {
        this.order = order;
    }

    public Integer getRukus() {
        return rukus;
    }

    public void setRukus(Integer rukus) {
        this.rukus = rukus;
    }
}
