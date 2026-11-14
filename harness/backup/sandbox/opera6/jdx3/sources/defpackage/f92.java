package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class f92 {
    public final uqe a;
    public final j4c b;
    public final j4c c;
    public final a92 d = new a92(this);
    public final j4c e;

    public f92(au8 au8Var, uqe uqeVar, String str) {
        final byte b = 0;
        this.b = new j4c(new esk(this) { // from class: y82
            public final /* synthetic */ f92 b;

            {
                this.b = this;
            }

            public final Object get() {
                byte b2 = b;
                f92 f92Var = this.b;
                switch (b2) {
                    case 0:
                        return f92Var.b();
                    default:
                        return f92Var.a();
                }
            }
        }, (byte) 0);
        final byte b2 = 1;
        this.c = new j4c(new esk(this) { // from class: y82
            public final /* synthetic */ f92 b;

            {
                this.b = this;
            }

            public final Object get() {
                byte b22 = b2;
                f92 f92Var = this.b;
                switch (b22) {
                    case 0:
                        return f92Var.b();
                    default:
                        return f92Var.a();
                }
            }
        }, (byte) 0);
        this.a = uqeVar;
        this.e = new j4c(new z82(b, this, au8Var, str), (byte) 0);
    }

    public u82 a() {
        return new b92();
    }

    public d53 b() {
        return new d92();
    }

    public u82 c() {
        return (u82) this.c.get();
    }

    public d53 d() {
        return (d53) this.b.get();
    }

    public final void e(Object obj, oqe oqeVar, w82 w82Var) {
        hv2 hv2Var;
        c53 c53Var;
        if (oqeVar == null && (c53Var = (hv2Var = (hv2) this.e.get()).g) != null) {
            hv2Var.g = null;
            hv2Var.e.accept(c53Var);
            w82Var.a(c53Var);
        } else {
            d53 d53VarD = d();
            v82 v82Var = new v82((byte) 0);
            ArrayList arrayList = (ArrayList) v82Var.b;
            arrayList.add(this.d);
            arrayList.add(w82Var);
            d53VarD.e(obj, oqeVar, v82Var);
        }
    }

    public void f(c53 c53Var) {
    }
}
