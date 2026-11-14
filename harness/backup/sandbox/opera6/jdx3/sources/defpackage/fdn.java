package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class fdn {
    public final String a;
    public final String b;
    public final String c;
    public final pt0 d;
    public final boolean e;
    public final fdn f;
    public final ArrayList g = new ArrayList();
    public final int h;
    public final int i;
    public final boolean j;

    public fdn(String str, String str2, String str3, pt0 pt0Var, boolean z, int i, int i2, fdn fdnVar, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = pt0Var;
        this.e = z;
        this.f = fdnVar;
        this.h = i;
        this.i = i2;
        this.j = z2;
    }

    public static fdn a(String str, String str2, String str3, int i, pt0 pt0Var) {
        return new fdn(str, str2, str3, pt0Var, true, i, 0, null, pt0Var == pt0.b);
    }

    public final boolean b() {
        return !this.e && this.f == null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fdn.class != obj.getClass()) {
            return false;
        }
        fdn fdnVar = (fdn) obj;
        if (fdnVar.e == this.e) {
            return this.b.equals(fdnVar.b);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.b, Boolean.valueOf(this.e));
    }
}
