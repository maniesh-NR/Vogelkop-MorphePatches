package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class gxi extends fxi {
    public final ArrayList j;

    public gxi(bjh bjhVar, long j, long j2, long j3, long j4, ArrayList arrayList, long j5, ArrayList arrayList2, long j6, long j7) {
        super(bjhVar, j, j2, j3, j4, arrayList, j5, j6, j7);
        this.j = arrayList2;
    }

    @Override // defpackage.fxi
    public final long d(long j) {
        return this.j.size();
    }

    @Override // defpackage.fxi
    public final bjh h(cvh cvhVar, long j) {
        return (bjh) this.j.get((int) (j - this.d));
    }

    @Override // defpackage.fxi
    public final boolean i() {
        return true;
    }
}
