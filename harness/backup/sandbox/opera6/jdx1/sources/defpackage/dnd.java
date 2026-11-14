package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class dnd {
    public final Bundle a;
    public final Boolean b;
    public vnd c;

    public dnd(vnd vndVar, boolean z) {
        if (vndVar == null) {
            qp2.o("selector must not be null");
            throw null;
        }
        Bundle bundle = new Bundle();
        this.a = bundle;
        this.c = vndVar;
        this.b = Boolean.FALSE;
        bundle.putBundle("selector", vndVar.a);
        bundle.putBoolean("activeScan", z);
    }

    public final void a() {
        if (this.c == null) {
            vnd vndVarB = vnd.b(this.a.getBundle("selector"));
            this.c = vndVarB;
            if (vndVarB == null) {
                this.c = vnd.c;
            }
        }
    }

    public final boolean b() {
        return this.a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dnd)) {
            return false;
        }
        dnd dndVar = (dnd) obj;
        a();
        vnd vndVar = this.c;
        dndVar.a();
        return vndVar.equals(dndVar.c) && b() == dndVar.b() && this.b.booleanValue() == dndVar.b.booleanValue();
    }

    public final int hashCode() {
        a();
        return (this.c.hashCode() ^ (b() ? 1 : 0)) ^ (this.b.booleanValue() ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb.append(this.c);
        sb.append(", activeScan=");
        sb.append(b());
        sb.append(", isValid=");
        a();
        this.c.a();
        sb.append(!r1.b.contains(null));
        sb.append(", shouldScanWithScreenOff= ");
        sb.append(this.b.booleanValue());
        sb.append(" }");
        return sb.toString();
    }
}
