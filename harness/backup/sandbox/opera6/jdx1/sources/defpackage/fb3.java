package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class fb3 implements ufl {
    public final ue5 a;
    public final mfe b = new mfe();
    public final t0g c = hyg.k((Object) null);

    public fb3(ue5 ue5Var) {
        this.a = ue5Var;
    }

    @Override // defpackage.ufl
    public final Object a(lfl lflVar, kuk kukVar) {
        Object objA = mfe.a(this.b, new u11((Object) this, (Object) new eb3(lflVar), (mt5) null, (byte) 3), kukVar);
        return objA == px5.a ? objA : Unit.a;
    }

    public final void b(final Function0 function0, ih5 ih5Var, final int i) {
        final Function0 function02;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(723898654);
        int i2 = (vt9Var.f(this) ? 32 : 16) | i;
        final byte b = 0;
        final byte b2 = 1;
        if (vt9Var.N(i2 & 1, (i2 & 19) != 18)) {
            eb3 eb3Var = (eb3) this.c.getValue();
            if (eb3Var == null) {
                znh znhVarR = vt9Var.r();
                if (znhVarR != null) {
                    znhVarR.d = new Function2(this, function0, i, b) { // from class: db3
                        public final /* synthetic */ byte a;
                        public final /* synthetic */ fb3 b;
                        public final /* synthetic */ Function0 c;

                        {
                            this.a = b;
                            this.b = this;
                        }

                        public final Object invoke(Object obj, Object obj2) {
                            byte b3 = this.a;
                            ih5 ih5Var2 = (ih5) obj;
                            ((Integer) obj2).getClass();
                            switch (b3) {
                                case 0:
                                    this.b.b(this.c, ih5Var2, aoh.m(7));
                                    break;
                                default:
                                    this.b.b(this.c, ih5Var2, aoh.m(7));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            function02 = function0;
            this.a.m(eb3Var, eb3Var.a, function02, vt9Var, 384);
        } else {
            function02 = function0;
            vt9Var.Q();
        }
        znh znhVarR2 = vt9Var.r();
        if (znhVarR2 != null) {
            znhVarR2.d = new Function2(this, function02, i, b2) { // from class: db3
                public final /* synthetic */ byte a;
                public final /* synthetic */ fb3 b;
                public final /* synthetic */ Function0 c;

                {
                    this.a = b2;
                    this.b = this;
                }

                public final Object invoke(Object obj, Object obj2) {
                    byte b3 = this.a;
                    ih5 ih5Var2 = (ih5) obj;
                    ((Integer) obj2).getClass();
                    switch (b3) {
                        case 0:
                            this.b.b(this.c, ih5Var2, aoh.m(7));
                            break;
                        default:
                            this.b.b(this.c, ih5Var2, aoh.m(7));
                            break;
                    }
                    return Unit.a;
                }
            };
        }
    }
}
