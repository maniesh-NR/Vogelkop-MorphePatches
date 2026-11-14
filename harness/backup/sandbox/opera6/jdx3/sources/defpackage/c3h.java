package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c3h {
    public final float a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final float f;
    public final String g;
    public final String h;

    public c3h(float f, String str, String str2, String str3, String str4, float f2, String str5, String str6) {
        this.a = f;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = f2;
        this.g = str5;
        this.h = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3h)) {
            return false;
        }
        c3h c3hVar = (c3h) obj;
        return Float.compare(this.a, c3hVar.a) == 0 && this.b.equals(c3hVar.b) && this.c.equals(c3hVar.c) && Intrinsics.a(this.d, c3hVar.d) && this.e.equals(c3hVar.e) && Float.compare(this.f, c3hVar.f) == 0 && this.g.equals(c3hVar.g) && Intrinsics.a(this.h, c3hVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + z1m.f(sko.d(this.f, z1m.f(z1m.f(z1m.f(z1m.f(Float.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31, this.g);
    }

    public final String toString() {
        return "";
    }
}
