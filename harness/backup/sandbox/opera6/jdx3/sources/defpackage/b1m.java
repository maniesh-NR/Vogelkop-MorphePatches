package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class b1m {

    @NotNull
    public static final a1m Companion = new a1m();
    public static final ke3 f;
    public final wv a;
    public final wv b;
    public final ke3 c;
    public final r7a d;
    public final ke3 e;

    static {
        new ke3(0L);
        f = new ke3(1L);
    }

    public /* synthetic */ b1m(int i, wv wvVar, wv wvVar2, ke3 ke3Var, r7a r7aVar, ke3 ke3Var2) {
        if (31 != (i & 31)) {
            x7d.I(i, 31, z0m.a.getDescriptor());
            throw null;
        }
        this.a = wvVar;
        this.b = wvVar2;
        this.c = ke3Var;
        this.d = r7aVar;
        this.e = ke3Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1m)) {
            return false;
        }
        b1m b1mVar = (b1m) obj;
        return Intrinsics.a(this.a, b1mVar.a) && Intrinsics.a(this.b, b1mVar.b) && Intrinsics.a(this.c, b1mVar.c) && Intrinsics.a(this.d, b1mVar.d) && Intrinsics.a(this.e, b1mVar.e);
    }

    public final int hashCode() {
        return this.e.a.hashCode() + ((this.d.a.hashCode() + ((this.c.a.hashCode() + ((this.b.a.hashCode() + (this.a.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TransactionReceipt(from=" + this.a + ", to=" + this.b + ", status=" + this.c + ", transactionHash=" + this.d + ", type=" + this.e + ")";
    }
}
