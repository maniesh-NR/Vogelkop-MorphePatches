package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class jsn implements lsn {
    public final rxh a;
    public final qxh b;
    public final msn c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final List h;
    public final boolean i;
    public final boolean j;
    public final Boolean k;

    public jsn(rxh rxhVar, qxh qxhVar, msn msnVar, boolean z, boolean z2, boolean z3, boolean z4, List list, boolean z5, boolean z6, Boolean bool) {
        this.a = rxhVar;
        this.b = qxhVar;
        this.c = msnVar;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = list;
        this.i = z5;
        this.j = z6;
        this.k = bool;
    }

    @Override // defpackage.lsn
    public final boolean a() {
        return this.d;
    }

    @Override // defpackage.lsn
    public final msn b() {
        return this.c;
    }

    @Override // defpackage.lsn
    public final boolean c() {
        return this.e;
    }

    @Override // defpackage.lsn
    public final boolean d() {
        return this.i;
    }

    @Override // defpackage.lsn
    public final pxh e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jsn)) {
            return false;
        }
        jsn jsnVar = (jsn) obj;
        return this.a.equals(jsnVar.a) && Intrinsics.a(this.b, jsnVar.b) && this.c == jsnVar.c && this.d == jsnVar.d && this.e == jsnVar.e && this.f == jsnVar.f && this.g == jsnVar.g && this.h.equals(jsnVar.h) && this.i == jsnVar.i && this.j == jsnVar.j && Intrinsics.a(this.k, jsnVar.k);
    }

    @Override // defpackage.lsn
    public final Boolean f() {
        return this.k;
    }

    @Override // defpackage.lsn
    public final List g() {
        return this.h;
    }

    @Override // defpackage.lsn
    public final pxh getText() {
        return this.b;
    }

    @Override // defpackage.lsn
    public final boolean h() {
        return this.j;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a.a) * 31;
        qxh qxhVar = this.b;
        int iK = fki.k(fki.k(rfp.f(fki.k(fki.k(fki.k(fki.k((this.c.hashCode() + ((iHashCode + (qxhVar == null ? 0 : qxhVar.a.hashCode())) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
        Boolean bool = this.k;
        return iK + (bool != null ? bool.hashCode() : 0);
    }

    @Override // defpackage.lsn
    public final boolean isEnabled() {
        return true;
    }

    @Override // defpackage.lsn
    public final boolean isVisible() {
        return true;
    }

    public final String toString() {
        return "";
    }
}
