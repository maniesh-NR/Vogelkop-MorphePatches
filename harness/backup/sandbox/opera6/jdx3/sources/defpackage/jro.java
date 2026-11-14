package defpackage;

import java.io.File;

/* loaded from: classes.dex */
public final class jro {
    public final byte a;
    public String b;
    public final String c;
    public final mjo d;
    public final wci e;
    public final File f;
    public final fr g;
    public final int h;
    public int i;
    public boolean j;

    public jro(String str, File file, wci wciVar) {
        this.b = str;
        this.a = (byte) 11;
        this.f = file;
        this.e = wciVar;
        this.g = new fr((byte) 29, 0);
    }

    public jro(String str, String str2, int i, int i2, mjo mjoVar) {
        this.b = str;
        this.a = (byte) 12;
        this.c = str2;
        this.g = new fr((byte) 29, i);
        this.h = i2;
        this.d = mjoVar;
    }

    public jro(String str, mjo mjoVar, int i, int i2) {
        this.b = str;
        this.a = (byte) 11;
        this.d = mjoVar;
        this.g = new fr((byte) 29, i);
        this.h = i2;
    }
}
