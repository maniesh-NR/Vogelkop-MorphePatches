package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class aio {

    @NotNull
    public static final zho Companion = new zho();
    public final String a;
    public final String b;
    public final String c;

    public aio(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            x7d.I(i, 7, yho.b);
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aio)) {
            return false;
        }
        aio aioVar = (aio) obj;
        return Intrinsics.a(this.a, aioVar.a) && Intrinsics.a(this.b, aioVar.b) && Intrinsics.a(this.c, aioVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + z1m.f(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Omid(vendorKey=");
        sb.append(this.a);
        sb.append(", verifyParams=");
        sb.append(this.b);
        sb.append(", verifyUrl=");
        return o18.p(sb, this.c, ')');
    }
}
