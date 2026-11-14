package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class m0a {
    public final tah a;
    public final iv7 b;
    public final ode c;
    public Set d;
    public final pde e;

    public m0a(ndc ndcVar, h0a h0aVar, tah tahVar, iv7 iv7Var) {
        this.a = tahVar;
        this.b = iv7Var;
        ode odeVar = h0aVar.d;
        this.c = odeVar;
        this.d = v08.a;
        pde pdeVar = new pde(a());
        this.e = pdeVar;
        final byte b = 0;
        odeVar.j(ndcVar, new ug(new Function1(this) { // from class: j0a
            public final /* synthetic */ m0a b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b2 = b;
                m0a m0aVar = this.b;
                switch (b2) {
                    case 0:
                        m0aVar.b();
                        break;
                    case 1:
                        m0aVar.b();
                        break;
                    default:
                        if (m0aVar.d.isEmpty() && !((Collection) ((pde) m0aVar.a.h).g()).isEmpty()) {
                            m0aVar.d = Collections.singleton(o0a.a);
                        }
                        m0aVar.b();
                        break;
                }
                return Unit.a;
            }
        }, (byte) 24));
        final byte b2 = 1;
        iv7Var.f.j(ndcVar, new ug(new Function1(this) { // from class: j0a
            public final /* synthetic */ m0a b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b22 = b2;
                m0a m0aVar = this.b;
                switch (b22) {
                    case 0:
                        m0aVar.b();
                        break;
                    case 1:
                        m0aVar.b();
                        break;
                    default:
                        if (m0aVar.d.isEmpty() && !((Collection) ((pde) m0aVar.a.h).g()).isEmpty()) {
                            m0aVar.d = Collections.singleton(o0a.a);
                        }
                        m0aVar.b();
                        break;
                }
                return Unit.a;
            }
        }, (byte) 24));
        final byte b3 = 2;
        ((pde) tahVar.h).j(ndcVar, new ug(new Function1(this) { // from class: j0a
            public final /* synthetic */ m0a b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b22 = b3;
                m0a m0aVar = this.b;
                switch (b22) {
                    case 0:
                        m0aVar.b();
                        break;
                    case 1:
                        m0aVar.b();
                        break;
                    default:
                        if (m0aVar.d.isEmpty() && !((Collection) ((pde) m0aVar.a.h).g()).isEmpty()) {
                            m0aVar.d = Collections.singleton(o0a.a);
                        }
                        m0aVar.b();
                        break;
                }
                return Unit.a;
            }
        }, (byte) 24));
        new x77(ndcVar, pdeVar, iv7Var);
    }

    public final l0a a() {
        eri eriVarB = this.b.c.b();
        q6e q6eVar = eti.a;
        boolean z = eriVarB == null ? false : eriVarB instanceof f1a;
        return new l0a(z, v08.a, l08.a);
    }

    public final void b() {
        xf8.F0(this.e, a());
    }
}
