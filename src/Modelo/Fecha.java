package Modelo;

import java.util.Calendar;
import java.util.Date;


public class Fecha {
    private int dd,  mm, aa, hr, min;
    
    public Fecha(int dd, int mm, int aa, int hr, int min) {
        this.dd = dd;
        this.mm = mm;
        this.aa = aa;
        this.hr = hr;
        this.min = min;
    }

    public Fecha() {
        Calendar fecha = Calendar.getInstance();
        Date fecha2 = new Date();
        this.dd = fecha.get(Calendar.DAY_OF_MONTH);
        this.mm = fecha.get(Calendar.MONTH)+1;
        this.aa = fecha.get(Calendar.YEAR);
        this.hr = fecha2.getHours();
        this.min = fecha2.getMinutes();
    }

    public int getDd() {
        return dd;
    }

    public void setDd(int dd) {
        this.dd = dd;
    }

    public int getMm() {
        return mm;
    }

    public void setMm(int mm) {
        this.mm = mm;
    }

    public int getAa() {
        return aa;
    }

    public void setAa(int aa) {
        this.aa = aa;
    }

    public int getHr() {
        return hr;
    }

    public void setHr(int hr) {
        this.hr = hr;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    @Override
    public String toString() {
        return dd + "/" + mm + "/" + aa ;
    }
}