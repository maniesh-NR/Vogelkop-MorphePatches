package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fwc extends ewc {
    public final ate d;
    public final use e;
    public final vse f;

    public fwc(ate ateVar, use useVar, vse vseVar) {
        super(ateVar);
        this.d = ateVar;
        this.e = useVar;
        this.f = vseVar;
    }

    @Override // defpackage.ewc
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fwc) {
            fwc fwcVar = (fwc) obj;
            return Intrinsics.a(this.d, fwcVar.d) && this.e == fwcVar.e && this.f == fwcVar.f;
        }
        return false;
    }

    @Override // defpackage.ewc
    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
