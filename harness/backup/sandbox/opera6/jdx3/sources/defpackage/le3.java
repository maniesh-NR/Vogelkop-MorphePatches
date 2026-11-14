package defpackage;

import java.math.BigInteger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public abstract class le3 {
    public final BigInteger a;
    public final String b;

    public le3(int i, BigInteger bigInteger) {
        this.a = bigInteger;
        String string = bigInteger.toString(16);
        this.b = i > 0 ? StringsKt.S(i, string) : string;
    }

    public final String a() {
        return sko.j("0x", this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Intrinsics.a(this.a, ((le3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.b;
    }
}
