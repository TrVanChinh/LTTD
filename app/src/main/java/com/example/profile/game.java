package com.example.profile;

public class game {

    private int stt;
    private int logogame;
    private int anhgame;
    private String tengame;
    private String theloai;
    private String danhgia;
    private String dungluong;
    private int star;
    private String chitiet;

    public game(int stt, int logogame, int anhgame, String tengame, String theloai, String danhgia, String dungluong, int star, String chitiet) {
        this.stt = stt;
        this.logogame = logogame;
        this.anhgame = anhgame;
        this.tengame = tengame;
        this.theloai = theloai;
        this.danhgia = danhgia;
        this.dungluong = dungluong;
        this.star = star;
        this.chitiet = chitiet;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public int getLogogame() {
        return logogame;
    }

    public void setLogogame(int logogame) {
        this.logogame = logogame;
    }

    public int getAnhgame() {
        return anhgame;
    }

    public void setAnhgame(int anhgame) {
        this.anhgame = anhgame;
    }

    public String getTengame() {
        return tengame;
    }

    public void setTengame(String tengame) {
        this.tengame = tengame;
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    public String getDanhgia() {
        return danhgia;
    }

    public void setDanhgia(String danhgia) {
        this.danhgia = danhgia;
    }

    public String getDungluong() {
        return dungluong;
    }

    public void setDungluong(String dungluong) {
        this.dungluong = dungluong;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public String getChitiet() {
        return chitiet;
    }

    public void setChitiet(String chitiet) {
        this.chitiet = chitiet;
    }
}
