package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a3m {
    public final co8 a;
    public final ypj b;
    public final mr4 c;
    public final mli d;
    public final boolean e;
    public final Map f;

    public a3m(co8 co8Var, ypj ypjVar, mr4 mr4Var, mli mliVar, LinkedHashMap linkedHashMap, int i) {
        this((i & 1) != 0 ? null : co8Var, (i & 2) != 0 ? null : ypjVar, (i & 4) != 0 ? null : mr4Var, (i & 8) != 0 ? null : mliVar, (i & 32) == 0, (i & 64) != 0 ? n08.a : linkedHashMap);
    }

    public a3m(co8 co8Var, ypj ypjVar, mr4 mr4Var, mli mliVar, boolean z, Map map) {
        this.a = co8Var;
        this.b = ypjVar;
        this.c = mr4Var;
        this.d = mliVar;
        this.e = z;
        this.f = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3m)) {
            return false;
        }
        a3m a3mVar = (a3m) obj;
        return Intrinsics.a(this.a, a3mVar.a) && Intrinsics.a(this.b, a3mVar.b) && Intrinsics.a(this.c, a3mVar.c) && Intrinsics.a(this.d, a3mVar.d) && this.e == a3mVar.e && Intrinsics.a(this.f, a3mVar.f);
    }

    public final int hashCode() {
        co8 co8Var = this.a;
        int iHashCode = (co8Var == null ? 0 : co8Var.hashCode()) * 31;
        ypj ypjVar = this.b;
        int iHashCode2 = (iHashCode + (ypjVar == null ? 0 : ypjVar.hashCode())) * 31;
        mr4 mr4Var = this.c;
        int iHashCode3 = (iHashCode2 + (mr4Var == null ? 0 : mr4Var.hashCode())) * 31;
        mli mliVar = this.d;
        return this.f.hashCode() + fki.k((iHashCode3 + (mliVar != null ? mliVar.hashCode() : 0)) * 961, 31, this.e);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.a + ", slide=" + this.b + ", changeSize=" + this.c + ", scale=" + this.d + ", veil=null, hold=" + this.e + ", effectsMap=" + this.f + ")";
    }
}
