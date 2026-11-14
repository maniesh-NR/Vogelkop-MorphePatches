package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class rha {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public rha(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rha)) {
            return false;
        }
        rha rhaVar = (rha) obj;
        return this.a.equals(rhaVar.a) && Intrinsics.a(this.b, rhaVar.b) && this.c.equals(rhaVar.c) && this.d.equals(rhaVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return z1m.f(z1m.f((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        return sko.n(z1m.n("ActionsV1GetBackendOriginsData(oscore=", this.a, ", oscoreWss=", this.b, ", ftOscore="), this.c, ", apex=", this.d, ", news=null)");
    }
}
