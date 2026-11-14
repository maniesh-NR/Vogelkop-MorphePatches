package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class gak {
    public final y10 a;
    public final v40 b;
    public final gw2 c;
    public final o79 d;
    public final List e;
    public final List f;
    public final List g;
    public final Boolean h;
    public final Boolean i;
    public final Boolean j;

    public gak(y10 y10Var, v40 v40Var, gw2 gw2Var, o79 o79Var, List list, List list2, List list3, Boolean bool, Boolean bool2, Boolean bool3) {
        this.a = y10Var;
        this.b = v40Var;
        this.c = gw2Var;
        this.d = o79Var;
        this.e = list;
        this.f = list2;
        this.g = list3;
        this.h = bool;
        this.i = bool2;
        this.j = bool3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gak)) {
            return false;
        }
        gak gakVar = (gak) obj;
        return Intrinsics.a(this.a, gakVar.a) && Intrinsics.a(this.b, gakVar.b) && Intrinsics.a(this.c, gakVar.c) && Intrinsics.a(this.d, gakVar.d) && Intrinsics.a(this.e, gakVar.e) && Intrinsics.a(this.f, gakVar.f) && Intrinsics.a(this.g, gakVar.g) && Intrinsics.a(this.h, gakVar.h) && Intrinsics.a(this.i, gakVar.i) && Intrinsics.a(this.j, gakVar.j);
    }

    public final int hashCode() {
        y10 y10Var = this.a;
        int iHashCode = (y10Var == null ? 0 : Integer.hashCode(y10Var.a)) * 31;
        v40 v40Var = this.b;
        int iHashCode2 = (iHashCode + (v40Var == null ? 0 : Integer.hashCode(v40Var.a))) * 31;
        gw2 gw2Var = this.c;
        int iHashCode3 = (iHashCode2 + (gw2Var == null ? 0 : Integer.hashCode(gw2Var.a))) * 31;
        o79 o79Var = this.d;
        int iHashCode4 = (iHashCode3 + (o79Var == null ? 0 : Integer.hashCode(o79Var.a))) * 31;
        List list = this.e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.g;
        int iHashCode7 = (iHashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool = this.h;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.i;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.j;
        return iHashCode9 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        return "State3A(aeMode=" + this.a + ", afMode=" + this.b + ", awbMode=" + this.c + ", flashMode=" + this.d + ", aeRegions=" + this.e + ", afRegions=" + this.f + ", awbRegions=" + this.g + ", aeLock=" + this.h + ", afLock=" + this.i + ", awbLock=" + this.j + ')';
    }
}
