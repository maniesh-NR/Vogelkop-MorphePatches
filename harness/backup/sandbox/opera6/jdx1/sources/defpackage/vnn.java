package defpackage;

/* loaded from: classes.dex */
public final class vnn implements cn8 {
    public en8 a;
    public hyl b;
    public tnn e;
    public byte c = 0;
    public long d = -1;
    public int f = -1;
    public long g = -1;

    @Override // defpackage.cn8
    public final boolean a(dn8 dn8Var) {
        return aib.o((lp6) dn8Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x024d  */
    @Override // defpackage.cn8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(defpackage.dn8 r25, hp2 r26) throws defpackage.s1g, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 731
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vnn.b(dn8, hp2):int");
    }

    @Override // defpackage.cn8
    public final void d(en8 en8Var) {
        this.a = en8Var;
        this.b = en8Var.track(0, 1);
        en8Var.endTracks();
    }

    @Override // defpackage.cn8
    public final void release() {
    }

    @Override // defpackage.cn8
    public final void seek(long j, long j2) {
        this.c = j == 0 ? (byte) 0 : (byte) 4;
        tnn tnnVar = this.e;
        if (tnnVar != null) {
            tnnVar.c(j2);
        }
    }
}
