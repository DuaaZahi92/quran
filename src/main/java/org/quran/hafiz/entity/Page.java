package org.quran.hafiz.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: duaazahi
 * Date: Sat 05 May, 2018
 * Time: 10:09 PM
 * Project: quran.hafiz
 * To change this template use File | Settings | File and Code Templates.
 */
@Entity
public class Page implements Serializable {
    @Id
    private Short id;

    @OneToOne
    private Aya startAya;

    @OneToOne
    private Aya endAya;

    public Page() {
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public Aya getStartAya() {
        return startAya;
    }

    public void setStartAya(Aya startAya) {
        this.startAya = startAya;
    }

    public Aya getEndAya() {
        return endAya;
    }

    public void setEndAya(Aya endAya) {
        this.endAya = endAya;
    }
}
