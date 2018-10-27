package org.quran.hafiz.crud.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: duaazahi
 * Date: Tue 15 May, 2018
 * Time: 10:21 PM
 * Project: quran.hafiz
 * To change this template use File | Settings | File and Code Templates.
 */
@Getter
@Setter
@NoArgsConstructor
@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Aya implements Serializable {
    private Short id;

    private Short orderInSura;

    private Byte sura;

    private String text;

    private Short letterCount;

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

    public Byte getSura() {
        return sura;
    }

    public void setSura(Byte sura) {
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
