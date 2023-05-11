package com.gnb.MyWasteFree.domain;

public class Trash {
    private Long tnum;
    private String trash_item;
    private String real_img;
    private int cnum;

    public Long getTnum() {
        return tnum;
    }

    public void setTnum(Long tnum) {
        this.tnum = tnum;
    }

    public String getTrash_item() {
        return trash_item;
    }

    public void setTrash_item(String trash_item) {
        this.trash_item = trash_item;
    }

    public String getReal_img() {
        return real_img;
    }

    public void setReal_img(String real_img) {
        this.real_img = real_img;
    }

    public int getCnum() {
        return cnum;
    }

    public void setCnum(int cnum) {
        this.cnum = cnum;
    }

    @Override
    public String toString() {
        return "Trash{" +
                "tnum=" + tnum +
                ", trash_item='" + trash_item + '\'' +
                ", real_img='" + real_img + '\'' +
                ", cnum=" + cnum +
                '}';
    }
}
