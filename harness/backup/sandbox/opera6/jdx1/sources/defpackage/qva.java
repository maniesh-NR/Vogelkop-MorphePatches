package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class qva extends qrm {
    public static final ova B = new ova();
    public r3j A;
    public final Object s;
    public rva t;
    public Executor u;
    public j3e v;
    public Rect w;
    public Matrix x;
    public q3j y;
    public s0b z;

    public qva(tva tvaVar) {
        super(tvaVar);
        this.s = new Object();
    }

    @Override // defpackage.qrm
    public final to2 A(to2 to2Var, to2 to2Var2) {
        Objects.toString(to2Var);
        Objects.toString(to2Var2);
        tva tvaVar = (tva) this.h;
        g();
        q3j q3jVarI = I(tvaVar, to2Var);
        this.y = q3jVarI;
        Object[] objArr = {q3jVarI.b()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        G(Collections.unmodifiableList(arrayList));
        return to2Var;
    }

    @Override // defpackage.qrm
    public final void B() {
        xug.i();
        r3j r3jVar = this.A;
        if (r3jVar != null) {
            r3jVar.b();
            this.A = null;
        }
        s0b s0bVar = this.z;
        if (s0bVar != null) {
            s0bVar.a();
            this.z = null;
        }
        synchronized (this.s) {
            rva rvaVar = this.t;
            rvaVar.u = false;
            rvaVar.c();
            this.t = null;
        }
    }

    @Override // defpackage.qrm
    public final void C(Matrix matrix) {
        super.C(matrix);
        synchronized (this.s) {
            rva rvaVar = this.t;
            if (rvaVar != null) {
                rvaVar.i(matrix);
            }
            this.x = matrix;
        }
    }

    @Override // defpackage.qrm
    public final void E(Rect rect) {
        this.k = rect;
        synchronized (this.s) {
            rva rvaVar = this.t;
            if (rvaVar != null) {
                rvaVar.j(rect);
            }
            this.w = rect;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.q3j I(defpackage.tva r18, defpackage.to2 r19) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qva.I(tva, to2):q3j");
    }

    public final int J() {
        return ((Integer) ((tva) this.h).b(tva.c, 6)).intValue();
    }

    public final int K() {
        return ((Integer) ((tva) this.h).b(tva.e, 1)).intValue();
    }

    public final void L() {
        rva svaVar;
        j3e j3eVar;
        synchronized (this.s) {
            tva tvaVar = (tva) this.h;
            if (((Integer) tvaVar.b(tva.b, 0)).intValue() == 1) {
                svaVar = new sva();
                this.t = svaVar;
            } else {
                wva wvaVar = new wva((Executor) tvaVar.b(cml.Ep, eba.a()));
                this.t = wvaVar;
                svaVar = wvaVar;
            }
            svaVar.d = K();
            this.t.e = ((Boolean) ((tva) this.h).b(tva.g, Boolean.FALSE)).booleanValue();
            zd4 zd4VarE = e();
            Boolean bool = (Boolean) ((tva) this.h).b(tva.f, null);
            boolean zA = zd4VarE != null ? zd4VarE.g().s().a(OnePixelShiftQuirk.class) : false;
            rva rvaVar = this.t;
            if (bool != null) {
                zA = bool.booleanValue();
            }
            rvaVar.f = zA;
            if (zd4VarE != null) {
                this.t.b = j(zd4VarE, false);
            }
            Rect rect = this.w;
            if (rect != null) {
                this.t.j(rect);
            }
            Matrix matrix = this.x;
            if (matrix != null) {
                this.t.i(matrix);
            }
            Executor executor = this.u;
            if (executor != null && (j3eVar = this.v) != null) {
                this.t.h(executor, j3eVar);
            }
        }
    }

    public final void M(Executor executor, j3e j3eVar) {
        synchronized (this.s) {
            rva rvaVar = this.t;
            if (rvaVar != null) {
                rvaVar.h(executor, new bm8(j3eVar, (byte) 18));
            }
            if (this.v == null) {
                this.d = 1;
                s();
            }
            this.u = executor;
            this.v = j3eVar;
        }
    }

    public final void N() {
        synchronized (this.s) {
            zd4 zd4VarE = e();
            if (zd4VarE != null) {
                this.t.b = j(zd4VarE, false);
            }
        }
    }

    @Override // defpackage.qrm
    public final qsm h(boolean z, tsm tsmVar) {
        B.getClass();
        tva tvaVar = ova.a;
        tj5 tj5VarA = tsmVar.a(tvaVar.C(), 1);
        if (z) {
            tj5VarA = tj5.A(tj5VarA, tvaVar);
        }
        if (tj5VarA == null) {
            return null;
        }
        return new tva(wrf.f(((nva) n(tj5VarA)).b));
    }

    public final String toString() {
        return "ImageAnalysis:".concat(i());
    }

    @Override // defpackage.qrm
    public final qsm v(xd4 xd4Var, psm psmVar) {
        Size sizeC;
        p8f p8fVarK;
        synchronized (this.s) {
            j3e j3eVar = this.v;
            sizeC = j3eVar != null ? j3eVar.c() : null;
        }
        if (sizeC == null) {
            return psmVar.v();
        }
        if (xd4Var.C(((Integer) psmVar.i().b(hya.lp, 0)).intValue()) % 180 == 90) {
            sizeC = new Size(sizeC.getHeight(), sizeC.getWidth());
        }
        qsm qsmVarV = psmVar.v();
        an2 an2Var = hya.pp;
        if (!qsmVarV.g(an2Var)) {
            psmVar.i().s(an2Var, sizeC);
        }
        qsm qsmVarV2 = psmVar.v();
        an2 an2Var2 = hya.up;
        if (qsmVarV2.g(an2Var2)) {
            zxh zxhVar = (zxh) this.f.b(an2Var2, null);
            if (zxhVar == null) {
                p8fVarK = new p8f((byte) 10, false);
                p8fVarK.b = sa2.c;
                p8fVarK.c = null;
                p8fVarK.d = null;
            } else {
                p8fVarK = p8f.k(zxhVar);
            }
            if (zxhVar == null || zxhVar.b == null) {
                p8fVarK.c = new ayh(sizeC);
            }
            if (zxhVar == null) {
                p8fVarK.d = new bm8(sizeC, (byte) 19);
            }
            psmVar.i().s(an2Var2, new zxh((sa2) p8fVarK.b, (ayh) p8fVarK.c, (bm8) p8fVarK.d));
        }
        return psmVar.v();
    }

    @Override // defpackage.qrm
    public final void w(int i) {
        if (D(i)) {
            N();
        }
    }

    @Override // defpackage.qrm
    public final to2 z(eb4 eb4Var) {
        this.y.b.f(eb4Var);
        Object[] objArr = {this.y.b()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        G(Collections.unmodifiableList(arrayList));
        ne5 ne5VarB = this.i.b();
        ne5VarB.f = eb4Var;
        return ne5VarB.p();
    }
}
