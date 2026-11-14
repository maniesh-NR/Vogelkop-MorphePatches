package ads_mobile_sdk;

import android.content.Context;
import defpackage.fsg;
import defpackage.rnp;
import defpackage.xep;
import defpackage.zch;
import defpackage.zq;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.h;

/* loaded from: classes.dex */
public final class uo2 extends on2 {
    public static final /* synthetic */ xtb[] B = {zch.b(uo2.class, "refreshCallback", "getRefreshCallback()Lcom/google/android/libraries/ads/mobile/sdk/banner/BannerAdRefreshCallback;")};
    public zq A;
    public final Context m;
    public final CoroutineContext n;
    public final CoroutineContext o;
    public final ab0 p;
    public final vs2 q;
    public final kj0 r;
    public final defpackage.w13 s;
    public final e7 t;
    public final ji u;
    public final AtomicBoolean v;
    public final AtomicBoolean w;
    public vd1 x;
    public fv2 y;
    public d3k z;

    public uo2(Context context, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, nx5 nx5Var, nx5 nx5Var2, ab0 ab0Var, vs2 vs2Var, kj0 kj0Var, defpackage.w13 w13Var, kh3 kh3Var, qr0 qr0Var, ux2 ux2Var, String str, av2 av2Var, i41 i41Var, boolean z, j71 j71Var, gdj gdjVar) {
        super(nx5Var, nx5Var2, kh3Var, qr0Var, ux2Var, str, av2Var, w13Var, z, i41Var, j71Var, gdjVar);
        this.m = context;
        this.n = coroutineContext;
        this.o = coroutineContext2;
        this.p = ab0Var;
        this.q = vs2Var;
        this.r = kj0Var;
        this.s = w13Var;
        this.t = new e7((byte) 13, false);
        this.u = new ji((Object) null, (Object) null);
        this.v = new AtomicBoolean(false);
        this.w = new AtomicBoolean(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable a(ads_mobile_sdk.uo2 r7, nt5 r8) throws m2 {
        /*
            boolean r0 = r8 instanceof ads_mobile_sdk.ho2
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.ho2 r0 = (ads_mobile_sdk.ho2) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.ho2 r0 = new ads_mobile_sdk.ho2
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.b
            px5 r1 = px5.a
            int r2 = r0.d
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2e
            ads_mobile_sdk.uo2 r7 = r0.a
            defpackage.ybh.y(r8)     // Catch: java.lang.Exception -> L80
            goto L54
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r7)
            return r6
        L34:
            ads_mobile_sdk.uo2 r7 = r0.a
            defpackage.ybh.y(r8)     // Catch: java.lang.Exception -> L80
            goto L47
        L3a:
            defpackage.ybh.y(r8)
            r0.a = r7     // Catch: java.lang.Exception -> L80
            r0.d = r5     // Catch: java.lang.Exception -> L80
            java.lang.Object r8 = r7.b(r0)     // Catch: java.lang.Exception -> L80
            if (r8 == r1) goto L53
        L47:
            f99 r8 = (f99) r8     // Catch: java.lang.Exception -> L80
            r0.a = r7     // Catch: java.lang.Exception -> L80
            r0.d = r4     // Catch: java.lang.Exception -> L80
            java.lang.Object r8 = defpackage.cs5.E(r8, r0)     // Catch: java.lang.Exception -> L80
            if (r8 != r1) goto L54
        L53:
            return r1
        L54:
            kotlin.Pair r8 = (kotlin.Pair) r8     // Catch: java.lang.Exception -> L80
            java.lang.Object r0 = r8.a     // Catch: java.lang.Exception -> L80
            rap r0 = (defpackage.rap) r0     // Catch: java.lang.Exception -> L80
            boolean r1 = r0 instanceof ads_mobile_sdk.hv0     // Catch: java.lang.Exception -> L80
            if (r1 == 0) goto L76
            java.util.concurrent.atomic.AtomicBoolean r1 = r7.v     // Catch: java.lang.Exception -> L80
            ads_mobile_sdk.kj0 r2 = r7.r     // Catch: java.lang.Exception -> L80
            ads_mobile_sdk.av2 r7 = r7.g     // Catch: java.lang.Exception -> L80
            ads_mobile_sdk.hv0 r0 = (ads_mobile_sdk.hv0) r0     // Catch: java.lang.Exception -> L80
            java.lang.Object r0 = r0.b     // Catch: java.lang.Exception -> L80
            ads_mobile_sdk.td1 r0 = (ads_mobile_sdk.td1) r0     // Catch: java.lang.Exception -> L80
            ads_mobile_sdk.a2 r0 = r0.b()     // Catch: java.lang.Exception -> L80
            boolean r7 = r2.a(r7, r0)     // Catch: java.lang.Exception -> L80
            r1.set(r7)     // Catch: java.lang.Exception -> L80
            return r8
        L76:
            boolean r7 = r0 instanceof ads_mobile_sdk.av0     // Catch: java.lang.Exception -> L80
            if (r7 == 0) goto L7f
            ads_mobile_sdk.av0 r0 = (ads_mobile_sdk.av0) r0     // Catch: java.lang.Exception -> L80
            ads_mobile_sdk.xh3.a(r0, r3)     // Catch: java.lang.Exception -> L80
        L7f:
            return r8
        L80:
            r7 = move-exception
            ads_mobile_sdk.rg3 r8 = ads_mobile_sdk.hh3.a()
            ads_mobile_sdk.ub2 r0 = r8.e()
            r0.m = r3
            r8.a(r7)
            kotlin.Pair r8 = new kotlin.Pair
            ads_mobile_sdk.bv0 r0 = new ads_mobile_sdk.bv0
            r1 = 6
            r0.<init>(r7, r6, r6, r1)
            r8.<init>(r0, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.uo2.a(ads_mobile_sdk.uo2, nt5):java.io.Serializable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a7, code lost:
    
        if (r13.a(r12, r14, r0) != r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.uo2 r12, ads_mobile_sdk.td1 r13, nt5 r14) {
        /*
            boolean r0 = r14 instanceof ads_mobile_sdk.io2
            if (r0 == 0) goto L13
            r0 = r14
            ads_mobile_sdk.io2 r0 = (ads_mobile_sdk.io2) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.io2 r0 = new ads_mobile_sdk.io2
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 3
            r4 = 2
            r5 = 1
            r10 = 0
            if (r2 == 0) goto L46
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2f
            defpackage.ybh.y(r14)
            goto Laa
        L2f:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r12)
            r12 = 0
            return r12
        L36:
            ads_mobile_sdk.uo2 r12 = r0.a
            defpackage.ybh.y(r14)
            goto L9b
        L3c:
            ads_mobile_sdk.td1 r13 = r0.b
            ads_mobile_sdk.uo2 r12 = r0.a
            defpackage.ybh.y(r14)
        L43:
            r8 = r12
            r9 = r13
            goto L5b
        L46:
            defpackage.ybh.y(r14)
            d3k r14 = r12.z
            if (r14 != 0) goto L4e
            r14 = r10
        L4e:
            r0.a = r12
            r0.b = r13
            r0.e = r5
            java.lang.Object r14 = r14.Z(r0)
            if (r14 != r1) goto L43
            goto La9
        L5b:
            r8.x = r10
            ads_mobile_sdk.e7 r12 = r8.t
            java.util.concurrent.atomic.AtomicBoolean r13 = r8.v
            ads_mobile_sdk.kj0 r14 = r8.r
            ads_mobile_sdk.av2 r2 = r8.g
            ads_mobile_sdk.a2 r5 = r9.b()
            boolean r14 = r14.a(r2, r5)
            r13.set(r14)
            java.lang.Object r13 = r12.a
            if (r13 == 0) goto L7e
            java.lang.String r13 = "The backing field has not yet been initialized."
            java.lang.Object r13 = r12.a(r13)
            ads_mobile_sdk.td1 r13 = (ads_mobile_sdk.td1) r13
            r7 = r13
            goto L7f
        L7e:
            r7 = r10
        L7f:
            r12.a(r9)
            r0.a = r8
            r0.b = r10
            r0.e = r4
            kotlin.coroutines.CoroutineContext r12 = r8.n
            sto r6 = new sto
            r11 = 4
            r6.<init>(r7, r8, r9, r10, r11)
            java.lang.Object r12 = defpackage.na2.Z(r12, r6, r0)
            if (r12 == r1) goto L98
            kotlin.Unit r12 = kotlin.Unit.a
        L98:
            if (r12 == r1) goto La9
            r12 = r8
        L9b:
            ads_mobile_sdk.vs2 r13 = r12.q
            gdj r14 = r12.l
            r0.a = r10
            r0.e = r3
            java.lang.Object r12 = r13.a(r12, r14, r0)
            if (r12 != r1) goto Laa
        La9:
            return r1
        Laa:
            kotlin.Unit r12 = kotlin.Unit.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.uo2.a(ads_mobile_sdk.uo2, ads_mobile_sdk.td1, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.td1 r11, nt5 r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof ads_mobile_sdk.so2
            if (r0 == 0) goto L13
            r0 = r12
            ads_mobile_sdk.so2 r0 = (ads_mobile_sdk.so2) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.so2 r0 = new ads_mobile_sdk.so2
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.b
            px5 r1 = px5.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L2a
            ads_mobile_sdk.td1 r10 = r0.a
            defpackage.ybh.y(r12)
            goto La9
        L2a:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r10)
            r10 = 0
            return r10
        L31:
            defpackage.ybh.y(r12)
            ads_mobile_sdk.e7 r12 = r10.t
            java.lang.Object r2 = r12.a
            r8 = 0
            if (r2 == 0) goto L45
            java.lang.String r2 = "The backing field has not yet been initialized."
            java.lang.Object r12 = r12.a(r2)
            ads_mobile_sdk.td1 r12 = (ads_mobile_sdk.td1) r12
            r5 = r12
            goto L46
        L45:
            r5 = r8
        L46:
            ads_mobile_sdk.e7 r12 = r10.t
            r12.a(r11)
            if (r5 == 0) goto L8f
            ads_mobile_sdk.ve2 r12 = r5.c()
            java.util.concurrent.atomic.AtomicLong r12 = r12.a
            long r6 = r12.get()
            ads_mobile_sdk.e7 r12 = r10.t
            java.lang.String r2 = "The backing field has not yet been initialized."
            java.lang.Object r12 = r12.a(r2)
            ads_mobile_sdk.td1 r12 = (ads_mobile_sdk.td1) r12
            ads_mobile_sdk.ve2 r12 = r12.c()
            java.util.concurrent.atomic.AtomicLong r12 = r12.a
            r12.set(r6)
            ads_mobile_sdk.ph0 r12 = r5.j()
            monitor-enter(r12)
            bpd r2 = r12.g     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r12)
            ads_mobile_sdk.ph0 r12 = r5.j()
            r12.a(r8)
            ads_mobile_sdk.e7 r12 = r10.t
            java.lang.String r4 = "The backing field has not yet been initialized."
            java.lang.Object r12 = r12.a(r4)
            ads_mobile_sdk.td1 r12 = (ads_mobile_sdk.td1) r12
            ads_mobile_sdk.ph0 r12 = r12.j()
            r12.a(r2)
            goto L8f
        L8b:
            r0 = move-exception
            r10 = r0
            monitor-exit(r12)
            throw r10
        L8f:
            r0.a = r5
            r0.d = r3
            kotlin.coroutines.CoroutineContext r12 = r10.n
            sto r4 = new sto
            r9 = 4
            r6 = r10
            r7 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.Object r10 = defpackage.na2.Z(r12, r4, r0)
            if (r10 == r1) goto La5
            kotlin.Unit r10 = kotlin.Unit.a
        La5:
            if (r10 != r1) goto La8
            return r1
        La8:
            r10 = r5
        La9:
            if (r10 == 0) goto Lae
            r10.destroy()
        Lae:
            kotlin.Unit r10 = kotlin.Unit.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.uo2.a(ads_mobile_sdk.td1, nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x009f, code lost:
    
        if (defpackage.na2.Z(r0, r3, r6) == r7) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00be, code lost:
    
        if (defpackage.na2.Z(r9, r0, r6) == r7) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008a A[PHI: r1 r2
      0x008a: PHI (r1v8 rap) = (r1v7 rap), (r1v10 rap) binds: [B:27:0x0088, B:19:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x008a: PHI (r2v3 ads_mobile_sdk.uo2) = (r2v2 ads_mobile_sdk.uo2), (r2v5 ads_mobile_sdk.uo2) binds: [B:27:0x0088, B:19:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.rap r12, defpackage.xzh r13, nt5 r14) {
        /*
            r11 = this;
            boolean r1 = r14 instanceof ads_mobile_sdk.ko2
            if (r1 == 0) goto L14
            r1 = r14
            ads_mobile_sdk.ko2 r1 = (ads_mobile_sdk.ko2) r1
            int r4 = r1.e
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L14
            int r4 = r4 - r5
            r1.e = r4
        L12:
            r6 = r1
            goto L1a
        L14:
            ads_mobile_sdk.ko2 r1 = new ads_mobile_sdk.ko2
            r1.<init>(r11, r14)
            goto L12
        L1a:
            java.lang.Object r0 = r6.c
            px5 r7 = px5.a
            int r1 = r6.e
            r8 = 4
            r4 = 3
            r5 = 2
            r9 = 1
            r10 = 0
            if (r1 == 0) goto L4f
            if (r1 == r9) goto L47
            if (r1 == r5) goto L3f
            if (r1 == r4) goto L3b
            if (r1 != r8) goto L34
            defpackage.ybh.y(r0)
            goto Lc1
        L34:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r0)
            r0 = 0
            return r0
        L3b:
            defpackage.ybh.y(r0)
            goto La1
        L3f:
            rap r1 = r6.b
            ads_mobile_sdk.uo2 r2 = r6.a
            defpackage.ybh.y(r0)
            goto L8a
        L47:
            rap r1 = r6.b
            ads_mobile_sdk.uo2 r2 = r6.a
            defpackage.ybh.y(r0)
            goto L77
        L4f:
            defpackage.ybh.y(r0)
            boolean r0 = r12 instanceof ads_mobile_sdk.hv0
            if (r0 == 0) goto La4
            r0 = r12
            ads_mobile_sdk.hv0 r0 = (ads_mobile_sdk.hv0) r0
            java.lang.Object r0 = r0.b
            ads_mobile_sdk.td1 r0 = (ads_mobile_sdk.td1) r0
            ads_mobile_sdk.kh3 r1 = r0.a()
            ads_mobile_sdk.kh3 r8 = r11.c
            r8.a(r1)
            r6.a = r11
            r6.b = r12
            r6.e = r9
            r0.getClass()
            java.lang.Object r0 = ads_mobile_sdk.cc1.a(r0, r6)
            if (r0 == r7) goto Lc0
            r2 = r11
            r1 = r12
        L77:
            r0 = r1
            ads_mobile_sdk.hv0 r0 = (ads_mobile_sdk.hv0) r0
            java.lang.Object r0 = r0.b
            ads_mobile_sdk.td1 r0 = (ads_mobile_sdk.td1) r0
            r6.a = r2
            r6.b = r1
            r6.e = r5
            java.lang.Object r0 = r2.a(r0, r6)
            if (r0 == r7) goto Lc0
        L8a:
            nx5 r0 = r2.b
            kotlin.coroutines.CoroutineContext r0 = r0.l()
            eno r3 = new eno
            r3.<init>(r2, r1, r10, r5)
            r6.a = r10
            r6.b = r10
            r6.e = r4
            java.lang.Object r0 = defpackage.na2.Z(r0, r3, r6)
            if (r0 == r7) goto Lc0
        La1:
            kotlin.Unit r0 = kotlin.Unit.a
            return r0
        La4:
            boolean r0 = r12 instanceof ads_mobile_sdk.av0
            if (r0 == 0) goto Lc1
            nx5 r0 = r11.b
            kotlin.coroutines.CoroutineContext r9 = r0.l()
            ads_mobile_sdk.po2 r0 = new ads_mobile_sdk.po2
            r5 = 2
            r2 = r11
            r3 = r12
            r1 = r13
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r6.e = r8
            java.lang.Object r0 = defpackage.na2.Z(r9, r0, r6)
            if (r0 != r7) goto Lc1
        Lc0:
            return r7
        Lc1:
            kotlin.Unit r0 = kotlin.Unit.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.uo2.a(rap, xzh, nt5):java.lang.Object");
    }

    @Override // ads_mobile_sdk.on2
    public final Object a(rnp rnpVar, xm2 xm2Var) {
        return a(this, (td1) rnpVar, xm2Var);
    }

    @Override // ads_mobile_sdk.on2
    public final Object b(mt5 mt5Var) {
        byte b = 1;
        if (this.z == null) {
            mt5 mt5Var2 = null;
            co2 co2Var = new co2(this, mt5Var2, b);
            this.z = defpackage.na2.B(this.b, h.a, null, new fsg(co2Var, mt5Var2, (byte) 3), 2);
        }
        kh3 kh3Var = this.c;
        kh3Var.getClass();
        kh3Var.b = new ih1();
        kh3Var.c = new dt2();
        kh3Var.d = new s8();
        xep xepVar = (xep) this.p.get();
        defpackage.w13 w13Var = this.s;
        fc0 fc0Var = (fc0) a(xepVar, w13Var);
        fc0Var.n = Boolean.valueOf(this.w.getAndSet(true));
        ys2 ys2Var = new ys2();
        vs2 vs2Var = this.q;
        ys2Var.a = vs2Var;
        fc0Var.m = ys2Var;
        vs2Var.getClass();
        fc0Var.l = vs2Var;
        w13Var.getClass();
        fc0Var.o = w13Var;
        return ((qc1) fc0Var.a().G0.get()).a(mt5Var);
    }

    @Override // ads_mobile_sdk.on2
    public final Object c(nt5 nt5Var) {
        Object objA;
        return (this.x == null || (objA = this.q.a(this, this.l, nt5Var)) != px5.a) ? Unit.a : objA;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(nt5 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.do2
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.do2 r0 = (ads_mobile_sdk.do2) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.do2 r0 = new ads_mobile_sdk.do2
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.b
            px5 r1 = px5.a
            int r2 = r0.d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L2a
            ads_mobile_sdk.uo2 r5 = r0.a
            defpackage.ybh.y(r6)
            goto L43
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r3
        L30:
            defpackage.ybh.y(r6)
            d3k r6 = r5.z
            if (r6 != 0) goto L38
            r6 = r3
        L38:
            r0.a = r5
            r0.d = r4
            java.lang.Object r6 = r6.Z(r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            ads_mobile_sdk.fv2 r5 = r5.y
            if (r5 == 0) goto L48
            return r5
        L48:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.uo2.d(nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(nt5 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ads_mobile_sdk.jo2
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.jo2 r0 = (ads_mobile_sdk.jo2) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.jo2 r0 = new ads_mobile_sdk.jo2
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2e
            ads_mobile_sdk.kj0 r6 = r0.b
            ads_mobile_sdk.uo2 r0 = r0.a
            defpackage.ybh.y(r7)
            goto L68
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            r6 = 0
            return r6
        L35:
            ads_mobile_sdk.uo2 r6 = r0.a
            defpackage.ybh.y(r7)
            goto L48
        L3b:
            defpackage.ybh.y(r7)
            r0.a = r6
            r0.e = r4
            java.lang.Object r7 = r6.d(r0)
            if (r7 == r1) goto L63
        L48:
            ads_mobile_sdk.fv2 r7 = (ads_mobile_sdk.fv2) r7
            android.view.ViewParent r7 = r7.getParent()
            boolean r7 = r7 instanceof android.view.View
            if (r7 != 0) goto L55
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L55:
            ads_mobile_sdk.kj0 r7 = r6.r
            r0.a = r6
            r0.b = r7
            r0.e = r3
            java.lang.Object r0 = r6.d(r0)
            if (r0 != r1) goto L64
        L63:
            return r1
        L64:
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L68:
            android.view.View r7 = (android.view.View) r7
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.v
            boolean r0 = r0.get()
            boolean r6 = r6.a(r7, r0)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.uo2.e(nt5):java.lang.Object");
    }
}
