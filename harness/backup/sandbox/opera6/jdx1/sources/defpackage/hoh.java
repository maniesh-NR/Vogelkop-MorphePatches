package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class hoh extends zh5 {
    public final bt3 a;
    public final g77 b;
    public final Object c;
    public unb d;
    public Throwable e;
    public final ArrayList f;
    public List g;
    public tee h;
    public final dfe i;
    public final ArrayList j;
    public final ArrayList k;
    public final see l;
    public final k5o m;
    public final see n;
    public final see o;
    public ArrayList p;
    public tee q;
    public nh4 r;
    public final nak s;
    public boolean t;
    public final nak u;
    public final p8f v;
    public final ynb w;
    public final CoroutineContext x;
    public final hr5 y;
    public static final nak z = z4o.f(sbg.e);
    public static final AtomicReference A = new AtomicReference(Boolean.FALSE);

    /* JADX WARN: Type inference failed for: r1v0, types: [boh] */
    public hoh(CoroutineContext coroutineContext) {
        final byte b = 0;
        bt3 bt3Var = new bt3(new Function0(this) { // from class: boh
            public final /* synthetic */ hoh b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b2 = b;
                hoh hohVar = this.b;
                switch (b2) {
                    case 0:
                        hohVar.E();
                        break;
                    default:
                        hohVar.E();
                        break;
                }
                return Unit.a;
            }
        });
        this.a = bt3Var;
        final byte b2 = 1;
        Function0 function0 = new Function0(this) { // from class: boh
            public final /* synthetic */ hoh b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b22 = b2;
                hoh hohVar = this.b;
                switch (b22) {
                    case 0:
                        hohVar.E();
                        break;
                    default:
                        hohVar.E();
                        break;
                }
                return Unit.a;
            }
        };
        g77 g77Var = new g77();
        g77Var.a = new cf2(0);
        g77Var.b = new wjh((byte) 10);
        g77Var.c = new gv8(g77Var, function0, (byte) 29);
        this.b = g77Var;
        this.c = new Object();
        this.f = new ArrayList();
        this.h = new tee();
        this.i = new dfe(new fi5[16]);
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new see();
        this.m = new k5o((byte) 24);
        this.n = new see();
        this.o = new see();
        this.s = z4o.f(null);
        this.u = z4o.f(eoh.c);
        this.v = new p8f((byte) 20);
        ynb ynbVar = new ynb(coroutineContext.get(ulp.h));
        ynbVar.s(new rmg(this, (byte) 16));
        this.w = ynbVar;
        this.x = coroutineContext.plus(bt3Var).plus(ynbVar);
        this.y = new hr5();
    }

    public static final void G(ArrayList arrayList, hoh hohVar, fi5 fi5Var) {
        arrayList.clear();
        synchronized (hohVar.c) {
            Iterator it = hohVar.k.iterator();
            if (it.hasNext()) {
                ((uae) it.next()).getClass();
                throw null;
            }
        }
    }

    public static void w(yee yeeVar) {
        try {
            if (yeeVar.w() instanceof utj) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            yeeVar.c();
        }
    }

    public final boolean A() {
        return this.i.c != 0 || z() || B() || this.l.j();
    }

    public final boolean B() {
        return !this.t && (((cf2) ((wjh) this.b.b).d).get() & 134217727) > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean C() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.c
            monitor-enter(r0)
            tee r1 = r2.h     // Catch: java.lang.Throwable -> L22
            boolean r1 = r1.h()     // Catch: java.lang.Throwable -> L22
            if (r1 != 0) goto L1f
            dfe r1 = r2.i     // Catch: java.lang.Throwable -> L22
            int r1 = r1.c     // Catch: java.lang.Throwable -> L22
            if (r1 != 0) goto L1f
            boolean r1 = r2.z()     // Catch: java.lang.Throwable -> L22
            if (r1 != 0) goto L1f
            boolean r2 = r2.B()     // Catch: java.lang.Throwable -> L22
            if (r2 != 0) goto L1f
            r2 = 0
            goto L20
        L1f:
            r2 = 1
        L20:
            monitor-exit(r0)
            return r2
        L22:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hoh.C():boolean");
    }

    public final List D() {
        List list = this.g;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = this.f;
        l08 arrayList2 = arrayList.isEmpty() ? l08.a : new ArrayList(arrayList);
        this.g = arrayList2;
        return arrayList2;
    }

    public final void E() {
        nh4 nh4VarY;
        synchronized (this.c) {
            nh4VarY = y();
            if (((eoh) this.u.getValue()).compareTo(eoh.b) <= 0) {
                throw na2.a("Recomposer shutdown; frame clock awaiter will never resume", this.e);
            }
        }
        if (nh4VarY != null) {
            p0i p0iVar = t0i.b;
            nh4VarY.resumeWith(Unit.a);
        }
    }

    public final void F(fi5 fi5Var) {
        synchronized (this.c) {
            ArrayList arrayList = this.k;
            if (arrayList.size() > 0) {
                ((uae) arrayList.get(0)).getClass();
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x013a, code lost:
    
        r3 = r11.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x013f, code lost:
    
        if (r4 >= r3) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0149, code lost:
    
        if (((kotlin.Pair) r11.get(r4)).b == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014b, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014e, code lost:
    
        r3 = new java.util.ArrayList(r11.size());
        r4 = r11.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x015c, code lost:
    
        if (r9 >= r4) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x015e, code lost:
    
        r12 = (kotlin.Pair) r11.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0166, code lost:
    
        if (r12.b != null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0168, code lost:
    
        r12 = (defpackage.uae) r12.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x016c, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x016f, code lost:
    
        r4 = r18.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0171, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0172, code lost:
    
        defpackage.o95.t(r3, r18.k);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0177, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0178, code lost:
    
        r3 = new java.util.ArrayList(r11.size());
        r4 = r11.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0186, code lost:
    
        if (r9 >= r4) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0188, code lost:
    
        r12 = r11.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0191, code lost:
    
        if (((kotlin.Pair) r12).b == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0193, code lost:
    
        r3.add(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0196, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0199, code lost:
    
        r11 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List H(java.util.ArrayList r19, defpackage.tee r20) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hoh.H(java.util.ArrayList, tee):java.util.List");
    }

    public final fi5 I(fi5 fi5Var, tee teeVar) {
        yee yeeVarC;
        if (fi5Var.v.F || fi5Var.w == 3) {
            return null;
        }
        tee teeVar2 = this.q;
        if (teeVar2 == null || !teeVar2.c(fi5Var)) {
            Function1 rmgVar = new rmg(fi5Var, (byte) 15);
            Function1 vvfVar = new vvf(fi5Var, teeVar, (byte) 10);
            ttj ttjVarH = ytj.h();
            yee yeeVar = ttjVarH instanceof yee ? (yee) ttjVarH : null;
            if (yeeVar == null || (yeeVarC = yeeVar.C(rmgVar, vvfVar)) == null) {
                qp2.n("Cannot create a mutable snapshot of an read-only snapshot");
            } else {
                try {
                    ttj ttjVarJ = yeeVarC.j();
                    if (teeVar != null) {
                        try {
                            if (teeVar.h()) {
                                s4f s4fVar = new s4f(teeVar, fi5Var, (byte) 13);
                                vt9 vt9Var = fi5Var.v;
                                if (vt9Var.F) {
                                    mh5.a("Preparing a composition while composing is not supported");
                                }
                                vt9Var.F = true;
                                try {
                                    s4fVar.invoke();
                                    vt9Var.F = false;
                                } catch (Throwable th) {
                                    vt9Var.F = false;
                                    throw th;
                                }
                            }
                        } finally {
                            ttj.q(ttjVarJ);
                        }
                    }
                    if (fi5Var.w()) {
                        return fi5Var;
                    }
                } finally {
                    w(yeeVarC);
                }
            }
        }
        return null;
    }

    public final void J(Throwable th, fi5 fi5Var) throws Throwable {
        if (!((Boolean) A.get()).booleanValue() || (th instanceof hg5)) {
            synchronized (this.c) {
                doh dohVar = (doh) this.s.getValue();
                if (dohVar != null) {
                    throw dohVar.a;
                }
                nak nakVar = this.s;
                doh dohVar2 = new doh(th);
                nakVar.getClass();
                nakVar.k((Object) null, dohVar2);
            }
            throw th;
        }
        synchronized (this.c) {
            this.j.clear();
            this.i.h();
            this.h = new tee();
            this.k.clear();
            this.l.a();
            this.n.a();
            nak nakVar2 = this.s;
            doh dohVar3 = new doh(th);
            nakVar2.getClass();
            nakVar2.k((Object) null, dohVar3);
            if (fi5Var != null) {
                L(fi5Var);
            }
            if (y() != null) {
                mh5.a("expected to go to inactive state due to composition error");
            }
        }
    }

    public final boolean K() {
        boolean zA;
        synchronized (this.c) {
            if (this.h.g()) {
                return A();
            }
            List listD = D();
            kmi kmiVar = new kmi(this.h);
            this.h = new tee();
            try {
                int size = listD.size();
                for (int i = 0; i < size; i++) {
                    ((fi5) listD.get(i)).x(kmiVar);
                    if (((eoh) this.u.getValue()).compareTo(eoh.b) <= 0) {
                        break;
                    }
                }
                synchronized (this.c) {
                    if (y() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zA = A();
                }
                return zA;
            } catch (Throwable th) {
                synchronized (this.c) {
                    tee teeVar = this.h;
                    int i2 = teeVar.d;
                    Iterator<E> it = kmiVar.iterator();
                    while (it.hasNext()) {
                        teeVar.k(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    public final void L(fi5 fi5Var) {
        ArrayList arrayList = this.p;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.p = arrayList;
        }
        if (!arrayList.contains(fi5Var)) {
            arrayList.add(fi5Var);
        }
        if (this.f.remove(fi5Var)) {
            this.g = null;
        }
    }

    @Override // defpackage.zh5
    public final void a(fi5 fi5Var, Function2 function2) throws Throwable {
        eoh eohVar;
        boolean zContains;
        yee yeeVarC;
        boolean z2 = fi5Var.v.F;
        synchronized (this.c) {
            eoh eohVar2 = (eoh) this.u.getValue();
            eohVar = eoh.b;
            zContains = eohVar2.compareTo(eohVar) > 0 ? true ^ D().contains(fi5Var) : true;
        }
        try {
            Function1 rmgVar = new rmg(fi5Var, (byte) 15);
            Function1 vvfVar = new vvf(fi5Var, (Object) null, (byte) 10);
            ttj ttjVarH = ytj.h();
            yee yeeVar = ttjVarH instanceof yee ? (yee) ttjVarH : null;
            if (yeeVar == null || (yeeVarC = yeeVar.C(rmgVar, vvfVar)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                ttj ttjVarJ = yeeVarC.j();
                try {
                    fi5Var.j(function2);
                    synchronized (this.c) {
                        if (((eoh) this.u.getValue()).compareTo(eohVar) > 0 && !D().contains(fi5Var)) {
                            this.f.add(fi5Var);
                            this.g = null;
                        }
                    }
                    if (!z2) {
                        ytj.h().m();
                    }
                    try {
                        F(fi5Var);
                        try {
                            fi5Var.d();
                            fi5Var.f();
                            if (z2) {
                                return;
                            }
                            ytj.h().m();
                        } catch (Throwable th) {
                            J(th, null);
                        }
                    } catch (Throwable th2) {
                        J(th2, fi5Var);
                    }
                } finally {
                    ttj.q(ttjVarJ);
                }
            } finally {
                w(yeeVarC);
            }
        } catch (Throwable th3) {
            if (zContains) {
                synchronized (this.c) {
                }
            }
            J(th3, fi5Var);
        }
    }

    @Override // defpackage.zh5
    public final tee b(fi5 fi5Var, thj thjVar, Function2 function2) {
        p8f p8fVar = this.v;
        try {
            thj thjVar2 = fi5Var.p;
            fi5Var.p = thjVar;
            try {
                a(fi5Var, function2);
                tee teeVar = (tee) p8fVar.get();
                if (teeVar == null) {
                    teeVar = jmi.a;
                }
                return teeVar;
            } finally {
                fi5Var.p = thjVar2;
            }
        } finally {
            p8fVar.F((Object) null);
        }
    }

    @Override // defpackage.zh5
    public final CoroutineContext j() {
        return this.x;
    }

    @Override // defpackage.zh5
    public final void l(fi5 fi5Var) {
        mh4 mh4VarY;
        synchronized (this.c) {
            if (this.i.i(fi5Var)) {
                mh4VarY = null;
            } else {
                this.i.c(fi5Var);
                mh4VarY = y();
            }
        }
        if (mh4VarY != null) {
            p0i p0iVar = t0i.b;
            ((nh4) mh4VarY).resumeWith(Unit.a);
        }
    }

    @Override // defpackage.zh5
    public final tae m(uae uaeVar) {
        tae taeVar;
        synchronized (this.c) {
            taeVar = (tae) this.n.k(uaeVar);
        }
        return taeVar;
    }

    @Override // defpackage.zh5
    public final tee n(fi5 fi5Var, thj thjVar, tee teeVar) {
        p8f p8fVar = this.v;
        try {
            K();
            fi5Var.x(new kmi(teeVar));
            thj thjVar2 = fi5Var.p;
            fi5Var.p = thjVar;
            try {
                fi5 fi5VarI = I(fi5Var, null);
                if (fi5VarI != null) {
                    F(fi5Var);
                    fi5VarI.d();
                    fi5VarI.f();
                }
                tee teeVar2 = (tee) p8fVar.get();
                if (teeVar2 == null) {
                    teeVar2 = jmi.a;
                }
                return teeVar2;
            } finally {
                fi5Var.p = thjVar2;
            }
        } finally {
            p8fVar.F((Object) null);
        }
    }

    @Override // defpackage.zh5
    public final void q(znh znhVar) {
        p8f p8fVar = this.v;
        tee teeVar = (tee) p8fVar.get();
        if (teeVar == null) {
            tee teeVar2 = jmi.a;
            teeVar = new tee();
            p8fVar.F(teeVar);
        }
        teeVar.a(znhVar);
    }

    @Override // defpackage.zh5
    public final void r(fi5 fi5Var) {
        synchronized (this.c) {
            tee teeVar = this.q;
            if (teeVar == null) {
                tee teeVar2 = jmi.a;
                teeVar = new tee();
                this.q = teeVar;
            }
            teeVar.a(fi5Var);
        }
    }

    @Override // defpackage.zh5
    public final ph4 s(q4b q4bVar) {
        g77 g77Var = this.b;
        wjh wjhVar = (wjh) g77Var.b;
        ove oveVar = new ove();
        oveVar.a = q4bVar;
        return wjhVar.c(oveVar, (gv8) g77Var.c);
    }

    @Override // defpackage.zh5
    public final void v(fi5 fi5Var) {
        synchronized (this.c) {
            if (this.f.remove(fi5Var)) {
                this.g = null;
            }
            this.i.k(fi5Var);
            this.j.remove(fi5Var);
        }
    }

    public final void x() {
        synchronized (this.c) {
            if (((eoh) this.u.getValue()).compareTo(eoh.e) >= 0) {
                nak nakVar = this.u;
                eoh eohVar = eoh.b;
                nakVar.getClass();
                nakVar.k((Object) null, eohVar);
            }
        }
        this.w.k((CancellationException) null);
    }

    public final mh4 y() {
        eoh eohVar;
        nak nakVar = this.u;
        int iCompareTo = ((eoh) nakVar.getValue()).compareTo(eoh.b);
        nak nakVar2 = this.s;
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = this.j;
        dfe dfeVar = this.i;
        if (iCompareTo > 0) {
            if (nakVar2.getValue() != null) {
                eohVar = eoh.c;
            } else if (this.d == null) {
                this.h = new tee();
                dfeVar.h();
                eohVar = (z() || B()) ? eoh.d : eoh.c;
            } else {
                eohVar = (dfeVar.c != 0 || this.h.h() || !arrayList2.isEmpty() || !arrayList.isEmpty() || z() || B() || this.l.j()) ? eoh.f : eoh.e;
            }
            nakVar.k((Object) null, eohVar);
            if (eohVar != eoh.f) {
                return null;
            }
            nh4 nh4Var = this.r;
            this.r = null;
            return nh4Var;
        }
        List listD = D();
        int size = listD.size();
        for (int i = 0; i < size; i++) {
        }
        this.f.clear();
        this.g = l08.a;
        this.h = new tee();
        dfeVar.h();
        arrayList2.clear();
        arrayList.clear();
        this.p = null;
        nh4 nh4Var2 = this.r;
        if (nh4Var2 != null) {
            nh4Var2.d((Throwable) null);
        }
        this.r = null;
        nakVar2.j((Object) null);
        return null;
    }

    public final boolean z() {
        return !this.t && (((cf2) this.a.b.d).get() & 134217727) > 0;
    }
}
