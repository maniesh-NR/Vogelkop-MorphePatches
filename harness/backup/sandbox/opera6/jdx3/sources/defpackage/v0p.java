package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class v0p {

    @NotNull
    public static final u0p Companion = new u0p();
    public final String a;
    public final String b;

    public v0p(int i, String str, String str2) {
        if (1 != (i & 1)) {
            x7d.I(i, 1, t0p.b);
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = "1.2";
        } else {
            this.b = str2;
        }
    }

    public v0p(String str) {
        this.a = str;
        this.b = "1.2";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0p)) {
            return false;
        }
        v0p v0pVar = (v0p) obj;
        return Intrinsics.a(this.a, v0pVar.a) && Intrinsics.a(this.b, v0pVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Native(request=");
        sb.append(this.a);
        sb.append(", ver=");
        return o18.p(sb, this.b, ')');
    }
}
