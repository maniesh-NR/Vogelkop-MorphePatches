package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class wvg {
    public static final wvg k = new wvg("loading", -1, -1, -1, 0, null, null, null, null, null);
    public static final wvg l = new wvg("none", -1, -1, -1, 1, null, null, null, null, null);
    public static final wvg m = new wvg("pending", 0, 0, -1, 2, null, null, null, null, null);
    public final String a;
    public final long b;
    public final long c;
    public final long d;
    public final int e;
    public final a0f f;
    public final ck8 g;
    public final jmk h;
    public final o9g i;
    public final String j;

    public wvg(String str, long j, long j2, long j3, int i, a0f a0fVar, ck8 ck8Var, jmk jmkVar, o9g o9gVar, String str2) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = i;
        this.f = a0fVar;
        this.g = ck8Var;
        this.h = jmkVar;
        this.i = o9gVar;
        this.j = str2;
    }

    public final boolean a() {
        int i = this.e;
        return i == 3 || i == 4;
    }

    public final boolean b() {
        jmk jmkVar = this.h;
        return jmkVar != null && "ofa_free_trial".equals(jmkVar.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wvg.class != obj.getClass()) {
            return false;
        }
        wvg wvgVar = (wvg) obj;
        if (this.b == wvgVar.b && this.c == wvgVar.c && this.d == wvgVar.d && this.e == wvgVar.e && Objects.equals(this.f, wvgVar.f) && Objects.equals(this.g, wvgVar.g) && Objects.equals(this.h, wvgVar.h) && Objects.equals(this.i, wvgVar.i)) {
            return Objects.equals(this.j, wvgVar.j);
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.c;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.d;
        return Objects.hashCode(this.j) + ((Objects.hashCode(this.i) + ((Objects.hashCode(this.h) + ((Objects.hashCode(this.g) + ((Objects.hashCode(this.f) + ((((i + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.e) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
