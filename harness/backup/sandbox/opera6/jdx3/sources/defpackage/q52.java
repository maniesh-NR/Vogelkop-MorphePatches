package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q52 {
    public final xb a;
    public final k42 b;
    public final kze c = new kze(k52.a);

    public q52(ndc ndcVar, xb xbVar, k42 k42Var) {
        this.a = xbVar;
        this.b = k42Var;
        final byte b = 0;
        xbVar.e.j(ndcVar, new ug(new Function1(this) { // from class: p52
            public final /* synthetic */ q52 b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b2 = b;
                q52 q52Var = this.b;
                switch (b2) {
                    case 0:
                        q52Var.a();
                        break;
                    default:
                        if (((t0i) obj) != null) {
                            q52Var.a();
                        }
                        break;
                }
                return Unit.a;
            }
        }, (byte) 5));
        final byte b2 = 1;
        k42Var.d.j(ndcVar, new ug(new Function1(this) { // from class: p52
            public final /* synthetic */ q52 b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b22 = b2;
                q52 q52Var = this.b;
                switch (b22) {
                    case 0:
                        q52Var.a();
                        break;
                    default:
                        if (((t0i) obj) != null) {
                            q52Var.a();
                        }
                        break;
                }
                return Unit.a;
            }
        }, (byte) 5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        Object n52Var;
        ipf ipfVar = (ipf) this.a.d.g();
        if (ipfVar instanceof fpf) {
            n52Var = new l52((fpf) ipfVar);
        } else if (ipfVar instanceof cpf) {
            n52Var = new j52((cpf) ipfVar);
        } else if (ipfVar instanceof gpf) {
            t0i t0iVar = (t0i) this.b.d.g();
            if (t0iVar != null) {
                Object obj = t0iVar.a;
                ehfVar = obj instanceof q0i ? null : obj;
            }
            n52Var = ehfVar != null ? new n52(ehfVar) : m52.a;
        } else {
            if (!Intrinsics.a(ipfVar, epf.a)) {
                h9o.p();
                return;
            }
            n52Var = k52.a;
        }
        xf8.G0(this.c, n52Var);
    }
}
