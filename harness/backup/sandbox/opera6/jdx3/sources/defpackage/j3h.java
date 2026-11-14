package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j3h {
    public final String a;
    public yv4 b;
    public d3k c;
    public List d = null;

    public j3h(String str, yv4 yv4Var, d3k d3kVar) {
        this.a = str;
        this.b = yv4Var;
        this.c = d3kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3h)) {
            return false;
        }
        j3h j3hVar = (j3h) obj;
        return this.a.equals(j3hVar.a) && Intrinsics.a(this.b, j3hVar.b) && Intrinsics.a(this.c, j3hVar.c) && Intrinsics.a(this.d, j3hVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        yv4 yv4Var = this.b;
        int iHashCode2 = (iHashCode + (yv4Var == null ? 0 : yv4Var.hashCode())) * 31;
        d3k d3kVar = this.c;
        int iHashCode3 = (iHashCode2 + (d3kVar == null ? 0 : d3kVar.hashCode())) * 31;
        List list = this.d;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "";
    }
}
