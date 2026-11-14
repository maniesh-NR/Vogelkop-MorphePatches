package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class ppb {

    @NotNull
    public static final opb Companion = new opb();
    public final int a;
    public final String b;
    public final String c;

    public /* synthetic */ ppb(int i, int i2, String str, String str2) {
        if (7 != (i & 7)) {
            x7d.I(i, 7, npb.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = str;
        this.c = str2;
    }

    public ppb(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppb)) {
            return false;
        }
        ppb ppbVar = (ppb) obj;
        return this.a == ppbVar.a && Intrinsics.a(this.b, ppbVar.b) && Intrinsics.a(this.c, ppbVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + z1m.f(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return z1m.l(p3p.p(this.a, "JsMessage(callbackId=", ", methodName=", this.b, ", params="), this.c, ")");
    }
}
