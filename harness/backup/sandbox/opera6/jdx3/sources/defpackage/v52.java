package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v52 extends wyh {
    public final String k;
    public final String l;

    public v52(String str, String str2) {
        this.k = str;
        this.l = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v52)) {
            return false;
        }
        v52 v52Var = (v52) obj;
        return Intrinsics.a(this.k, v52Var.k) && Intrinsics.a(this.l, v52Var.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + (this.k.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
