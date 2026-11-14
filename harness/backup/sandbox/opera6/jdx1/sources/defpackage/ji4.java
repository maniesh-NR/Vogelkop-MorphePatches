package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class ji4 implements ivh, z2a {
    public final long a;
    public final df2 b;
    public d3a c;

    public ji4(long j) {
        this.a = j;
        if (j <= 0) {
            qp2.o("Failed requirement.");
            throw null;
        }
        df2 df2Var = new df2();
        df2Var.a = 0L;
        this.b = df2Var;
    }

    @Override // defpackage.ivh
    public final void D(owh owhVar, long j, w61 w61Var) {
        long j2;
        long j3;
        df2 df2Var = this.b;
        do {
            j2 = df2Var.a;
            j3 = j2 != -1 ? 1 + j2 : -1L;
        } while (!df2Var.a(j2, j3));
        if (j3 == this.a) {
            Objects.toString(this.c);
            this.c.s(true);
        }
    }

    @Override // defpackage.z2a
    public final void a() {
    }

    @Override // defpackage.z2a
    public final void b() {
        long j;
        df2 df2Var = this.b;
        do {
            j = df2Var.a;
        } while (!df2Var.a(j, j != -1 ? 0L : -1L));
        this.c.s(false);
        Objects.toString(this.c);
    }

    @Override // defpackage.z2a
    public final void c() {
        this.b.a = -1L;
        this.c.s(false);
    }
}
