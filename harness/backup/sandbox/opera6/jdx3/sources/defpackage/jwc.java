package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class jwc extends ewc {
    public final ate d;
    public final int e;
    public final vse f;

    public jwc(ate ateVar, int i, vse vseVar) {
        super(ateVar);
        this.d = ateVar;
        this.e = i;
        this.f = vseVar;
    }

    @Override // defpackage.ewc
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!jwc.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        jwc jwcVar = (jwc) obj;
        if (Intrinsics.a(this.d, jwcVar.d) && this.e == jwcVar.e) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // defpackage.ewc
    public final int hashCode() {
        return this.b.hashCode() + ((((Integer.hashCode(this.e) + (this.d.hashCode() * 31)) * 31) + 2131886157) * 31);
    }

    public final String toString() {
        return "";
    }
}
