package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class huo {

    @NotNull
    public static final tto Companion = new tto();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final xto f;
    public final rto g;

    public huo(int i, String str, String str2, String str3, String str4, int i2, xto xtoVar, rto rtoVar) {
        if (111 != (i & 111)) {
            x7d.I(i, 111, mto.b);
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        if ((i & 16) == 0) {
            this.e = 1;
        } else {
            this.e = i2;
        }
        this.f = xtoVar;
        this.g = rtoVar;
    }

    public huo(String str, String str2, String str3, String str4, xto xtoVar, rto rtoVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = 1;
        this.f = xtoVar;
        this.g = rtoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof huo)) {
            return false;
        }
        huo huoVar = (huo) obj;
        return Intrinsics.a(this.a, huoVar.a) && Intrinsics.a(this.b, huoVar.b) && Intrinsics.a(this.c, huoVar.c) && Intrinsics.a(this.d, huoVar.d) && this.e == huoVar.e && Intrinsics.a(this.f, huoVar.f) && Intrinsics.a(this.g, huoVar.g);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + rfp.c(this.e, z1m.f(z1m.f(z1m.f(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31)) * 31;
        rto rtoVar = this.g;
        return iHashCode + (rtoVar == null ? 0 : rtoVar.hashCode());
    }

    public final String toString() {
        return "AppObject(id=" + this.a + ", name=" + this.b + ", packageName=" + this.c + ", ver=" + this.d + ", privacypolicy=" + this.e + ", publisher=" + this.f + ", ext=" + this.g + ')';
    }
}
