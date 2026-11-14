package defpackage;

import android.util.Pair;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class qim {
    public final dx3 a;
    public final ll9 b;
    public final z77 c;
    public final nej d;
    public final ysj e;
    public final aal f;
    public final oz3 g;
    public final p77 h;
    public final qie i;
    public final isj j;
    public final bpd k;
    public uwf l;
    public z8b m;
    public u7k n;
    public b2l o;
    public boolean p;
    public boolean q;
    public final h7f r;
    public boolean s;
    public boolean t;
    public final ijm[] u;
    public boolean v;
    public boolean w;

    public qim(dx3 dx3Var, dx3 dx3Var2, dx3 dx3Var3, ViewGroup viewGroup, boolean z) {
        p77 p77Var = new p77(dx3Var3);
        boolean z2 = false;
        qie qieVar = new qie((byte) 21, z2);
        isj isjVar = new isj(new jjg(viewGroup, (byte) 13), new frk((byte) 1));
        this.p = true;
        this.r = new h7f();
        this.u = new ijm[]{ijm.a, ijm.b};
        this.a = dx3Var;
        this.b = new ll9(new mcj(this, dx3Var2, z2), this);
        this.h = p77Var;
        this.i = qieVar;
        this.j = isjVar;
        this.c = new z77(this);
        this.d = new nej(this);
        this.e = new ysj(this);
        this.f = new aal(this);
        this.g = new oz3(this);
        this.k = new bpd(this);
        this.t = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qim.a():void");
    }

    public final boolean b() {
        z8b z8bVar = this.m;
        if (z8bVar != null) {
            Pair pair = (Pair) z8bVar.a;
            if (pair == null ? false : ((lz3) pair.second).b(hjm.b)) {
                return true;
            }
        }
        return false;
    }

    public final btj c() {
        isj isjVarB = this.k.B();
        if (isjVarB != null) {
            return isjVarB;
        }
        ArrayList arrayList = this.b.g;
        Fragment fragment = arrayList.isEmpty() ? null : (ryl) am2.k(1, arrayList);
        if (fragment == null) {
            return this.j;
        }
        if (fragment.isVisible()) {
            return fragment;
        }
        return null;
    }

    public final boolean d() {
        if (((Pair) this.h.d) == null && !this.q && ((Pair) this.i.b) == null && this.b.g.isEmpty()) {
            ArrayList arrayList = (ArrayList) this.k.c;
            int i = 0;
            while (i < arrayList.size()) {
                if (((em8) arrayList.get(i)).a.get() == null) {
                    arrayList.remove(i);
                    i--;
                }
                i++;
            }
            if (arrayList.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public final void e(boolean z) {
        if (this.s != z) {
            this.s = z;
            h7f h7fVar = this.r;
            g7f g7fVarH = am2.h(h7fVar, h7fVar);
            while (g7fVarH.hasNext()) {
                ((wim) g7fVarH.next()).c(this.s);
            }
        }
    }

    public final eq6 f(fm8 fm8Var) {
        Pair pair;
        Pair pair2;
        u7k u7kVar = this.n;
        hjm hjmVar = hjm.b;
        if (u7kVar != null) {
            ((z9l) u7kVar.a).finish(hjmVar);
            this.n = null;
        }
        bpd bpdVar = this.k;
        bpdVar.getClass();
        eq6 eq6Var = new eq6();
        Objects.requireNonNull(bpdVar);
        eq6Var.a = bpdVar;
        ((ArrayList) bpdVar.c).add(new em8(eq6Var, fm8Var));
        btj btjVarC = c();
        if (btjVarC != null) {
            btjVarC.I();
        }
        uwf uwfVar = this.l;
        if (uwfVar != null && (pair2 = uwfVar.a) != null && pair2 != null) {
            ((q2f) pair2.second).f(hjmVar);
        }
        z8b z8bVar = this.m;
        if (z8bVar != null && (pair = (Pair) z8bVar.a) != null && pair != null) {
            ((lz3) pair.second).b(hjmVar);
        }
        e(true);
        return eq6Var;
    }

    public final void g(zhj zhjVar) {
        this.b.b(zhjVar);
    }

    public final dej h(cej cejVar, b2l b2lVar) {
        dej dejVarCreate = cejVar.create(this.a, b2lVar);
        qie qieVar = this.i;
        qieVar.getClass();
        qieVar.b = new Pair(cejVar, dejVarCreate);
        mej mejVar = dejVarCreate.b;
        mejVar.U(dejVarCreate.a(mejVar.getContext()));
        return dejVarCreate;
    }

    public final void i(boolean z) {
        this.p = false;
        ll9 ll9Var = this.b;
        int i = ll9Var.h - 1;
        ll9Var.h = i;
        if (i <= 0) {
            il9 il9Var = ll9Var.d;
            if (!z) {
                il9Var.a();
            } else if (!il9Var.a) {
                il9Var.a = true;
                vml.c(il9Var);
            }
        }
        a();
    }
}
