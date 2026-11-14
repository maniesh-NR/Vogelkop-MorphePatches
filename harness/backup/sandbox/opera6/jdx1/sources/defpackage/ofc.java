package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ofc extends pfc {
    public final String a;
    public final tjl b;
    public final tfc c;

    public ofc(String str, tjl tjlVar, tfc tfcVar) {
        this.a = str;
        this.b = tjlVar;
        this.c = tfcVar;
    }

    public /* synthetic */ ofc(String str, tjl tjlVar, tfc tfcVar, int i) {
        this(str, (i & 2) != 0 ? null : tjlVar, (i & 4) != 0 ? null : tfcVar);
    }

    @Override // defpackage.pfc
    public final tfc a() {
        return this.c;
    }

    @Override // defpackage.pfc
    public final tjl b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ofc)) {
            return false;
        }
        ofc ofcVar = (ofc) obj;
        return Intrinsics.a(this.a, ofcVar.a) && Intrinsics.a(this.b, ofcVar.b) && Intrinsics.a(this.c, ofcVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        tjl tjlVar = this.b;
        int iHashCode2 = (iHashCode + (tjlVar != null ? tjlVar.hashCode() : 0)) * 31;
        tfc tfcVar = this.c;
        return iHashCode2 + (tfcVar != null ? tfcVar.hashCode() : 0);
    }

    public final String toString() {
        return sko.k("LinkAnnotation.Url(url=", this.a, ")");
    }
}
