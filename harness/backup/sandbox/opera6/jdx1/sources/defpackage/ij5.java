package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class ij5 extends th5 {
    public static final qjd u;
    public final ArrayList k;
    public final HashSet l;
    public Handler m;
    public final ArrayList n;
    public final IdentityHashMap o;
    public final HashMap p;
    public final HashSet q;
    public boolean r;
    public HashSet s;
    public jij t;

    static {
        ejd ejdVar = new ejd();
        ejdVar.b = Uri.EMPTY;
        u = ejdVar.a();
    }

    public ij5(l73... l73VarArr) {
        hij hijVar = new hij(0);
        for (l73 l73Var : l73VarArr) {
            l73Var.getClass();
        }
        this.t = hijVar.b.length > 0 ? hijVar.cloneAndClear() : hijVar;
        this.o = new IdentityHashMap();
        this.p = new HashMap();
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        this.n = new ArrayList();
        this.s = new HashSet();
        this.l = new HashSet();
        this.q = new HashSet();
        List listAsList = Arrays.asList(l73VarArr);
        synchronized (this) {
            A(arrayList.size(), listAsList);
        }
    }

    public final void A(int i, List list) {
        Handler handler = this.m;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((l73) it.next()).getClass();
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new gj5((l73) it2.next()));
        }
        this.k.addAll(i, arrayList);
        if (handler == null || list.isEmpty()) {
            return;
        }
        handler.obtainMessage(1, new hj5(i, arrayList, null)).sendToTarget();
    }

    public final void B(int i, int i2, int i3) {
        while (true) {
            ArrayList arrayList = this.n;
            if (i >= arrayList.size()) {
                return;
            }
            gj5 gj5Var = (gj5) arrayList.get(i);
            gj5Var.d += i2;
            gj5Var.e += i3;
            i++;
        }
    }

    public final void C() {
        Iterator it = this.q.iterator();
        while (it.hasNext()) {
            gj5 gj5Var = (gj5) it.next();
            if (gj5Var.c.isEmpty()) {
                sh5 sh5Var = (sh5) this.h.get(gj5Var);
                sh5Var.getClass();
                sh5Var.a.d(sh5Var.b);
                it.remove();
            }
        }
    }

    public final synchronized void D(Set set) {
        Iterator it = set.iterator();
        if (it.hasNext()) {
            throw null;
        }
        this.l.removeAll(set);
    }

    public final synchronized lcd E(int i) {
        return ((gj5) this.k.get(i)).a;
    }

    public final synchronized int F() {
        return this.k.size();
    }

    public final void G(int i, int i2) {
        Handler handler = this.m;
        tym.T(this.k, i, i2);
        if (handler != null) {
            handler.obtainMessage(2, new hj5(i, Integer.valueOf(i2), null)).sendToTarget();
        }
    }

    public final void H(fj5 fj5Var) {
        if (this.r) {
            return;
        }
        Handler handler = this.m;
        handler.getClass();
        handler.obtainMessage(5).sendToTarget();
        this.r = true;
    }

    public final void I() {
        this.r = false;
        HashSet hashSet = this.s;
        this.s = new HashSet();
        n(new dj5(this.n, this.t));
        Handler handler = this.m;
        handler.getClass();
        handler.obtainMessage(6, hashSet).sendToTarget();
    }

    @Override // defpackage.l73
    public final nkd c(jrd jrdVar, l45 l45Var, long j) {
        Object obj = jrdVar.a;
        int i = e4.g;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        jrd jrdVarA = jrdVar.a(pair.second);
        gj5 gj5Var = (gj5) this.p.get(obj2);
        if (gj5Var == null) {
            gj5Var = new gj5(new ej5());
            gj5Var.f = true;
            y(gj5Var, gj5Var.a);
        }
        this.q.add(gj5Var);
        sh5 sh5Var = (sh5) this.h.get(gj5Var);
        sh5Var.getClass();
        sh5Var.a.f(sh5Var.b);
        gj5Var.c.add(jrdVarA);
        icd icdVarC = gj5Var.a.c(jrdVarA, l45Var, j);
        this.o.put(icdVarC, gj5Var);
        C();
        return icdVarC;
    }

    @Override // defpackage.th5, defpackage.l73
    public final void e() {
        super.e();
        this.q.clear();
    }

    @Override // defpackage.th5, defpackage.l73
    public final void g() {
    }

    @Override // defpackage.l73
    public final synchronized gql h() {
        jij jijVarCloneAndInsert;
        int length = this.t.getLength();
        int size = this.k.size();
        jijVarCloneAndInsert = this.t;
        if (length != size) {
            jijVarCloneAndInsert = jijVarCloneAndInsert.cloneAndClear().cloneAndInsert(0, this.k.size());
        }
        return new dj5(this.k, jijVarCloneAndInsert);
    }

    @Override // defpackage.l73
    public final synchronized void m(pl6 pl6Var) {
        this.j = pl6Var;
        this.i = tym.p(null);
        this.m = new Handler(new cj5(this, (byte) 0));
        if (this.k.isEmpty()) {
            I();
        } else {
            this.t = this.t.cloneAndInsert(0, this.k.size());
            z(0, this.k);
            H(null);
        }
    }

    @Override // defpackage.l73
    public final void o(nkd nkdVar) {
        IdentityHashMap identityHashMap = this.o;
        gj5 gj5Var = (gj5) identityHashMap.remove(nkdVar);
        gj5Var.getClass();
        gj5Var.a.o(nkdVar);
        ArrayList arrayList = gj5Var.c;
        arrayList.remove(((icd) nkdVar).a);
        if (!identityHashMap.isEmpty()) {
            C();
        }
        if (gj5Var.f && arrayList.isEmpty()) {
            this.q.remove(gj5Var);
            sh5 sh5Var = (sh5) this.h.remove(gj5Var);
            sh5Var.getClass();
            l73 l73Var = sh5Var.a;
            l73Var.p(sh5Var.b);
            rh5 rh5Var = sh5Var.c;
            l73Var.s(rh5Var);
            l73Var.r(rh5Var);
        }
    }

    @Override // defpackage.th5, defpackage.l73
    public final synchronized void q() {
        super.q();
        this.n.clear();
        this.q.clear();
        this.p.clear();
        this.t = this.t.cloneAndClear();
        Handler handler = this.m;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.m = null;
        }
        this.r = false;
        this.s.clear();
        D(this.l);
    }

    @Override // defpackage.th5
    public final int w(Object obj, int i) {
        return i + ((gj5) obj).e;
    }

    @Override // defpackage.th5
    public final void x(Object obj, l73 l73Var, gql gqlVar) {
        gj5 gj5Var = (gj5) obj;
        int i = gj5Var.d + 1;
        ArrayList arrayList = this.n;
        if (i < arrayList.size()) {
            int iO = gqlVar.o() - (((gj5) arrayList.get(gj5Var.d + 1)).e - gj5Var.e);
            if (iO != 0) {
                B(gj5Var.d + 1, 0, iO);
            }
        }
        H(null);
    }

    public final void z(int i, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            gj5 gj5Var = (gj5) it.next();
            int i2 = i + 1;
            ArrayList arrayList = this.n;
            if (i > 0) {
                gj5 gj5Var2 = (gj5) arrayList.get(i - 1);
                int iO = gj5Var2.a.o.e.o() + gj5Var2.e;
                gj5Var.d = i;
                gj5Var.e = iO;
                gj5Var.f = false;
                gj5Var.c.clear();
            } else {
                gj5Var.d = i;
                gj5Var.e = 0;
                gj5Var.f = false;
                gj5Var.c.clear();
            }
            B(i, 1, gj5Var.a.o.e.o());
            arrayList.add(i, gj5Var);
            this.p.put(gj5Var.b, gj5Var);
            y(gj5Var, gj5Var.a);
            if (this.b.isEmpty() || !this.o.isEmpty()) {
                sh5 sh5Var = (sh5) this.h.get(gj5Var);
                sh5Var.getClass();
                sh5Var.a.d(sh5Var.b);
            } else {
                this.q.add(gj5Var);
            }
            i = i2;
        }
    }
}
