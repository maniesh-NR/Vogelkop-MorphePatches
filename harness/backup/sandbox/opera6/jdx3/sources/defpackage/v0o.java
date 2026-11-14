package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class v0o {

    @NotNull
    public static final u0o Companion = new u0o();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Long e;

    public /* synthetic */ v0o(int i, Long l, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            x7d.I(i, 15, t0o.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = l;
        }
    }

    public v0o(String str, String str2, String str3, String str4, Long l) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = l;
    }

    public static v0o a(v0o v0oVar, Long l, int i) {
        String str = (i & 1) != 0 ? v0oVar.a : "ZZ";
        String str2 = v0oVar.b;
        String str3 = v0oVar.c;
        String str4 = v0oVar.d;
        if ((i & 16) != 0) {
            l = v0oVar.e;
        }
        v0oVar.getClass();
        return new v0o(str, str2, str3, str4, l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0o)) {
            return false;
        }
        v0o v0oVar = (v0o) obj;
        return Intrinsics.a(this.a, v0oVar.a) && Intrinsics.a(this.b, v0oVar.b) && Intrinsics.a(this.c, v0oVar.c) && Intrinsics.a(this.d, v0oVar.d) && Intrinsics.a(this.e, v0oVar.e);
    }

    public final int hashCode() {
        int iF = z1m.f(z1m.f(z1m.f(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        Long l = this.e;
        return iF + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "";
    }
}
