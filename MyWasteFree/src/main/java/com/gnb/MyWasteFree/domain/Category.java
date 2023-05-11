package com.gnb.MyWasteFree.domain;

public class Category {
    private Long cnum; //pk
    private String main_category; // 쓰레기 메인 카테고리
    private String trash_photo; // 쓰레기 카테고리 사진
    private String method; //분리수거 방법
    private int recycle_permit; // 재활용 가능 여부

    public Long getCnum() {
        return cnum;
    }

    public void setCnum(Long cnum) {
        this.cnum = cnum;
    }

    public String getMain_category() {
        return main_category;
    }

    public void setMain_category(String main_category) {
        this.main_category = main_category;
    }

    public String getTrash_photo() {
        return trash_photo;
    }

    public void setTrash_photo(String trash_photo) {
        this.trash_photo = trash_photo;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public int getRecycle_permit() {
        return recycle_permit;
    }

    public void setRecycle_permit(int recycle_permit) {
        this.recycle_permit = recycle_permit;
    }

    @Override
    public String toString() {
        return "Category{" +
                "cnum=" + cnum +
                ", main_category='" + main_category + '\'' +
                ", trash_photo='" + trash_photo + '\'' +
                ", method='" + method + '\'' +
                ", recycle_permit=" + recycle_permit +
                '}';
    }
}
