package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p3l implements u3l {
    public final u3l d;
    public final u3l e;

    public p3l(u3l u3lVar, u3l u3lVar2) {
        this.d = u3lVar;
        this.e = u3lVar2;
    }

    @Override // defpackage.u3l
    public final boolean a(b2l b2lVar) {
        return this.d.a(b2lVar) && this.e.a(b2lVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p3l)) {
            return false;
        }
        p3l p3lVar = (p3l) obj;
        return Intrinsics.a(this.d, p3lVar.d) && Intrinsics.a(this.e, p3lVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
