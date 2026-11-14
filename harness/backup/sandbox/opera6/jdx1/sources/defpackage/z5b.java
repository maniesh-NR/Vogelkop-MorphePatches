package defpackage;

/* loaded from: classes.dex */
public final class z5b implements twi {
    public final j0d a;
    public final j0d b;
    public long c;

    public z5b(long[] jArr, long[] jArr2, long j) {
        j0d j0dVar;
        j0d j0dVar2;
        z4o.w(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            j0dVar = new j0d(length);
            this.a = j0dVar;
            j0dVar2 = new j0d(length);
            this.b = j0dVar2;
        } else {
            int i = length + 1;
            j0dVar = new j0d(i);
            this.a = j0dVar;
            j0dVar2 = new j0d(i);
            this.b = j0dVar2;
            j0dVar.a(0L);
            j0dVar2.a(0L);
        }
        j0dVar.b(jArr);
        j0dVar2.b(jArr2);
        this.c = j;
    }

    public final void d(long j, long j2) {
        j0d j0dVar = this.b;
        int i = j0dVar.b;
        j0d j0dVar2 = this.a;
        if (i == 0 && j > 0) {
            j0dVar2.a(0L);
            j0dVar.a(0L);
        }
        j0dVar2.a(j2);
        j0dVar.a(j);
    }

    @Override // defpackage.twi
    public final long getDurationUs() {
        return this.c;
    }

    @Override // defpackage.twi
    public final swi getSeekPoints(long j) {
        j0d j0dVar = this.b;
        if (j0dVar.b == 0) {
            vwi vwiVar = vwi.c;
            return new swi(vwiVar, vwiVar);
        }
        int iD = tym.d(j0dVar, j);
        long jD = j0dVar.d(iD);
        j0d j0dVar2 = this.a;
        vwi vwiVar2 = new vwi(jD, j0dVar2.d(iD));
        if (jD == j || iD == j0dVar.b - 1) {
            return new swi(vwiVar2, vwiVar2);
        }
        int i = iD + 1;
        return new swi(vwiVar2, new vwi(j0dVar.d(i), j0dVar2.d(i)));
    }

    @Override // defpackage.twi
    public final boolean isSeekable() {
        return this.b.b > 0;
    }
}
