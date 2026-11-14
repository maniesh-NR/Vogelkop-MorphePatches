package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class bbn extends hbn {
    public final kze a;
    public final ode b;
    public final ode c;

    public bbn(kze kzeVar, ode odeVar, ode odeVar2) {
        this.a = kzeVar;
        this.b = odeVar;
        this.c = odeVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbn)) {
            return false;
        }
        bbn bbnVar = (bbn) obj;
        return Intrinsics.a(this.a, bbnVar.a) && Intrinsics.a(this.b, bbnVar.b) && Intrinsics.a(this.c, bbnVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
