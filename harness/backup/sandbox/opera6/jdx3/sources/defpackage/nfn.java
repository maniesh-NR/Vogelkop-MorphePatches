package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class nfn {
    public final String a;
    public final String b;
    public final String c;
    public final axc d;

    public nfn(String str, String str2, String str3, axc axcVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = axcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nfn)) {
            return false;
        }
        nfn nfnVar = (nfn) obj;
        return Intrinsics.a(this.a, nfnVar.a) && Intrinsics.a(this.b, nfnVar.b) && Intrinsics.a(this.c, nfnVar.c) && this.d == nfnVar.d;
    }

    public final int hashCode() {
        int iF = z1m.f(z1m.f(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        axc axcVar = this.d;
        return iF + (axcVar == null ? 0 : axcVar.hashCode());
    }

    public final String toString() {
        return "";
    }
}
