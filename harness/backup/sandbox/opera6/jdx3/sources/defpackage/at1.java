package defpackage;

import android.content.Context;
import com.opera.android.settings.SettingsManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class at1 extends j93 {
    public final lw3 d;
    public final gjm e;
    public final z77 f;
    public final yl6 g;
    public final ru9 h;
    public final umi i;
    public final it1 j;
    public final orm k;
    public final ekc l;
    public final r2i m;
    public final e4i n;
    public final jze o;
    public final qie p;
    public boolean q;
    public boolean r;
    public d7j s;
    public vb0 t;

    public at1(SettingsManager settingsManager, g8j g8jVar, lw3 lw3Var, gjm gjmVar, z77 z77Var, yl6 yl6Var, ru9 ru9Var, umi umiVar, it1 it1Var, orm ormVar, ekc ekcVar, r2i r2iVar, e4i e4iVar) {
        super(settingsManager, g8jVar);
        this.d = lw3Var;
        this.e = gjmVar;
        this.f = z77Var;
        this.g = yl6Var;
        this.h = ru9Var;
        this.i = umiVar;
        this.j = it1Var;
        this.k = ormVar;
        this.l = ekcVar;
        this.m = r2iVar;
        this.n = e4iVar;
        jze jzeVar = new jze(us1.e);
        this.o = jzeVar;
        this.p = new qie((byte) 19);
        this.q = lw3Var.b.k().b();
        final byte b = 1;
        na2.B(p7n.a(this), (CoroutineContext) null, (rx5) null, new yf((byte) 1, (mt5) null, this), 3);
        final byte b2 = 0;
        jzeVar.s(r2iVar.h, new ug(new Function1(this) { // from class: vs1
            public final /* synthetic */ at1 b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b3 = b2;
                at1 at1Var = this.b;
                switch (b3) {
                    case 0:
                        at1Var.i((List) obj);
                        break;
                    default:
                        at1Var.i((List) at1Var.m.h.g());
                        break;
                }
                return Unit.a;
            }
        }, (byte) 2));
        jzeVar.s(ekcVar, new ug(new Function1(this) { // from class: vs1
            public final /* synthetic */ at1 b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b3 = b;
                at1 at1Var = this.b;
                switch (b3) {
                    case 0:
                        at1Var.i((List) obj);
                        break;
                    default:
                        at1Var.i((List) at1Var.m.h.g());
                        break;
                }
                return Unit.a;
            }
        }, (byte) 2));
    }

    public final void e() {
        vb0 vb0Var = this.t;
        if (vb0Var != null) {
            this.t = null;
            this.g.i(this.k, vb0Var, ac0.f, false, null);
        }
    }

    public final void g(Context context, ndc ndcVar, qs1 qs1Var) {
        byte b = 0;
        os1 os1Var = new os1(new ys1(this, b), new i51(this, context, ndcVar, qs1Var, (byte) 2), new ys1(this, (byte) 1), b);
        z77 z77Var = this.f;
        z77Var.getClass();
        z77Var.b(os1Var, ijm.b);
    }

    public final void h(Context context, qs1 qs1Var) {
        d7j d7jVarD = d7j.d(qs1Var.a);
        this.p.n(this.i.e(new xj(this, context.getApplicationContext(), (byte) 9)).c(new t40((byte) 14)), d7jVarD);
    }

    public final void i(List list) {
        r2i r2iVar;
        ArrayList arrayList = new ArrayList();
        ekc ekcVar = this.l;
        if (ekcVar.g() == m18.b) {
            h58 h58Var = zs1.a;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = h58Var.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (!((d7j) next).f) {
                    arrayList2.add(next);
                }
            }
            ArrayList arrayList3 = new ArrayList(k95.o(arrayList2, 10));
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                d7j d7jVar = (d7j) obj;
                arrayList3.add(new qs1(d7jVar.e, d7jVar.c, d7jVar.d, false, 0L));
            }
            arrayList.addAll(arrayList3);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                k15 k15Var = (k15) it2.next();
                String str = k15Var.a;
                arrayList.add(new qs1(Integer.parseInt(str), d7j.d(Integer.parseInt(str)).c, Intrinsics.a(str, "6") && ekcVar.g() == m18.c && !this.q, k15Var.c == l15.b, k15Var.b));
            }
        } else {
            h58 h58Var2 = zs1.a;
            ArrayList arrayList4 = new ArrayList();
            Iterator it3 = h58Var2.iterator();
            while (it3.hasNext()) {
                Object next2 = it3.next();
                d7j d7jVar2 = (d7j) next2;
                if (d7jVar2.d || !d7jVar2.f) {
                    arrayList4.add(next2);
                }
            }
            ArrayList arrayList5 = new ArrayList(k95.o(arrayList4, 10));
            int size2 = arrayList4.size();
            int i2 = 0;
            while (true) {
                r2iVar = this.m;
                if (i2 >= size2) {
                    break;
                }
                Object obj2 = arrayList4.get(i2);
                i2++;
                d7j d7jVar3 = (d7j) obj2;
                arrayList5.add(new qs1(d7jVar3.e, d7jVar3.c, d7jVar3.d && !w1h.m(r2iVar.c.a, "rewards.claimed_app_icons").contains(String.valueOf((int) d7jVar3.e)), false, 0L));
            }
            arrayList.addAll(arrayList5);
            HashSet hashSetM = w1h.m(r2iVar.c.a, "rewards.claimed_app_icons");
            ArrayList arrayList6 = new ArrayList();
            Iterator it4 = hashSetM.iterator();
            while (it4.hasNext()) {
                Object next3 = it4.next();
                if (!Intrinsics.a((String) next3, "6")) {
                    arrayList6.add(next3);
                }
            }
            int size3 = arrayList6.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj3 = arrayList6.get(i3);
                i3++;
                String str2 = (String) obj3;
                arrayList.add(new qs1(Integer.parseInt(str2), d7j.d(Integer.parseInt(str2)).c, false, false, 0L));
            }
        }
        jze jzeVar = this.o;
        jzeVar.r(us1.a((us1) jzeVar.g(), arrayList, null, false, false, 14));
    }

    public final void k(d7j d7jVar, boolean z, boolean z2) {
        Object next;
        jze jzeVar = this.o;
        us1 us1Var = (us1) jzeVar.g();
        us1 us1Var2 = (us1) jzeVar.g();
        byte b = d7jVar.e;
        Iterator it = us1Var2.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (b == ((qs1) next).a) {
                    break;
                }
            }
        }
        jzeVar.r(us1.a(us1Var, null, (qs1) next, z, z2, 1));
    }
}
