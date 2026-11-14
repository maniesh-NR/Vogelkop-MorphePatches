package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class jse {
    public static final i06 m = new i06((byte) 20);
    public final String a;
    public final String b;
    public final String c;
    public final Integer d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;

    public jse(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        String[] strArr = aik.a;
        this.a = str == null ? "" : str;
        this.b = str2 == null ? "" : str2;
        this.c = str3;
        this.d = num;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = str10;
        this.l = str11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jse)) {
            return false;
        }
        jse jseVar = (jse) obj;
        if (this.a.equals(jseVar.a) && this.b.equals(jseVar.b) && this.c.equals(jseVar.c) && Objects.equals(this.d, jseVar.d) && Objects.equals(this.e, jseVar.e) && Objects.equals(this.f, jseVar.f) && Objects.equals(this.g, jseVar.g) && Objects.equals(this.h, jseVar.h) && Objects.equals(this.i, jseVar.i) && Objects.equals(this.j, jseVar.j) && Objects.equals(this.l, jseVar.l)) {
            return Objects.equals(this.k, jseVar.k);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.l) + ((Objects.hashCode(this.k) + ((Objects.hashCode(this.j) + ((Objects.hashCode(this.i) + ((Objects.hashCode(this.h) + ((Objects.hashCode(this.g) + ((Objects.hashCode(this.f) + ((Objects.hashCode(this.e) + ((Objects.hashCode(this.d) + z1m.f(z1m.f(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
