package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class o43 extends lx8 implements rjm, y9n, cr {
    public final ViewGroup d;
    public final dr e;

    public o43(View view) {
        this(view, 2131362864);
    }

    public o43(View view, int i) {
        super(view);
        WeakHashMap weakHashMap = r5n.a;
        this.d = (ViewGroup) ((View) m5n.f(view, i));
        this.e = new dr(view.getContext(), this);
    }

    @Override // defpackage.y9n
    public final void T(View view, int i, int i2) {
        this.e.T(view, i, i2);
    }

    @Override // defpackage.ab2
    public final int U() {
        return -1;
    }

    @Override // defpackage.ab2
    public void V(ja2 ja2Var, boolean z) {
        if (z) {
            return;
        }
        dr drVar = this.e;
        an anVar = drVar.a;
        if (anVar.a.b(drVar) && anVar.b) {
            drVar.d(true);
        }
        if (drVar.f) {
            return;
        }
        drVar.a(new ar(drVar, true, (byte) 0));
    }

    @Override // defpackage.ab2
    public void Y() {
        dr drVar = this.e;
        if (drVar.f) {
            drVar.a(new ar(drVar, false, (byte) 0));
        }
        an anVar = drVar.a;
        if (anVar.a.c(drVar) && anVar.b) {
            drVar.d(false);
        }
    }

    @Override // defpackage.rjm
    public final void b(sjm sjmVar) {
        mq mqVarZ = Z();
        boolean zA = sjmVar.a();
        if (mqVarZ.o != zA) {
            mqVarZ.o = zA;
            k8 k8Var = mqVarZ.k;
            if (zA) {
                k8Var.d0(mqVarZ);
            } else {
                k8Var.f0(mqVarZ);
            }
        }
        this.e.b(sjmVar);
    }

    public mq e0() {
        return (mq) this.b;
    }

    public void i(boolean z) {
    }

    public void q(boolean z) {
        Z().l(z);
    }
}
