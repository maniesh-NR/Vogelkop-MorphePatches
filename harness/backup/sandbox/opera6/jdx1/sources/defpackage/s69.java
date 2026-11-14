package defpackage;

/* loaded from: classes.dex */
public final class s69 implements cn8 {
    public en8 e;
    public hyl f;
    public lxd h;
    public u69 i;
    public int j;
    public int k;
    public r69 l;
    public int m;
    public long n;
    public final byte[] a = new byte[42];
    public final g1g b = new g1g(new byte[32768], 0);
    public final boolean c = false;
    public final hp2 d = new hp2((byte) 2, false);
    public byte g = 0;

    @Override // defpackage.cn8
    public final boolean a(dn8 dn8Var) {
        lp6 lp6Var = (lp6) dn8Var;
        lxd lxdVarC = new xm5((byte) 26).C(lp6Var, nua.b, 0);
        if (lxdVarC != null) {
            int length = lxdVarC.a.length;
        }
        g1g g1gVar = new g1g(4);
        lp6Var.peekFully(g1gVar.a, 0, 4, false);
        return g1gVar.C() == 1716281667;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r15v1 r69, still in use, count: 2, list:
          (r15v1 r69) from 0x0220: MOVE (r30v1 r69) = (r15v1 r69)
          (r15v1 r69) from 0x020e: MOVE (r30v3 r69) = (r15v1 r69)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v2, types: [r69, zf3] */
    @Override // defpackage.cn8
    public final int b(defpackage.dn8 r30, hp2 r31) {
        /*
            Method dump skipped, instructions count: 1103
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s69.b(dn8, hp2):int");
    }

    @Override // defpackage.cn8
    public final void d(en8 en8Var) {
        this.e = en8Var;
        this.f = en8Var.track(0, 1);
        en8Var.endTracks();
    }

    @Override // defpackage.cn8
    public final void release() {
    }

    @Override // defpackage.cn8
    public final void seek(long j, long j2) {
        if (j == 0) {
            this.g = (byte) 0;
        } else {
            r69 r69Var = this.l;
            if (r69Var != null) {
                r69Var.d(j2);
            }
        }
        this.n = j2 != 0 ? -1L : 0L;
        this.m = 0;
        this.b.K(0);
    }
}
