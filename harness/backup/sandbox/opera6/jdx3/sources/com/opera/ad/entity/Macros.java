package com.opera.ad.entity;

/* loaded from: classes.dex */
public class Macros {
    public int error_code;
    public int h;
    public String trigger_type;
    public int w;
    public double x;
    public double y;

    public Macros(int i, int i2, double d, double d2) {
        this.h = i;
        this.w = i2;
        this.x = d;
        this.y = d2;
    }

    public Macros(String str, int i) {
        this.trigger_type = str;
        this.error_code = i;
    }
}
