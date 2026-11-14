package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class rgj {

    @NotNull
    public static final qgj Companion = new qgj();
    public final String a;
    public final String b;
    public final String c;
    public final igj d;

    public /* synthetic */ rgj(int i, String str, String str2, String str3, igj igjVar) {
        if (15 != (i & 15)) {
            x7d.I(i, 15, pgj.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = igjVar;
    }

    public rgj(String str, String str2, String str3, igj igjVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = igjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgj)) {
            return false;
        }
        rgj rgjVar = (rgj) obj;
        return Intrinsics.a(this.a, rgjVar.a) && Intrinsics.a(this.b, rgjVar.b) && Intrinsics.a(this.c, rgjVar.c) && Intrinsics.a(this.d, rgjVar.d);
    }

    public final int hashCode() {
        return this.d.a.hashCode() + z1m.f(z1m.f(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "";
    }
}
