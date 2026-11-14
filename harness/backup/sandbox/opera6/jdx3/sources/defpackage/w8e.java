package defpackage;

import java.math.BigInteger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class w8e extends x8e {

    @NotNull
    public static final v8e Companion = new v8e();
    public static final l4c[] e = {null, z4c.a(f7c.b, new uuc(16))};
    public final BigInteger c;
    public final h46 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w8e(int i, BigInteger bigInteger, h46 h46Var) {
        super(0);
        if (3 != (i & 3)) {
            x7d.I(i, 3, u8e.a.getDescriptor());
            throw null;
        }
        this.c = bigInteger;
        this.d = h46Var;
    }

    public w8e(BigInteger bigInteger, h46 h46Var) {
        this.c = bigInteger;
        this.d = h46Var;
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
        if (!(obj instanceof w8e)) {
            return false;
        }
        w8e w8eVar = (w8e) obj;
        return Intrinsics.a(this.c, w8eVar.c) && this.d == w8eVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    @Override // defpackage.x8e
    public final String toString() {
        return super.toString();
    }
}
