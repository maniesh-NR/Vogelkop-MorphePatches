package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class kqi {
    public final ArrayList a;
    public final String b;
    public final iqi c;
    public final long d;
    public final long e;

    public kqi(ArrayList arrayList, String str, iqi iqiVar, long j, long j2) {
        this.a = arrayList;
        this.b = str;
        this.c = iqiVar;
        this.d = j;
        this.e = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kqi)) {
            return false;
        }
        kqi kqiVar = (kqi) obj;
        return this.a.equals(kqiVar.a) && this.b.equals(kqiVar.b) && this.c == kqiVar.c && this.d == kqiVar.d && this.e == kqiVar.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + z1m.e((this.c.hashCode() + z1m.f(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
    }

    public final String toString() {
        return "";
    }
}
