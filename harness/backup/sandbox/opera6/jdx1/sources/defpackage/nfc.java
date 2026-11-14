package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class nfc extends pfc {
    public final String a;
    public final tjl b;
    public final z8k c;

    public nfc(String str, tjl tjlVar, z8k z8kVar) {
        this.a = str;
        this.b = tjlVar;
        this.c = z8kVar;
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
        if (!(obj instanceof nfc)) {
            return false;
        }
        nfc nfcVar = (nfc) obj;
        return Intrinsics.a(this.a, nfcVar.a) && Intrinsics.a(this.b, nfcVar.b) && Intrinsics.a(this.c, nfcVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        tjl tjlVar = this.b;
        int iHashCode2 = (iHashCode + (tjlVar != null ? tjlVar.hashCode() : 0)) * 31;
        z8k z8kVar = this.c;
        return iHashCode2 + (z8kVar != null ? z8kVar.hashCode() : 0);
    }

    public final String toString() {
        return sko.k("LinkAnnotation.Clickable(tag=", this.a, ")");
    }
}
