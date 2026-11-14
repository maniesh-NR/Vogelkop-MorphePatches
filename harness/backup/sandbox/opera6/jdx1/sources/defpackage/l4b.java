package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l4b {
    public final int a;
    public final g07 b;
    public final nd4 c;

    public l4b(int i, g07 g07Var, nd4 nd4Var) {
        this.a = i;
        this.b = g07Var;
        this.c = nd4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l4b) {
            l4b l4bVar = (l4b) obj;
            return this.a == l4bVar.a && Intrinsics.a(this.b, l4bVar.b) && this.c == l4bVar.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "ConfiguredOutput(streamId=" + ((Object) yfk.a(this.a)) + ", deferrableSurface=" + this.b + ", graph=" + this.c + ')';
    }
}
