package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class z4i implements wkn {
    public final tu9 a;
    public final h42 b;
    public final h42 c;

    public z4i(x4i x4iVar, ru9 ru9Var) {
        ekc tu9Var = new tu9(ru9.h, new rag((byte) 24), ru9Var);
        this.a = tu9Var;
        ekc ekcVarJ = b8h.j(x4iVar.h, new u4h((byte) 21));
        this.b = ekcVarJ;
        h42 h42Var = new h42();
        final byte b = 0;
        h42Var.s(ekcVarJ, new t7d(new Function1(this) { // from class: y4i
            public final /* synthetic */ z4i b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b2 = b;
                z4i z4iVar = this.b;
                switch (b2) {
                    case 0:
                        z4iVar.b();
                        break;
                    default:
                        z4iVar.b();
                        break;
                }
                return Unit.a;
            }
        }, (byte) 9));
        final byte b2 = 1;
        h42Var.s(tu9Var, new t7d(new Function1(this) { // from class: y4i
            public final /* synthetic */ z4i b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b22 = b2;
                z4i z4iVar = this.b;
                switch (b22) {
                    case 0:
                        z4iVar.b();
                        break;
                    default:
                        z4iVar.b();
                        break;
                }
                return Unit.a;
            }
        }, (byte) 9));
        this.c = h42Var;
    }

    @Override // defpackage.wkn
    public final ekc a() {
        return this.c;
    }

    public final void b() {
        r79 r79Var;
        tu9 tu9Var = this.a;
        if (tu9Var.i()) {
            h42 h42Var = this.b;
            if (h42Var.i()) {
                l08 l08Var = (List) tu9Var.g();
                if (l08Var == null) {
                    l08Var = l08.a;
                }
                v08 v08Var = (Set) h42Var.g();
                if (v08Var == null) {
                    v08Var = v08.a;
                }
                m2m m2mVarM = e82.m(new Collection[]{l08Var, v08Var});
                bli bliVar = new bli((byte) 10);
                if (m2mVarM instanceof m2m) {
                    m2m m2mVar = m2mVarM;
                    r79Var = new r79(m2mVar.a, m2mVar.b, bliVar);
                } else {
                    r79Var = new r79(m2mVarM, new bli((byte) 11), bliVar);
                }
                xf8.E0(this.c, y1j.h(r79Var));
            }
        }
    }
}
