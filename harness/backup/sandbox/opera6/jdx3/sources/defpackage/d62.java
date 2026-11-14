package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.view.View;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d62 extends lim {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public /* synthetic */ d62(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public d62(k6l k6lVar) {
        this.a = (byte) 10;
        this.b = k6lVar;
        this.c = new ht3((byte) 1);
    }

    public d62(p1f p1fVar, t1f t1fVar) {
        this.a = (byte) 8;
        this.b = t1fVar;
        this.c = p1fVar;
    }

    public d62(qm9 qm9Var, View view) {
        this.a = (byte) 5;
        this.b = view;
        Objects.requireNonNull(qm9Var);
        this.c = qm9Var;
    }

    public d62(rmg rmgVar, Context context) {
        this.a = (byte) 3;
        this.c = context;
        this.b = new it5(rmgVar, (byte) 1);
    }

    public d62(x5f x5fVar, yu2 yu2Var) {
        this.a = (byte) 2;
        this.b = x5fVar;
        this.c = yu2Var;
        R();
    }

    public final void R() {
        x5f x5fVar = (x5f) this.b;
        yu2 yu2Var = (yu2) this.c;
        vd0 vd0Var = !yu2Var.b() ? vd0.d : yu2Var.a() ? vd0.b : vd0.c;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            b66 b66Var = am2.g(zpaVar, x56VarF).b;
            b66Var.getClass();
            b66Var.q(81, 1, vd0Var);
            x5fVar.U0(x56VarF);
        }
    }

    @Override // defpackage.as6
    public final void W(ndc ndcVar) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 3:
                ((Context) obj).registerComponentCallbacks((it5) obj2);
                break;
            case 7:
                ((pde) obj2).r(((tcc) obj).i);
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                ((k6l) obj2).b((ht3) obj);
                break;
        }
    }

    @Override // defpackage.lim, defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ndcVar.getLifecycle().b(this);
                e62 e62Var = (e62) obj2;
                if (Intrinsics.a(e62Var.e, (hq3) obj)) {
                    e62Var.e = null;
                    urn urnVar = e62Var.b;
                    urnVar.c.getClass();
                    f9e.a.getClass();
                    urnVar.d = new spl(f9e.b());
                    break;
                }
                break;
            case 1:
                ndcVar.getLifecycle().b(this);
                u02 u02Var = ((s62) obj2).v;
                if (Intrinsics.a((zz1) u02Var.o, (zz1) obj)) {
                    u02Var.o = null;
                    break;
                }
                break;
            case 2:
            case 4:
            case 6:
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
            default:
                super.onDestroy(ndcVar);
                break;
            case 3:
                ndcVar.getLifecycle().b(this);
                ((Context) obj).unregisterComponentCallbacks((it5) obj2);
                break;
            case 5:
                ndcVar.getLifecycle().b(this);
                qm9 qm9Var = (qm9) obj;
                if (qm9Var.g == ((View) obj2)) {
                    qm9Var.g = null;
                    break;
                }
                break;
            case 7:
                ndcVar.getLifecycle().b(this);
                ((pde) obj2).r(((tcc) obj).i);
                break;
            case 8:
                ndcVar.getLifecycle().b(this);
                p1f p1fVar = (p1f) obj;
                if (p1fVar.a.c((t1f) obj2)) {
                    p1fVar.c.run();
                    break;
                }
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                ndcVar.getLifecycle().b(this);
                ((k6l) obj2).v((ht3) obj);
                break;
        }
    }

    @Override // defpackage.as6
    public final void onPause(ndc ndcVar) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 7:
                ((pde) this.b).r(((tcc) obj).i);
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((x3i) ((j4c) obj).get()).e = null;
                break;
        }
    }

    @Override // defpackage.as6
    public final void onResume(ndc ndcVar) {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 1:
                ((s62) obj).v.o = (zz1) obj2;
                break;
            case 2:
                R();
                break;
            case 4:
                if (((yl6) obj).f()) {
                    ((y3i) ((j4c) obj2).get()).n(bm6.a);
                    break;
                }
                break;
            case 6:
                ((e59) ((wv1) obj2).b.get()).c(d59.d, ((NotificationManager) obj).areNotificationsEnabled());
                break;
            case 7:
                ((pde) obj).r(((tcc) obj2).i);
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((x3i) ((j4c) obj2).get()).e = ((du3) obj).b.I0();
                break;
        }
    }

    @Override // defpackage.as6
    public final void onStart(ndc ndcVar) {
        switch (this.a) {
            case 7:
                ((pde) this.b).r(((tcc) this.c).i);
                break;
        }
    }

    @Override // defpackage.as6
    public final void onStop(ndc ndcVar) {
        switch (this.a) {
            case 7:
                ((pde) this.b).r(((tcc) this.c).i);
                break;
        }
    }
}
