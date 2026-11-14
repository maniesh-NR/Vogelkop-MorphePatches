package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class nbe implements tfd {
    public final mbe a;

    public nbe(mbe mbeVar) {
        this.a = mbeVar;
    }

    @Override // defpackage.tfd
    public final int a(shb shbVar, List list, int i) {
        return this.a.a(shbVar, xf8.H(shbVar), i);
    }

    @Override // defpackage.tfd
    public final ufd b(vfd vfdVar, List list, long j) {
        return this.a.b(vfdVar, xf8.H(vfdVar), j);
    }

    @Override // defpackage.tfd
    public final int c(shb shbVar, List list, int i) {
        return this.a.c(shbVar, xf8.H(shbVar), i);
    }

    @Override // defpackage.tfd
    public final int d(shb shbVar, List list, int i) {
        return this.a.d(shbVar, xf8.H(shbVar), i);
    }

    @Override // defpackage.tfd
    public final int e(shb shbVar, List list, int i) {
        return this.a.e(shbVar, xf8.H(shbVar), i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nbe) && Intrinsics.a(this.a, ((nbe) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.a + ")";
    }
}
