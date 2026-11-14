package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class dri {
    public final byte a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;

    /* JADX WARN: Multi-variable type inference failed */
    public dri(String str, String str2, String str3, String str4, int i, int i2, String str5) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dri)) {
            return false;
        }
        dri driVar = (dri) obj;
        return this.a == driVar.a && this.b.equals(driVar.b) && Intrinsics.a(this.c, driVar.c) && Intrinsics.a(this.d, driVar.d) && this.e.equals(driVar.e) && Intrinsics.a(this.f, driVar.f) && this.g == driVar.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + z1m.f(z1m.f(z1m.f(z1m.f(z1m.f(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        return "";
    }
}
