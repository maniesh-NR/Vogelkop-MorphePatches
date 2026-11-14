package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class jc4 implements mc4 {
    public final pe4 b;
    public final n79 c;
    public final dg9 d;
    public final cdk e;
    public final kwl f;
    public final t3d g;
    public final edo h;
    public final pdo i;
    public final y94 j;
    public final ysm k;
    public final ctm l;
    public final x4n m;

    public jc4(pe4 pe4Var, n79 n79Var, dg9 dg9Var, cdk cdkVar, kwl kwlVar, t3d t3dVar, edo edoVar, pdo pdoVar, y94 y94Var, ysm ysmVar, ctm ctmVar, x4n x4nVar) {
        this.b = pe4Var;
        this.c = n79Var;
        this.d = dg9Var;
        this.e = cdkVar;
        this.f = kwlVar;
        this.g = t3dVar;
        this.h = edoVar;
        this.i = pdoVar;
        this.j = y94Var;
        this.k = ysmVar;
        this.l = ctmVar;
        this.m = x4nVar;
    }

    @Override // defpackage.mc4
    public final void a(q3j q3jVar) {
        this.i.a(q3jVar);
    }

    @Override // defpackage.mc4
    public final void b() {
        this.i.b();
    }

    @Override // defpackage.mc4
    public final void c() {
        this.m.a.b();
    }

    @Override // defpackage.mc4
    public final ListenableFuture d(float f) {
        float fI;
        edo edoVar = this.h;
        edoVar.getClass();
        if (f > 1.0f || f < 0.0f) {
            return new q0b(new IllegalArgumentException("Requested linearZoom " + f + " is not within valid range [0, 1]"), (byte) 1);
        }
        float f2 = edoVar.b;
        float f3 = edoVar.c;
        float f4 = f - 1.0f;
        if (Math.abs(f4) < Math.ulp(Math.abs(f4)) * 2.0d) {
            fI = f3;
        } else {
            float f5 = f - 0.0f;
            if (Math.abs(f5) < Math.ulp(Math.abs(f5)) * 2.0d) {
                fI = f2;
            } else {
                float f6 = 1.0f / f2;
                fI = nb6.i(1.0f / (f6 - ((f6 - (1.0f / f3)) * f)), f2, f3);
            }
        }
        return edoVar.a(new odo(fI, f2, f3), true, true);
    }

    @Override // defpackage.mc4
    public final void e(tj5 tj5Var) {
        y94 y94Var = this.j;
        tw2 tw2Var = new tw2((byte) 16);
        tj5Var.c(new xj(tw2Var, tj5Var, (byte) 25));
        wrf wrfVarF = wrf.f((fee) tw2Var.b);
        z94 z94Var = y94Var.a;
        synchronized (z94Var.a) {
            for (an2 an2Var : wrfVarF.d()) {
                ((fee) z94Var.c.b).q(an2Var, sj5.a, wrfVarF.i(an2Var));
            }
        }
        cd5 cd5VarA = y94Var.a.a(y94Var.d, true);
        l94 l94Var = new l94();
        l94Var.c = new byh();
        o94 o94Var = new o94(l94Var);
        l94Var.b = o94Var;
        l94Var.a = vep.class;
        try {
            cd5VarA.s(new cv2(l94Var, cd5VarA, (byte) 21));
            l94Var.a = "addCaptureRequestOptions";
        } catch (Exception e) {
            o94Var.a(e);
        }
        k1g.O(o94Var);
    }

    @Override // defpackage.mc4
    public final ListenableFuture f(float f) {
        edo edoVar = this.h;
        float f2 = edoVar.b;
        float f3 = edoVar.c;
        if (f <= f3 && f >= f2) {
            return edoVar.a(new odo(f, f2, f3), true, true);
        }
        StringBuilder sbP = am2.p("Requested zoomRatio ", f, " is not within valid range [", f2, ", ");
        sbP.append(f3);
        sbP.append(']');
        return new q0b(new IllegalArgumentException(sbP.toString()), (byte) 1);
    }

    @Override // defpackage.mc4
    public final void g(int i) {
        boolean z = true;
        this.c.d(i, true);
        if (i != 1 && i != 0) {
            z = false;
        }
        this.i.d(z);
    }

    @Override // defpackage.mc4
    public final void h(cwa cwaVar) {
        this.c.h = cwaVar;
    }

    @Override // defpackage.mc4
    public final ListenableFuture i(bx7 bx7Var) {
        cd5 cd5Var;
        o94 o94VarP;
        List list;
        List list2;
        List list3;
        CoroutineContext coroutineContext;
        boolean z;
        h07 h07VarG;
        dg9 dg9Var = this.d;
        ctm ctmVar = dg9Var.d;
        Integer num = dg9Var.j;
        Integer num2 = dg9Var.i;
        Integer num3 = dg9Var.h;
        cdo cdoVar = dg9Var.e;
        cd5 cd5Var2 = new cd5();
        zrm zrmVar = dg9Var.f;
        if (zrmVar != null) {
            d3k d3kVar = dg9Var.p;
            if (d3kVar != null) {
                d3kVar.k((CancellationException) null);
            }
            d3k d3kVar2 = dg9Var.q;
            if (d3kVar2 != null) {
                d3kVar2.k((CancellationException) null);
            }
            cd5 cd5Var3 = dg9Var.o;
            if (cd5Var3 != null) {
                am2.z("Cancelled by another startFocusAndMetering()", cd5Var3);
            }
            cd5 cd5Var4 = dg9Var.n;
            if (cd5Var4 != null) {
                am2.z("Cancelled by another startFocusAndMetering()", cd5Var4);
            }
            dg9Var.n = cd5Var2;
            List listN = wxe.N((List) bx7Var.c, num2.intValue(), cdoVar.l(), dg9Var.c(), 2, dg9Var.b);
            List listN2 = wxe.N((List) bx7Var.b, num3.intValue(), cdoVar.l(), dg9Var.c(), 1, dg9Var.b);
            List listN3 = wxe.N((List) bx7Var.d, num.intValue(), cdoVar.l(), dg9Var.c(), 4, dg9Var.b);
            if (listN.isEmpty() && listN2.isEmpty() && listN3.isEmpty()) {
                cd5Var2.B0(new IllegalArgumentException("None of the specified AF/AE/AWB MeteringPoints is supported on this camera."));
                o94VarP = p37.p(cd5Var2);
                return k1g.O(o94VarP);
            }
            List listB = listN2;
            if (!listB.isEmpty()) {
                hak hakVar = dg9Var.c;
                synchronized (hakVar.d) {
                    hakVar.l = 1;
                }
                hakVar.f();
            }
            if (num2.intValue() > 0) {
                List listB2 = listN;
                if (listB2.isEmpty()) {
                    listB2 = e82.B(gd4.a);
                }
                list = listB2;
            } else {
                list = null;
            }
            if (num3.intValue() > 0) {
                if (listB.isEmpty()) {
                    listB = e82.B(gd4.a);
                }
                list2 = listB;
            } else {
                list2 = null;
            }
            if (num.intValue() > 0) {
                List listB3 = listN3;
                if (listB3.isEmpty()) {
                    listB3 = e82.B(gd4.a);
                }
                list3 = listB3;
            } else {
                list3 = null;
            }
            if (listN2.isEmpty() || !dg9Var.k) {
                coroutineContext = null;
                z = true;
                h07VarG = zrmVar.g(list, list2, list3);
            } else {
                long j = bx7Var.a;
                if (j <= 0 || j >= 5000) {
                    j = 5000;
                }
                jyc jycVar = num3.intValue() > 0 ? new jyc(1) : null;
                List list4 = y10.b;
                ArrayList arrayList = dg9Var.l;
                int i = 0;
                if (arrayList != null && (arrayList.contains(new y10(1)) || arrayList.contains(new y10(1)))) {
                    i = 1;
                }
                z = true;
                jyc jycVar2 = jycVar;
                coroutineContext = null;
                h07VarG = zrmVar.a(list, list2, list3, jycVar2, new y10(i), TimeUnit.NANOSECONDS.convert(j, TimeUnit.MILLISECONDS));
            }
            boolean zIsEmpty = listN2.isEmpty() ^ z;
            CoroutineContext coroutineContext2 = coroutineContext;
            h07 h07Var = h07VarG;
            cd5Var = cd5Var2;
            h07Var.s(new ha1(cd5Var2, h07Var, dg9Var, zIsEmpty, (byte) 1));
            d3k d3kVar3 = dg9Var.p;
            if (d3kVar3 != null) {
                d3kVar3.k(coroutineContext2);
            }
            dg9Var.p = na2.B(ctmVar.f, coroutineContext2, coroutineContext2, new w94(cd5Var, coroutineContext2, (byte) 2), 3);
            long j2 = bx7Var.a;
            if (j2 > 0) {
                d3k d3kVar4 = dg9Var.q;
                if (d3kVar4 != null) {
                    d3kVar4.k(coroutineContext2);
                }
                dg9Var.q = na2.B(ctmVar.f, coroutineContext2, coroutineContext2, new oa7(j2, dg9Var, zrmVar, cd5Var, null, (byte) 1), 3);
            }
        } else {
            cd5Var = cd5Var2;
            am2.z("Camera is not active.", cd5Var);
        }
        o94VarP = p37.p(cd5Var);
        return k1g.O(o94VarP);
    }

    @Override // defpackage.mc4
    public final ListenableFuture j(boolean z) {
        Integer num;
        fe4 fe4Var = ge4.Oo;
        ge4 ge4Var = this.b.b;
        fe4Var.getClass();
        int[] iArr = (int[]) ((ma4) ge4Var).c(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr != null && e82.t(6, iArr) >= 0 && ((num = (Integer) this.g.f.g()) == null || num.intValue() != -1)) {
            return new q0b(new IllegalStateException("Torch can not be enabled/disable when low-light boost is on!"), (byte) 1);
        }
        return k1g.O(k1g.i0(sr9.a(p37.p(kwl.a(this.f, z, 6))), new qe6(new kp5((byte) 5), (byte) 14), n97.a()));
    }

    @Override // defpackage.mc4
    public final tj5 k() {
        zy9 zy9Var;
        z94 z94Var = this.j.a;
        synchronized (z94Var.a) {
            eb4 eb4VarB = z94Var.c.b();
            tw2 tw2Var = new tw2((byte) 16);
            eb4VarB.c(new xj(tw2Var, eb4VarB, (byte) 25));
            zy9Var = new zy9(wrf.f((fee) tw2Var.b));
        }
        return zy9Var;
    }

    @Override // defpackage.mc4
    public final void l() {
        bf2.b.incrementAndGet(this.m.a);
    }

    @Override // defpackage.mc4
    public final ListenableFuture m(ArrayList arrayList, int i, int i2) {
        cdk cdkVar = this.e;
        cdkVar.getClass();
        cd5 cd5Var = new cd5();
        na2.B(cdkVar.b.f, null, null, new adk(arrayList, i, i2, cd5Var, cdkVar, null), 3);
        return k1g.O(p37.p(cd5Var));
    }

    @Override // defpackage.mc4
    public final void n() {
        y94 y94Var = this.j;
        z94 z94Var = y94Var.a;
        synchronized (z94Var.a) {
            z94Var.c = new u59((byte) 20);
        }
        cd5 cd5VarA = y94Var.a.a(y94Var.d, true);
        l94 l94Var = new l94();
        l94Var.c = new byh();
        o94 o94Var = new o94(l94Var);
        l94Var.b = o94Var;
        l94Var.a = vep.class;
        try {
            cd5VarA.s(new cv2(l94Var, cd5VarA, (byte) 21));
            l94Var.a = "clearCaptureRequestOptions";
        } catch (Exception e) {
            o94Var.a(e);
        }
        k1g.O(o94Var);
    }

    @Override // defpackage.mc4
    public final ListenableFuture o(int i) {
        wrm wrmVarH = this.k.h();
        if (wrmVarH == null) {
            return new q0b(new gc4("Camera is not active."), (byte) 1);
        }
        a64 a64Var = this.l.f;
        l94 l94Var = new l94();
        l94Var.c = new byh();
        o94 o94Var = new o94(l94Var);
        l94Var.b = o94Var;
        l94Var.a = ic4.class;
        try {
            l94Var.a = na2.B(a64Var, null, null, new hc4(l94Var, null, wrmVarH, i, this), 3);
            return o94Var;
        } catch (Exception e) {
            o94Var.a(e);
            return o94Var;
        }
    }
}
