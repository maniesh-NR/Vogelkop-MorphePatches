package defpackage;

import java.math.BigInteger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class q8e extends x8e {

    @NotNull
    public static final p8e Companion = new p8e();
    public final BigInteger c;
    public final f46 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q8e(int i, BigInteger bigInteger, f46 f46Var) {
        super(0);
        if (3 != (i & 3)) {
            x7d.I(i, 3, o8e.a.getDescriptor());
            throw null;
        }
        this.c = bigInteger;
        this.d = f46Var;
    }

    public q8e(BigInteger bigInteger, f46 f46Var) {
        this.c = bigInteger;
        this.d = f46Var;
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
        if (!(obj instanceof q8e)) {
            return false;
        }
        q8e q8eVar = (q8e) obj;
        return Intrinsics.a(this.c, q8eVar.c) && Intrinsics.a(this.d, q8eVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    @Override // defpackage.x8e
    public final String toString() {
        return super.toString();
    }
}
