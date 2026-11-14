package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ex0 {
    public final ndc a;
    public final j4c b;
    public final k6l c;
    public final pde d;
    public final pde e;
    public qdc f;
    public final dx0 g;
    public pde h;
    public final k9 i;

    public ex0(ndc ndcVar, j4c j4cVar, k6l k6lVar) {
        this.a = ndcVar;
        this.b = j4cVar;
        this.c = k6lVar;
        l08 l08Var = l08.a;
        this.d = new pde(l08Var);
        this.e = new pde(l08Var);
        this.g = new dx0(this);
        this.i = new k9((Object) this, (byte) 7);
        final byte b = 0;
        z5i.e0(j4cVar, ndcVar.getLifecycle(), new bx0(this), new Function0(this) { // from class: ax0
            public final /* synthetic */ ex0 b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b2 = b;
                ex0 ex0Var = this.b;
                switch (b2) {
                    case 0:
                        ex0Var.b();
                        break;
                    default:
                        ex0Var.b();
                        break;
                }
                return Unit.a;
            }
        });
        final byte b2 = 1;
        aib.A(k6lVar, ndcVar.getLifecycle(), new cx0(this), new Function0(this) { // from class: ax0
            public final /* synthetic */ ex0 b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b22 = b2;
                ex0 ex0Var = this.b;
                switch (b22) {
                    case 0:
                        ex0Var.b();
                        break;
                    default:
                        ex0Var.b();
                        break;
                }
                return Unit.a;
            }
        });
    }

    public final void a() {
        v22 v22VarG;
        b2l b2lVarA = this.c.A();
        qdc qdcVar = this.f;
        pde pdeVar = null;
        if ((qdcVar != null ? qdcVar.i : null) == qcc.e && (v22VarG = ((b22) this.b.get()).g(b2lVarA)) != null) {
            pdeVar = v22VarG.d;
        }
        if (Intrinsics.a(this.h, pdeVar)) {
            return;
        }
        pde pdeVar2 = this.h;
        k9 k9Var = this.i;
        if (pdeVar2 != null) {
            pdeVar2.p(k9Var);
        }
        this.h = pdeVar;
        if (pdeVar != null) {
            pdeVar.j(this.a, k9Var);
            return;
        }
        l08 l08Var = l08.a;
        xf8.F0(this.d, l08Var);
        xf8.F0(this.e, l08Var);
    }

    public final void b() {
        v22 v22VarG;
        b2l b2lVar = this.c.o;
        qdc qdcVar = null;
        if (b2lVar != null && (v22VarG = ((b22) this.b.get()).g(b2lVar)) != null) {
            qdcVar = v22VarG.f;
        }
        if (Intrinsics.a(this.f, qdcVar)) {
            return;
        }
        qdc qdcVar2 = this.f;
        dx0 dx0Var = this.g;
        if (qdcVar2 != null) {
            qdcVar2.b(dx0Var);
        }
        this.f = qdcVar;
        if (qdcVar != null) {
            qdcVar.a(dx0Var);
        }
        a();
    }
}
