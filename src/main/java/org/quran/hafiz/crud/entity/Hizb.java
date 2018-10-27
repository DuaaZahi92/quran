package org.quran.hafiz.crud.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: duaazahi
 * Date: Wed 09 May, 2018
 * Time: 10:26 PM
 * Project: quran.hafiz
 * To change this template use File | Settings | File and Code Templates.
 */
@Entity
public class Hizb implements Serializable {

    @Id
    private Byte id;

    @OneToOne
    private Aya startAya;

    public Hizb() {
    }

    public Byte getId() {
        return id;
    }

    public void setId(Byte id) {
        this.id = id;
    }

    public Aya getStartAya() {
        return startAya;
    }

    public void setStartAya(Aya startAya) {
        this.startAya = startAya;
    }
}
