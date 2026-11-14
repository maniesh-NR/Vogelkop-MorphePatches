package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class xzl {

    @NotNull
    public static final wzl Companion = new wzl();
    public final yzl a;
    public final uzl b;

    public /* synthetic */ xzl(int i, yzl yzlVar, uzl uzlVar) {
        if (3 != (i & 3)) {
            x7d.I(i, 3, vzl.a.getDescriptor());
            throw null;
        }
        this.a = yzlVar;
        this.b = uzlVar;
    }

    public xzl(yzl yzlVar, uzl uzlVar) {
        this.a = yzlVar;
        this.b = uzlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xzl)) {
            return false;
        }
        xzl xzlVar = (xzl) obj;
        return Intrinsics.a(this.a, xzlVar.a) && Intrinsics.a(this.b, xzlVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WithFee(transaction=" + this.a + ", fee=" + this.b + ")";
    }
}
