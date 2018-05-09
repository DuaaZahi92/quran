package org.quran.hafiz.entity;

import javax.persistence.*;
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
public class Juz implements Serializable {
    @Id
    private Byte id;

    private String arName;

    @OneToOne
    private Aya startAya;

    public Juz() {
    }

    public Byte getId() {
        return id;
    }

    public void setId(Byte id) {
        this.id = id;
    }

    public String getArName() {
        return arName;
    }

    public void setArName(String arName) {
        this.arName = arName;
    }

    public Aya getStartAya() {
        return startAya;
    }

    public void setStartAya(Aya startAya) {
        this.startAya = startAya;
    }
}
