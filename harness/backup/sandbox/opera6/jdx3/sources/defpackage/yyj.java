package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class yyj extends bzj {
    public final String a;
    public final String b;
    public final kze c;
    public final ode d;

    public yyj(String str, String str2, kze kzeVar, ode odeVar) {
        this.a = str;
        this.b = str2;
        this.c = kzeVar;
        this.d = odeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yyj)) {
            return false;
        }
        yyj yyjVar = (yyj) obj;
        return Intrinsics.a(this.a, yyjVar.a) && Intrinsics.a(this.b, yyjVar.b) && Intrinsics.a(this.c, yyjVar.c) && Intrinsics.a(this.d, yyjVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + z1m.f(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "";
    }
}
