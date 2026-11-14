package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l03 {
    public final qjn a;
    public final kl5 b;
    public final jzk c;

    public l03(qjn qjnVar, kl5 kl5Var, jzk jzkVar) {
        this.a = qjnVar;
        this.b = kl5Var;
        this.c = jzkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l03)) {
            return false;
        }
        l03 l03Var = (l03) obj;
        return Intrinsics.a(this.a, l03Var.a) && Intrinsics.a(this.b, l03Var.b) && Intrinsics.a(this.c, l03Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
