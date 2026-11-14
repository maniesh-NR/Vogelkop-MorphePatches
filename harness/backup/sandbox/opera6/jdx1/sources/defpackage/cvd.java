package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class cvd extends th5 {
    public static final qjd s;
    public final l73[] k;
    public final ArrayList l;
    public final gql[] m;
    public final ArrayList n;
    public final ir5 o;
    public int p;
    public long[][] q;
    public g65 r;

    static {
        ejd ejdVar = new ejd();
        ejdVar.a = "MergingMediaSource";
        s = ejdVar.a();
    }

    public cvd(l73... l73VarArr) {
        ir5 ir5Var = new ir5();
        this.k = l73VarArr;
        this.o = ir5Var;
        this.n = new ArrayList(Arrays.asList(l73VarArr));
        this.p = -1;
        this.l = new ArrayList(l73VarArr.length);
        for (int i = 0; i < l73VarArr.length; i++) {
            this.l.add(new ArrayList());
        }
        this.m = new gql[l73VarArr.length];
        this.q = new long[0][];
        scd.q(8, "expectedKeys");
        scd.q(2, "expectedValuesPerKey");
        nc5 nc5Var = new nc5();
        nc5Var.j(8);
        mce mceVar = new mce();
        scd.q(2, "expectedValuesPerKey");
        new nce(nc5Var).g = mceVar;
    }

    @Override // defpackage.l73
    public final boolean a(qjd qjdVar) {
        l73[] l73VarArr = this.k;
        return l73VarArr.length > 0 && l73VarArr[0].a(qjdVar);
    }

    @Override // defpackage.l73
    public final nkd c(jrd jrdVar, l45 l45Var, long j) {
        l73[] l73VarArr = this.k;
        int length = l73VarArr.length;
        nkd[] nkdVarArr = new nkd[length];
        gql[] gqlVarArr = this.m;
        int iB = gqlVarArr[0].b(jrdVar.a);
        for (int i = 0; i < length; i++) {
            jrd jrdVarA = jrdVar.a(gqlVarArr[i].l(iB));
            nkdVarArr[i] = l73VarArr[i].c(jrdVarA, l45Var, j - this.q[iB][i]);
            ((List) this.l.get(i)).add(new bvd(jrdVarA, nkdVarArr[i]));
        }
        return new avd(this.o, this.q[iB], nkdVarArr);
    }

    @Override // defpackage.l73
    public final qjd i() {
        l73[] l73VarArr = this.k;
        return l73VarArr.length > 0 ? l73VarArr[0].i() : s;
    }

    @Override // defpackage.th5, defpackage.l73
    public final void k() throws g65 {
        g65 g65Var = this.r;
        if (g65Var != null) {
            throw g65Var;
        }
        super.k();
    }

    @Override // defpackage.l73
    public final void m(pl6 pl6Var) {
        this.j = pl6Var;
        this.i = tym.p(null);
        int i = 0;
        while (true) {
            l73[] l73VarArr = this.k;
            if (i >= l73VarArr.length) {
                return;
            }
            y(Integer.valueOf(i), l73VarArr[i]);
            i++;
        }
    }

    @Override // defpackage.l73
    public final void o(nkd nkdVar) {
        avd avdVar = (avd) nkdVar;
        int i = 0;
        while (true) {
            l73[] l73VarArr = this.k;
            if (i >= l73VarArr.length) {
                return;
            }
            List list = (List) this.l.get(i);
            boolean[] zArr = avdVar.b;
            nkd[] nkdVarArr = avdVar.a;
            nkd nkdVar2 = zArr[i] ? ((ppl) nkdVarArr[i]).a : nkdVarArr[i];
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                }
                if (((bvd) list.get(i2)).b.equals(nkdVar2)) {
                    list.remove(i2);
                    break;
                }
                i2++;
            }
            l73VarArr[i].o(avdVar.b[i] ? ((ppl) nkdVarArr[i]).a : nkdVarArr[i]);
            i++;
        }
    }

    @Override // defpackage.th5, defpackage.l73
    public final void q() {
        super.q();
        Arrays.fill(this.m, (Object) null);
        this.p = -1;
        this.r = null;
        ArrayList arrayList = this.n;
        arrayList.clear();
        Collections.addAll(arrayList, this.k);
    }

    @Override // defpackage.l73
    public final void t(qjd qjdVar) {
        this.k[0].t(qjdVar);
    }

    @Override // defpackage.th5
    public final jrd u(Object obj, jrd jrdVar) {
        int iIntValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.l;
        List list = (List) arrayList.get(iIntValue);
        for (int i = 0; i < list.size(); i++) {
            if (((bvd) list.get(i)).a.equals(jrdVar)) {
                return ((bvd) ((List) arrayList.get(0)).get(i)).a;
            }
        }
        return null;
    }

    @Override // defpackage.th5
    public final void x(Object obj, l73 l73Var, gql gqlVar) {
        int iH;
        Integer num = (Integer) obj;
        if (this.r == null) {
            if (this.p == -1) {
                iH = gqlVar.h();
                this.p = iH;
            } else {
                int iH2 = gqlVar.h();
                int i = this.p;
                if (iH2 != i) {
                    this.r = new g65();
                    return;
                }
                iH = i;
            }
            int length = this.q.length;
            gql[] gqlVarArr = this.m;
            if (length == 0) {
                this.q = (long[][]) Array.newInstance((Class<?>) Long.TYPE, iH, gqlVarArr.length);
            }
            ArrayList arrayList = this.n;
            arrayList.remove(l73Var);
            gqlVarArr[num.intValue()] = gqlVar;
            if (arrayList.isEmpty()) {
                n(gqlVarArr[0]);
            }
        }
    }
}
