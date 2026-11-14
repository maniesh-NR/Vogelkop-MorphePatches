package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lmpi;", "Lh8e;", "Lroi;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class mpi extends h8e {
    public final voi b;
    public final boolean c;

    public mpi(voi voiVar, boolean z) {
        this.b = voiVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mpi)) {
            return false;
        }
        mpi mpiVar = (mpi) obj;
        return Intrinsics.a(this.b, mpiVar.b) && this.c == mpiVar.c;
    }

    @Override // defpackage.h8e
    public final b8e f() {
        roi roiVar = new roi();
        roiVar.o = this.b;
        roiVar.p = this.c;
        return roiVar;
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        roi roiVar = (roi) b8eVar;
        roiVar.o = this.b;
        roiVar.p = this.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (((this.b.hashCode() * 31) + 1237) * 31);
    }
}
