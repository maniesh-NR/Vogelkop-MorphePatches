package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class wmc implements zmc {
    public final lmc a;
    public final String b;

    public wmc(lmc lmcVar, String str) {
        this.a = lmcVar;
        this.b = str;
    }

    @Override // defpackage.zmc
    public final lmc a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wmc)) {
            return false;
        }
        wmc wmcVar = (wmc) obj;
        return this.a.equals(wmcVar.a) && Intrinsics.a(this.b, wmcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
