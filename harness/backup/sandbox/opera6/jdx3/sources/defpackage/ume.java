package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class ume {

    @NotNull
    public static final tme Companion = new tme();
    public final String a;
    public final String b;
    public final rme c;

    public /* synthetic */ ume(int i, String str, String str2, rme rmeVar) {
        if (1 != (i & 1)) {
            x7d.I(i, 1, sme.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = new rme();
        } else {
            this.c = rmeVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ume)) {
            return false;
        }
        ume umeVar = (ume) obj;
        return Intrinsics.a(this.a, umeVar.a) && Intrinsics.a(this.b, umeVar.b) && Intrinsics.a(this.c, umeVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + z1m.f(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "";
    }
}
