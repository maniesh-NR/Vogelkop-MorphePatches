package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Range;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class ycc {
    public static final qc4 H = new qc4();
    public final qie A;
    public final qie B;
    public final HashSet C;
    public final Context D;
    public final HashMap E;
    public final long F;
    public ndc G;
    public final jf4 a;
    public byte b;
    public swg c;
    public ewa d;
    public Executor e;
    public j3e f;
    public qva g;
    public y2n h;
    public final wfh i;
    public final ip7 j;
    public final ip7 k;
    public final Range l;
    public xcc m;
    public g1h n;
    public k8n o;
    public yhe p;
    public final ghf q;
    public final pc4 r;
    public int s;
    public final boolean t;
    public final boolean u;
    public rn9 v;
    public final hx5 w;
    public final hx5 x;
    public final ode y;
    public final qie z;

    /* JADX WARN: Type inference failed for: r12v2, types: [pc4] */
    public ycc(Context context) {
        cdc cdcVar;
        ListenableFuture listenableFutureO;
        f1h f1hVar = f1h.b;
        context.getClass();
        p12 p12Var = f1h.b.a;
        synchronized (p12Var.b) {
            Object obj = gt5.a;
            int iP = Build.VERSION.SDK_INT >= 34 ? g8.p(context) : 0;
            LinkedHashMap linkedHashMap = adc.a;
            synchronized (linkedHashMap) {
                Integer numValueOf = Integer.valueOf(iP);
                Object cdcVar2 = linkedHashMap.get(numValueOf);
                if (cdcVar2 == null) {
                    cdcVar2 = new cdc();
                    linkedHashMap.put(numValueOf, cdcVar2);
                }
                cdcVar = (cdc) cdcVar2;
            }
            p12Var.f = cdcVar;
            listenableFutureO = (sr9) p12Var.c;
            if (listenableFutureO == null) {
                wg4 wg4Var = new wg4(context, null);
                fr4 fr4VarI0 = k1g.i0(k1g.i0(sr9.a((ListenableFuture) p12Var.d), new yzb(new nna(wg4Var, (byte) 24), (byte) 3), n97.a()), new qe6(new yzb(new yo7(p12Var, wg4Var, context, (byte) 10), (byte) 4), (byte) 14), n97.a());
                p12Var.c = fr4VarI0;
                fr4VarI0.addListener(new wr9(fr4VarI0, new qe6(p12Var, (byte) 24), (byte) 0), n97.a());
                listenableFutureO = k1g.O(fr4VarI0);
            }
        }
        fr4 fr4VarI02 = k1g.i0(k1g.i0(listenableFutureO, new qe6(new odf(new m3g((byte) 23), (byte) 28), (byte) 14), n97.a()), new qe6(new t14((byte) 8), (byte) 14), n97.a());
        this.a = jf4.c;
        this.b = (byte) 3;
        this.i = moh.E;
        ip7 ip7Var = ip7.c;
        this.j = ip7Var;
        this.k = ip7Var;
        this.l = to2.h;
        this.s = -1;
        this.t = true;
        this.u = true;
        this.w = new hx5((byte) 1);
        this.x = new hx5((byte) 1);
        ode odeVar = new ode(new ybl(0));
        this.y = odeVar;
        t14 t14Var = new t14((byte) 9);
        kbd kbdVar = new kbd(t14Var.apply(odeVar.g()), t14Var);
        ode odeVar2 = (ode) kbdVar.q;
        kbdVar.q = odeVar;
        xug.q(new jbd(odeVar2, kbdVar, odeVar));
        this.z = new qie((byte) 7, false);
        this.A = new qie((byte) 7, false);
        this.B = new qie((byte) 7, false);
        this.C = new HashSet();
        this.E = new HashMap();
        this.F = 5000000000L;
        Context contextA = gt5.a(context);
        this.D = contextA;
        nva nvaVar = new nva((byte) 2);
        c(nvaVar);
        fee feeVar = nvaVar.b;
        feeVar.s(txa.ip, ip7Var);
        twg twgVar = new twg(wrf.f(feeVar));
        hya.t(twgVar);
        swg swgVar = new swg(twgVar);
        swgVar.t = swg.A;
        this.c = swgVar;
        this.d = e(null);
        this.g = d(null, null, null);
        this.h = g();
        k1g.i0(fr4VarI02, new qe6(new jr9() { // from class: pc4
            @Override // defpackage.jr9
            /* renamed from: apply */
            public final Object mo17apply(Object obj2) {
                ycc yccVar = this.a;
                yccVar.n = (g1h) obj2;
                yccVar.p();
                yccVar.o(null);
                return null;
            }
        }, (byte) 14), x7d.l());
        this.q = new ghf(contextA);
        this.r = new jr9() { // from class: pc4
            @Override // defpackage.jr9
            /* renamed from: apply */
            public final Object mo17apply(Object obj2) {
                ycc yccVar = this.a;
                yccVar.n = (g1h) obj2;
                yccVar.p();
                yccVar.o(null);
                return null;
            }
        };
    }

    public final void a(yhe yheVar, k8n k8nVar) {
        xug.i();
        boolean z = true;
        if (this.p != yheVar) {
            this.p = yheVar;
            swg swgVar = this.c;
            swgVar.getClass();
            ScheduledExecutorService scheduledExecutorService = swg.A;
            xug.i();
            if (yheVar == null) {
                swgVar.s = null;
                swgVar.d = 2;
                swgVar.s();
            } else {
                swgVar.s = yheVar;
                swgVar.t = scheduledExecutorService;
                if (swgVar.d() != null) {
                    swgVar.J((twg) swgVar.h, swgVar.i);
                    swgVar.r();
                }
                swgVar.d = 1;
                swgVar.s();
            }
        }
        if (this.o != null) {
            int i = i(k8nVar);
            sa2 sa2Var = i != -1 ? new sa2((byte) 0, i, false) : null;
            int i2 = i(this.o);
            if (sa2Var == (i2 != -1 ? new sa2((byte) 0, i2, false) : null)) {
                z = false;
            }
        }
        this.o = k8nVar;
        ghf ghfVar = this.q;
        ScheduledExecutorService scheduledExecutorServiceL = x7d.l();
        pc4 pc4Var = this.r;
        synchronized (ghfVar.b) {
            if (((b8i) ghfVar.c).canDetectOrientation()) {
                ((HashMap) ghfVar.d).put(pc4Var, new d8i(pc4Var, scheduledExecutorServiceL));
                ((b8i) ghfVar.c).enable();
            }
        }
        if (z) {
            p();
        }
        o(null);
    }

    public final void b() {
        xug.i();
        g1h g1hVar = this.n;
        if (g1hVar != null) {
            g1hVar.b(new qrm[]{this.c, this.d, this.g, this.h});
        }
        swg swgVar = this.c;
        swgVar.getClass();
        qwg qwgVar = swg.z;
        xug.i();
        swgVar.s = null;
        swgVar.d = 2;
        swgVar.s();
        this.m = null;
        this.p = null;
        this.o = null;
        ghf ghfVar = this.q;
        pc4 pc4Var = this.r;
        synchronized (ghfVar.b) {
            d8i d8iVar = (d8i) ((HashMap) ghfVar.d).get(pc4Var);
            if (d8iVar != null) {
                d8iVar.c.set(false);
                ((HashMap) ghfVar.d).remove(pc4Var);
            }
            if (((HashMap) ghfVar.d).isEmpty()) {
                ((b8i) ghfVar.c).disable();
            }
        }
    }

    public final void c(nva nvaVar) {
        k8n k8nVar = this.o;
        if (k8nVar != null) {
            int i = i(k8nVar);
            sa2 sa2Var = i != -1 ? new sa2((byte) 0, i, false) : null;
            if (sa2Var != null) {
                zxh zxhVar = new zxh(sa2Var, null, null);
                switch (nvaVar.a) {
                    case 0:
                        nvaVar.b.s(hya.up, zxhVar);
                        break;
                    case 1:
                        nvaVar.b.s(hya.up, zxhVar);
                        break;
                    case 2:
                        nvaVar.b.s(hya.up, zxhVar);
                        break;
                    default:
                        nvaVar.b.s(hya.up, zxhVar);
                        break;
                }
            }
        }
    }

    public final qva d(Integer num, Integer num2, Integer num3) {
        nva nvaVar = new nva((byte) 0);
        fee feeVar = nvaVar.b;
        if (num != null) {
            feeVar.s(tva.b, num);
        }
        if (num2 != null) {
            feeVar.s(tva.c, num2);
        }
        if (num3 != null) {
            feeVar.s(tva.e, num3);
        }
        c(nvaVar);
        int i = this.s;
        if (i != -1) {
            feeVar.s(hya.lp, Integer.valueOf(i));
        }
        tva tvaVar = new tva(wrf.f(feeVar));
        hya.t(tvaVar);
        return new qva(tvaVar);
    }

    public final ewa e(Integer num) {
        nva nvaVar = new nva((byte) 1);
        fee feeVar = nvaVar.b;
        if (num != null) {
            feeVar.s(fwa.b, num);
        }
        c(nvaVar);
        int i = this.s;
        if (i != -1) {
            feeVar.s(hya.lp, Integer.valueOf(i));
        }
        return nvaVar.a();
    }

    public final agm f() {
        if (this.n == null || this.p == null || this.o == null) {
            return null;
        }
        q();
        wsm wsmVar = new wsm();
        swg swgVar = this.c;
        ArrayList arrayList = wsmVar.b;
        arrayList.add(swgVar);
        xug.i();
        if ((this.b & 1) != 0) {
            arrayList.add(this.d);
        }
        xug.i();
        if ((this.b & 2) != 0) {
            arrayList.add(this.g);
        }
        xug.i();
        wsmVar.a = this.o;
        Iterator it = this.C.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            ArrayList arrayList2 = wsmVar.c;
            if (!zHasNext) {
                jpo.i("UseCase must not be empty.", !arrayList.isEmpty());
                Iterator it2 = arrayList2.iterator();
                if (it2.hasNext()) {
                    throw p3p.g(it2);
                }
                return new agm(wsmVar.a, arrayList, arrayList2, (byte) 1);
            }
            if (it.next() != null) {
                h9o.t();
                return null;
            }
            arrayList2.add(null);
        }
    }

    public final y2n g() {
        int i;
        j9h j9hVar = moh.H;
        j9h j9hVar2 = moh.J;
        zrd zrdVar = moh.G;
        zrdVar.getClass();
        int i2 = s4n.c;
        s4n s4nVar = zrdVar.a;
        wfh wfhVar = this.i;
        jpo.m(wfhVar, "The specified quality selector can't be null.");
        s4nVar.getClass();
        s4n s4nVar2 = new s4n(wfhVar, s4nVar.b);
        k8n k8nVar = this.o;
        if (k8nVar != null && wfhVar == moh.E && (i = i(k8nVar)) != -1) {
            s4nVar2 = new s4n(s4nVar2.a, i);
        }
        nva nvaVar = new nva(new moh(new zrd(s4nVar2), j9hVar, j9hVar, j9hVar2));
        Range range = this.l;
        an2 an2Var = qsm.Np;
        fee feeVar = nvaVar.b;
        feeVar.s(an2Var, range);
        feeVar.s(hya.op, 0);
        feeVar.s(txa.ip, this.j);
        int i3 = this.s;
        if (i3 != -1) {
            feeVar.s(hya.lp, Integer.valueOf(i3));
        }
        return new y2n(new j3n(wrf.f(feeVar)));
    }

    public final oni h() {
        HashMap map = this.E;
        nni nniVar = nni.b;
        if (map.get(nniVar) != null) {
            return (oni) map.get(nniVar);
        }
        nni nniVar2 = nni.a;
        if (map.get(nniVar2) != null) {
            return (oni) map.get(nniVar2);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(k8n r6) {
        /*
            r5 = this;
            jf4 r0 = r5.a
            r1 = 0
            if (r6 != 0) goto L7
            r2 = r1
            goto Ld
        L7:
            int r2 = r6.a
            int r2 = defpackage.kfo.f0(r2)
        Ld:
            r3 = 1
            g1h r5 = r5.n     // Catch: java.lang.IllegalArgumentException -> L2a
            if (r5 == 0) goto L28
            f1h r5 = r5.a     // Catch: java.lang.IllegalArgumentException -> L2a
            p12 r5 = r5.a     // Catch: java.lang.IllegalArgumentException -> L2a
            mr r5 = r5.d(r0)     // Catch: java.lang.IllegalArgumentException -> L2a
            xd4 r5 = r5.a     // Catch: java.lang.IllegalArgumentException -> L2a
            int r4 = r5.c()     // Catch: java.lang.IllegalArgumentException -> L2a
            int r5 = r5.j()     // Catch: java.lang.IllegalArgumentException -> L2b
            if (r5 == r3) goto L30
            r5 = r1
            goto L31
        L28:
            r4 = r1
            goto L30
        L2a:
            r4 = r1
        L2b:
            if (r0 == 0) goto L30
            r0.b()
        L30:
            r5 = r3
        L31:
            int r5 = defpackage.kfo.M(r2, r4, r5)
            java.lang.Object r6 = r6.d
            android.util.Rational r6 = (android.util.Rational) r6
            r0 = 90
            if (r5 == r0) goto L41
            r0 = 270(0x10e, float:3.78E-43)
            if (r5 != r0) goto L4f
        L41:
            android.util.Rational r5 = new android.util.Rational
            int r0 = r6.getDenominator()
            int r6 = r6.getNumerator()
            r5.<init>(r0, r6)
            r6 = r5
        L4f:
            android.util.Rational r5 = ua2.a
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L58
            return r1
        L58:
            android.util.Rational r5 = ua2.c
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L61
            return r3
        L61:
            r5 = -1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ycc.i(k8n):int");
    }

    public final boolean j() {
        return this.m != null;
    }

    public final void k(Integer num, boolean z) {
        if (z) {
            q();
        }
        int iK = this.d.K();
        this.d = e(num);
        xug.i();
        if (iK == 3) {
            Integer numB = this.a.b();
            if (numB != null && numB.intValue() != 0) {
                qp2.o("Not a front camera despite setting FLASH_MODE_SCREEN");
                return;
            }
            oni oniVarH = h();
            ewa ewaVar = this.d;
            if (oniVarH == null) {
                qc4 qc4Var = H;
                ewaVar.getClass();
                pni pniVar = new pni(qc4Var);
                ewaVar.x = pniVar;
                ewaVar.f().h(pniVar);
            } else {
                ewaVar.getClass();
                pni pniVar2 = new pni(null);
                ewaVar.x = pniVar2;
                ewaVar.f().h(pniVar2);
            }
        }
        ewa ewaVar2 = this.d;
        ewaVar2.getClass();
        if (iK != 0 && iK != 1 && iK != 2) {
            if (iK != 3) {
                qp2.o(sko.i(iK, "Invalid flash mode: "));
                return;
            }
            if (ewaVar2.x.a == null) {
                qp2.o("A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first.");
                return;
            } else if (ewaVar2.e() != null) {
                zd4 zd4VarE = ewaVar2.e();
                if ((zd4VarE != null ? zd4VarE.a().j() : -1) != 0) {
                    qp2.o("Not a front camera despite setting FLASH_MODE_SCREEN");
                    return;
                }
            }
        }
        synchronized (ewaVar2.t) {
            ewaVar2.v = iK;
            ewaVar2.N();
        }
    }

    public final void l(j3e j3eVar, j3e j3eVar2) {
        j3e j3eVar3;
        if (Objects.equals(j3eVar == null ? null : j3eVar.c(), j3eVar2 == null ? null : j3eVar2.c())) {
            return;
        }
        Integer num = (Integer) ((tva) this.g.h).b(tva.b, 0);
        num.intValue();
        Integer numValueOf = Integer.valueOf(this.g.J());
        Integer numValueOf2 = Integer.valueOf(this.g.K());
        xug.i();
        q();
        qva qvaVarD = d(num, numValueOf, numValueOf2);
        this.g = qvaVarD;
        Executor executor = this.e;
        if (executor != null && (j3eVar3 = this.f) != null) {
            qvaVarD.M(executor, j3eVar3);
        }
        o(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m(int i) {
        xug.i();
        byte b = this.b;
        if (i == b) {
            return;
        }
        this.b = i;
        xug.i();
        xug.i();
        o(new oc4(this, b, i));
    }

    public final ListenableFuture n(float f) {
        xug.i();
        return !j() ? this.B.y(Float.valueOf(f)) : ((mc4) ((lr) this.m.j()).d).f(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(oc4 r6) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ycc.o(oc4):void");
    }

    public final void p() {
        j3e j3eVar;
        q();
        nva nvaVar = new nva((byte) 2);
        c(nvaVar);
        an2 an2Var = txa.ip;
        fee feeVar = nvaVar.b;
        feeVar.s(an2Var, this.k);
        twg twgVar = new twg(wrf.f(feeVar));
        hya.t(twgVar);
        swg swgVar = new swg(twgVar);
        ScheduledExecutorService scheduledExecutorService = swg.A;
        swgVar.t = scheduledExecutorService;
        this.c = swgVar;
        yhe yheVar = this.p;
        if (yheVar != null) {
            xug.i();
            swgVar.s = yheVar;
            swgVar.t = scheduledExecutorService;
            if (swgVar.d() != null) {
                swgVar.J((twg) swgVar.h, swgVar.i);
                swgVar.r();
            }
            swgVar.d = 1;
            swgVar.s();
        }
        xug.i();
        k(Integer.valueOf(this.d.s), false);
        Integer num = (Integer) ((tva) this.g.h).b(tva.b, 0);
        num.intValue();
        Integer numValueOf = Integer.valueOf(this.g.J());
        Integer numValueOf2 = Integer.valueOf(this.g.K());
        xug.i();
        qva qvaVarD = d(num, numValueOf, numValueOf2);
        this.g = qvaVarD;
        Executor executor = this.e;
        if (executor != null && (j3eVar = this.f) != null) {
            qvaVarD.M(executor, j3eVar);
        }
        this.h = g();
    }

    public final void q() {
        g1h g1hVar = this.n;
        if (g1hVar != null) {
            g1hVar.b(new qrm[]{this.c, this.d, this.g, this.h});
        }
    }
}
