package org.quran.hafiz.crud.entity;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.springframework.web.bind.annotation.RequestMapping;

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
@Table(name="aya")
public class Aya implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Short id;

    @Column(name="order_in_sura")
    private Short orderInSura;

    @NotFound(action = NotFoundAction.IGNORE)
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="sura", nullable=true)
    private Sura sura;

    private String text;

    @Column(name="letter_count")
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
