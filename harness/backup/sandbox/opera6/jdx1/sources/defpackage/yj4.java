package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class yj4 {
    public final ac4 a;
    public final pyl b;
    public final sa4 c;

    public yj4(ac4 ac4Var, pyl pylVar, sa4 sa4Var) {
        this.a = ac4Var;
        this.b = pylVar;
        this.c = sa4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yj4) {
            yj4 yj4Var = (yj4) obj;
            return Intrinsics.a(this.a, yj4Var.a) && this.b == yj4Var.b && this.c == yj4Var.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ConfiguredCameraCaptureSession(session=" + this.a + ", processor=" + this.b + ", captureSequenceProcessor=" + this.c + ')';
    }
}
