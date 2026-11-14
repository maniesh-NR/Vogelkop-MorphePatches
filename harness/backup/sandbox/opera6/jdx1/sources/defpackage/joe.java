package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class joe {
    public final String a;
    public final String b;
    public final one c;
    public final hn8 d;

    public joe(String str, String str2, one oneVar, hn8 hn8Var) {
        this.a = str;
        this.b = str2;
        this.c = oneVar;
        this.d = hn8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof joe)) {
            return false;
        }
        joe joeVar = (joe) obj;
        return this.a.equals(joeVar.a) && Intrinsics.a(this.b, joeVar.b) && this.c.equals(joeVar.c) && this.d.equals(joeVar.d);
    }

    public final int hashCode() {
        return this.d.a.hashCode() + z1m.h(this.c.a, z1m.f(this.a.hashCode() * 31, 31, this.b), 961);
    }

    public final String toString() {
        StringBuilder sbN = z1m.n("NetworkRequest(url=", this.a, ", method=", this.b, ", headers=");
        sbN.append(this.c);
        sbN.append(", body=null, extras=");
        sbN.append(this.d);
        sbN.append(")");
        return sbN.toString();
    }
}
