package defpackage;

import android.content.Context;
import com.opera.android.webaiassistant.db.HistoryDatabase;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class tz1 {
    public final l32 a;
    public final kul b;
    public final ru9 c;
    public final bw3 d;
    public final nx5 e;
    public final jg8 f;
    public final qca g;
    public final ode h = new ode();

    public tz1(Context context, umi umiVar, HistoryDatabase historyDatabase, l32 l32Var, kul kulVar, ru9 ru9Var, bw3 bw3Var, k51 k51Var, nx5 nx5Var, jg8 jg8Var) {
        this.a = l32Var;
        this.b = kulVar;
        this.c = ru9Var;
        this.d = bw3Var;
        this.e = nx5Var;
        this.f = jg8Var;
        this.g = historyDatabase.x();
        lz1 lz1Var = new lz1(this);
        sz1 sz1Var = new sz1(this);
        na2.B(nx5Var, (CoroutineContext) null, (rx5) null, new hz1(this, context, umiVar, (mt5) null, (byte) 0), 3);
        kulVar.e.b(lz1Var);
        l32Var.e.b(sz1Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cc, code lost:
    
        if (r9 != r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(nt5 r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.kz1
            if (r0 == 0) goto L13
            r0 = r10
            kz1 r0 = (defpackage.kz1) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            kz1 r0 = new kz1
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 5
            r4 = 0
            r5 = 3
            r6 = 2
            ode r7 = r9.h
            r8 = 1
            if (r2 == 0) goto L40
            if (r2 == r8) goto L3c
            if (r2 == r6) goto L38
            if (r2 != r5) goto L32
            ybh.y(r10)
            goto Lcf
        L32:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r9)
            return r4
        L38:
            ybh.y(r10)
            goto L67
        L3c:
            ybh.y(r10)
            goto L51
        L40:
            ybh.y(r10)
            java.lang.Object r10 = r7.g()
            if (r10 != 0) goto L51
            r0.v = r8
            java.lang.Object r10 = xf8.v(r7, r0)
            if (r10 == r1) goto Lce
        L51:
            r0.v = r6
            qca r10 = r9.g
            y5i r10 = r10.a
            q9a r2 = new q9a
            r2.<init>(r3)
            r6 = 0
            java.lang.Object r10 = kfo.a0(r0, r10, r6, r8, r2)
            if (r10 == r1) goto L65
            kotlin.Unit r10 = kotlin.Unit.a
        L65:
            if (r10 == r1) goto Lce
        L67:
            r0.v = r5
            bhi r10 = new bhi
            mt5 r0 = hib.b(r0)
            r10.<init>(r0)
            ig r0 = new ig
            r0.<init>(r10, r3)
            l32 r9 = r9.a
            umi r2 = r9.a
            rml r3 = new rml
            kotlin.Unit r5 = kotlin.Unit.a
            r3.<init>(r5, r2)
            b32 r2 = new b32
            r2.<init>(r9, r8)
            plk r2 = r3.a(r2)
            t02 r3 = new t02
            r5 = 6
            r3.<init>(r0, r5)
            plk r0 = r2.t(r3)
            r0.l()
            java.util.LinkedHashMap r9 = r9.b
            java.util.Set r0 = r9.entrySet()
            java.util.Iterator r0 = r0.iterator()
        La2:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lc3
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getValue()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r2 = r2.get()
            d32 r2 = (defpackage.d32) r2
            if (r2 == 0) goto La2
            e32 r2 = r2.a
            r2.a = r4
            r2.b = r4
            goto La2
        Lc3:
            r9.clear()
            java.lang.Object r9 = r10.a()
            px5 r10 = px5.a
            if (r9 != r1) goto Lcf
        Lce:
            return r1
        Lcf:
            l08 r9 = l08.a
            r7.r(r9)
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tz1.a(nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r6, nt5 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.mz1
            if (r0 == 0) goto L13
            r0 = r7
            mz1 r0 = (defpackage.mz1) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            mz1 r0 = new mz1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            java.lang.String r6 = r0.t
            ybh.y(r7)
            goto L4e
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r5)
            r5 = 0
            return r5
        L30:
            ybh.y(r7)
            r0.t = r6
            r0.w = r3
            qca r7 = r5.g
            y5i r7 = r7.a
            tx0 r2 = new tx0
            r4 = 17
            r2.<init>(r6, r4)
            r4 = 0
            java.lang.Object r7 = kfo.a0(r0, r7, r4, r3, r2)
            if (r7 == r1) goto L4b
            kotlin.Unit r7 = kotlin.Unit.a
        L4b:
            if (r7 != r1) goto L4e
            return r1
        L4e:
            l32 r7 = r5.a
            umi r0 = r7.a
            rml r1 = new rml
            kotlin.Unit r2 = kotlin.Unit.a
            r1.<init>(r2, r0)
            q3 r0 = new q3
            r4 = 21
            r0.<init>(r7, r6, r4)
            plk r0 = r1.a(r0)
            r0.l()
            java.util.LinkedHashMap r7 = r7.b
            java.lang.Object r0 = r7.get(r6)
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            if (r0 == 0) goto L7f
            java.lang.Object r0 = r0.get()
            d32 r0 = (defpackage.d32) r0
            if (r0 != 0) goto L7d
            r7.remove(r6)
            goto L7f
        L7d:
            r0.c = r3
        L7f:
            r62 r7 = new r62
            wx r0 = new wx
            r1 = 5
            r0.<init>(r6, r5, r1)
            ode r5 = r5.h
            r7.<init>(r5, r0, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tz1.b(java.lang.String, nt5):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b1 A[LOOP:1: B:24:0x00ab->B:26:0x00b1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(nt5 r15) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tz1.c(nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bb, code lost:
    
        if (r12.x(r14, r13, r11.g, r0) != r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(android.content.Context r12, defpackage.umi r13, nt5 r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.qz1
            if (r0 == 0) goto L13
            r0 = r14
            qz1 r0 = (defpackage.qz1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            qz1 r0 = new qz1
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.v
            px5 r1 = px5.a
            int r2 = r0.x
            r3 = 0
            java.lang.String r4 = "ai.bottomsheet.migration"
            ru9 r5 = r11.c
            r6 = 2
            r7 = 1
            r8 = 0
            if (r2 == 0) goto L3f
            if (r2 == r7) goto L37
            if (r2 != r6) goto L31
            ybh.y(r14)
            goto Lbe
        L31:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r11)
            return r8
        L37:
            rii r12 = r0.u
            a12 r13 = r0.t
            ybh.y(r14)
            goto L87
        L3f:
            ybh.y(r14)
            android.content.SharedPreferences r14 = r5.a
            int r14 = r14.getInt(r4, r3)
            if (r14 < r7) goto L4d
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        L4d:
            a12 r14 = new a12
            r14.<init>(r12, r13)
            rii r2 = new rii
            r9 = 21
            r2.<init>(r14, r9)
            boolean r9 = r2.j()
            if (r9 == 0) goto La4
            qb7 r9 = new qb7
            vk6 r10 = new vk6
            r10.<init>(r12, r13)
            wth r12 = new wth
            r13 = 10
            r12.<init>(r14, r13)
            r9.<init>(r10, r12)
            java.lang.Object r12 = r9.c
            kze r12 = (defpackage.kze) r12
            rz1 r13 = new rz1
            r13.<init>(r6, r8, r3)
            r0.t = r14
            r0.u = r2
            r0.x = r7
            java.lang.Object r12 = xf8.w(r12, r13, r0)
            if (r12 == r1) goto Lbd
            r13 = r14
            r12 = r2
        L87:
            java.lang.Object r12 = r12.b
            a12 r12 = (defpackage.a12) r12
            b59 r12 = r12.b
            java.lang.Object r12 = r12.get()
            android.content.SharedPreferences r12 = (android.content.SharedPreferences) r12
            android.content.SharedPreferences$Editor r12 = r12.edit()
            java.lang.String r14 = "ofa-migration-version"
            java.lang.String r2 = java.lang.String.valueOf(r3)
            r12.putString(r14, r2)
            r12.apply()
            r14 = r13
        La4:
            ole r12 = new ole
            jg8 r13 = r11.f
            r12.<init>(r13)
            l32 r13 = r11.a
            k32 r13 = r13.d
            r0.t = r8
            r0.u = r8
            r0.x = r6
            qca r11 = r11.g
            java.lang.Object r11 = r12.x(r14, r13, r11, r0)
            if (r11 != r1) goto Lbe
        Lbd:
            return r1
        Lbe:
            nv6 r11 = r5.b()
            java.lang.Object r12 = r11.a
            android.content.SharedPreferences$Editor r12 = (android.content.SharedPreferences.Editor) r12
            r12.putInt(r4, r7)
            r11.w()
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tz1.d(android.content.Context, umi, nt5):java.lang.Object");
    }
}
