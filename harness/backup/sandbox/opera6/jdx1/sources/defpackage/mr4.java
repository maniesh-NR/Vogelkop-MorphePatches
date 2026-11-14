package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class mr4 {
    public final td3 a;
    public final Function1 b;
    public final h49 c;
    public final boolean d;

    public mr4(td3 td3Var, h49 h49Var, Function1 function1, boolean z) {
        this.a = td3Var;
        this.b = function1;
        this.c = h49Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mr4)) {
            return false;
        }
        mr4 mr4Var = (mr4) obj;
        return this.a.equals(mr4Var.a) && Intrinsics.a(this.b, mr4Var.b) && Intrinsics.a(this.c, mr4Var.c) && this.d == mr4Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.a + ", size=" + this.b + ", animationSpec=" + this.c + ", clip=" + this.d + ")";
    }
}
