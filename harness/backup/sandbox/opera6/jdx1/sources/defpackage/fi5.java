package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fi5 implements yh5 {
    public final zh5 a;
    public final jim b;
    public final AtomicReference c = new AtomicReference(null);
    public final Object d = new Object();
    public final wee e;
    public final iqj f;
    public final see g;
    public final tee h;
    public final tee i;
    public final see j;
    public final lr4 k;
    public final lr4 l;
    public final see m;
    public see n;
    public boolean o;
    public thj p;
    public f8g q;
    public fi5 r;
    public int s;
    public final eme t;
    public final j1c u;
    public final vt9 v;
    public byte w;
    public Function2 x;

    public fi5(zh5 zh5Var, jim jimVar) {
        this.a = zh5Var;
        this.b = jimVar;
        wee weeVar = new wee(new tee());
        this.e = weeVar;
        iqj iqjVar = new iqj();
        if (zh5Var.d()) {
            iqjVar.k = new jde();
        }
        if (zh5Var.f()) {
            iqjVar.c();
        }
        this.f = iqjVar;
        this.g = n6h.e();
        this.h = new tee();
        this.i = new tee();
        this.j = n6h.e();
        lr4 lr4Var = new lr4();
        this.k = lr4Var;
        lr4 lr4Var2 = new lr4();
        this.l = lr4Var2;
        this.m = n6h.e();
        this.n = n6h.e();
        eme emeVar = new eme(zh5Var);
        this.t = emeVar;
        this.u = new j1c();
        vt9 vt9Var = new vt9(jimVar, zh5Var, kqj.a(iqjVar), weeVar, lr4Var, lr4Var2, emeVar, this);
        zh5Var.p(vt9Var);
        this.v = vt9Var;
        this.x = scd.e;
    }

    public final void A(Function2 function2) {
        boolean zI = i();
        q();
        zh5 zh5Var = this.a;
        if (!zI) {
            this.x = function2;
            zh5Var.a(this, function2);
            return;
        }
        vt9 vt9Var = this.v;
        vt9Var.z = 0;
        vt9Var.y = true;
        this.x = function2;
        zh5Var.a(this, function2);
        if (vt9Var.F || vt9Var.z != 0) {
            bpg.a("Cannot disable reuse from root if it was caused by other groups");
        }
        vt9Var.z = -1;
        vt9Var.y = false;
    }

    public final void a() {
        this.c.set(null);
        this.k.l.G0();
        this.l.l.G0();
        wee weeVar = this.e;
        if (weeVar.a.g()) {
            return;
        }
        j1c j1cVar = this.u;
        try {
            j1cVar.i(weeVar, this.v.y());
            j1cVar.c();
        } finally {
            j1cVar.b();
        }
    }

    public final void b(Object obj, boolean z) {
        Object objG = this.g.g(obj);
        if (objG == null) {
            return;
        }
        boolean z2 = objG instanceof tee;
        tee teeVar = this.h;
        tee teeVar2 = this.i;
        see seeVar = this.m;
        if (!z2) {
            znh znhVar = (znh) objG;
            if (n6h.l(seeVar, obj, znhVar) || znhVar.b(obj) == mjb.a) {
                return;
            }
            if (znhVar.g == null || z) {
                teeVar.a(znhVar);
                return;
            } else {
                teeVar2.a(znhVar);
                return;
            }
        }
        tee teeVar3 = (tee) objG;
        Object[] objArr = teeVar3.b;
        long[] jArr = teeVar3.a;
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
                        znh znhVar2 = (znh) objArr[(i << 3) + i3];
                        if (!n6h.l(seeVar, obj, znhVar2) && znhVar2.b(obj) != mjb.a) {
                            if (znhVar2.g == null || z) {
                                teeVar.a(znhVar2);
                            } else {
                                teeVar2.a(znhVar2);
                            }
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

    /* JADX WARN: Removed duplicated region for block: B:73:0x0182 A[EDGE_INSN: B:73:0x0182->B:219:0x0122 BREAK  A[LOOP:13: B:63:0x0150->B:74:0x0184]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.util.Set r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 878
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fi5.c(java.util.Set, boolean):void");
    }

    public final void d() {
        synchronized (this.d) {
            try {
                e(this.k);
                o();
            } catch (Throwable th) {
                try {
                    if (!this.e.a.g()) {
                        j1c j1cVar = this.u;
                        try {
                            j1cVar.i(this.e, this.v.y());
                            j1cVar.c();
                            j1cVar.b();
                        } catch (Throwable th2) {
                            j1cVar.b();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    a();
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.lr4 r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fi5.e(lr4):void");
    }

    public final void f() {
        synchronized (this.d) {
            try {
                lr4 lr4Var = this.l;
                lr4Var.getClass();
                if (!lr4Var.l.I0()) {
                    e(this.l);
                }
            } catch (Throwable th) {
                try {
                    if (!this.e.a.g()) {
                        j1c j1cVar = this.u;
                        try {
                            j1cVar.i(this.e, this.v.y());
                            j1cVar.c();
                            j1cVar.b();
                        } catch (Throwable th2) {
                            j1cVar.b();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    a();
                    throw th3;
                }
            }
        }
    }

    public final void g() {
        j1c j1cVar;
        synchronized (this.d) {
            try {
                this.v.v = null;
                if (!this.e.a.g()) {
                    j1cVar = this.u;
                    try {
                        j1cVar.i(this.e, this.v.y());
                        j1cVar.c();
                        j1cVar.b();
                    } finally {
                    }
                }
            } catch (Throwable th) {
                try {
                    if (!this.e.a.g()) {
                        j1cVar = this.u;
                        try {
                            j1cVar.i(this.e, this.v.y());
                            j1cVar.c();
                            j1cVar.b();
                        } finally {
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    a();
                    throw th2;
                }
            }
        }
    }

    public final void h() {
        long j;
        char c;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        int i2;
        long j4;
        char c2;
        long j5;
        long j6;
        int i3;
        boolean zG;
        int i4;
        int i5;
        see seeVar = this.j;
        long[] jArr3 = seeVar.a;
        int length = jArr3.length - 2;
        long j7 = 255;
        char c3 = 7;
        long j8 = -9187201950435737472L;
        int i6 = 8;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j9 = jArr3[i7];
                j3 = 128;
                if ((((~j9) << c3) & j9 & j8) != j8) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j9 & j7) < 128) {
                            j4 = j7;
                            int i10 = (i7 << 3) + i9;
                            Object obj = seeVar.b[i10];
                            Object obj2 = seeVar.c[i10];
                            c2 = c3;
                            boolean z = obj2 instanceof tee;
                            j5 = j8;
                            see seeVar2 = this.g;
                            if (z) {
                                tee teeVar = (tee) obj2;
                                Object[] objArr = teeVar.b;
                                long[] jArr4 = teeVar.a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    int i11 = i6;
                                    j6 = j9;
                                    int i12 = 0;
                                    while (true) {
                                        long j10 = jArr4[i12];
                                        jArr2 = jArr3;
                                        i = length;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                            int i14 = 0;
                                            while (i14 < i13) {
                                                if ((j10 & j4) < 128) {
                                                    i4 = i14;
                                                    int i15 = (i12 << 3) + i4;
                                                    i5 = i9;
                                                    if (!seeVar2.c((i37) objArr[i15])) {
                                                        teeVar.m(i15);
                                                    }
                                                } else {
                                                    i4 = i14;
                                                    i5 = i9;
                                                }
                                                j10 >>= i11;
                                                i14 = i4 + 1;
                                                i9 = i5;
                                            }
                                            i2 = i9;
                                            if (i13 != i11) {
                                                break;
                                            }
                                        } else {
                                            i2 = i9;
                                        }
                                        if (i12 == length2) {
                                            break;
                                        }
                                        i12++;
                                        jArr3 = jArr2;
                                        length = i;
                                        i9 = i2;
                                        i11 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i = length;
                                    i2 = i9;
                                    j6 = j9;
                                }
                                zG = teeVar.g();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                i2 = i9;
                                j6 = j9;
                                zG = !seeVar2.c((i37) obj2);
                            }
                            if (zG) {
                                seeVar.l(i10);
                            }
                            i3 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            i2 = i9;
                            j4 = j7;
                            c2 = c3;
                            j5 = j8;
                            j6 = j9;
                            i3 = i6;
                        }
                        j9 = j6 >> i3;
                        i9 = i2 + 1;
                        i6 = i3;
                        c3 = c2;
                        j7 = j4;
                        j8 = j5;
                        jArr3 = jArr2;
                        length = i;
                    }
                    jArr = jArr3;
                    int i16 = length;
                    j = j7;
                    c = c3;
                    j2 = j8;
                    if (i8 != i6) {
                        break;
                    } else {
                        length = i16;
                    }
                } else {
                    jArr = jArr3;
                    j = j7;
                    c = c3;
                    j2 = j8;
                }
                if (i7 == length) {
                    break;
                }
                i7++;
                c3 = c;
                j7 = j;
                j8 = j2;
                jArr3 = jArr;
                i6 = 8;
            }
        } else {
            j = 255;
            c = 7;
            j2 = -9187201950435737472L;
            j3 = 128;
        }
        tee teeVar2 = this.i;
        if (!teeVar2.h()) {
            return;
        }
        Object[] objArr2 = teeVar2.b;
        long[] jArr5 = teeVar2.a;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            long j11 = jArr5[i17];
            if ((((~j11) << c) & j11 & j2) != j2) {
                int i18 = 8 - ((~(i17 - length3)) >>> 31);
                for (int i19 = 0; i19 < i18; i19++) {
                    if ((j11 & j) < j3) {
                        int i20 = (i17 << 3) + i19;
                        if (((znh) objArr2[i20]).g == null) {
                            teeVar2.m(i20);
                        }
                    }
                    j11 >>= 8;
                }
                if (i18 != 8) {
                    return;
                }
            }
            if (i17 == length3) {
                return;
            } else {
                i17++;
            }
        }
    }

    public final boolean i() {
        boolean z;
        synchronized (this.d) {
            z = this.w == 1;
            if (z) {
                this.w = (byte) 0;
            }
        }
        return z;
    }

    public final void j(Function2 function2) {
        try {
            synchronized (this.d) {
                n();
                see seeVar = this.n;
                this.n = n6h.e();
                try {
                    vt9 vt9Var = this.v;
                    thj thjVar = this.p;
                    if (!vt9Var.e.l.I0()) {
                        mh5.a("Expected applyChanges() to have been called");
                    }
                    vt9Var.P = thjVar;
                    try {
                        vt9Var.n(seeVar, function2);
                    } finally {
                        vt9Var.P = null;
                    }
                } catch (Throwable th) {
                    this.n = seeVar;
                    throw th;
                }
            }
        } catch (Throwable th2) {
            try {
                if (!this.e.a.g()) {
                    j1c j1cVar = this.u;
                    try {
                        j1cVar.i(this.e, this.v.y());
                        j1cVar.c();
                        j1cVar.b();
                    } catch (Throwable th3) {
                        j1cVar.b();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                a();
                throw th4;
            }
        }
    }

    public final f8g k(boolean z, Function2 function2) {
        if (this.q != null) {
            bpg.b("A pausable composition is in progress");
        }
        f8g f8gVar = new f8g(this, this.a, this.v, this.e, function2, z, this.b, this.d);
        this.q = f8gVar;
        return f8gVar;
    }

    public final void l() {
        synchronized (this.d) {
            if (this.q != null) {
                bpg.b("Deactivate is not supported while pausable composition is in progress");
            }
            boolean z = this.f.b == 0;
            if (!z || !this.e.a.g()) {
                Trace.beginSection("Compose:deactivate");
                try {
                    j1c j1cVar = this.u;
                    try {
                        j1cVar.i(this.e, this.v.y());
                        if (!z) {
                            iqj iqjVar = this.f;
                            j1c j1cVar2 = this.u;
                            lqj lqjVarE = iqjVar.e();
                            try {
                                lqjVarE.m(lqjVarE.t, new fx0(j1cVar2, lqjVarE, (byte) 27));
                                lqjVarE.e(true);
                                this.b.n();
                                j1cVar.d();
                            } catch (Throwable th) {
                                lqjVarE.e(false);
                                throw th;
                            }
                        }
                        j1cVar.c();
                    } finally {
                        j1cVar.b();
                    }
                } finally {
                    Trace.endSection();
                }
            }
            this.g.a();
            this.j.a();
            this.n.a();
            this.k.l.G0();
            this.l.l.G0();
            vt9 vt9Var = this.v;
            vt9Var.E.clear();
            vt9Var.s.clear();
            vt9Var.e.l.G0();
            vt9Var.v = null;
            this.w = (byte) 1;
        }
    }

    public final void m() {
        synchronized (this.d) {
            if (this.v.F) {
                bpg.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
            }
            if (this.w != 3) {
                this.w = (byte) 3;
                this.x = scd.f;
                lr4 lr4Var = this.v.L;
                if (lr4Var != null) {
                    e(lr4Var);
                }
                boolean z = this.f.b == 0;
                if (!z || !this.e.a.g()) {
                    j1c j1cVar = this.u;
                    try {
                        j1cVar.i(this.e, this.v.y());
                        if (!z) {
                            iqj iqjVar = this.f;
                            j1c j1cVar2 = this.u;
                            lqj lqjVarE = iqjVar.e();
                            try {
                                lqjVarE.m(lqjVarE.t, new whf(j1cVar2, (byte) 16));
                                lqjVarE.G();
                                lqjVarE.e(true);
                                this.b.a();
                                this.b.n();
                                j1cVar.d();
                            } catch (Throwable th) {
                                lqjVarE.e(false);
                                throw th;
                            }
                        }
                        j1cVar.c();
                    } finally {
                        j1cVar.b();
                    }
                }
                this.m.a();
                vt9 vt9Var = this.v;
                vt9Var.getClass();
                Trace.beginSection("Compose:Composer.dispose");
                try {
                    vt9Var.b.u(vt9Var);
                    vt9Var.E.clear();
                    vt9Var.s.clear();
                    vt9Var.e.l.G0();
                    vt9Var.v = null;
                    vt9Var.a.a();
                    Trace.endSection();
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            }
        }
        this.a.v(this);
    }

    public final void n() throws pxb {
        Object obj = kfo.a;
        AtomicReference atomicReference = this.c;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                mh5.b("pending composition has not been applied");
                t3p.v();
                return;
            }
            if (andSet instanceof Set) {
                c((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                mh5.b("corrupt pendingModifications drain: " + atomicReference);
                t3p.v();
                return;
            }
            for (Set set : (Set[]) andSet) {
                c(set, true);
            }
        }
    }

    public final void o() throws pxb {
        AtomicReference atomicReference = this.c;
        Object andSet = atomicReference.getAndSet(null);
        if (Intrinsics.a(andSet, kfo.a)) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                c(set, false);
            }
            return;
        }
        if (andSet == null) {
            if (this.q == null) {
                mh5.a("calling recordModificationsOf and applyChanges concurrently is not supported");
            }
        } else {
            mh5.b("corrupt pendingModifications drain: " + atomicReference);
            t3p.v();
        }
    }

    public final void p() throws pxb {
        v08 v08Var = v08.a;
        AtomicReference atomicReference = this.c;
        Object andSet = atomicReference.getAndSet(v08Var);
        if (Intrinsics.a(andSet, kfo.a) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            mh5.b("corrupt pendingModifications drain: " + atomicReference);
            t3p.v();
            return;
        }
        for (Set set : (Set[]) andSet) {
            c(set, false);
        }
    }

    public final void q() {
        byte b = this.w;
        if (b != 0) {
            bpg.b(b != 1 ? b != 2 ? b != 3 ? "" : "The composition is disposed" : "A previous pausable composition for this composition was cancelled. This composition must be disposed." : "The composition should be activated before setting content.");
        }
        if (this.q == null) {
            return;
        }
        bpg.b("A pausable composition is in progress");
    }

    public final void r(ArrayList arrayList) {
        wee weeVar = this.e;
        vt9 vt9Var = this.v;
        if (arrayList.size() > 0) {
            ((uae) ((Pair) arrayList.get(0)).a).getClass();
            mh5.a("Check failed");
        }
        try {
            vt9Var.getClass();
            Trace.beginSection("Compose:insertMovableContent");
            try {
                try {
                    vt9Var.A(arrayList);
                    vt9Var.i();
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th) {
                vt9Var.a();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                if (!weeVar.a.g()) {
                    j1c j1cVar = this.u;
                    try {
                        j1cVar.i(weeVar, vt9Var.y());
                        j1cVar.c();
                        j1cVar.b();
                    } catch (Throwable th3) {
                        j1cVar.b();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                a();
                throw th4;
            }
        }
    }

    public final mjb s(znh znhVar, Object obj) {
        fi5 fi5Var;
        int i = znhVar.b;
        if ((i & 2) != 0) {
            znhVar.b = i | 4;
        }
        qt9 qt9Var = znhVar.c;
        if (qt9Var == null || !qt9Var.a()) {
            return mjb.a;
        }
        iqj iqjVar = this.f;
        iqjVar.getClass();
        qt9 qt9Var2 = znhVar.c;
        if (qt9Var2 != null && iqjVar.f(na2.e(qt9Var2))) {
            if (znhVar.d == null) {
                return mjb.a;
            }
            mjb mjbVarT = t(znhVar, qt9Var, obj);
            if (mjbVarT != mjb.a) {
                this.t.r0();
            }
            return mjbVarT;
        }
        synchronized (this.d) {
            fi5Var = this.r;
        }
        if (fi5Var != null) {
            vt9 vt9Var = fi5Var.v;
            if (vt9Var.F && vt9Var.c0(znhVar, obj)) {
                return mjb.d;
            }
        }
        return mjb.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c1 A[Catch: all -> 0x00e1, EDGE_INSN: B:73:0x00c1->B:57:0x00c1 BREAK  A[LOOP:0: B:43:0x0084->B:54:0x00ba], EDGE_INSN: B:74:0x00c1->B:57:0x00c1 BREAK  A[LOOP:0: B:43:0x0084->B:54:0x00ba], TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x000e, B:8:0x0016, B:10:0x001d, B:13:0x0026, B:15:0x0030, B:12:0x0021, B:21:0x0043, B:23:0x0049, B:28:0x0054, B:32:0x005a, B:33:0x0062, B:35:0x0068, B:36:0x006e, B:38:0x0074, B:40:0x0078, B:43:0x0084, B:45:0x0094, B:47:0x00a0, B:49:0x00a9, B:51:0x00b2, B:54:0x00ba, B:55:0x00bd, B:57:0x00c1), top: B:71:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.mjb t(defpackage.znh r20, defpackage.qt9 r21, java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fi5.t(znh, qt9, java.lang.Object):mjb");
    }

    public final void u(Object obj) {
        Object objG = this.g.g(obj);
        if (objG == null) {
            return;
        }
        boolean z = objG instanceof tee;
        see seeVar = this.m;
        if (!z) {
            znh znhVar = (znh) objG;
            if (znhVar.b(obj) != mjb.d || (obj instanceof i37)) {
                return;
            }
            n6h.c(seeVar, obj, znhVar);
            return;
        }
        tee teeVar = (tee) objG;
        Object[] objArr = teeVar.b;
        long[] jArr = teeVar.a;
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
                        znh znhVar2 = (znh) objArr[(i << 3) + i3];
                        if (znhVar2.b(obj) == mjb.d && !(obj instanceof i37)) {
                            n6h.c(seeVar, obj, znhVar2);
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

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean v(defpackage.kmi r15) {
        /*
            r14 = this;
            see r0 = r14.j
            see r14 = r14.g
            r1 = 0
            if (r15 == 0) goto L54
            tee r15 = r15.a
            java.lang.Object[] r2 = r15.b
            long[] r15 = r15.a
            int r3 = r15.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L70
            r4 = r1
        L13:
            r5 = r15[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L4f
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r1
        L2d:
            if (r9 >= r7) goto L4d
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L49
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r2[r10]
            boolean r11 = r14.c(r10)
            if (r11 != 0) goto L6e
            boolean r10 = r0.c(r10)
            if (r10 != 0) goto L6e
        L49:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L2d
        L4d:
            if (r7 != r8) goto L70
        L4f:
            if (r4 == r3) goto L70
            int r4 = r4 + 1
            goto L13
        L54:
            java.util.Iterator r15 = r15.iterator()
        L58:
            boolean r2 = r15.hasNext()
            if (r2 == 0) goto L70
            java.lang.Object r2 = r15.next()
            boolean r3 = r14.c(r2)
            if (r3 != 0) goto L6e
            boolean r2 = r0.c(r2)
            if (r2 == 0) goto L58
        L6e:
            r14 = 1
            return r14
        L70:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fi5.v(kmi):boolean");
    }

    public final boolean w() {
        boolean z;
        synchronized (this.d) {
            f8g f8gVar = this.q;
            z = false;
            if (f8gVar == null || (f8gVar.h.get() == h8g.e && f8gVar.i == joh.k())) {
                n();
                try {
                    see seeVar = this.n;
                    this.n = n6h.e();
                    try {
                        vt9 vt9Var = this.v;
                        thj thjVar = this.p;
                        erf erfVar = vt9Var.e.l;
                        if (!erfVar.I0()) {
                            mh5.a("Expected applyChanges() to have been called");
                        }
                        if (seeVar.e > 0 || !vt9Var.s.isEmpty()) {
                            vt9Var.P = thjVar;
                            try {
                                vt9Var.n(seeVar, null);
                                vt9Var.P = null;
                                z = !erfVar.I0();
                            } catch (Throwable th) {
                                vt9Var.P = null;
                                throw th;
                            }
                        }
                        if (!z) {
                            o();
                        }
                    } catch (Throwable th2) {
                        this.n = seeVar;
                        throw th2;
                    }
                } catch (Throwable th3) {
                    try {
                        if (!this.e.a.g()) {
                            j1c j1cVar = this.u;
                            try {
                                j1cVar.i(this.e, this.v.y());
                                j1cVar.c();
                                j1cVar.b();
                            } catch (Throwable th4) {
                                j1cVar.b();
                                throw th4;
                            }
                        }
                        throw th3;
                    } catch (Throwable th5) {
                        a();
                        throw th5;
                    }
                }
            } else {
                AtomicReference atomicReference = f8gVar.h;
                h8g h8gVar = h8g.f;
                h8g h8gVar2 = h8g.d;
                while (!atomicReference.compareAndSet(h8gVar, h8gVar2) && atomicReference.get() == h8gVar) {
                }
                f8gVar.l.a.a(9);
            }
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.Set[]] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object[]] */
    public final void x(kmi kmiVar) {
        kmi kmiVar2;
        while (true) {
            Object obj = this.c.get();
            if (obj == null || obj.equals(kfo.a)) {
                kmiVar2 = kmiVar;
            } else if (obj instanceof Set) {
                kmiVar2 = new Set[]{obj, kmiVar};
            } else {
                if (!(obj instanceof Object[])) {
                    j9h.r(this.c, "corrupt pendingModifications: ");
                    return;
                }
                Set[] setArr = (Set[]) obj;
                int length = setArr.length;
                ?? CopyOf = Arrays.copyOf(setArr, length + 1);
                CopyOf[length] = kmiVar;
                kmiVar2 = CopyOf;
            }
            AtomicReference atomicReference = this.c;
            while (!atomicReference.compareAndSet(obj, kmiVar2)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            if (obj == null) {
                synchronized (this.d) {
                    o();
                }
                return;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fi5.y(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.d
            monitor-enter(r0)
            r14.u(r15)     // Catch: java.lang.Throwable -> L60
            see r1 = r14.j     // Catch: java.lang.Throwable -> L60
            java.lang.Object r15 = r1.g(r15)     // Catch: java.lang.Throwable -> L60
            if (r15 == 0) goto L5e
            boolean r1 = r15 instanceof defpackage.tee     // Catch: java.lang.Throwable -> L60
            if (r1 == 0) goto L59
            tee r15 = (defpackage.tee) r15     // Catch: java.lang.Throwable -> L60
            java.lang.Object[] r1 = r15.b     // Catch: java.lang.Throwable -> L60
            long[] r15 = r15.a     // Catch: java.lang.Throwable -> L60
            int r2 = r15.length     // Catch: java.lang.Throwable -> L60
            int r2 = r2 + (-2)
            if (r2 < 0) goto L5e
            r3 = 0
            r4 = r3
        L1f:
            r5 = r15[r4]     // Catch: java.lang.Throwable -> L60
            long r7 = ~r5     // Catch: java.lang.Throwable -> L60
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L54
            int r7 = r4 - r2
            int r7 = ~r7     // Catch: java.lang.Throwable -> L60
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L39:
            if (r9 >= r7) goto L52
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4e
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]     // Catch: java.lang.Throwable -> L60
            i37 r10 = (defpackage.i37) r10     // Catch: java.lang.Throwable -> L60
            r14.u(r10)     // Catch: java.lang.Throwable -> L60
        L4e:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L39
        L52:
            if (r7 != r8) goto L5e
        L54:
            if (r4 == r2) goto L5e
            int r4 = r4 + 1
            goto L1f
        L59:
            i37 r15 = (defpackage.i37) r15     // Catch: java.lang.Throwable -> L60
            r14.u(r15)     // Catch: java.lang.Throwable -> L60
        L5e:
            monitor-exit(r0)
            return
        L60:
            r14 = move-exception
            monitor-exit(r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fi5.z(java.lang.Object):void");
    }
}
