package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class jh9 {
    public final ArrayList a;
    public final char b;
    public final double c;
    public final String d;
    public final String e;

    public jh9(ArrayList arrayList, char c, double d, String str, String str2) {
        this.a = arrayList;
        this.b = c;
        this.c = d;
        this.d = str;
        this.e = str2;
    }

    public static int a(char c, String str, String str2) {
        return str2.hashCode() + z1m.f(c * 31, 31, str);
    }

    public final int hashCode() {
        return a(this.b, this.e, this.d);
    }
}
