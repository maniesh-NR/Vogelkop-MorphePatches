package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class zi5 implements h0n {
    public final Function1 a;

    public zi5(Function1 function1) {
        this.a = function1;
    }

    public final Object a(oag oagVar) {
        return this.a.invoke(oagVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zi5) && Intrinsics.a(this.a, ((zi5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.a + ")";
    }
}
