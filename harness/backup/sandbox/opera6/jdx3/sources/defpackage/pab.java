package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class pab extends uup {
    public final rxh h;
    public final rxh i;

    public pab(rxh rxhVar, rxh rxhVar2) {
        this.h = rxhVar;
        this.i = rxhVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pab)) {
            return false;
        }
        pab pabVar = (pab) obj;
        return this.h.equals(pabVar.h) && Intrinsics.a(this.i, pabVar.i);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.h.a) * 31;
        rxh rxhVar = this.i;
        return iHashCode + (rxhVar == null ? 0 : Integer.hashCode(rxhVar.a));
    }

    public final String toString() {
        return "";
    }
}
