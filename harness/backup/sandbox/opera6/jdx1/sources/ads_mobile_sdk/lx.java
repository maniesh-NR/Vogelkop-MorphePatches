package ads_mobile_sdk;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import defpackage.aop;
import defpackage.fsg;
import defpackage.kap;
import defpackage.mip;
import defpackage.prb;
import defpackage.rap;
import defpackage.vkp;
import defpackage.wpb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.h;

/* loaded from: classes.dex */
public final class lx extends k61 implements aop {
    public final CoroutineContext c;
    public final nx5 d;
    public final Context e;
    public final i41 f;
    public final String g;
    public final bk1 h;
    public final dk i;
    public final sb j;
    public final ah3 k;
    public final mip l;
    public final qr0 m;
    public final ux2 n;
    public final vz o;
    public final vkp p;
    public final ax0 q;
    public final kap r;
    public final pfe s;
    public boolean t;
    public long u;
    public long v;

    public lx(CoroutineContext coroutineContext, nx5 nx5Var, Context context, i41 i41Var, String str, bk1 bk1Var, dk dkVar, sb sbVar, ah3 ah3Var, mip mipVar, qr0 qr0Var, ux2 ux2Var, vz vzVar, vkp vkpVar, ax0 ax0Var, kap kapVar) {
        super((fw0) null, 1);
        this.c = coroutineContext;
        this.d = nx5Var;
        this.e = context;
        this.f = i41Var;
        this.g = str;
        this.h = bk1Var;
        this.i = dkVar;
        this.j = sbVar;
        this.k = ah3Var;
        this.l = mipVar;
        this.m = qr0Var;
        this.n = ux2Var;
        this.o = vzVar;
        this.p = vkpVar;
        this.q = ax0Var;
        this.r = kapVar;
        this.s = new pfe();
        pn7.b.getClass();
        this.u = 0L;
        this.v = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ads_mobile_sdk.lx r8, nt5 r9) {
        /*
            ads_mobile_sdk.fo r0 = ads_mobile_sdk.fo.a$18
            r8.getClass()
            boolean r1 = r9 instanceof ads_mobile_sdk.jx
            if (r1 == 0) goto L18
            r1 = r9
            ads_mobile_sdk.jx r1 = (ads_mobile_sdk.jx) r1
            int r2 = r1.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.d = r2
            goto L1d
        L18:
            ads_mobile_sdk.jx r1 = new ads_mobile_sdk.jx
            r1.<init>(r8, r9)
        L1d:
            java.lang.Object r9 = r1.b
            px5 r2 = px5.a
            int r3 = r1.d
            r4 = 1
            if (r3 == 0) goto L35
            if (r3 != r4) goto L2e
            ads_mobile_sdk.lx r8 = r1.a
            defpackage.ybh.y(r9)
            goto L4f
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r8)
            r8 = 0
            return r8
        L35:
            defpackage.ybh.y(r9)
            boolean r9 = r8.t
            if (r9 == 0) goto L3f
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        L3f:
            ads_mobile_sdk.dk r9 = r8.i
            r1.a = r8
            r1.d = r4
            r9.getClass()
            java.lang.Object r9 = ads_mobile_sdk.dk.c(r9, r1)
            if (r9 != r2) goto L4f
            return r2
        L4f:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L5a
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        L5a:
            long r1 = r8.u
            ads_mobile_sdk.qr0 r9 = r8.m
            mip r3 = r8.l
            on7 r4 = pn7.b
            r4.getClass()
            r4 = 0
            boolean r1 = pn7.e(r1, r4)
            if (r1 != 0) goto L9d
            r3.getClass()
            long r1 = android.os.SystemClock.elapsedRealtime()
            un7 r6 = un7.d
            long r1 = defpackage.cs5.y0(r1, r6)
            long r6 = r8.u
            long r1 = pn7.l(r1, r6)
            r9.getClass()
            r6 = 5
            un7 r7 = un7.e
            pn7 r6 = u0h.b(r6, r7)
            java.lang.String r7 = "gads:fetch_app_settings_using_cld:throttle_interval_ms"
            java.lang.Object r6 = r9.a(r7, r6, r0)
            pn7 r6 = (pn7) r6
            long r6 = r6.a
            int r1 = pn7.c(r1, r6)
            if (r1 >= 0) goto L9d
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        L9d:
            long r1 = r8.v
            boolean r1 = pn7.e(r1, r4)
            if (r1 != 0) goto Ld5
            r3.getClass()
            long r1 = android.os.SystemClock.elapsedRealtime()
            un7 r3 = un7.d
            long r1 = defpackage.cs5.y0(r1, r3)
            long r3 = r8.v
            long r1 = pn7.l(r1, r3)
            r9.getClass()
            r8 = 2
            un7 r3 = un7.g
            pn7 r8 = u0h.b(r8, r3)
            java.lang.String r3 = "gads:fetch_app_settings_using_cld:refresh_interval_ms"
            java.lang.Object r8 = r9.a(r3, r8, r0)
            pn7 r8 = (pn7) r8
            long r8 = r8.a
            int r8 = pn7.c(r1, r8)
            if (r8 >= 0) goto Ld5
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        Ld5:
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.lx.a(ads_mobile_sdk.lx, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.lx r4, defpackage.r83 r5, nt5 r6) {
        /*
            boolean r0 = r6 instanceof ads_mobile_sdk.ex
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.ex r0 = (ads_mobile_sdk.ex) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ads_mobile_sdk.ex r0 = new ads_mobile_sdk.ex
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            px5 r1 = px5.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            defpackage.ybh.y(r6)
            goto L3e
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.ybh.y(r6)
            java.lang.String r5 = r5.m()
            r0.c = r3
            java.lang.Object r6 = r4.b(r5, r0)
            if (r6 != r1) goto L3e
            return r1
        L3e:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            r6.getClass()
            kotlin.Unit r4 = kotlin.Unit.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.lx.a(ads_mobile_sdk.lx, r83, nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007c, code lost:
    
        if (r3 >= 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b7, code lost:
    
        if (defpackage.nb6.q(r6, r1) == r2) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00b7 -> B:13:0x0035). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ads_mobile_sdk.lx r10, defpackage.zk5 r11, nt5 r12) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.lx.a(ads_mobile_sdk.lx, zk5, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ads_mobile_sdk.lx r16, boolean r17, java.lang.String r18, nt5 r19) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.lx.a(ads_mobile_sdk.lx, boolean, java.lang.String, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(ads_mobile_sdk.lx r5, nt5 r6) {
        /*
            boolean r0 = r6 instanceof ads_mobile_sdk.bx
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.bx r0 = (ads_mobile_sdk.bx) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.bx r0 = new ads_mobile_sdk.bx
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2e
            pfe r5 = r0.b
            ads_mobile_sdk.lx r0 = r0.a
            defpackage.ybh.y(r6)
            r6 = r5
            r5 = r0
            goto L46
        L2e:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r4
        L34:
            defpackage.ybh.y(r6)
            pfe r6 = r5.s
            r0.a = r5
            r0.b = r6
            r0.e = r3
            java.lang.Object r0 = r6.i(r0)
            if (r0 != r1) goto L46
            return r1
        L46:
            long r0 = r5.v     // Catch: java.lang.Throwable -> L6f
            on7 r2 = pn7.b     // Catch: java.lang.Throwable -> L6f
            r2.getClass()     // Catch: java.lang.Throwable -> L6f
            r2 = 0
            boolean r0 = pn7.e(r0, r2)     // Catch: java.lang.Throwable -> L6f
            if (r0 != 0) goto L66
            mip r0 = r5.l     // Catch: java.lang.Throwable -> L6f
            r0.getClass()     // Catch: java.lang.Throwable -> L6f
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L6f
            long r2 = r5.v     // Catch: java.lang.Throwable -> L6f
            long r2 = pn7.f(r2)     // Catch: java.lang.Throwable -> L6f
            long r2 = r0 - r2
        L66:
            java.lang.Long r5 = new java.lang.Long     // Catch: java.lang.Throwable -> L6f
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L6f
            r6.l(r4)
            return r5
        L6f:
            r5 = move-exception
            r6.l(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.lx.b(ads_mobile_sdk.lx, nt5):java.lang.Object");
    }

    @Override // defpackage.aop
    public final Object a(defpackage.r83 r83Var, mt5 mt5Var) {
        return a(this, r83Var, (nt5) mt5Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.zk5 r8, nt5 r9) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.lx.a(zk5, nt5):java.lang.Object");
    }

    public final rap a(prb prbVar) {
        pqb pqbVarU = prbVar.u(NotificationCompat.CATEGORY_STATUS);
        hgc hgcVar = prbVar.a;
        if (pqbVarU == null || pqbVarU.f() != 1) {
            return new ev0("Response status not OK - " + prbVar.u(NotificationCompat.CATEGORY_STATUS));
        }
        wpb wpbVarE = bw2.e(prbVar, "ad_unit_settings");
        if (wpbVarE != null) {
            prbVar.o("ad_unit_id_settings", wpbVarE);
        }
        if (!hgcVar.containsKey("common_settings")) {
            prbVar.o("common_settings", new prb());
        }
        prb prbVarW = prbVar.w("common_settings");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        prb prbVarW2 = prbVar.w("exp_param");
        wpb wpbVarE2 = prbVarW2 != null ? bw2.e(prbVarW2, "loeid") : null;
        if (wpbVarE2 != null) {
            ArrayList arrayList = wpbVarE2.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                linkedHashSet.add(((pqb) obj).n());
            }
        }
        if (!linkedHashSet.isEmpty()) {
            prbVarW.o("loeid", new m5a().j(CollectionsKt.k0(linkedHashSet)));
        }
        boolean zContainsKey = hgcVar.containsKey("cache_ttl_sec");
        qr0 qr0Var = this.m;
        if (!zContainsKey) {
            qr0Var.getClass();
            on7 on7Var = pn7.b;
            prbVar.p(Long.valueOf(pn7.p(((pn7) qr0Var.a("gads:default_cld_ttl_secs", u0h.b(3, un7.h), fo.a$21)).a, un7.e)), "cache_ttl_sec");
        }
        prb prbVarW3 = prbVar.w("initializer_settings");
        prb prbVarW4 = prbVarW3 != null ? prbVarW3.w("config") : null;
        if (prbVarW4 != null) {
            qr0Var.getClass();
            Iterator it = ((List) qr0Var.a("gads:ad_colony_adapters_name_list_for_cld", Arrays.asList("GADMediationAdapterAdColony", "GADMAdapterAdColony", "com.google.ads.mediation.adcolony.AdColonyMediationAdapter", "com.jirbo.adcolony.AdColonyAdapter"), fo.a$15)).iterator();
            while (it.hasNext()) {
                prb prbVarW5 = prbVarW4.w((String) it.next());
                wpb wpbVarV = prbVarW5 != null ? prbVarW5.v("data") : null;
                if (wpbVarV != null) {
                    wpb wpbVar = new wpb();
                    ArrayList arrayList2 = wpbVarV.a;
                    int size2 = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj2 = arrayList2.get(i2);
                        i2++;
                        prb prbVarH = ((pqb) obj2).h();
                        prb prbVarW6 = prbVarH.w("data");
                        if (prbVarW6 != null) {
                            hgc hgcVar2 = prbVarW6.a;
                            if (hgcVar2.containsKey("zone_id")) {
                                prbVarW6.o("zone_ids", prbVarW6.u("zone_id"));
                            }
                            if (hgcVar2.containsKey("zone_ids")) {
                                prbVarW6.o("zone_id", prbVarW6.u("zone_ids"));
                            }
                            if (hgcVar2.containsKey("zone_id") && hgcVar2.containsKey("zone_ids") && hgcVar2.containsKey("app_id")) {
                                wpbVar.o(prbVarH);
                            }
                        }
                    }
                    prbVarW5.o("data", wpbVar);
                }
            }
        }
        prb prbVar2 = new prb();
        prbVar2.q("isSuccessful", Boolean.TRUE);
        prbVar2.r("appSettingsJson", prbVar.toString());
        prbVar2.r("errorReason", "");
        return new hv0(prbVar2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009e, code lost:
    
        if (ads_mobile_sdk.dk.a(r11, r10, r7, r0) != r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a$1(kotlin.jvm.functions.Function1 r10, nt5 r11) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.lx.a$1(kotlin.jvm.functions.Function1, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r9, nt5 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof ads_mobile_sdk.kx
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.kx r0 = (ads_mobile_sdk.kx) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.kx r0 = new ads_mobile_sdk.kx
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            defpackage.ybh.y(r10)
            return r10
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r8)
            return r5
        L31:
            java.lang.String r9 = r0.b
            ads_mobile_sdk.lx r8 = r0.a
            defpackage.ybh.y(r10)
            goto L63
        L39:
            defpackage.ybh.y(r10)
            ads_mobile_sdk.qr0 r10 = r8.m
            r10.getClass()
            on7 r2 = pn7.b
            r2 = 60
            un7 r6 = un7.e
            pn7 r2 = u0h.b(r2, r6)
            ads_mobile_sdk.fo r6 = ads_mobile_sdk.fo.a$21
            java.lang.String r7 = "gads:cld_fetch_delay_on_cache_hit"
            java.lang.Object r10 = r10.a(r7, r2, r6)
            pn7 r10 = (pn7) r10
            long r6 = r10.a
            r0.a = r8
            r0.b = r9
            r0.e = r4
            java.lang.Object r10 = defpackage.nb6.q(r6, r0)
            if (r10 == r1) goto L77
        L63:
            r0.a = r5
            r0.b = r5
            r0.e = r3
            kotlin.coroutines.CoroutineContext r10 = r8.c
            dg6 r2 = new dg6
            r3 = 0
            r2.<init>(r8, r3, r9, r5)
            java.lang.Object r8 = defpackage.na2.Z(r10, r2, r0)
            if (r8 != r1) goto L78
        L77:
            return r1
        L78:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.lx.b(java.lang.String, nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
    
        if (r9 == r2) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.zk5 r8, nt5 r9) {
        /*
            r7 = this;
            java.lang.String r0 = "Failed to parse CLD response."
            boolean r1 = r9 instanceof ads_mobile_sdk.cx
            if (r1 == 0) goto L15
            r1 = r9
            ads_mobile_sdk.cx r1 = (ads_mobile_sdk.cx) r1
            int r2 = r1.e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.e = r2
            goto L1a
        L15:
            ads_mobile_sdk.cx r1 = new ads_mobile_sdk.cx
            r1.<init>(r7, r9)
        L1a:
            java.lang.Object r9 = r1.c
            px5 r2 = px5.a
            int r3 = r1.e
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L3d
            if (r3 == r6) goto L35
            if (r3 != r5) goto L2f
            ads_mobile_sdk.lx r7 = r1.a
            defpackage.ybh.y(r9)
            goto L6c
        L2f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r7)
            return r4
        L35:
            zk5 r8 = r1.b
            ads_mobile_sdk.lx r7 = r1.a
            defpackage.ybh.y(r9)
            goto L4c
        L3d:
            defpackage.ybh.y(r9)
            r1.a = r7
            r1.b = r8
            r1.e = r6
            java.lang.Object r9 = r7.a(r8, r1)
            if (r9 == r2) goto L6b
        L4c:
            rap r9 = (defpackage.rap) r9
            boolean r3 = r9 instanceof ads_mobile_sdk.av0
            if (r3 == 0) goto L55
            ads_mobile_sdk.av0 r9 = (ads_mobile_sdk.av0) r9
            return r9
        L55:
            ads_mobile_sdk.hv0 r9 = (ads_mobile_sdk.hv0) r9
            java.lang.Object r9 = r9.b
            ads_mobile_sdk.h21 r9 = (ads_mobile_sdk.h21) r9
            vkp r3 = r7.p
            r1.a = r7
            r1.b = r8
            r1.e = r5
            r8 = 30
            java.lang.Object r9 = defpackage.vkp.c(r3, r9, r4, r1, r8)
            if (r9 != r2) goto L6c
        L6b:
            return r2
        L6c:
            rap r9 = (defpackage.rap) r9
            boolean r8 = r9 instanceof ads_mobile_sdk.av0
            if (r8 == 0) goto L75
            ads_mobile_sdk.av0 r9 = (ads_mobile_sdk.av0) r9
            return r9
        L75:
            ads_mobile_sdk.hv0 r9 = (ads_mobile_sdk.hv0) r9
            java.lang.Object r8 = r9.b
            ads_mobile_sdk.j21 r8 = (ads_mobile_sdk.j21) r8
            ads_mobile_sdk.gv2 r8 = r8.d
            if (r8 == 0) goto L84
            java.lang.String r8 = ads_mobile_sdk.gv2.a(r8)
            goto L86
        L84:
            java.lang.String r8 = ""
        L86:
            m5a r9 = new m5a     // Catch: ksb -> La2
            r9.<init>()     // Catch: ksb -> La2
            java.lang.Class<prb> r1 = defpackage.prb.class
            java.lang.Object r8 = r9.b(r1, r8)     // Catch: ksb -> La2
            prb r8 = (defpackage.prb) r8     // Catch: ksb -> La2
            if (r8 != 0) goto L9d
            ads_mobile_sdk.ev0 r7 = new ads_mobile_sdk.ev0     // Catch: ksb -> La2
            ads_mobile_sdk.ae1 r8 = ads_mobile_sdk.ae1.a     // Catch: ksb -> La2
            r7.<init>(r0, r8)     // Catch: ksb -> La2
            return r7
        L9d:
            rap r7 = r7.a(r8)     // Catch: ksb -> La2
            return r7
        La2:
            ads_mobile_sdk.ev0 r7 = new ads_mobile_sdk.ev0
            ads_mobile_sdk.ae1 r8 = ads_mobile_sdk.ae1.a
            r7.<init>(r0, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.lx.b(zk5, nt5):java.lang.Object");
    }

    @Override // ads_mobile_sdk.k61
    public final Object h(mt5 mt5Var) {
        mt5 mt5Var2 = null;
        fx fxVar = new fx(this, mt5Var2, (byte) 1);
        defpackage.na2.B(this.d, h.a, null, new fsg(fxVar, mt5Var2, (byte) 3), 2);
        return new hv0(Unit.a);
    }
}
