package ads_mobile_sdk;

import android.os.SystemClock;
import defpackage.cs5;
import defpackage.fjd;
import defpackage.ijp;
import defpackage.jn4;
import defpackage.luo;
import defpackage.mip;
import defpackage.prb;
import defpackage.t3;
import defpackage.w1h;
import defpackage.wdp;
import kotlin.coroutines.h;

/* loaded from: classes.dex */
public abstract class sr extends ijp implements wdp {
    public final mip c;
    public final nx5 d;
    public final ux2 e;
    public final qr0 f;
    public final g0 g;
    public final pfe h = new pfe();
    public lr i;
    public mr j;
    public d3k k;

    public sr(mip mipVar, nx5 nx5Var, ux2 ux2Var, qr0 qr0Var, g0 g0Var) {
        this.c = mipVar;
        this.d = nx5Var;
        this.e = ux2Var;
        this.f = qr0Var;
        this.g = g0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01d1 A[Catch: all -> 0x01d2, TRY_LEAVE, TryCatch #11 {all -> 0x01d2, blocks: (B:86:0x01a4, B:88:0x01ab, B:90:0x01b2, B:92:0x01b6, B:94:0x01ba, B:95:0x01bb, B:96:0x01c0, B:97:0x01c1, B:98:0x01c8, B:99:0x01c9, B:100:0x01d0, B:101:0x01d1), top: B:199:0x01a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0223 A[Catch: all -> 0x02c4, TryCatch #2 {all -> 0x02c4, blocks: (B:112:0x0201, B:114:0x0212, B:116:0x0218, B:118:0x0220, B:119:0x0223, B:121:0x0227, B:123:0x022d, B:124:0x0230), top: B:187:0x0201, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0230 A[Catch: all -> 0x02c4, TRY_LEAVE, TryCatch #2 {all -> 0x02c4, blocks: (B:112:0x0201, B:114:0x0212, B:116:0x0218, B:118:0x0220, B:119:0x0223, B:121:0x0227, B:123:0x022d, B:124:0x0230), top: B:187:0x0201, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x025e A[Catch: Exception -> 0x029f, all -> 0x02c9, TryCatch #5 {all -> 0x02c9, blocks: (B:125:0x0238, B:126:0x025a, B:128:0x025e, B:129:0x0268, B:131:0x026c, B:144:0x0299, B:145:0x029e, B:156:0x02c5, B:157:0x02c8, B:112:0x0201, B:114:0x0212, B:116:0x0218, B:118:0x0220, B:119:0x0223, B:121:0x0227, B:123:0x022d, B:124:0x0230), top: B:187:0x0201, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0268 A[Catch: Exception -> 0x029f, all -> 0x02c9, TryCatch #5 {all -> 0x02c9, blocks: (B:125:0x0238, B:126:0x025a, B:128:0x025e, B:129:0x0268, B:131:0x026c, B:144:0x0299, B:145:0x029e, B:156:0x02c5, B:157:0x02c8, B:112:0x0201, B:114:0x0212, B:116:0x0218, B:118:0x0220, B:119:0x0223, B:121:0x0227, B:123:0x022d, B:124:0x0230), top: B:187:0x0201, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02b7 A[Catch: all -> 0x028f, TRY_LEAVE, TryCatch #9 {all -> 0x028f, blocks: (B:15:0x003a, B:135:0x0288, B:149:0x02b3, B:151:0x02b7, B:148:0x02a1), top: B:195:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02d4 A[Catch: all -> 0x02fb, TryCatch #15 {all -> 0x02fb, blocks: (B:162:0x02cd, B:164:0x02d4, B:166:0x02db, B:168:0x02df, B:170:0x02e3, B:171:0x02e4, B:172:0x02e9, B:173:0x02ea, B:174:0x02f1, B:175:0x02f2, B:176:0x02f9, B:177:0x02fa), top: B:204:0x02cd }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02fa A[Catch: all -> 0x02fb, TRY_LEAVE, TryCatch #15 {all -> 0x02fb, blocks: (B:162:0x02cd, B:164:0x02d4, B:166:0x02db, B:168:0x02df, B:170:0x02e3, B:171:0x02e4, B:172:0x02e9, B:173:0x02ea, B:174:0x02f1, B:175:0x02f2, B:176:0x02f9, B:177:0x02fa), top: B:204:0x02cd }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fb A[Catch: all -> 0x019b, TryCatch #14 {all -> 0x019b, blocks: (B:38:0x00d9, B:40:0x00ea, B:42:0x00f0, B:44:0x00f8, B:45:0x00fb, B:47:0x00ff, B:49:0x0105, B:50:0x0108), top: B:184:0x00d9, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0108 A[Catch: all -> 0x019b, TRY_LEAVE, TryCatch #14 {all -> 0x019b, blocks: (B:38:0x00d9, B:40:0x00ea, B:42:0x00f0, B:44:0x00f8, B:45:0x00fb, B:47:0x00ff, B:49:0x0105, B:50:0x0108), top: B:184:0x00d9, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0136 A[Catch: Exception -> 0x0175, all -> 0x01a0, TryCatch #0 {all -> 0x01a0, blocks: (B:51:0x0110, B:52:0x0132, B:54:0x0136, B:55:0x0140, B:57:0x0144, B:69:0x016f, B:70:0x0174, B:80:0x019c, B:81:0x019f, B:38:0x00d9, B:40:0x00ea, B:42:0x00f0, B:44:0x00f8, B:45:0x00fb, B:47:0x00ff, B:49:0x0105, B:50:0x0108), top: B:184:0x00d9, inners: #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0140 A[Catch: Exception -> 0x0175, all -> 0x01a0, TryCatch #0 {all -> 0x01a0, blocks: (B:51:0x0110, B:52:0x0132, B:54:0x0136, B:55:0x0140, B:57:0x0144, B:69:0x016f, B:70:0x0174, B:80:0x019c, B:81:0x019f, B:38:0x00d9, B:40:0x00ea, B:42:0x00f0, B:44:0x00f8, B:45:0x00fb, B:47:0x00ff, B:49:0x0105, B:50:0x0108), top: B:184:0x00d9, inners: #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018d A[Catch: all -> 0x0165, TRY_LEAVE, TryCatch #4 {all -> 0x0165, blocks: (B:25:0x0067, B:60:0x015e, B:74:0x0189, B:76:0x018d, B:73:0x0177), top: B:190:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ab A[Catch: all -> 0x01d2, TryCatch #11 {all -> 0x01d2, blocks: (B:86:0x01a4, B:88:0x01ab, B:90:0x01b2, B:92:0x01b6, B:94:0x01ba, B:95:0x01bb, B:96:0x01c0, B:97:0x01c1, B:98:0x01c8, B:99:0x01c9, B:100:0x01d0, B:101:0x01d1), top: B:199:0x01a4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.sr r16, nt5 r17) {
        /*
            Method dump skipped, instructions count: 771
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.sr.a(ads_mobile_sdk.sr, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(ads_mobile_sdk.sr r13, nt5 r14) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.sr.b(ads_mobile_sdk.sr, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object c(ads_mobile_sdk.sr r4, nt5 r5) {
        /*
            boolean r0 = r5 instanceof ads_mobile_sdk.rr
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.rr r0 = (ads_mobile_sdk.rr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ads_mobile_sdk.rr r0 = new ads_mobile_sdk.rr
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            px5 r1 = px5.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            defpackage.ybh.y(r5)
            goto L42
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.ybh.y(r5)
            fjd r5 = r4.c()
            boolean r5 = r5.e
            if (r5 == 0) goto L42
            r0.c = r3
            java.lang.Object r4 = r4.k(r0)
            if (r4 != r1) goto L42
            return r1
        L42:
            ads_mobile_sdk.hv0 r4 = new ads_mobile_sdk.hv0
            kotlin.Unit r5 = kotlin.Unit.a
            r4.<init>(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.sr.c(ads_mobile_sdk.sr, nt5):java.lang.Object");
    }

    public final dw0 a(lr lrVar, mr mrVar) {
        if (lrVar != null) {
            if (!lrVar.a()) {
                return dw0.CACHED;
            }
            if (lrVar.a() && c().d) {
                return dw0.STALE;
            }
        }
        return mrVar != null ? dw0.UPDATING : dw0.EXPIRED;
    }

    public final mr b() {
        jn4 jn4Var = new jn4(this, null);
        i07 i07VarG = defpackage.na2.g(this.d, h.a, null, new defpackage.wc2(jn4Var, null, (byte) 5), 2);
        pn7.b.getClass();
        return new mr(i07VarG, this.c, pn7.c);
    }

    public final fjd c() throws Exception {
        lw0 lw0VarMo15a = mo15a();
        qr0 qr0Var = this.f;
        qr0Var.getClass();
        prb prbVar = qr0.G;
        fo foVar = fo.a$13;
        prb prbVar2 = (prb) qr0Var.a("gads:caching_signal_source_ttls_ms", prbVar, foVar);
        on7 on7Var = pn7.b;
        long jC = w1h.c(prbVar2, prbVar, lw0VarMo15a, ((pn7) qr0Var.a("gads:default_signal_ttl", u0h.b(30, un7.e), fo.a$18)).a);
        prb prbVar3 = qr0.D;
        boolean zF = w1h.f((prb) qr0Var.a("gads:caching_signal_source_automatic_refreshes", prbVar3, foVar), prbVar3, lw0VarMo15a);
        prb prbVar4 = qr0.F;
        long jC2 = w1h.c((prb) qr0Var.a("gads:caching_signal_source_refresh_buffers_ms", prbVar4, foVar), prbVar4, lw0VarMo15a, cs5.x0(0, un7.d));
        prb prbVar5 = qr0.E;
        boolean zF2 = w1h.f((prb) qr0Var.a("gads:caching_signal_source_stale_results_enabled", prbVar5, foVar), prbVar5, lw0VarMo15a);
        prb prbVar6 = qr0.H;
        boolean zF3 = w1h.f((prb) qr0Var.a("gads:caching_signal_source_initialization_enabled", prbVar6, foVar), prbVar6, lw0VarMo15a);
        prb prbVar7 = qr0.I;
        boolean zF4 = w1h.f((prb) qr0Var.a("gads:caching_signal_source_background_refresh_enabled", prbVar7, foVar), prbVar7, lw0VarMo15a);
        fjd fjdVar = new fjd();
        fjdVar.a = jC;
        fjdVar.b = zF;
        fjdVar.c = jC2;
        fjdVar.d = zF2;
        fjdVar.e = zF3;
        fjdVar.f = zF4;
        return fjdVar;
    }

    @Override // defpackage.wdp
    public final Object c(mt5 mt5Var) {
        return a(this, (nt5) mt5Var);
    }

    public final e43 d() {
        luo luoVarO = e43.o();
        boolean z = c().b;
        luoVarO.b$1();
        ((e43) luoVarO.b).automaticRefresh_ = z;
        boolean z2 = c().d;
        luoVarO.b$1();
        ((e43) luoVarO.b).staleResultAllowed_ = z2;
        return (e43) luoVarO.a();
    }

    public final void g() {
        long jL;
        if ((!this.g.c() || c().f) && c().b && this.k == null) {
            lr lrVar = this.i;
            if (lrVar != null) {
                long j = lrVar.b;
                on7 on7Var = pn7.b;
                this.c.getClass();
                jL = pn7.l(j, cs5.y0(SystemClock.elapsedRealtime(), un7.d));
            } else {
                jL = c().a;
            }
            this.k = defpackage.na2.B(this.d, null, null, new t3((byte) 6, pn7.l(jL, c().c), (mt5) null, (Object) this), 3);
        }
    }

    @Override // ads_mobile_sdk.k61
    public Object h(mt5 mt5Var) {
        return c(this, (nt5) mt5Var);
    }

    public Object k(mt5 mt5Var) {
        return b(this, (nt5) mt5Var);
    }
}
