package defpackage;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class bsm {
    public final u59 a;
    public final Map b;
    public final Set c;
    public wwh d;

    public /* synthetic */ bsm(u59 u59Var, LinkedHashMap linkedHashMap, wwh wwhVar, int i) {
        this((i & 1) != 0 ? new u59((byte) 20) : u59Var, (i & 2) != 0 ? new LinkedHashMap() : linkedHashMap, new LinkedHashSet(), (i & 8) != 0 ? null : wwhVar);
    }

    public bsm(u59 u59Var, Map map, Set set, wwh wwhVar) {
        this.a = u59Var;
        this.b = map;
        this.c = set;
        this.d = wwhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bsm)) {
            return false;
        }
        bsm bsmVar = (bsm) obj;
        return Intrinsics.a(this.a, bsmVar.a) && Intrinsics.a(this.b, bsmVar.b) && Intrinsics.a(this.c, bsmVar.c) && Intrinsics.a(this.d, bsmVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + z1m.h(this.b, this.a.hashCode() * 31, 31)) * 31;
        wwh wwhVar = this.d;
        return iHashCode + (wwhVar == null ? 0 : Integer.hashCode(wwhVar.a));
    }

    public final String toString() {
        return "InfoBundle(options=" + this.a + ", tags=" + this.b + ", listeners=" + this.c + ", template=" + this.d + ')';
    }
}
