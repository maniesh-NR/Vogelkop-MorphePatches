package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class al8 implements hwh {
    public final owh a;
    public final long b;

    public al8(owh owhVar, long j) {
        this.a = owhVar;
        this.b = j;
    }

    @Override // defpackage.inm
    public final Object E(s15 s15Var) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof al8) {
            al8 al8Var = (al8) obj;
            return Intrinsics.a(this.a, al8Var.a) && this.b == al8Var.b;
        }
        return false;
    }

    @Override // defpackage.hwh
    public final int getReason() {
        return 0;
    }

    public final int hashCode() {
        return z1m.e(((this.a.hashCode() * 31) + 1237) * 31, 31, this.b);
    }

    @Override // defpackage.hwh
    public final boolean m() {
        return false;
    }

    public final String toString() {
        return "ExtensionRequestFailure(requestMetadata=" + this.a + ", wasImageCaptured=false, frameNumber=" + ((Object) ho9.a(this.b)) + ", reason=0)";
    }
}
