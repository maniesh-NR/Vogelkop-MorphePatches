package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class zzl {
    public final wv a;
    public final nle b;

    public zzl(wv wvVar, nle nleVar) {
        this.a = wvVar;
        this.b = nleVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzl)) {
            return false;
        }
        zzl zzlVar = (zzl) obj;
        return Intrinsics.a(this.a, zzlVar.a) && this.b == zzlVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "Key(address=" + this.a + ", net=" + this.b + ")";
    }
}
