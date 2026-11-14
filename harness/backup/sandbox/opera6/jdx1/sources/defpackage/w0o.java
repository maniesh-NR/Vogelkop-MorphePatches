package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w0o {
    public final String a;
    public final String b;
    public final String c;

    public w0o(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0o)) {
            return false;
        }
        w0o w0oVar = (w0o) obj;
        return Intrinsics.a(this.a, w0oVar.a) && Intrinsics.a(this.b, w0oVar.b) && Intrinsics.a(this.c, w0oVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + z1m.f(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "";
    }
}
