package defpackage;

import android.hardware.camera2.CameraManager;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.e;

/* loaded from: classes.dex */
public final class oa4 implements AutoCloseable {
    public final hnl a;
    public final String b;
    public final CameraManager c;
    public final a64 d;
    public final af2 e;
    public final nak f;
    public final rlh g;
    public final jdj h;
    public final plh i;
    public final j94 j;
    public final d3k k;

    public oa4(n7h n7hVar, hnl hnlVar, String str, unb unbVar) {
        this.a = hnlVar;
        this.b = str;
        this.c = (CameraManager) n7hVar.get();
        a64 a64VarB = sgb.b(e.a(new csk(unbVar), e.a(hnlVar.h, new jx5("CXCP-CameraStatusMonitor"))));
        this.d = a64VarB;
        this.e = c26.i(false);
        nak nakVarF = z4o.f(zf4.a);
        this.f = nakVarF;
        this.g = a26.j(nakVarF);
        mt5 mt5Var = null;
        jdj jdjVarC = ipe.c(0, 0, (h04) null, 7);
        this.h = jdjVarC;
        this.i = a26.i(jdjVarC);
        this.j = f03.g(new r3((byte) 12, mt5Var, (Object) this));
        this.k = na2.B(a64VarB, null, null, new yf((byte) 6, mt5Var, this), 3);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.e.a()) {
            this.k.k((CancellationException) null);
            sgb.k(this.d, null);
        }
    }
}
