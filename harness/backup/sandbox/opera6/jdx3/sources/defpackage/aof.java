package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class aof {
    public final gsj a;
    public final wg5 b;

    public aof(gsj gsjVar, wg5 wg5Var) {
        this.a = gsjVar;
        this.b = wg5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aof) {
            aof aofVar = (aof) obj;
            return Intrinsics.a(this.a, aofVar.a) && this.b == aofVar.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
