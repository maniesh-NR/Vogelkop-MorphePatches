package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class wj7 extends xj7 {
    public final pc a;
    public final pc b;
    public final tf c;

    static {
        int i = tf.i;
    }

    public wj7(pc pcVar, pc pcVar2, tf tfVar) {
        this.a = pcVar;
        this.b = pcVar2;
        this.c = tfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wj7)) {
            return false;
        }
        wj7 wj7Var = (wj7) obj;
        return this.a == wj7Var.a && this.b == wj7Var.b && Intrinsics.a(this.c, wj7Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        pc pcVar = this.b;
        int iHashCode2 = (iHashCode + (pcVar == null ? 0 : pcVar.hashCode())) * 31;
        tf tfVar = this.c;
        return iHashCode2 + (tfVar != null ? tfVar.hashCode() : 0);
    }

    public final String toString() {
        return "";
    }
}
