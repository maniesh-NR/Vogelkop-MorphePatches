package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class du7 extends w7d {
    public final String k;
    public final qw0 l;

    public du7(String str, qw0 qw0Var) {
        this.k = str;
        this.l = qw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof du7)) {
            return false;
        }
        du7 du7Var = (du7) obj;
        return Intrinsics.a(this.k, du7Var.k) && this.l.equals(du7Var.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + (this.k.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
