package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class qfj {

    @NotNull
    public static final pfj Companion = new pfj();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ qfj(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            x7d.I(i, 7, ofj.a.getDescriptor());
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
        if (!(obj instanceof qfj)) {
            return false;
        }
        qfj qfjVar = (qfj) obj;
        return Intrinsics.a(this.a, qfjVar.a) && Intrinsics.a(this.b, qfjVar.b) && Intrinsics.a(this.c, qfjVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + z1m.f(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "";
    }
}
