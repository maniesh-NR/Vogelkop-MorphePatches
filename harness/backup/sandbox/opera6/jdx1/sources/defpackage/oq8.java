package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class oq8 {
    public final String a;
    public final ArrayList b;
    public final ArrayList c;
    public final String d;
    public final int e;

    public oq8(String str, ArrayList arrayList, ArrayList arrayList2, String str2, int i) {
        this.a = str;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = str2;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oq8)) {
            return false;
        }
        oq8 oq8Var = (oq8) obj;
        return this.a.equals(oq8Var.a) && this.b.equals(oq8Var.b) && this.c.equals(oq8Var.c) && this.d.equals(oq8Var.d) && this.e == oq8Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + z1m.f(z1m.g(this.c, z1m.g(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d);
    }

    public final String toString() {
        return "";
    }
}
