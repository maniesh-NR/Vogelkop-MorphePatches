package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fha {
    public final dd0 a;
    public final a98 b;
    public km0 c;
    public boolean d;
    public final ArrayList e;
    public String f;
    public Long g;
    public Long h;

    public fha(dd0 dd0Var, a98 a98Var) {
        ArrayList arrayList = new ArrayList();
        this.a = dd0Var;
        this.b = a98Var;
        this.c = null;
        this.d = false;
        this.e = arrayList;
        this.f = null;
        this.g = null;
        this.h = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fha) {
            fha fhaVar = (fha) obj;
            if (this.a == fhaVar.a && this.b.equals(fhaVar.b) && Intrinsics.a(this.c, fhaVar.c) && this.d == fhaVar.d && this.e.equals(fhaVar.e) && Intrinsics.a(this.f, fhaVar.f) && Intrinsics.a(this.g, fhaVar.g) && Intrinsics.a(this.h, fhaVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        km0 km0Var = this.c;
        int iG = z1m.g(this.e, fki.k((iHashCode + (km0Var == null ? 0 : km0Var.hashCode())) * 31, 31, this.d), 31);
        String str = this.f;
        int iHashCode2 = (iG + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.g;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.h;
        return iHashCode3 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        return "";
    }
}
