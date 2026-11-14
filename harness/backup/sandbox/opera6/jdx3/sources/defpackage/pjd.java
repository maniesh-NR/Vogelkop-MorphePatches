package defpackage;

import android.net.Uri;
import com.leanplum.core.BuildConfig;
import java.util.Objects;

/* loaded from: classes.dex */
public class pjd {
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public final Uri a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;

    static {
        String str = tym.a;
        h = BuildConfig.BUILD_NUMBER;
        i = "1";
        j = "2";
        k = "3";
        l = "4";
        m = "5";
        n = "6";
    }

    public pjd(mw7 mw7Var) {
        this.a = (Uri) mw7Var.c;
        this.b = (String) mw7Var.d;
        this.c = (String) mw7Var.e;
        this.d = mw7Var.a;
        this.e = mw7Var.b;
        this.f = (String) mw7Var.f;
        this.g = (String) mw7Var.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pjd)) {
            return false;
        }
        pjd pjdVar = (pjd) obj;
        return this.a.equals(pjdVar.a) && Objects.equals(this.b, pjdVar.b) && Objects.equals(this.c, pjdVar.c) && this.d == pjdVar.d && this.e == pjdVar.e && Objects.equals(this.f, pjdVar.f) && Objects.equals(this.g, pjdVar.g);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.d) * 31) + this.e) * 31;
        String str3 = this.f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }
}
