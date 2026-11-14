package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class rp4 extends olb {
    public final String c;

    public rp4(String str) {
        super(nlb.a);
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rp4) && Intrinsics.a(this.c, ((rp4) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return sko.k("CategoryTitle(title=", this.c, ")");
    }
}
