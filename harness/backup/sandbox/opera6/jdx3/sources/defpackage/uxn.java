package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class uxn implements yxn {
    public final String a;
    public final q0n b;

    public uxn(String str, q0n q0nVar) {
        this.a = str;
        this.b = q0nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uxn)) {
            return false;
        }
        uxn uxnVar = (uxn) obj;
        return Intrinsics.a(this.a, uxnVar.a) && Intrinsics.a(this.b, uxnVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        q0n q0nVar = this.b;
        return iHashCode + (q0nVar == null ? 0 : q0nVar.hashCode());
    }

    public final String toString() {
        return "EvaluateJavaScript(script=" + this.a + ", callback=" + this.b + ")";
    }
}
