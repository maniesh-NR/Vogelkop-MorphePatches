package defpackage;

import android.net.NetworkRequest;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class xo5 {
    public static final xo5 j = new xo5(15);
    public final int a;
    public final koe b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final long h;
    public final Set i;

    public xo5(int i) {
        int i2 = (i & 1) == 0 ? 2 : 1;
        v08 v08Var = v08.a;
        this.b = new koe(null);
        this.a = i2;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = -1L;
        this.h = -1L;
        this.i = v08Var;
    }

    public xo5(koe koeVar, int i, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, Set set) {
        this.b = koeVar;
        this.a = i;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = j2;
        this.h = j3;
        this.i = set;
    }

    public xo5(xo5 xo5Var) {
        this.c = xo5Var.c;
        this.d = xo5Var.d;
        this.b = xo5Var.b;
        this.a = xo5Var.a;
        this.e = xo5Var.e;
        this.f = xo5Var.f;
        this.i = xo5Var.i;
        this.g = xo5Var.g;
        this.h = xo5Var.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !xo5.class.equals(obj.getClass())) {
            return false;
        }
        xo5 xo5Var = (xo5) obj;
        if (this.c == xo5Var.c && this.d == xo5Var.d && this.e == xo5Var.e && this.f == xo5Var.f && this.g == xo5Var.g && this.h == xo5Var.h && Intrinsics.a(this.b.a, xo5Var.b.a) && this.a == xo5Var.a) {
            return Intrinsics.a(this.i, xo5Var.i);
        }
        return false;
    }

    public final int hashCode() {
        int iA = ((((((((vep.A(this.a) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31;
        long j2 = this.g;
        int i = (iA + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.h;
        int iHashCode = (this.i.hashCode() + ((i + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31;
        NetworkRequest networkRequest = this.b.a;
        return iHashCode + (networkRequest != null ? networkRequest.hashCode() : 0);
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + j7c.t(this.a) + ", requiresCharging=" + this.c + ", requiresDeviceIdle=" + this.d + ", requiresBatteryNotLow=" + this.e + ", requiresStorageNotLow=" + this.f + ", contentTriggerUpdateDelayMillis=" + this.g + ", contentTriggerMaxDelayMillis=" + this.h + ", contentUriTriggers=" + this.i + ", }";
    }
}
