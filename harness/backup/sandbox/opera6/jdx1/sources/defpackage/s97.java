package defpackage;

/* loaded from: classes.dex */
public final class s97 implements hyl {
    public final byte[] a = new byte[4096];

    @Override // defpackage.hyl
    public final void a(long j, int i, int i2, int i3, gyl gylVar) {
    }

    @Override // defpackage.hyl
    public final void b(g1g g1gVar, int i, int i2) {
        g1gVar.O(i);
    }

    @Override // defpackage.hyl
    public final int d(oc6 oc6Var, int i, boolean z) {
        byte[] bArr = this.a;
        int i2 = oc6Var.read(bArr, 0, Math.min(bArr.length, i));
        if (i2 != -1) {
            return i2;
        }
        if (z) {
            return -1;
        }
        qp2.c();
        return 0;
    }

    @Override // defpackage.hyl
    public final void g(oj9 oj9Var) {
    }
}
