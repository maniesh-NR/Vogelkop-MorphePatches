package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class xwn {
    public final int a;
    public final String b;
    public final boolean c;

    public xwn(int i, String str, boolean z) {
        this.a = i;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xwn)) {
            return false;
        }
        xwn xwnVar = (xwn) obj;
        return this.a == xwnVar.a && Intrinsics.a(this.b, xwnVar.b) && this.c == xwnVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + z1m.f(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return z1m.m(p3p.p(this.a, "WebViewError(code=", ", description=", this.b, ", isFromMainFrame="), this.c, ")");
    }
}
