package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class ae7 implements rsf {
    public final eq6 a;
    public final u56 b;

    public ae7(eq6 eq6Var, u56 u56Var) {
        this.a = eq6Var;
        this.b = u56Var;
    }

    @Override // defpackage.rsf
    public final int a() {
        return 0;
    }

    @Override // defpackage.rsf
    public final void b(long j, boolean z) {
        this.b.p(3, -1, System.currentTimeMillis());
    }

    @Override // defpackage.rsf
    public final void c() {
        this.b.p(7, 1, 969L);
    }

    @Override // defpackage.rsf
    public final void d(rsf rsfVar) {
        u56 u56Var = ((ae7) rsfVar).b;
        u56 u56Var2 = this.b;
        if (u56Var2.n(4) != null) {
            u56Var.q(4, 1, (Long) u56Var2.n(4));
        }
        if (u56Var2.n(5) != null) {
            u56Var.q(5, 1, (Long) u56Var2.n(5));
        }
        if (u56Var2.n(6) != null) {
            u56Var.q(6, -1, (Long) u56Var2.n(6));
        }
        if (u56Var2.n(8) != null) {
            u56Var.q(8, 1, (String) u56Var2.n(8));
        }
        if (u56Var2.n(9) != null) {
            qf0 qf0Var = (qf0) u56Var2.n(9);
            qf0 qf0Var2 = new qf0(2188, 1, 1);
            if (qf0Var.n(0) != null) {
                qf0Var2.q(0, 1, (String) qf0Var.n(0));
            }
            u56Var.q(9, 1, qf0Var2);
        }
    }

    @Override // defpackage.rsf
    public final rsf e(rsf rsfVar) {
        u56 u56Var = ((ae7) rsfVar).b;
        u56 u56Var2 = this.b;
        u56Var2.m(u56Var);
        return new ae7(this.a, u56Var2);
    }

    @Override // defpackage.rsf
    public final String f() {
        return (String) this.b.n(0);
    }

    @Override // defpackage.rsf
    public final void g(int i, int i2, int i3) {
    }

    @Override // defpackage.rsf
    public final void h(ByteArrayOutputStream byteArrayOutputStream, long j) throws IOException {
        this.b.t(byteArrayOutputStream, j);
    }

    @Override // defpackage.rsf
    public final void i(int i, boolean z) {
        if (hr5.a == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        u56 u56Var = this.b;
        u56Var.p(3, -1, jCurrentTimeMillis);
        u56Var.p(6, -1, 969L);
        u56Var.p(4, 1, 104L);
        u56Var.p(5, 1, 0L);
    }

    @Override // defpackage.rsf
    public final boolean isEmpty() {
        Map map = (Map) this.b.n(10);
        return (map != null ? Collections.unmodifiableMap(map) : null) == null;
    }

    @Override // defpackage.rsf
    public final void j(String str) {
        this.b.x(0, str);
    }
}
