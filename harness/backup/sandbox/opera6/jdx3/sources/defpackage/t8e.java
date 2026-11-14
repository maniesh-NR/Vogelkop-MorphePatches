package defpackage;

import java.math.BigInteger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class t8e extends x8e {

    @NotNull
    public static final s8e Companion = new s8e();
    public static final l4c[] e = {null, z4c.a(f7c.b, new uuc(15))};
    public final BigInteger c;
    public final g46 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t8e(int i, BigInteger bigInteger, g46 g46Var) {
        super(0);
        if (3 != (i & 3)) {
            x7d.I(i, 3, r8e.a.getDescriptor());
            throw null;
        }
        this.c = bigInteger;
        this.d = g46Var;
    }

    public t8e(BigInteger bigInteger, g46 g46Var) {
        this.c = bigInteger;
        this.d = g46Var;
    }

    @Override // defpackage.x8e
    public final BigInteger a() {
        return this.c;
    }

    @Override // defpackage.x8e
    public final i46 b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8e)) {
            return false;
        }
        t8e t8eVar = (t8e) obj;
        return Intrinsics.a(this.c, t8eVar.c) && this.d == t8eVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    @Override // defpackage.x8e
    public final String toString() {
        return super.toString();
    }
}
