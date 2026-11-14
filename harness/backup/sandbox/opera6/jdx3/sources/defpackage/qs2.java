package defpackage;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class qs2 implements as6, ewh {
    public final /* synthetic */ byte a;
    public final Object b;
    public Object c;

    public qs2(bli bliVar, qwa qwaVar) {
        this.a = (byte) 5;
        this.b = qwaVar;
    }

    public /* synthetic */ qs2(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public qs2(rs2 rs2Var, t53 t53Var) {
        this.a = (byte) 0;
        this.b = t53Var;
        Objects.requireNonNull(rs2Var);
        this.c = rs2Var;
    }

    public qs2(ru9 ru9Var, n1 n1Var) {
        this.a = (byte) 1;
        this.b = n1Var;
        Objects.requireNonNull(ru9Var);
        this.c = ru9Var;
    }

    public qs2(tah tahVar, ilm ilmVar) {
        this.a = (byte) 6;
        this.b = ilmVar;
        this.c = tahVar;
    }

    public final void a() {
        ((tcc) this.b).b(this);
    }

    public final Object b(xlh xlhVar) {
        return uup.h((tcc) this.b, xlhVar);
    }

    public final void c() {
        ((tcc) this.b).a(this);
    }

    public final void d() {
        qdc qdcVar = (tcc) ((qwa) this.b).invoke();
        if (qdcVar.i != qcc.a) {
            return;
        }
        hai.g(qdcVar, " is not active", "Lifecycle ");
    }

    public final void e(ora oraVar) {
        tcc tccVar = (tcc) ((qwa) this.b).invoke();
        if (oraVar == null) {
            if (((ora) this.c) == null) {
                return;
            }
            this.c = oraVar;
            tccVar.b(this);
            return;
        }
        d();
        if (((ora) this.c) == null) {
            tccVar.a(this);
        }
        this.c = oraVar;
    }

    @Override // defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((rs2) this.c).a.c((t53) obj);
                break;
            case 1:
                ndcVar.getLifecycle().b(this);
                ((ru9) this.c).d((n1) obj);
                break;
            case 2:
                ndcVar.getLifecycle().b(this);
                qe6 qe6Var = (qe6) obj;
                if (Intrinsics.a((tah) qe6Var.b, (tah) this.c)) {
                    qe6Var.b = null;
                    break;
                }
                break;
            case 3:
                ndcVar.getLifecycle().b(this);
                ga6 ga6Var = (ga6) obj;
                if (Intrinsics.a((d06) ga6Var.b, (d06) this.c)) {
                    ga6Var.b = null;
                    break;
                }
                break;
            case 4:
                ((unb) this.c).k((CancellationException) null);
                break;
            case 5:
                e(null);
                break;
            default:
                ((i7f) ((tah) this.c).c).c((ilm) obj);
                break;
        }
    }
}
