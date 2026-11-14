package defpackage;

/* loaded from: classes.dex */
public final class v9a implements cn8 {
    public final cn8 a;
    public final boolean b;

    public v9a(int i) {
        boolean z = (i & 1) != 0;
        this.b = z;
        if (z) {
            this.a = new bmj(-1, -1, "image/heif");
        } else {
            this.a = new u9a();
        }
    }

    @Override // defpackage.cn8
    public final boolean a(dn8 dn8Var) {
        return this.b ? qbe.P((lp6) dn8Var, false) : this.a.a(dn8Var);
    }

    @Override // defpackage.cn8
    public final int b(dn8 dn8Var, hp2 hp2Var) {
        return this.a.b(dn8Var, hp2Var);
    }

    @Override // defpackage.cn8
    public final void d(en8 en8Var) {
        this.a.d(en8Var);
    }

    @Override // defpackage.cn8
    public final void release() {
        this.a.release();
    }

    @Override // defpackage.cn8
    public final void seek(long j, long j2) {
        this.a.seek(j, j2);
    }
}
