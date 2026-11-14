package defpackage;

import android.net.Uri;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class mjd {
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public final Uri a;
    public final String b;
    public final jjd c;
    public final djd d;
    public final List e;
    public final String f;
    public final h1b g;
    public final long h;

    static {
        String str = tym.a;
        i = "0";
        j = "1";
        k = "2";
        l = "3";
        m = "4";
        n = "5";
        o = "6";
        p = "7";
    }

    public mjd(Uri uri, String str, jjd jjdVar, djd djdVar, List list, String str2, h1b h1bVar, long j2) {
        this.a = uri;
        this.b = dzd.p(str);
        this.c = jjdVar;
        this.d = djdVar;
        this.e = list;
        this.f = str2;
        this.g = h1bVar;
        z0b z0bVarP = h1b.p();
        for (int i2 = 0; i2 < h1bVar.size(); i2++) {
            pjd pjdVar = (pjd) h1bVar.get(i2);
            mw7 mw7Var = new mw7();
            mw7Var.c = pjdVar.a;
            mw7Var.d = pjdVar.b;
            mw7Var.e = pjdVar.c;
            mw7Var.a = pjdVar.d;
            mw7Var.b = pjdVar.e;
            mw7Var.f = pjdVar.f;
            mw7Var.g = pjdVar.g;
            z0bVarP.c(new ojd(mw7Var));
        }
        z0bVarP.g();
        this.h = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mjd)) {
            return false;
        }
        mjd mjdVar = (mjd) obj;
        return this.a.equals(mjdVar.a) && Objects.equals(this.b, mjdVar.b) && Objects.equals(this.c, mjdVar.c) && Objects.equals(this.d, mjdVar.d) && this.e.equals(mjdVar.e) && Objects.equals(this.f, mjdVar.f) && this.g.equals(mjdVar.g) && this.h == mjdVar.h;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        jjd jjdVar = this.c;
        int iHashCode3 = (iHashCode2 + (jjdVar == null ? 0 : jjdVar.hashCode())) * 31;
        djd djdVar = this.d;
        int iHashCode4 = (this.e.hashCode() + ((iHashCode3 + (djdVar == null ? 0 : djdVar.hashCode())) * 31)) * 31;
        return (int) (((this.g.hashCode() + ((iHashCode4 + (this.f != null ? r0.hashCode() : 0)) * 31)) * 31 * 31) + this.h);
    }
}
