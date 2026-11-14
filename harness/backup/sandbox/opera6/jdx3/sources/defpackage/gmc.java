package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class gmc {
    public final j4c a;
    public final nx5 b;
    public final dx5 c;
    public final AtomicInteger d = new AtomicInteger(0);
    public final LinkedHashMap e = new LinkedHashMap();
    public final pfe f = new pfe();
    public final nak g;
    public final nak h;
    public final nak i;
    public final nak j;
    public final nak k;
    public final nak l;
    public final nak m;
    public final nak n;
    public final rlh o;
    public final rlh p;
    public final rlh q;
    public final rlh r;
    public final rlh s;
    public final rlh t;
    public final rlh u;
    public final rlh v;

    public gmc(j4c j4cVar, jg8 jg8Var, nx5 nx5Var) {
        this.a = j4cVar;
        this.b = nx5Var;
        this.c = jg8Var.K(1, (String) null);
        l08 l08Var = l08.a;
        nak nakVarF = z4o.f(l08Var);
        this.g = nakVarF;
        nak nakVarF2 = z4o.f((Object) null);
        this.h = nakVarF2;
        nak nakVarF3 = z4o.f(l08Var);
        this.i = nakVarF3;
        nak nakVarF4 = z4o.f(l08Var);
        this.j = nakVarF4;
        nak nakVarF5 = z4o.f(l08Var);
        this.k = nakVarF5;
        nak nakVarF6 = z4o.f(l08Var);
        this.l = nakVarF6;
        nak nakVarF7 = z4o.f(l08Var);
        this.m = nakVarF7;
        nak nakVarF8 = z4o.f((Object) null);
        this.n = nakVarF8;
        this.o = a26.j(nakVarF);
        this.p = a26.j(nakVarF2);
        this.q = a26.j(nakVarF3);
        this.r = a26.j(nakVarF4);
        this.s = a26.j(nakVarF5);
        this.t = a26.j(nakVarF6);
        this.u = a26.j(nakVarF7);
        this.v = a26.j(nakVarF8);
        na2.B(nx5Var, (CoroutineContext) null, (rx5) null, new agb((byte) 3, null, this), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        if (r7 != r1) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.jvm.functions.Function1 r8, mt5 r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.ylc
            if (r0 == 0) goto L13
            r0 = r9
            ylc r0 = (defpackage.ylc) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            ylc r0 = new ylc
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.u
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L3a
            if (r2 == r4) goto L36
            if (r2 == r3) goto L30
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r7)
            return r6
        L30:
            java.lang.Throwable r7 = r0.t
            ybh.y(r9)
            goto L6d
        L36:
            ybh.y(r9)
            goto L5d
        L3a:
            ybh.y(r9)     // Catch: java.lang.Throwable -> L60
            goto L55
        L3e:
            ybh.y(r9)
            java.util.concurrent.atomic.AtomicInteger r9 = r7.d
            r9.getAndIncrement()
            dx5 r9 = r7.c     // Catch: java.lang.Throwable -> L60
            wc2 r2 = new wc2     // Catch: java.lang.Throwable -> L60
            r2.<init>(r8, r6, r5)     // Catch: java.lang.Throwable -> L60
            r0.w = r5     // Catch: java.lang.Throwable -> L60
            java.lang.Object r8 = na2.Z(r9, r2, r0)     // Catch: java.lang.Throwable -> L60
            if (r8 == r1) goto L6b
        L55:
            r0.w = r4
            java.lang.Object r7 = r7.b(r0)
            if (r7 == r1) goto L6b
        L5d:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L60:
            r8 = move-exception
            r0.t = r8
            r0.w = r3
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r1) goto L6c
        L6b:
            return r1
        L6c:
            r7 = r8
        L6d:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gmc.a(kotlin.jvm.functions.Function1, mt5):java.lang.Object");
    }

    public final Object b(mt5 mt5Var) {
        if (this.d.decrementAndGet() != 0) {
            return Unit.a;
        }
        Object objZ = na2.Z(this.c, new fmc(this, null), mt5Var);
        px5 px5Var = px5.a;
        if (objZ != px5Var) {
            objZ = Unit.a;
        }
        return objZ == px5Var ? objZ : Unit.a;
    }

    public final Object c(long j, oi9 oi9Var, kuk kukVar) throws Throwable {
        Object objA = a(new amc(this, j, oi9Var, null), kukVar);
        return objA == px5.a ? objA : Unit.a;
    }

    public final void d(Function1 function1) {
        this.d.getAndIncrement();
        na2.B(this.b, (CoroutineContext) null, (rx5) null, new hz1(function1, this, (mt5) null, (byte) 16), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.ruc r7, nt5 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.cmc
            if (r0 == 0) goto L13
            r0 = r8
            cmc r0 = (defpackage.cmc) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            cmc r0 = new cmc
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2f
            if (r2 != r4) goto L28
            ybh.y(r8)
            goto L65
        L28:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r6)
            r6 = 0
            return r6
        L2f:
            ybh.y(r8)
            java.lang.String r8 = r7.k
            java.lang.String r2 = "in progress"
            boolean r8 = kotlin.jvm.internal.Intrinsics.a(r8, r2)
            if (r8 != 0) goto L49
            java.lang.String r8 = r7.k
            java.lang.String r2 = "not started"
            boolean r8 = kotlin.jvm.internal.Intrinsics.a(r8, r2)
            if (r8 != 0) goto L49
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L49:
            j4c r6 = r6.a
            java.lang.Object r6 = r6.get()
            wlc r6 = (defpackage.wlc) r6
            long r7 = r7.a
            r0.v = r4
            com.opera.android.live_score.data.db.LiveScoreDatabase_Impl r6 = r6.a
            x41 r2 = new x41
            r5 = 10
            r2.<init>(r7, r5)
            java.lang.Object r8 = kfo.a0(r0, r6, r4, r3, r2)
            if (r8 != r1) goto L65
            return r1
        L65:
            if (r8 == 0) goto L68
            r3 = r4
        L68:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gmc.e(ruc, nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
    
        if (kfo.a0(r0, r11.a, false, true, new defpackage.g8c((byte) 14)) != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.util.Map r10, nt5 r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.dmc
            if (r0 == 0) goto L13
            r0 = r11
            dmc r0 = (defpackage.dmc) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            dmc r0 = new dmc
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.v
            px5 r1 = px5.a
            int r2 = r0.x
            r3 = 0
            j4c r9 = r9.a
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L42
            if (r2 == r6) goto L3a
            if (r2 != r4) goto L34
            java.util.Iterator r10 = r0.u
            java.util.Map r2 = r0.t
            java.util.Map r2 = (java.util.Map) r2
            ybh.y(r11)
            goto L69
        L34:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r9)
            return r5
        L3a:
            java.util.Map r10 = r0.t
            java.util.Map r10 = (java.util.Map) r10
            ybh.y(r11)
            goto L61
        L42:
            ybh.y(r11)
            java.lang.Object r11 = r9.get()
            wlc r11 = (defpackage.wlc) r11
            r2 = r10
            java.util.Map r2 = (java.util.Map) r2
            r0.t = r2
            r0.x = r6
            com.opera.android.live_score.data.db.LiveScoreDatabase_Impl r11 = r11.a
            g8c r2 = new g8c
            r7 = 14
            r2.<init>(r7)
            java.lang.Object r11 = kfo.a0(r0, r11, r3, r6, r2)
            if (r11 == r1) goto La0
        L61:
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L69:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto La1
            java.lang.Object r11 = r10.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r11 = r11.getValue()
            java.util.List r11 = (java.util.List) r11
            r0.t = r5
            r0.u = r10
            r0.x = r4
            java.lang.Object r2 = r9.get()
            wlc r2 = (defpackage.wlc) r2
            r2.getClass()
            r11.getClass()
            com.opera.android.live_score.data.db.LiveScoreDatabase_Impl r7 = r2.a
            vlc r8 = new vlc
            r8.<init>(r2, r11, r6)
            java.lang.Object r11 = kfo.a0(r0, r7, r3, r6, r8)
            px5 r2 = px5.a
            if (r11 == r2) goto L9e
            kotlin.Unit r11 = kotlin.Unit.a
        L9e:
            if (r11 != r1) goto L69
        La0:
            return r1
        La1:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gmc.f(java.util.Map, nt5):java.lang.Object");
    }

    public final Object g(List list, kuk kukVar) throws Throwable {
        Object objA = a(new u11(this, list, (mt5) null, (byte) 18), kukVar);
        return objA == px5.a ? objA : Unit.a;
    }
}
