package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ksm {
    public final int a;
    public final cd5 b;

    public ksm(int i, cd5 cd5Var) {
        this.a = i;
        this.b = cd5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ksm)) {
            return false;
        }
        ksm ksmVar = (ksm) obj;
        return this.a == ksmVar.a && Intrinsics.a(this.b, ksmVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "RequestSignal(requestNo=" + this.a + ", signal=" + this.b + ')';
    }
}
