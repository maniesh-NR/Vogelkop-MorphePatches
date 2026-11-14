package defpackage;

import android.util.Pair;
import java.io.IOException;

/* loaded from: classes.dex */
public final class vrd implements prd, bm7 {
    public final xrd a;
    public final /* synthetic */ vq8 b;

    public vrd(vq8 vq8Var, xrd xrdVar) {
        this.b = vq8Var;
        this.a = xrdVar;
    }

    @Override // defpackage.prd
    public final void C(int i, jrd jrdVar, bsc bscVar, tjd tjdVar) {
        Pair pairA = a(i, jrdVar);
        if (pairA != null) {
            ((szk) this.b.j).c(new trd(this, pairA, bscVar, tjdVar, (byte) 0));
        }
    }

    @Override // defpackage.prd
    public final void D(int i, jrd jrdVar, bsc bscVar, tjd tjdVar) {
        Pair pairA = a(i, jrdVar);
        if (pairA != null) {
            ((szk) this.b.j).c(new trd(this, pairA, bscVar, tjdVar, (byte) 1));
        }
    }

    @Override // defpackage.bm7
    public final void L(int i, jrd jrdVar) {
        Pair pairA = a(i, jrdVar);
        if (pairA != null) {
            ((szk) this.b.j).c(new urd(this, pairA, (byte) 0));
        }
    }

    public final Pair a(int i, jrd jrdVar) {
        jrd jrdVarA;
        xrd xrdVar = this.a;
        jrd jrdVar2 = null;
        if (jrdVar != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= xrdVar.c.size()) {
                    jrdVarA = null;
                    break;
                }
                if (((jrd) xrdVar.c.get(i2)).d == jrdVar.d) {
                    Object obj = jrdVar.a;
                    Object obj2 = xrdVar.b;
                    int i3 = e4.g;
                    jrdVarA = jrdVar.a(Pair.create(obj2, obj));
                    break;
                }
                i2++;
            }
            if (jrdVarA == null) {
                return null;
            }
            jrdVar2 = jrdVarA;
        }
        return Pair.create(Integer.valueOf(i + xrdVar.d), jrdVar2);
    }

    @Override // defpackage.bm7
    public final void d(int i, jrd jrdVar, Exception exc) {
        Pair pairA = a(i, jrdVar);
        if (pairA != null) {
            ((szk) this.b.j).c(new jbd(this, pairA, exc, (byte) 6));
        }
    }

    @Override // defpackage.prd
    public final void e(int i, jrd jrdVar, tjd tjdVar) {
        Pair pairA = a(i, jrdVar);
        if (pairA != null) {
            ((szk) this.b.j).c(new srd(this, pairA, tjdVar, (byte) 0));
        }
    }

    @Override // defpackage.bm7
    public final void f(int i, jrd jrdVar, int i2) {
        Pair pairA = a(i, jrdVar);
        if (pairA != null) {
            ((szk) this.b.j).c(new kw4(this, pairA, i2, (byte) 4));
        }
    }

    @Override // defpackage.prd
    public final void i(int i, jrd jrdVar, bsc bscVar, tjd tjdVar, IOException iOException, boolean z) {
        Pair pairA = a(i, jrdVar);
        if (pairA != null) {
            ((szk) this.b.j).c(new nb3(this, pairA, bscVar, tjdVar, iOException, z, (byte) 1));
        }
    }

    @Override // defpackage.bm7
    public final void j(int i, jrd jrdVar, ix5 ix5Var) {
        Pair pairA = a(i, jrdVar);
        if (pairA != null) {
            ((szk) this.b.j).c(new jbd(this, pairA, ix5Var, (byte) 5));
        }
    }

    @Override // defpackage.bm7
    public final void k(int i, jrd jrdVar) {
        Pair pairA = a(i, jrdVar);
        if (pairA != null) {
            ((szk) this.b.j).c(new urd(this, pairA, (byte) 1));
        }
    }

    @Override // defpackage.prd
    public final void t(int i, jrd jrdVar, bsc bscVar, tjd tjdVar, int i2) {
        Pair pairA = a(i, jrdVar);
        if (pairA != null) {
            ((szk) this.b.j).c(new vn(this, pairA, bscVar, tjdVar, i2, (byte) 1));
        }
    }

    @Override // defpackage.prd
    public final void u(int i, jrd jrdVar, tjd tjdVar) {
        Pair pairA = a(i, jrdVar);
        if (pairA != null) {
            ((szk) this.b.j).c(new srd(this, pairA, tjdVar, (byte) 1));
        }
    }
}
