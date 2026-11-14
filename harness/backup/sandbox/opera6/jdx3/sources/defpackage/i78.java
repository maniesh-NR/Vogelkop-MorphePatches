package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i78 {
    public final h78 a;
    public final m78 b;
    public final boolean c;

    public i78(h78 h78Var, m78 m78Var, boolean z) {
        this.a = h78Var;
        this.b = m78Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i78)) {
            return false;
        }
        i78 i78Var = (i78) obj;
        return Intrinsics.a(this.a, i78Var.a) && this.b.equals(i78Var.b) && this.c == i78Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
