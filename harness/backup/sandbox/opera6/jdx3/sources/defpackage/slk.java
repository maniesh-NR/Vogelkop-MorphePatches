package defpackage;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class slk {
    public final m59 a;
    public final tmk b;
    public final py9 c;
    public final ode d;
    public final zkk e;
    public final nv1 f;
    public final nx5 g;
    public final ode h;
    public final kze i;
    public final i7f j;
    public d3k k;
    public boolean l;

    public slk(m59 m59Var, tmk tmkVar, py9 py9Var, xbf xbfVar, ode odeVar, zkk zkkVar, nv1 nv1Var, nx5 nx5Var) {
        this.a = m59Var;
        this.b = tmkVar;
        this.c = py9Var;
        this.d = odeVar;
        this.e = zkkVar;
        this.f = nv1Var;
        this.g = nx5Var;
        ode odeVar2 = (ode) xbfVar.d;
        this.h = odeVar2;
        this.i = new kze(wvg.k);
        this.j = new i7f();
        final byte b = 0;
        ((HashSet) m59Var.d).add(new qlk(this, b));
        m59Var.i();
        odeVar2.k(new t7d(new n6k((Object) this, (byte) 11), (byte) 21));
        odeVar.k(new t7d(new ldh(1, this, slk.class, "onPushRegistrationStateChanged", "onPushRegistrationStateChanged(Z)V", 0, (byte) 29), (byte) 21));
        xf8.h0(tmkVar.g, new f7f(this) { // from class: rlk
            public final /* synthetic */ slk b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b2 = b;
                slk slkVar = this.b;
                switch (b2) {
                    case 0:
                        slkVar.c();
                        break;
                    default:
                        slkVar.c();
                        break;
                }
            }
        });
        final byte b2 = 1;
        xf8.h0(py9Var.f, new f7f(this) { // from class: rlk
            public final /* synthetic */ slk b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b22 = b2;
                slk slkVar = this.b;
                switch (b22) {
                    case 0:
                        slkVar.c();
                        break;
                    default:
                        slkVar.c();
                        break;
                }
            }
        });
        c();
    }

    public final Object a(h0d h0dVar, p71 p71Var) {
        if (h0dVar == h0d.c && ((Boolean) this.f.get()).booleanValue()) {
            wvg wvgVar = (wvg) this.b.g.g();
            return (wvgVar.a() || wvgVar.e == 5) ? Boolean.FALSE : this.c.c(p71Var);
        }
        return Boolean.FALSE;
    }

    public final void b(Runnable runnable) {
        if (runnable != null) {
            this.j.b(runnable);
        }
        if (this.k != null) {
            return;
        }
        d3k d3kVarB = na2.B(this.g, (CoroutineContext) null, rx5.b, new p71((byte) 24, (mt5) null, (Object) this), 1);
        this.k = d3kVarB;
        d3kVarB.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object[], wvg[]] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object] */
    public final void c() {
        wvg wvgVar;
        Object next;
        List listAsList = Arrays.asList(new wvg[]{this.b.g.g(), this.c.f.g()});
        Iterator it = listAsList.iterator();
        while (true) {
            wvgVar = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int i = ((wvg) next).e;
            if (i == 0 || i == 2) {
                break;
            }
        }
        wvg wvgVar2 = (wvg) next;
        if (wvgVar2 == null) {
            for (?? r2 : listAsList) {
                wvg wvgVar3 = (wvg) r2;
                if (wvgVar3.a() || wvgVar3.e == 5) {
                    wvgVar = r2;
                    break;
                }
            }
            wvgVar2 = wvgVar;
            if (wvgVar2 == null) {
                Iterator it2 = listAsList.iterator();
                if (!it2.hasNext()) {
                    t3p.y();
                    return;
                }
                wvg next2 = it2.next();
                if (it2.hasNext()) {
                    long j = ((wvg) next2).c;
                    do {
                        Object next3 = it2.next();
                        long j2 = ((wvg) next3).c;
                        next2 = next2;
                        if (j < j2) {
                            next2 = next3;
                            j = j2;
                        }
                    } while (it2.hasNext());
                }
                wvgVar2 = next2;
            }
        }
        xf8.G0(this.i, wvgVar2);
    }
}
