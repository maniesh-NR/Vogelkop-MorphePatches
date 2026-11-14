package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class e8k extends lim {
    public final mw3 a;
    public final po7 b;
    public final u8k c;
    public final kze d;
    public final kze e;
    public final kze f;
    public final x53 g;

    public e8k(mw3 mw3Var, po7 po7Var, u8k u8kVar) {
        j7k j7kVar;
        j7k j7kVar2;
        this.a = mw3Var;
        this.b = po7Var;
        this.c = u8kVar;
        this.d = new kze(Integer.valueOf((!((ru9) mw3Var.get()).a.getBoolean("startpage.allow_extended_behavior", false) || (j7kVar2 = (j7k) po7Var.g()) == null) ? 0 : j7kVar2.b));
        this.e = new kze(Boolean.valueOf((!((ru9) mw3Var.get()).a.getBoolean("startpage.allow_extended_behavior", false) || (j7kVar = (j7k) po7Var.g()) == null) ? true : j7kVar.d));
        u8kVar.b();
        this.f = new kze(Boolean.TRUE);
        this.g = new x53(this);
    }

    public final void R() {
        j7k j7kVar;
        j7k j7kVar2;
        mw3 mw3Var = this.a;
        boolean z = ((ru9) mw3Var.get()).a.getBoolean("startpage.allow_extended_behavior", false);
        po7 po7Var = this.b;
        xf8.G0(this.d, Integer.valueOf((!z || (j7kVar2 = (j7k) po7Var.g()) == null) ? 0 : j7kVar2.b));
        xf8.G0(this.e, Boolean.valueOf((!((ru9) mw3Var.get()).a.getBoolean("startpage.allow_extended_behavior", false) || (j7kVar = (j7k) po7Var.g()) == null) ? true : j7kVar.d));
        this.c.b();
        xf8.G0(this.f, Boolean.TRUE);
    }

    @Override // defpackage.as6
    public final void W(ndc ndcVar) {
        final byte b = 0;
        this.b.j(ndcVar, new t7d(new Function1(this) { // from class: d8k
            public final /* synthetic */ e8k b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b2 = b;
                e8k e8kVar = this.b;
                switch (b2) {
                    case 0:
                        e8kVar.R();
                        break;
                    default:
                        kze kzeVar = e8kVar.f;
                        e8kVar.c.b();
                        xf8.G0(kzeVar, Boolean.TRUE);
                        break;
                }
                return Unit.a;
            }
        }, (byte) 19));
        ((ru9) this.a.get()).a(this.g);
        final byte b2 = 1;
        this.c.d.j(ndcVar, new t7d(new Function1(this) { // from class: d8k
            public final /* synthetic */ e8k b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b22 = b2;
                e8k e8kVar = this.b;
                switch (b22) {
                    case 0:
                        e8kVar.R();
                        break;
                    default:
                        kze kzeVar = e8kVar.f;
                        e8kVar.c.b();
                        xf8.G0(kzeVar, Boolean.TRUE);
                        break;
                }
                return Unit.a;
            }
        }, (byte) 19));
    }

    @Override // defpackage.lim, defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        ndcVar.getLifecycle().b(this);
        ((ru9) this.a.get()).d(this.g);
    }
}
