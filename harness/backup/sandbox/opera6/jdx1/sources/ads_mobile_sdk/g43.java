package ads_mobile_sdk;

import ads_mobile_sdk.fl0;
import ads_mobile_sdk.g43;
import ads_mobile_sdk.jl2;
import ads_mobile_sdk.xk2;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import defpackage.bql;
import defpackage.dkp;
import defpackage.nzo;
import defpackage.pko;
import defpackage.sso;
import defpackage.v8p;
import defpackage.xq9;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class g43 implements nzo {
    public final vn3 a;
    public final ab3 b;
    public final dkp c;
    public final th3 d;
    public final ExecutorService e;
    public final AtomicReference f = new AtomicReference("2.945319811.-1");

    public g43(vn3 vn3Var, ab3 ab3Var, dkp dkpVar, th3 th3Var, ExecutorService executorService) {
        this.a = vn3Var;
        this.b = ab3Var;
        this.c = dkpVar;
        this.d = th3Var;
        this.e = executorService;
    }

    @Override // defpackage.nzo
    public final ef9 a() {
        ef9 ef9VarH = ef9.h(this.b.a());
        bql bqlVar = new bql((byte) 9);
        m97 m97Var = m97.a;
        final byte b = 0;
        f7 f7VarI = g7.i(o3.i(ef9VarH, Throwable.class, bqlVar, m97Var), new xq9(this) { // from class: p1p
            public final /* synthetic */ g43 b;

            {
                this.b = this;
            }

            @Override // defpackage.xq9
            public final Object apply(Object obj) {
                byte b2 = b;
                g43 g43Var = this.b;
                switch (b2) {
                    case 0:
                        jl2 jl2Var = (jl2) obj;
                        if (g43Var.c.b(jl2Var) && jl2Var != null) {
                            return Boolean.TRUE;
                        }
                        g43Var.d.b(fl0.EVENT_ID_DG_ENGINE_INIT_SKIP_INVALID_METADATA);
                        throw new e22(1);
                    default:
                        xk2 xk2Var = (xk2) obj;
                        if (xk2Var == null) {
                            throw new e22(3);
                        }
                        File file = xk2Var.b;
                        if (Build.VERSION.SDK_INT >= 34) {
                            file.setReadOnly();
                        }
                        g43Var.d.a(fl0.EVENT_ID_DG_ENGINE_INIT_VM_LOAD, (Runnable) new fmn(g43Var, xk2Var, (byte) 18));
                        return Boolean.TRUE;
                }
            }
        }, m97Var);
        final byte b2 = 1;
        return g7.i(g7.i(g7.j(f7VarI, new sso(this, (byte) 1), m97Var), new xq9(this) { // from class: p1p
            public final /* synthetic */ g43 b;

            {
                this.b = this;
            }

            @Override // defpackage.xq9
            public final Object apply(Object obj) {
                byte b22 = b2;
                g43 g43Var = this.b;
                switch (b22) {
                    case 0:
                        jl2 jl2Var = (jl2) obj;
                        if (g43Var.c.b(jl2Var) && jl2Var != null) {
                            return Boolean.TRUE;
                        }
                        g43Var.d.b(fl0.EVENT_ID_DG_ENGINE_INIT_SKIP_INVALID_METADATA);
                        throw new e22(1);
                    default:
                        xk2 xk2Var = (xk2) obj;
                        if (xk2Var == null) {
                            throw new e22(3);
                        }
                        File file = xk2Var.b;
                        if (Build.VERSION.SDK_INT >= 34) {
                            file.setReadOnly();
                        }
                        g43Var.d.a(fl0.EVENT_ID_DG_ENGINE_INIT_VM_LOAD, (Runnable) new fmn(g43Var, xk2Var, (byte) 18));
                        return Boolean.TRUE;
                }
            }
        }, m97Var), new bql((byte) 10), m97Var);
    }

    @Override // defpackage.nzo
    public final m7m a(Context context) {
        return yr9.e(new defpackage.d9(this, context, (byte) 8), this.e);
    }

    @Override // defpackage.nzo
    public final m7m a(Context context, String str, View view, Activity activity) {
        return yr9.e(new pko(this, context, str, view, activity), this.e);
    }

    @Override // defpackage.nzo
    public final void a(MotionEvent motionEvent) {
        cm1 cm1VarA = this.a.a();
        th3 th3Var = this.d;
        if (cm1VarA == null) {
            th3Var.b(fl0.EVENT_ID_DG_ENGINE_NULL_HANDLE);
            return;
        }
        if (motionEvent == null) {
            return;
        }
        try {
            cm1VarA.a(motionEvent);
        } catch (tn3 e) {
            fl0 fl0Var = fl0.EVENT_ID_UNSPECIFIED;
            th3Var.a.a(15004, -1L, e, null);
        }
    }

    @Override // defpackage.nzo
    public final String b() {
        return (String) this.f.get();
    }

    @Override // defpackage.nzo
    public final m7m b(Context context, String str, View view, Activity activity) {
        return yr9.e(new v8p(this, context, str, view, activity, (byte) 2), this.e);
    }

    @Override // defpackage.nzo
    public final int c() {
        return 3;
    }
}
