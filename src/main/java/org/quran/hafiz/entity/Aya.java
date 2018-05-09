package org.quran.hafiz.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: duaazahi
 * Date: Sat 05 May, 2018
 * Time: 10:07 PM
 * Project: quran.hafiz
 * To change this template use File | Settings | File and Code Templates.
 */
@Entity
public class Aya implements Serializable {
    @Id
    private Short id;

    private Short orderInSura;

    @ManyToOne
    private Sura sura;

    private String text;

    private Short letterCount;

    public Aya() {
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public Short getOrderInSura() {
        return orderInSura;
    }

    public void setOrderInSura(Short orderInSura) {
        this.orderInSura = orderInSura;
    }

    public Sura getSura() {
        return sura;
    }

    public void setSura(Sura sura) {
        this.sura = sura;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Short getLetterCount() {
        return letterCount;
    }

    public void setLetterCount(Short letterCount) {
        this.letterCount = letterCount;
    }
}
