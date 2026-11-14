package defpackage;

import android.view.View;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class xzk extends z9b {
    public Function1 r;
    public k3o s;

    @Override // defpackage.u9b, defpackage.b8e
    public final void L0() throws pxb {
        View viewI0 = p37.i0(this);
        WeakHashMap weakHashMap = k3o.x;
        k3o k3oVarS = fac.s(viewI0);
        k3oVarS.a(viewI0);
        g2o g2oVar = (g2o) this.r.invoke(k3oVarS);
        if (!Intrinsics.a(g2oVar, this.q)) {
            this.q = g2oVar;
            U0();
        }
        this.s = k3oVarS;
        super.L0();
    }

    @Override // defpackage.u9b, defpackage.b8e
    public final void M0() {
        View viewI0 = p37.i0(this);
        k3o k3oVar = this.s;
        if (k3oVar != null) {
            int i = k3oVar.v - 1;
            k3oVar.v = i;
            if (i == 0) {
                WeakHashMap weakHashMap = r5n.a;
                h5n.c(viewI0, null);
                n2o.a(viewI0, null);
                viewI0.removeOnAttachStateChangeListener(k3oVar.w);
            }
        }
        super.M0();
    }
}
