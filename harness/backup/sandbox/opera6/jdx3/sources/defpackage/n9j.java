package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class n9j extends h42 {
    public boolean n = true;
    public List o;
    public List p;
    public final /* synthetic */ o9j q;

    public n9j(o9j o9jVar) {
        this.q = o9jVar;
        final byte b = 1;
        l08 l08Var = l08.a;
        this.o = l08Var;
        this.p = l08Var;
        u();
        a21 a21Var = o9jVar.c;
        final byte b2 = 0;
        s((h42) a21Var.h, new t7d(new Function1(this) { // from class: m9j
            public final /* synthetic */ n9j b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b3 = b2;
                n9j n9jVar = this.b;
                List list = (List) obj;
                switch (b3) {
                    case 0:
                        n9jVar.o = list;
                        if (!n9jVar.n) {
                            n9jVar.u();
                        }
                        break;
                    default:
                        n9jVar.p = list;
                        if (n9jVar.n) {
                            n9jVar.u();
                        }
                        break;
                }
                return Unit.a;
            }
        }, (byte) 12));
        s((kbd) a21Var.i, new t7d(new Function1(this) { // from class: m9j
            public final /* synthetic */ n9j b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b3 = b;
                n9j n9jVar = this.b;
                List list = (List) obj;
                switch (b3) {
                    case 0:
                        n9jVar.o = list;
                        if (!n9jVar.n) {
                            n9jVar.u();
                        }
                        break;
                    default:
                        n9jVar.p = list;
                        if (n9jVar.n) {
                            n9jVar.u();
                        }
                        break;
                }
                return Unit.a;
            }
        }, (byte) 12));
    }

    public final void u() {
        String str = (String) ((shf) this.q.c.e).a;
        boolean z = this.n;
        r(new j9j(str, z ? this.p : this.o, z));
    }
}
