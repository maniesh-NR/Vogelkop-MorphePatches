package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.core.app.NotificationCompat;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class d13 extends b8e implements e3c, lk7, i0j, omg, e8e, z0g, z1c, gz9, nf9, jg9, mg9, ivf, e14 {
    public a8e o;
    public c13 p;
    public HashSet q;

    @Override // defpackage.e8e
    public final j14 B() {
        c13 c13Var = this.p;
        return c13Var != null ? c13Var : o08.y;
    }

    @Override // defpackage.e3c
    public final int E(o1d o1dVar, pfd pfdVar, int i) {
        c3c c3cVar = (c3c) this.o;
        c3cVar.getClass();
        return c3cVar.c(new jib(o1dVar, o1dVar.getLayoutDirection()), new lr6(pfdVar, bgd.b, cgd.b, (byte) 1), ap5.b(0, i, 0, 0, 13)).getHeight();
    }

    public final void G(wye wyeVar) {
        this.o.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.b8e
    public final void L0() throws pxb {
        T0(true);
    }

    @Override // defpackage.b8e
    public final void M0() {
        U0();
    }

    @Override // defpackage.e3c
    public final int N(o1d o1dVar, pfd pfdVar, int i) {
        c3c c3cVar = (c3c) this.o;
        c3cVar.getClass();
        return c3cVar.c(new jib(o1dVar, o1dVar.getLayoutDirection()), new lr6(pfdVar, bgd.a, cgd.a, (byte) 1), ap5.b(0, 0, 0, i, 7)).getWidth();
    }

    @Override // defpackage.i0j
    public final void R(q0j q0jVar) {
        f0j f0jVarG = ((g0j) this.o).g();
        f0j f0jVar = (f0j) q0jVar;
        see seeVar = f0jVar.a;
        if (f0jVarG.c) {
            f0jVar.c = true;
        }
        if (f0jVarG.d) {
            f0jVar.d = true;
        }
        see seeVar2 = f0jVarG.a;
        Object[] objArr = seeVar2.b;
        Object[] objArr2 = seeVar2.c;
        long[] jArr = seeVar2.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        p0j p0jVar = (p0j) obj;
                        if (!seeVar.b(p0jVar)) {
                            seeVar.m(p0jVar, obj2);
                        } else if (obj2 instanceof c8) {
                            c8 c8Var = (c8) seeVar.g(p0jVar);
                            String str = c8Var.a;
                            if (str == null) {
                                str = ((c8) obj2).a;
                            }
                            br9 br9Var = c8Var.b;
                            if (br9Var == null) {
                                br9Var = ((c8) obj2).b;
                            }
                            seeVar.m(p0jVar, new c8(str, br9Var));
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void T0(boolean z) throws pxb {
        if (!this.n) {
            a8b.b("initializeModifier called on unattached node");
        }
        a8e a8eVar = this.o;
        if ((this.c & 32) != 0 && (a8eVar instanceof f8e)) {
            f8e f8eVar = (f8e) a8eVar;
            h7h h7hVar = l07.a;
            c13 c13Var = this.p;
            if (c13Var == null || !c13Var.x(h7hVar)) {
                c13 c13Var2 = new c13();
                c13Var2.y = f8eVar;
                this.p = c13Var2;
                if (((lbl) ui6.e0(this).F.f).o) {
                    hd hdVar = ui6.f0(this).k0;
                    dee deeVar = (dee) hdVar.d;
                    if (deeVar == null) {
                        deeVar = new dee();
                        hdVar.d = deeVar;
                    }
                    deeVar.a(this);
                    dee deeVar2 = (dee) hdVar.e;
                    if (deeVar2 == null) {
                        deeVar2 = new dee();
                        hdVar.e = deeVar2;
                    }
                    deeVar2.a(h7hVar);
                    hdVar.p();
                }
            } else {
                c13Var.y = f8eVar;
                hd hdVar2 = ui6.f0(this).k0;
                dee deeVar3 = (dee) hdVar2.d;
                if (deeVar3 == null) {
                    deeVar3 = new dee();
                    hdVar2.d = deeVar3;
                }
                deeVar3.a(this);
                dee deeVar4 = (dee) hdVar2.e;
                if (deeVar4 == null) {
                    deeVar4 = new dee();
                    hdVar2.e = deeVar4;
                }
                deeVar4.a(h7hVar);
                hdVar2.p();
            }
        }
        if ((this.c & 4) != 0 && !z) {
            ui6.c0(this, 2).h1();
        }
        if ((this.c & 2) != 0) {
            if (((lbl) ui6.e0(this).F.f).o) {
                wye wyeVar = this.h;
                ((g3c) wyeVar).C1(this);
                evf evfVar = wyeVar.T;
                if (evfVar != null) {
                    ((s3a) evfVar).c();
                }
            }
            if (!z) {
                ui6.c0(this, 2).h1();
                ui6.e0(this).E();
            }
        }
        if (a8eVar instanceof r6c) {
            r6c r6cVar = (r6c) a8eVar;
            m3c m3cVarE0 = ui6.e0(this);
            switch (r6cVar.b) {
                case 0:
                    ((u6c) r6cVar.c).l = m3cVarE0;
                    break;
                default:
                    ((sxf) r6cVar.c).w.setValue(m3cVarE0);
                    break;
            }
        }
        int i = this.c;
        if ((i & 16) != 0 && (a8eVar instanceof smg)) {
            ((smg) a8eVar).e.b = this.h;
        }
        if ((i & 8) != 0) {
            ui6.f0(this).G();
        }
    }

    public final void U0() {
        if (!this.n) {
            a8b.b("unInitializeModifier called on unattached node");
        }
        a8e a8eVar = this.o;
        if ((this.c & 32) != 0 && (a8eVar instanceof f8e)) {
            hd hdVar = ui6.f0(this).k0;
            h7h h7hVar = l07.a;
            dee deeVar = (dee) hdVar.f;
            if (deeVar == null) {
                deeVar = new dee();
                hdVar.f = deeVar;
            }
            deeVar.a(ui6.e0(this));
            dee deeVar2 = (dee) hdVar.g;
            if (deeVar2 == null) {
                deeVar2 = new dee();
                hdVar.g = deeVar2;
            }
            deeVar2.a(h7hVar);
            hdVar.p();
        }
        if ((this.c & 8) != 0) {
            ui6.f0(this).G();
        }
    }

    public final void V0() {
        if (this.n) {
            this.q.clear();
            p12 p12Var = ui6.f0(this).K;
            ((tuj) p12Var.a).e(this, ipe.a, new oc2(this, (byte) 5));
        }
    }

    @Override // defpackage.z1c
    public final void X(b2c b2cVar) {
    }

    public final boolean Z() {
        return this.n;
    }

    @Override // defpackage.z1c, defpackage.xfd
    public final void a(long j) {
    }

    @Override // defpackage.e14
    public final n27 b() {
        return ui6.e0(this).y;
    }

    @Override // defpackage.e3c
    public final ufd c(vfd vfdVar, pfd pfdVar, long j) {
        return ((c3c) this.o).c(vfdVar, pfdVar, j);
    }

    @Override // defpackage.f17, defpackage.omg
    public final void d() {
        if (this.o instanceof smg) {
            g0();
        }
    }

    @Override // defpackage.e14
    public final long e() {
        return fr3.g0(ui6.c0(this, NotificationCompat.FLAG_HIGH_PRIORITY).c);
    }

    @Override // defpackage.e3c
    public final int f(o1d o1dVar, pfd pfdVar, int i) {
        c3c c3cVar = (c3c) this.o;
        c3cVar.getClass();
        return c3cVar.c(new jib(o1dVar, o1dVar.getLayoutDirection()), new lr6(pfdVar, bgd.b, cgd.a, (byte) 1), ap5.b(0, 0, 0, i, 7)).getWidth();
    }

    @Override // defpackage.omg
    public final void g0() {
        s9i s9iVar = ((smg) this.o).e;
        qmg qmgVar = (qmg) s9iVar.c;
        smg smgVar = (smg) s9iVar.e;
        if (qmgVar == qmg.b) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            motionEventObtain.setSource(0);
            dc1 dc1Var = smgVar.b;
            if (dc1Var == null) {
                dc1Var = null;
            }
            dc1Var.invoke(motionEventObtain);
            motionEventObtain.recycle();
            s9iVar.c = qmg.a;
            smgVar.d = false;
            s9iVar.d = null;
        }
    }

    @Override // defpackage.e14
    public final d2c getLayoutDirection() {
        return ui6.e0(this).z;
    }

    @Override // defpackage.lk7
    public final void i0() {
        c26.y(this);
    }

    @Override // defpackage.z0g
    public final Object l(n27 n27Var, Object obj) {
        return ((y0g) this.o).e();
    }

    @Override // defpackage.omg
    public final void n(fmg fmgVar, gmg gmgVar, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        s9i s9iVar = ((smg) this.o).e;
        smg smgVar = (smg) s9iVar.e;
        List list = fmgVar.a;
        List list2 = list;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            lmg lmgVar = (lmg) list.get(i);
            if (wxe.k(lmgVar) || wxe.m(lmgVar)) {
                z = false;
                break;
            }
        }
        z = true;
        if (!z) {
            z2 = false;
            break;
        }
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((lmg) list.get(i2)).c()) {
                z2 = false;
                break;
            }
        }
        z2 = true;
        if (smgVar.d) {
            z3 = true;
        } else {
            int size3 = list2.size();
            int i3 = 0;
            while (true) {
                if (i3 < size3) {
                    lmg lmgVar2 = (lmg) list.get(i3);
                    if (wxe.k(lmgVar2) || wxe.m(lmgVar2)) {
                        break;
                    } else {
                        i3++;
                    }
                } else if (!z2) {
                    z3 = false;
                }
            }
            z3 = true;
        }
        if (((qmg) s9iVar.c) != qmg.c) {
            if (gmgVar == gmg.a && z3) {
                s9iVar.d = fmgVar;
                s9iVar.M(fmgVar, !z || smgVar.d);
            }
            if (gmgVar == gmg.b && z && fmgVar == ((fmg) s9iVar.d) && smgVar.d) {
                int size4 = list2.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    ((lmg) list.get(i4)).a();
                }
            }
            if (gmgVar == gmg.c && !z3 && fmgVar != ((fmg) s9iVar.d)) {
                s9iVar.M(fmgVar, true);
            }
        }
        if (gmgVar == gmg.c) {
            int size5 = list2.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size5) {
                    s9iVar.c = qmg.a;
                    ((smg) s9iVar.e).d = false;
                    s9iVar.d = null;
                    break;
                } else if (!wxe.m((lmg) list.get(i5))) {
                    break;
                } else {
                    i5++;
                }
            }
            if (fmgVar == ((fmg) s9iVar.d) && z) {
                int size6 = list2.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size6) {
                        break;
                    }
                    if (!((lmg) list.get(i6)).c()) {
                        i6++;
                    } else if (!smgVar.d) {
                        s9iVar.g0(fmgVar);
                        return;
                    }
                }
                int size7 = list2.size();
                for (int i7 = 0; i7 < size7; i7++) {
                    ((lmg) list.get(i7)).a();
                }
            }
        }
    }

    @Override // defpackage.jg9
    public final void p(hg9 hg9Var) {
        a8e a8eVar = this.o;
        a8b.b("applyFocusProperties called on wrong node");
        a8eVar.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.nf9
    public final void r(qg9 qg9Var) {
        a8e a8eVar = this.o;
        a8b.b("onFocusEvent called on wrong node");
        a8eVar.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.e3c
    public final int r0(o1d o1dVar, pfd pfdVar, int i) {
        c3c c3cVar = (c3c) this.o;
        c3cVar.getClass();
        return c3cVar.c(new jib(o1dVar, o1dVar.getLayoutDirection()), new lr6(pfdVar, bgd.a, cgd.b, (byte) 1), ap5.b(0, i, 0, 0, 13)).getHeight();
    }

    public final String toString() {
        return this.o.toString();
    }

    @Override // defpackage.lk7
    public final void v0(o3c o3cVar) {
        ((d6b) this.o).getClass();
        o3cVar.a();
    }

    @Override // defpackage.omg
    public final void w() {
        ((smg) this.o).e.getClass();
    }

    @Override // defpackage.omg
    public final boolean x0() {
        ((smg) this.o).e.getClass();
        return true;
    }
}
