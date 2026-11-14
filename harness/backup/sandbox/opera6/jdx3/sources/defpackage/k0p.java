package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class k0p {

    @NotNull
    public static final h0p Companion = new h0p();
    public static final KSerializer[] d = {new k72(m0p.a, (byte) 0), new k72(xhk.a, (byte) 0), new k72(ecb.a, (byte) 0)};
    public final List a;
    public final List b;
    public final List c;

    public k0p(int i, List list, List list2, List list3) {
        if (7 != (i & 7)) {
            x7d.I(i, 7, g0p.b);
            throw null;
        }
        this.a = list;
        this.b = list2;
        this.c = list3;
        if (list.isEmpty()) {
            qp2.o("Failed requirement.");
            throw null;
        }
        list3.isEmpty();
    }

    public k0p(List list, List list2, List list3) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        if (list.isEmpty()) {
            qp2.o("Failed requirement.");
            throw null;
        }
        list3.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0p)) {
            return false;
        }
        k0p k0pVar = (k0p) obj;
        return Intrinsics.a(this.a, k0pVar.a) && Intrinsics.a(this.b, k0pVar.b) && Intrinsics.a(this.c, k0pVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rfp.f(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "Banner(format=" + this.a + ", mimes=" + this.b + ", api=" + this.c + ')';
    }
}
