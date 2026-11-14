package ads_mobile_sdk;

import com.google.common.util.concurrent.ListenableFuture;
import defpackage.bql;
import defpackage.fbp;
import defpackage.qua;
import defpackage.qw8;
import defpackage.vr9;
import defpackage.xfp;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class u83 implements fbp {
    public final l7 a;
    public final r83 b;
    public final qm1 c;
    public final ExecutorService d;
    public final th3 e;
    public final AtomicReference f = new AtomicReference();

    public u83(l7 l7Var, r83 r83Var, qm1 qm1Var, ExecutorService executorService, th3 th3Var) {
        this.a = l7Var;
        this.b = r83Var;
        this.c = qm1Var;
        this.d = executorService;
        this.e = th3Var;
    }

    @Override // defpackage.fbp
    public final ListenableFuture a() {
        l7 l7Var = this.a;
        int iK = l7Var.K();
        boolean zO = l7Var.o();
        r83 r83Var = this.b;
        r83Var.getClass();
        ef9 ef9VarH = ef9.h(yr9.e(new qua(r83Var, iK, (byte) 2), r83Var.d));
        xfp xfpVar = new xfp();
        m97 m97Var = m97.a;
        e7 e7VarJ = g7.j(ef9VarH, xfpVar, m97Var);
        if (zO && iK != r83Var.f) {
            e7VarJ = g7.j(o3.i(ef9.h(e7VarJ), Throwable.class, new bql((byte) 16), m97Var), new q83(r83Var), m97Var);
        }
        f7 f7VarI = g7.i(ef9.h(e7VarJ), new qw8(this, (byte) 8), m97Var);
        f7VarI.addListener(new vr9(f7VarI, new w8(this), (byte) 0), this.d);
        return f7VarI;
    }
}
