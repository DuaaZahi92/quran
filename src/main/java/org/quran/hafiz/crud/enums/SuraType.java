package org.quran.hafiz.crud.enums;

/**
 * Created by IntelliJ IDEA.
 * User: duaazahi
 * Date: Sat 05 May, 2018
 * Time: 10:09 PM
 * Project: quran.hafiz
 * To change this template use File | Settings | File and Code Templates.
 */
public enum SuraType {
    MECCAN(0,"Meccan","مكية"),
    MEDINAN(1,"Medinan","مدنية");

    SuraType(Integer id,String en_name,String ar_name){

    }
    private Integer id;

    private String enName;

    private String arName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getArName() {
        return arName;
    }

    public void setArName(String arName) {
        this.arName = arName;
    }
}
