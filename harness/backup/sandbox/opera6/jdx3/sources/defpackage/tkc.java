package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.opera.android.feed.FeedScrollView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class tkc extends z5k implements zsh, ndc {
    public final lu3 f;
    public final lu3 g;
    public final RecyclerView h;
    public final dqc i;
    public final tsd j;
    public final kze k;
    public final qdc l;
    public final qdc m;
    public final ks6 n;
    public final noc o;
    public final qkc p;
    public final agm q;

    public tkc(ndc ndcVar, lu3 lu3Var, lu3 lu3Var2, RecyclerView recyclerView, ijc ijcVar, FeedScrollView feedScrollView, dqc dqcVar, tsd tsdVar, kze kzeVar, tsd tsdVar2, fwf fwfVar) {
        super(skc.class, ijcVar, e6k.o, 2131558962, (byte) 0);
        this.f = lu3Var;
        this.g = lu3Var2;
        this.h = recyclerView;
        this.i = dqcVar;
        this.j = tsdVar;
        this.k = kzeVar;
        qdc qdcVar = new qdc(this, true);
        this.l = qdcVar;
        this.m = qdcVar;
        ks6 ks6Var = new ks6(this, (byte) 26);
        this.n = ks6Var;
        js6 js6Var = dqcVar.d;
        noc nocVar = new noc(ndcVar, feedScrollView, js6Var);
        this.o = nocVar;
        this.p = new qkc(new rkc((Object) this, (byte) 0), js6Var, nocVar, dqcVar.g, fwfVar, new wub(this));
        this.q = new agm(new gv8(this, tsdVar2, (byte) 21));
        qdcVar.g(qcc.c);
        dqcVar.e.k(ks6Var);
        w7d.i(scd.D(dqcVar.f, qdcVar), cqp.V(qdcVar), new fb9((byte) 9, null, this));
    }

    @Override // defpackage.z5k
    public final agm C() {
        return this.q;
    }

    public final void D(List list, boolean z, boolean z2, boolean z3) {
        boolean z4;
        llc jlcVar;
        qkc qkcVar = this.p;
        qkcVar.k = z;
        qkcVar.l = z2;
        qkcVar.m = z3;
        List list2 = qkcVar.n;
        int i = 0;
        boolean z5 = z2 || z;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            zmc zmcVar = (zmc) obj;
            if (zmcVar == null || !((zmcVar instanceof kmc) || (zmcVar instanceof nmc) || (zmcVar instanceof pmc) || (zmcVar instanceof qmc) || (zmcVar instanceof wmc))) {
                h9o.p();
                return;
            }
            arrayList.add(obj);
        }
        if (!z3 || arrayList.isEmpty()) {
            z4 = false;
        } else {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj2 = arrayList.get(i2);
                i2++;
                if (((zmc) obj2).a().h != null) {
                    z4 = true;
                    break;
                }
            }
            z4 = false;
        }
        ArrayList arrayList2 = new ArrayList(k95.o(arrayList, 10));
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj3 = arrayList.get(i);
            i++;
            zmc zmcVar2 = (zmc) obj3;
            if (zmcVar2 != null) {
                if (zmcVar2 instanceof kmc) {
                    jlcVar = new blc(new clc((kmc) zmcVar2, z4));
                } else if (zmcVar2 instanceof nmc) {
                    jlcVar = new dlc(new elc((nmc) zmcVar2, z4));
                } else if (zmcVar2 instanceof pmc) {
                    jlcVar = new flc(new glc((pmc) zmcVar2, z4));
                } else if (zmcVar2 instanceof qmc) {
                    jlcVar = new hlc(new ilc((qmc) zmcVar2, z4, z5, z));
                } else if (zmcVar2 instanceof wmc) {
                    jlcVar = new jlc(new klc((wmc) zmcVar2, z4, z5, z));
                }
                arrayList2.add(jlcVar);
            }
            h9o.p();
            return;
        }
        qkcVar.n = arrayList2;
        uup.k(new ik(arrayList2, list2), true).b(qkcVar);
    }

    @Override // defpackage.fa2, defpackage.rjm
    public final void b(sjm sjmVar) {
        boolean z = sjmVar.a;
        noc nocVar = this.o;
        if (nocVar.e != z) {
            nocVar.e = z;
            lw7 lw7Var = nocVar.c;
            if (z) {
                tcc tccVar = lw7Var.b;
                if (tccVar != null) {
                    tccVar.a(lw7Var);
                }
                nocVar.b.d();
            } else {
                tcc tccVar2 = lw7Var.b;
                if (tccVar2 != null) {
                    tccVar2.b(lw7Var);
                }
                ((HashSet) nocVar.a.j).clear();
            }
        }
        this.p.g.b(z);
    }

    @Override // defpackage.zsh
    public final void c() {
        js6 js6Var = this.i.d;
        if (((Boolean) ((fs6) js6Var.d).d.g()).booleanValue()) {
            ti9 ti9Var = ((cq6) ((j4c) js6Var.e).get()).d;
            na2.B(ti9Var.a, (CoroutineContext) null, (rx5) null, new rf4((byte) 5, (mt5) null, ti9Var), 3);
        }
    }

    public final tcc getLifecycle() {
        return this.m;
    }

    @Override // defpackage.ba2, defpackage.fa2
    public final void onDestroy() {
        this.l.g(qcc.a);
        this.i.e.p(this.n);
    }

    @Override // defpackage.u5k
    public final ja2 t() {
        return new skc((byte) 0);
    }

    @Override // defpackage.u5k
    public final boolean z() {
        return this.l.i.d(qcc.e) && (this.i.f.a.getValue() instanceof fqc);
    }
}
