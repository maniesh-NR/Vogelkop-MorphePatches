package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v7f extends y7f {
    public final f7j a;
    public final String b;
    public final g7j c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final List g;

    public v7f(f7j f7jVar, String str, g7j g7jVar, boolean z, boolean z2, boolean z3, List list) {
        this.a = f7jVar;
        this.b = str;
        this.c = g7jVar;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v7f)) {
            return false;
        }
        v7f v7fVar = (v7f) obj;
        return this.a == v7fVar.a && Intrinsics.a(this.b, v7fVar.b) && this.c == v7fVar.c && this.d == v7fVar.d && this.e == v7fVar.e && this.f == v7fVar.f && Intrinsics.a(this.g, v7fVar.g);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        g7j g7jVar = this.c;
        return this.g.hashCode() + fki.k(fki.k(fki.k((iHashCode2 + (g7jVar != null ? g7jVar.hashCode() : 0)) * 31, 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        return "";
    }
}
