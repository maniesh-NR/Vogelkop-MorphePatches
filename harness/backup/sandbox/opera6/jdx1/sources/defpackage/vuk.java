package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class vuk extends b8e implements pmg, n27, omg {
    public Object o;
    public Object p;
    public PointerInputEventHandler q;
    public d3k r;
    public fmg s = ruk.a;
    public final dfe t;
    public final dfe u;
    public final dfe v;
    public fmg w;
    public long x;

    public vuk(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        this.o = obj;
        this.p = obj2;
        this.q = pointerInputEventHandler;
        dfe dfeVar = new dfe(new uuk[16]);
        this.t = dfeVar;
        this.u = dfeVar;
        this.v = new dfe(new uuk[16]);
        this.x = 0L;
    }

    @Override // defpackage.omg
    public final void A0() {
        V0();
    }

    @Override // defpackage.b8e
    public final void M0() {
        V0();
    }

    public final Object T0(Function2 function2, mt5 mt5Var) {
        nh4 nh4Var = new nh4(1, hib.b(mt5Var));
        nh4Var.s();
        uuk uukVar = new uuk(this, nh4Var);
        synchronized (this.u) {
            this.t.c(uukVar);
            bhi bhiVar = new bhi(hib.b(hib.a(uukVar, uukVar, function2)), px5.a);
            p0i p0iVar = t0i.b;
            bhiVar.resumeWith(Unit.a);
        }
        nh4Var.u(new v91(uukVar, (byte) 18));
        return nh4Var.q();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004b A[Catch: all -> 0x0067, TryCatch #0 {all -> 0x0067, blocks: (B:6:0x000d, B:12:0x001a, B:13:0x001f, B:14:0x0020, B:17:0x002c, B:19:0x0034, B:21:0x0038, B:22:0x003f, B:23:0x0042, B:25:0x004b, B:27:0x0053, B:29:0x0057), top: B:39:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U0(defpackage.fmg r7, defpackage.gmg r8) {
        /*
            r6 = this;
            dfe r0 = r6.u
            monitor-enter(r0)
            dfe r1 = r6.v     // Catch: java.lang.Throwable -> L6e
            dfe r2 = r6.t     // Catch: java.lang.Throwable -> L6e
            int r3 = r1.c     // Catch: java.lang.Throwable -> L6e
            r1.d(r3, r2)     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r0)
            int r0 = r8.ordinal()     // Catch: java.lang.Throwable -> L67
            r1 = 0
            if (r0 == 0) goto L42
            r2 = 1
            if (r0 == r2) goto L20
            r2 = 2
            if (r0 == r2) goto L42
            oye r7 = new oye     // Catch: java.lang.Throwable -> L67
            r7.<init>()     // Catch: java.lang.Throwable -> L67
            throw r7     // Catch: java.lang.Throwable -> L67
        L20:
            dfe r0 = r6.v     // Catch: java.lang.Throwable -> L67
            int r3 = r0.c     // Catch: java.lang.Throwable -> L67
            int r3 = r3 - r2
            java.lang.Object[] r0 = r0.a     // Catch: java.lang.Throwable -> L67
            int r2 = r0.length     // Catch: java.lang.Throwable -> L67
            if (r3 >= r2) goto L61
        L2a:
            if (r3 < 0) goto L61
            r2 = r0[r3]     // Catch: java.lang.Throwable -> L67
            uuk r2 = (defpackage.uuk) r2     // Catch: java.lang.Throwable -> L67
            gmg r4 = r2.d     // Catch: java.lang.Throwable -> L67
            if (r8 != r4) goto L3f
            nh4 r4 = r2.c     // Catch: java.lang.Throwable -> L67
            if (r4 == 0) goto L3f
            r2.c = r1     // Catch: java.lang.Throwable -> L67
            p0i r2 = t0i.b     // Catch: java.lang.Throwable -> L67
            r4.resumeWith(r7)     // Catch: java.lang.Throwable -> L67
        L3f:
            int r3 = r3 + (-1)
            goto L2a
        L42:
            dfe r0 = r6.v     // Catch: java.lang.Throwable -> L67
            java.lang.Object[] r2 = r0.a     // Catch: java.lang.Throwable -> L67
            int r0 = r0.c     // Catch: java.lang.Throwable -> L67
            r3 = 0
        L49:
            if (r3 >= r0) goto L61
            r4 = r2[r3]     // Catch: java.lang.Throwable -> L67
            uuk r4 = (defpackage.uuk) r4     // Catch: java.lang.Throwable -> L67
            gmg r5 = r4.d     // Catch: java.lang.Throwable -> L67
            if (r8 != r5) goto L5e
            nh4 r5 = r4.c     // Catch: java.lang.Throwable -> L67
            if (r5 == 0) goto L5e
            r4.c = r1     // Catch: java.lang.Throwable -> L67
            p0i r4 = t0i.b     // Catch: java.lang.Throwable -> L67
            r5.resumeWith(r7)     // Catch: java.lang.Throwable -> L67
        L5e:
            int r3 = r3 + 1
            goto L49
        L61:
            dfe r6 = r6.v
            r6.h()
            return
        L67:
            r7 = move-exception
            dfe r6 = r6.v
            r6.h()
            throw r7
        L6e:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vuk.U0(fmg, gmg):void");
    }

    public final void V0() {
        d3k d3kVar = this.r;
        if (d3kVar != null) {
            d3kVar.C(new g8e("Pointer input was reset", (byte) 2));
            this.r = null;
        }
    }

    @Override // defpackage.n27
    public final float b() {
        return ui6.e0(this).y.b();
    }

    @Override // defpackage.f17, defpackage.omg
    public final void d() {
        V0();
    }

    @Override // defpackage.omg
    public final void g0() {
        fmg fmgVar = this.w;
        if (fmgVar != null) {
            List list = fmgVar.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((lmg) list.get(i)).d) {
                    ArrayList arrayList = new ArrayList(list.size());
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        lmg lmgVar = (lmg) list.get(i2);
                        long j = lmgVar.a;
                        long j2 = lmgVar.c;
                        long j3 = lmgVar.b;
                        float f = lmgVar.e;
                        boolean z = lmgVar.d;
                        arrayList.add(new lmg(j, j3, j2, false, f, j3, j2, z, z, lmgVar.i, 0L, 1.0f, 0L));
                    }
                    fmg fmgVar2 = new fmg(arrayList, null);
                    this.s = fmgVar2;
                    U0(fmgVar2, gmg.a);
                    U0(fmgVar2, gmg.b);
                    U0(fmgVar2, gmg.c);
                    this.w = null;
                    return;
                }
            }
        }
    }

    @Override // defpackage.omg
    public final void n(fmg fmgVar, gmg gmgVar, long j) {
        this.x = j;
        if (gmgVar == gmg.a) {
            this.s = fmgVar;
        }
        mt5 mt5Var = null;
        if (this.r == null) {
            this.r = na2.B(H0(), null, rx5.d, new rf4((byte) 19, mt5Var, this), 1);
        }
        U0(fmgVar, gmgVar);
        List list = fmgVar.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                fmgVar = null;
                break;
            } else if (!wxe.m((lmg) list.get(i))) {
                break;
            } else {
                i++;
            }
        }
        this.w = fmgVar;
    }

    @Override // defpackage.n27
    public final float n0() {
        return ui6.e0(this).y.n0();
    }
}
