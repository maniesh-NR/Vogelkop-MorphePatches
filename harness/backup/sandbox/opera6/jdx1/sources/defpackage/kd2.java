package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class kd2 implements nd2 {
    public final hyf a;
    public final l68 b;

    public kd2(hyf hyfVar, l68 l68Var) {
        this.a = hyfVar;
        this.b = l68Var;
    }

    @Override // defpackage.nd2
    public final hyf a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kd2)) {
            return false;
        }
        kd2 kd2Var = (kd2) obj;
        return Intrinsics.a(this.a, kd2Var.a) && this.b.equals(kd2Var.b);
    }

    public final int hashCode() {
        hyf hyfVar = this.a;
        return this.b.hashCode() + ((hyfVar == null ? 0 : hyfVar.hashCode()) * 31);
    }

    public final String toString() {
        return "Error(painter=" + this.a + ", result=" + this.b + ")";
    }
}
