package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class kbd extends h42 {
    public final /* synthetic */ byte n = 1;
    public final Object o;
    public final Object p;
    public Object q;

    public kbd(ekc ekcVar, b6i b6iVar, nqi nqiVar) {
        final byte b = 1;
        this.o = ekcVar;
        this.p = b6iVar;
        this.q = nqiVar;
        final byte b2 = 0;
        s(ekcVar, new t7d(new Function1(this) { // from class: i9j
            public final /* synthetic */ kbd b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b3 = b2;
                kbd kbdVar = this.b;
                switch (b3) {
                    case 0:
                        kbd.v(kbdVar, obj, null, 2);
                        break;
                    default:
                        kbd.v(kbdVar, null, obj, 1);
                        break;
                }
                return Unit.a;
            }
        }, (byte) 11));
        s(b6iVar, new t7d(new Function1(this) { // from class: i9j
            public final /* synthetic */ kbd b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b3 = b;
                kbd kbdVar = this.b;
                switch (b3) {
                    case 0:
                        kbd.v(kbdVar, obj, null, 2);
                        break;
                    default:
                        kbd.v(kbdVar, null, obj, 1);
                        break;
                }
                return Unit.a;
            }
        }, (byte) 11));
    }

    public kbd(Object obj, t14 t14Var) {
        this.o = obj;
        this.p = t14Var;
    }

    public static final void u(ode odeVar, kbd kbdVar, ode odeVar2) {
        if (odeVar != null) {
            kbdVar.t(odeVar);
        }
        super.s(odeVar2, new d8d(new rkc((Object) kbdVar, (byte) 14), (byte) 2));
    }

    public static void v(kbd kbdVar, Object obj, Object obj2, int i) {
        if ((i & 1) != 0) {
            obj = ((ekc) kbdVar.o).g();
        }
        if ((i & 2) != 0) {
            obj2 = ((b6i) kbdVar.p).g();
        }
        if (obj == null || obj2 == null) {
            return;
        }
        kbdVar.r(((nqi) kbdVar.q).invoke(obj, obj2));
    }

    public final Object g() {
        switch (this.n) {
            case 0:
                ode odeVar = (ode) this.q;
                return odeVar == null ? this.o : ((t14) this.p).apply(odeVar.g());
            default:
                return super/*ekc*/.g();
        }
    }

    @Override // defpackage.h42
    public final void s(ekc ekcVar, f7f f7fVar) {
        switch (this.n) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                super.s(ekcVar, f7fVar);
                return;
        }
    }
}
