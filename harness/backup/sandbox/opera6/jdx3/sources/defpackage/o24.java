package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o24 {
    public final pc a;
    public final jf b;

    static {
        byte b = jf.g;
    }

    public o24(pc pcVar, jf jfVar) {
        this.a = pcVar;
        this.b = jfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o24)) {
            return false;
        }
        o24 o24Var = (o24) obj;
        return this.a == o24Var.a && Intrinsics.a(this.b, o24Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
