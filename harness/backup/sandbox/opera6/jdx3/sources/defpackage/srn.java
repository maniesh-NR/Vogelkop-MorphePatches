package defpackage;

import androidx.fragment.app.Fragment;
import com.opera.android.BrowserActivity;
import com.opera.android.Lazy;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class srn implements lkf {
    public final BrowserActivity a;
    public final nw3 b;
    public final nw3 c;
    public final kze d;
    public final zv3 e;
    public final sw3 f;
    public final sw3 g;
    public final Lazy h;
    public final sw3 i;
    public final j4c j;
    public final rw3 k;
    public final rw3 l;
    public final sw3 m;
    public final zv3 n;
    public final Lazy o;
    public final zv3 p;
    public final nw3 q;
    public final nw3 r;
    public final zyk s;
    public final zyk t;

    public srn(BrowserActivity browserActivity, nw3 nw3Var, nw3 nw3Var2, kze kzeVar, zv3 zv3Var, sw3 sw3Var, sw3 sw3Var2, Lazy lazy, sw3 sw3Var3, j4c j4cVar, rw3 rw3Var, rw3 rw3Var2, sw3 sw3Var4, zv3 zv3Var2, Lazy lazy2, zv3 zv3Var3, nw3 nw3Var3, nw3 nw3Var4) {
        this.a = browserActivity;
        this.b = nw3Var;
        this.c = nw3Var2;
        this.d = kzeVar;
        this.e = zv3Var;
        this.f = sw3Var;
        this.g = sw3Var2;
        this.h = lazy;
        this.i = sw3Var3;
        this.j = j4cVar;
        this.k = rw3Var;
        this.l = rw3Var2;
        this.m = sw3Var4;
        this.n = zv3Var2;
        this.o = lazy2;
        this.p = zv3Var3;
        this.q = nw3Var3;
        this.r = nw3Var4;
        final byte b = 0;
        this.s = z4c.b(new Function0(this) { // from class: rrn
            public final /* synthetic */ srn b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b2 = b;
                srn srnVar = this.b;
                switch (b2) {
                    case 0:
                        return new e62((j62) srnVar.p.get(), (urn) srnVar.k.get(), new qfl(srnVar, (byte) 25), (d12) srnVar.l.get());
                    default:
                        return new wll(srnVar.a);
                }
            }
        });
        final byte b2 = 1;
        this.t = z4c.b(new Function0(this) { // from class: rrn
            public final /* synthetic */ srn b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b22 = b2;
                srn srnVar = this.b;
                switch (b22) {
                    case 0:
                        return new e62((j62) srnVar.p.get(), (urn) srnVar.k.get(), new qfl(srnVar, (byte) 25), (d12) srnVar.l.get());
                    default:
                        return new wll(srnVar.a);
                }
            }
        });
    }

    public final Fragment b(Class cls) {
        hq3 hq3VarA = null;
        if (!Intrinsics.a(cls, mqn.class)) {
            return null;
        }
        e62 e62Var = (e62) this.s.getValue();
        kze kzeVar = this.d;
        boolean zBooleanValue = ((Boolean) kzeVar.g()).booleanValue();
        hq3 hq3Var = e62Var.e;
        if (hq3Var != null) {
            if (hq3Var.l() || hq3Var.b.e().m() != zBooleanValue) {
                e62Var.e = null;
            }
            hq3VarA = e62Var.e;
        }
        final byte b = 0;
        if (hq3VarA == null) {
            hq3VarA = e62Var.a.a(zBooleanValue, e62Var.c, e62Var.d);
            e62Var.e = hq3VarA;
            hq3VarA.o.a(new d62(e62Var, hq3VarA, b));
        }
        final hq3 hq3Var2 = hq3VarA;
        final byte b2 = 1;
        mqn mqnVar = new mqn((ru9) this.f.get(), (pjn) this.g.get(), this.h, (orm) this.c.get(), hq3Var2, new vsn(kzeVar, r9n.A(this.a), hq3Var2, new Function2(this) { // from class: prn
            public final /* synthetic */ srn b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                byte b3 = b;
                hq3 hq3Var3 = hq3Var2;
                srn srnVar = this.b;
                String str = (String) obj;
                List list = (List) obj2;
                switch (b3) {
                    case 0:
                        new c5o(srnVar.a, (byte) 3).i(list, (o52) hq3Var3.p.c.g(), str);
                        break;
                    default:
                        new c5o(srnVar.a, (byte) 3).E(list, (o52) hq3Var3.p.c.g(), str);
                        break;
                }
                return Unit.a;
            }
        }, new Function2(this) { // from class: prn
            public final /* synthetic */ srn b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                byte b3 = b2;
                hq3 hq3Var3 = hq3Var2;
                srn srnVar = this.b;
                String str = (String) obj;
                List list = (List) obj2;
                switch (b3) {
                    case 0:
                        new c5o(srnVar.a, (byte) 3).i(list, (o52) hq3Var3.p.c.g(), str);
                        break;
                    default:
                        new c5o(srnVar.a, (byte) 3).E(list, (o52) hq3Var3.p.c.g(), str);
                        break;
                }
                return Unit.a;
            }
        }, new qrn(this, b), ((yk6) this.j.get()).k, new y1n((Object) this, (byte) 27), (urn) this.k.get(), this.m), (wll) this.t.getValue(), this.r.b.B(), new d7h(hq3Var2, this, (byte) 13), this.i, this.o, this.q);
        hq3Var2.m.t(mqnVar.getLifecycle());
        return mqnVar;
    }
}
