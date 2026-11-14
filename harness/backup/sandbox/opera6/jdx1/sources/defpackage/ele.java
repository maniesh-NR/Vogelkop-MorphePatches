package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lele;", "Lh8e;", "Lhle;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class ele extends h8e {
    public final ble b;
    public final s9i c;

    public ele(ble bleVar, s9i s9iVar) {
        this.b = bleVar;
        this.c = s9iVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ele)) {
            return false;
        }
        ele eleVar = (ele) obj;
        return Intrinsics.a(eleVar.b, this.b) && Intrinsics.a(eleVar.c, this.c);
    }

    @Override // defpackage.h8e
    public final b8e f() {
        return new hle(this.b, this.c);
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        hle hleVar = (hle) b8eVar;
        hleVar.o = this.b;
        s9i s9iVar = hleVar.p;
        if (((hle) s9iVar.b) == hleVar) {
            s9iVar.b = null;
            s9iVar.e = null;
            s9iVar.d = jpo.f;
        }
        s9i s9iVar2 = this.c;
        if (s9iVar2 == null) {
            s9iVar = new s9i((byte) 21);
            hleVar.p = s9iVar;
        } else if (s9iVar2 != s9iVar) {
            hleVar.p = s9iVar2;
            s9iVar = s9iVar2;
        }
        if (hleVar.n) {
            s9iVar.b = hleVar;
            s9iVar.c = null;
            hleVar.q = null;
            s9iVar.d = new d8e(hleVar, (byte) 2);
            s9iVar.e = hleVar.H0();
        }
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        s9i s9iVar = this.c;
        return iHashCode + (s9iVar != null ? s9iVar.hashCode() : 0);
    }
}
