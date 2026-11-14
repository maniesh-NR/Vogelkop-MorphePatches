package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class wl {

    @NotNull
    public static final vl Companion = new vl();
    public static final l4c[] g = {null, null, z4c.a(f7c.b, new lb((byte) 4)), null, null, null};
    public final long a;
    public final String b;
    public final yo c;
    public final String d;
    public final String e;
    public final String f;

    public /* synthetic */ wl(int i, long j, String str, yo yoVar, String str2, String str3, String str4) {
        if (63 != (i & 63)) {
            x7d.I(i, 63, ul.a.getDescriptor());
            throw null;
        }
        this.a = j;
        this.b = str;
        this.c = yoVar;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public wl(long j, String str, yo yoVar, String str2, String str3, String str4) {
        this.a = j;
        this.b = str;
        this.c = yoVar;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wl)) {
            return false;
        }
        wl wlVar = (wl) obj;
        return this.a == wlVar.a && Intrinsics.a(this.b, wlVar.b) && this.c == wlVar.c && Intrinsics.a(this.d, wlVar.d) && Intrinsics.a(this.e, wlVar.e) && Intrinsics.a(this.f, wlVar.f);
    }

    public final int hashCode() {
        int iF = z1m.f((this.c.hashCode() + z1m.f(Long.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d);
        String str = this.e;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "";
    }
}
