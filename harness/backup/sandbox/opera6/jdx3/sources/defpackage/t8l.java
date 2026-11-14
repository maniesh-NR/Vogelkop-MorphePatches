package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class t8l {
    public final k6l a;
    public final pde b;
    public final pde c = new pde(a());

    public t8l(ndc ndcVar, k6l k6lVar, pde pdeVar) {
        this.a = k6lVar;
        this.b = pdeVar;
        final byte b = 0;
        aib.A(k6lVar, ndcVar.getLifecycle(), new s8l(this), new Function0(this) { // from class: r8l
            public final /* synthetic */ t8l b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b2 = b;
                t8l t8lVar = this.b;
                switch (b2) {
                    case 0:
                        xf8.F0(t8lVar.c, t8lVar.a());
                        break;
                    default:
                        xf8.F0(t8lVar.c, t8lVar.a());
                        break;
                }
                return Unit.a;
            }
        });
        final byte b2 = 1;
        aib.A(k6lVar.w, ndcVar.getLifecycle(), new q6l(this, (byte) 4), new Function0(this) { // from class: r8l
            public final /* synthetic */ t8l b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b22 = b2;
                t8l t8lVar = this.b;
                switch (b22) {
                    case 0:
                        xf8.F0(t8lVar.c, t8lVar.a());
                        break;
                    default:
                        xf8.F0(t8lVar.c, t8lVar.a());
                        break;
                }
                return Unit.a;
            }
        });
        pdeVar.j(ndcVar, new w4i(new n6k((Object) this, (byte) 26), (byte) 23));
    }

    public final q8l a() {
        if (((Number) this.b.g()).floatValue() == 1.0f) {
            return q8l.c;
        }
        b2l b2lVar = this.a.o;
        if (b2lVar != null) {
            knf knfVar = (knf) ((d7l) b2lVar).e.d;
            q8l q8lVarD = knfVar == null ? q8l.c : knfVar.D();
            if (q8lVarD != null) {
                return q8lVarD;
            }
        }
        return q8l.c;
    }
}
