package com.lllgoyour;

public class StellarBody {
    private String hip;
    private String vmag;
    private String ra;
    private String dec;
    private String plx;
    private String b_v;
    private String spType;

   public String getHip() {
        return hip;
    }

    public String getVmag() {
        return vmag;
    }

    public String getRa() {
        return ra;
    }

    public String getDec() {
        return dec;
    }

    public String getPlx() {
        return plx;
    }

    public String getB_v() {
        return b_v;
    }

    public String getSpType() {
        return spType;
    }

    // Setter 方法
    public void setHip(String hip) {
        this.hip = hip;
    }

    public void setVmag(String vmag) {
        this.vmag = vmag;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public void setDec(String dec) {
        this.dec = dec;
    }

    public void setPlx(String plx) {
        this.plx = plx;
    }

    public void setB_v(String b_v) {
        this.b_v = b_v;
    }

    public void setSpType(String spType) {
        this.spType = spType;
    }
}
