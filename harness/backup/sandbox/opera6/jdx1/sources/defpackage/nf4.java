package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class nf4 extends kf4 {
    public final String a;
    public final k65 b;
    public final Integer c;
    public final sn7 d;
    public final Throwable e;
    public final sn7 f;
    public final sn7 g;
    public final sn7 h;
    public final yc4 i;

    public nf4(String str, k65 k65Var, Integer num, sn7 sn7Var, Throwable th, sn7 sn7Var2, sn7 sn7Var3, sn7 sn7Var4, yc4 yc4Var) {
        this.a = str;
        this.b = k65Var;
        this.c = num;
        this.d = sn7Var;
        this.e = th;
        this.f = sn7Var2;
        this.g = sn7Var3;
        this.h = sn7Var4;
        this.i = yc4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nf4)) {
            return false;
        }
        nf4 nf4Var = (nf4) obj;
        return Intrinsics.a(this.a, nf4Var.a) && this.b == nf4Var.b && Intrinsics.a(this.c, nf4Var.c) && Intrinsics.a(this.d, nf4Var.d) && Intrinsics.a(this.e, nf4Var.e) && Intrinsics.a(this.f, nf4Var.f) && Intrinsics.a(this.g, nf4Var.g) && Intrinsics.a(this.h, nf4Var.h) && Intrinsics.a(this.i, nf4Var.i);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Integer num = this.c;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        sn7 sn7Var = this.d;
        int iHashCode3 = (iHashCode2 + (sn7Var == null ? 0 : Long.hashCode(sn7Var.a))) * 31;
        Throwable th = this.e;
        int iHashCode4 = (iHashCode3 + (th == null ? 0 : th.hashCode())) * 31;
        sn7 sn7Var2 = this.f;
        int iHashCode5 = (iHashCode4 + (sn7Var2 == null ? 0 : Long.hashCode(sn7Var2.a))) * 31;
        sn7 sn7Var3 = this.g;
        int iHashCode6 = (iHashCode5 + (sn7Var3 == null ? 0 : Long.hashCode(sn7Var3.a))) * 31;
        sn7 sn7Var4 = this.h;
        int iHashCode7 = (iHashCode6 + (sn7Var4 == null ? 0 : Long.hashCode(sn7Var4.a))) * 31;
        yc4 yc4Var = this.i;
        return iHashCode7 + (yc4Var != null ? Integer.hashCode(yc4Var.a) : 0);
    }

    public final String toString() {
        return "CameraStateClosed(cameraId=" + ((Object) sd4.b(this.a)) + ", cameraClosedReason=" + this.b + ", cameraRetryCount=" + this.c + ", cameraRetryDurationNs=" + this.d + ", cameraException=" + this.e + ", cameraOpenDurationNs=" + this.f + ", cameraActiveDurationNs=" + this.g + ", cameraClosingDurationNs=" + this.h + ", cameraErrorCode=" + this.i + ')';
    }
}
