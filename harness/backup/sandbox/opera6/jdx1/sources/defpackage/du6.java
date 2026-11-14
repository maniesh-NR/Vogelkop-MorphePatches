package defpackage;

/* loaded from: classes.dex */
public final class du6 implements p9f {
    public final o9f a;
    public final long b;
    public final long c;
    public final dgk d;
    public byte e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;

    public du6(dgk dgkVar, long j, long j2, long j3, long j4, boolean z) {
        z4o.w(j >= 0 && j2 > j);
        this.d = dgkVar;
        this.b = j;
        this.c = j2;
        if (j3 == j2 - j || z) {
            this.f = j4;
            this.e = (byte) 4;
        } else {
            this.e = (byte) 0;
        }
        this.a = new o9f();
    }

    @Override // defpackage.p9f
    public final twi createSeekMap() {
        if (this.f != 0) {
            return new cu6(this);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ce  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int, short] */
    /* JADX WARN: Type inference failed for: r14v3 */
    @Override // defpackage.p9f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long h(defpackage.lp6 r31) throws defpackage.s1g, java.io.InterruptedIOException, java.io.EOFException {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.du6.h(lp6):long");
    }

    @Override // defpackage.p9f
    public final void startSeek(long j) {
        this.h = tym.j(j, 0L, this.f - 1);
        this.e = (byte) 2;
        this.i = this.b;
        this.j = this.c;
        this.k = 0L;
        this.l = this.f;
    }
}
