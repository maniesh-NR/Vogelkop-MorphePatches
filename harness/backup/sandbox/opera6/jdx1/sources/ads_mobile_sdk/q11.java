package ads_mobile_sdk;

import android.net.Uri;
import defpackage.cs5;
import defpackage.eyo;
import defpackage.vkp;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import okhttp3.internal._UtilJvmKt;

/* loaded from: classes.dex */
public final class q11 implements vkp {
    public final qr0 a;
    public final eyo b;
    public final nx5 c;
    public final s9e d;
    public ws e;
    public d91 f;
    public final pfe g = new pfe();
    public volatile t9f h;
    public t9f i;

    public q11(qr0 qr0Var, qw qwVar, eyo eyoVar, nx5 nx5Var) {
        this.a = qr0Var;
        this.b = eyoVar;
        this.c = nx5Var;
        this.d = qwVar.d;
    }

    @Override // defpackage.vkp
    public final Object a(int i, long j, m5 m5Var) {
        long jX0;
        s9f s9fVar = new s9f();
        s9fVar.a = new sa7(this.d);
        qr0 qr0Var = this.a;
        if (qr0Var != null) {
            jX0 = ((pn7) qr0Var.a("gads:http_url_connection_factory:timeout_millis", new pn7(qr0.z), fo.a$18)).a;
        } else {
            on7 on7Var = pn7.b;
            jX0 = cs5.x0(20, un7.e);
        }
        s9fVar.x = _UtilJvmKt.checkDuration("timeout", pn7.f(jX0), TimeUnit.MILLISECONDS);
        s9fVar.b = new fm5(i, j, TimeUnit.MINUTES);
        this.i = new t9f(s9fVar);
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.h21 r7, java.util.Map r8, mt5 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof ads_mobile_sdk.c11
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.c11 r0 = (ads_mobile_sdk.c11) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            ads_mobile_sdk.c11 r0 = new ads_mobile_sdk.c11
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.e
            px5 r1 = px5.a
            int r2 = r0.g
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L32
            java.lang.String r6 = r0.d
            ads_mobile_sdk.g21 r7 = r0.c
            java.util.Map r8 = r0.b
            java.util.Map r0 = r0.a
            defpackage.ybh.y(r9)
            r3 = r8
            r8 = r0
            goto L6e
        L32:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r3
        L38:
            defpackage.ybh.y(r9)
            ads_mobile_sdk.ws r9 = r6.e
            if (r9 == 0) goto L4d
            java.net.URL r2 = r7.a
            java.lang.String r2 = r2.toString()
            android.net.Uri r2 = android.net.Uri.parse(r2)
            java.util.Map r3 = r9.a(r2)
        L4d:
            r7.getClass()
            ads_mobile_sdk.g21 r9 = new ads_mobile_sdk.g21
            r9.<init>(r7)
            r0.a = r8
            r0.b = r3
            r0.c = r9
            java.lang.String r7 = "User-Agent"
            r0.d = r7
            r0.g = r4
            eyo r6 = r6.b
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L6a
            return r1
        L6a:
            r5 = r9
            r9 = r6
            r6 = r7
            r7 = r5
        L6e:
            java.lang.String r9 = (java.lang.String) r9
            r7.a(r6, r9)
            if (r8 == 0) goto L99
            java.util.Set r6 = r8.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L7d:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L99
            java.lang.Object r8 = r6.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r9 = r8.getKey()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r8.getValue()
            java.lang.String r8 = (java.lang.String) r8
            r7.a(r9, r8)
            goto L7d
        L99:
            if (r3 == 0) goto Lbf
            java.util.Set r6 = r3.entrySet()
            java.util.Iterator r6 = r6.iterator()
        La3:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto Lbf
            java.lang.Object r8 = r6.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r9 = r8.getKey()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r8.getValue()
            java.lang.String r8 = (java.lang.String) r8
            r7.a(r9, r8)
            goto La3
        Lbf:
            ads_mobile_sdk.h21 r6 = r7.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.q11.a(ads_mobile_sdk.h21, java.util.Map, mt5):java.lang.Object");
    }

    @Override // defpackage.vkp
    public final Object a(h21 h21Var, pn7 pn7Var, w22 w22Var) {
        return vkp.c(this, h21Var, pn7Var, w22Var, 16);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // defpackage.vkp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.h21 r10, pn7 r11, java.util.Map r12, boolean r13, boolean r14, mt5 r15) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.q11.a(ads_mobile_sdk.h21, pn7, java.util.Map, boolean, boolean, mt5):java.lang.Object");
    }

    @Override // defpackage.vkp
    public final Object a(hf1 hf1Var) {
        long jX0;
        s9f s9fVar = new s9f();
        s9fVar.a = new sa7(this.d);
        qr0 qr0Var = this.a;
        if (qr0Var != null) {
            jX0 = ((pn7) qr0Var.a("gads:http_url_connection_factory:timeout_millis", new pn7(qr0.z), fo.a$18)).a;
        } else {
            on7 on7Var = pn7.b;
            jX0 = cs5.x0(20, un7.e);
        }
        s9fVar.x = _UtilJvmKt.checkDuration("timeout", pn7.f(jX0), TimeUnit.MILLISECONDS);
        this.h = new t9f(s9fVar);
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bd, code lost:
    
        if (r7 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.vkp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r8, java.util.Map r9, mt5 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof ads_mobile_sdk.f11
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.f11 r0 = (ads_mobile_sdk.f11) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L1a
        L13:
            ads_mobile_sdk.f11 r0 = new ads_mobile_sdk.f11
            nt5 r10 = (nt5) r10
            r0.<init>(r7, r10)
        L1a:
            java.lang.Object r10 = r0.e
            px5 r1 = px5.a
            int r2 = r0.g
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L45
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2e
            defpackage.ybh.y(r10)
            goto Lc0
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r7)
            return r5
        L34:
            java.lang.String r7 = r0.d
            fvh r8 = r0.c
            fvh r9 = r0.b
            ads_mobile_sdk.q11 r2 = r0.a
            defpackage.ybh.y(r10)
            r6 = r8
            r8 = r7
            r7 = r2
            r2 = r10
            r10 = r6
            goto L8f
        L45:
            defpackage.ybh.y(r10)
            fvh r10 = new fvh
            r10.<init>()
            r10.h(r8)
            r10.c()
            if (r9 == 0) goto L79
            java.util.Set r8 = r9.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L5d:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L79
            java.lang.Object r9 = r8.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r2 = r9.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r9 = r9.getValue()
            java.lang.String r9 = (java.lang.String) r9
            r10.a(r2, r9)
            goto L5d
        L79:
            r0.a = r7
            r0.b = r10
            r0.c = r10
            java.lang.String r8 = "User-Agent"
            r0.d = r8
            r0.g = r4
            eyo r9 = r7.b
            java.lang.Object r9 = r9.a(r0)
            if (r9 == r1) goto Lbf
            r2 = r9
            r9 = r10
        L8f:
            java.lang.String r2 = (java.lang.String) r2
            r10.a(r8, r2)
            r9.getClass()
            kvh r8 = new kvh
            r8.<init>(r9)
            java.util.UUID r9 = java.util.UUID.randomUUID()
            r0.a = r5
            r0.b = r5
            r0.c = r5
            r0.d = r5
            r0.g = r3
            r7.getClass()
            prb r8 = xih.a(r8)
            java.lang.String r10 = "onNetworkRequest"
            java.lang.Object r7 = r7.a(r10, r9, r8, r0)
            px5 r8 = px5.a
            if (r7 == r8) goto Lbd
            kotlin.Unit r7 = kotlin.Unit.a
        Lbd:
            if (r7 != r1) goto Lc0
        Lbf:
            return r1
        Lc0:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.q11.a(java.lang.String, java.util.Map, mt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r9, java.util.UUID r10, defpackage.prb r11, mt5 r12) {
        /*
            r8 = this;
            java.lang.String r0 = "GMA Debug CONTENT "
            boolean r1 = r12 instanceof ads_mobile_sdk.d11
            if (r1 == 0) goto L15
            r1 = r12
            ads_mobile_sdk.d11 r1 = (ads_mobile_sdk.d11) r1
            int r2 = r1.e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.e = r2
            goto L1a
        L15:
            ads_mobile_sdk.d11 r1 = new ads_mobile_sdk.d11
            r1.<init>(r8, r12)
        L1a:
            java.lang.Object r12 = r1.c
            px5 r2 = px5.a
            int r3 = r1.e
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L34
            if (r3 != r4) goto L2e
            pfe r8 = r1.b
            prb r9 = r1.a
            defpackage.ybh.y(r12)
            goto L7f
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r8)
            return r5
        L34:
            defpackage.ybh.y(r12)
            prb r12 = new prb
            r12.<init>()
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r6)
            java.lang.String r6 = "timestamp"
            r12.p(r3, r6)
            java.lang.String r3 = "event"
            r12.r(r3, r9)
            wpb r9 = new wpb
            r9.<init>()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = "network_request_"
            r3.<init>(r6)
            r3.append(r10)
            java.lang.String r10 = r3.toString()
            r9.p(r10)
            java.lang.String r10 = "components"
            r12.o(r10, r9)
            java.lang.String r9 = "params"
            r12.o(r9, r11)
            r1.a = r12
            pfe r8 = r8.g
            r1.b = r8
            r1.e = r4
            java.lang.Object r9 = r8.i(r1)
            if (r9 != r2) goto L7e
            return r2
        L7e:
            r9 = r12
        L7f:
            java.lang.String r10 = "GMA Debug BEGIN"
            r11 = 2
            ads_mobile_sdk.xu0.a(r10, r5, r11)     // Catch: java.lang.Throwable -> L9f
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9f
            r10.<init>(r0)     // Catch: java.lang.Throwable -> L9f
            r10.append(r9)     // Catch: java.lang.Throwable -> L9f
            java.lang.String r9 = r10.toString()     // Catch: java.lang.Throwable -> L9f
            ads_mobile_sdk.xu0.a(r9, r5, r11)     // Catch: java.lang.Throwable -> L9f
            java.lang.String r9 = "GMA Debug FINISH"
            ads_mobile_sdk.xu0.a(r9, r5, r11)     // Catch: java.lang.Throwable -> L9f
            kotlin.Unit r9 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L9f
            r8.l(r5)
            return r9
        L9f:
            r9 = move-exception
            r8.l(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.q11.a(java.lang.String, java.util.UUID, prb, mt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // defpackage.vkp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.net.URL r20, ads_mobile_sdk.in0 r21, mt5 r22) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.q11.a(java.net.URL, ads_mobile_sdk.in0, mt5):java.lang.Object");
    }

    @Override // defpackage.vkp
    public final Object a(URL url, Map map, boolean z, nt5 nt5Var) {
        URL url2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        if (arrayList.isEmpty()) {
            url2 = url;
        } else {
            Uri.Builder builderBuildUpon = Uri.parse(url.toString()).buildUpon();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Pair pair = (Pair) obj;
                builderBuildUpon.appendQueryParameter((String) pair.a, (String) pair.b);
            }
            url2 = new URL(builderBuildUpon.build().toString());
        }
        return a(new h21(url2, "GET", rbd.i(linkedHashMap), null, null, null), (pn7) null, map, false, z, (mt5) nt5Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // defpackage.vkp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.net.URL r10, mt5 r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof ads_mobile_sdk.j11
            if (r0 == 0) goto L14
            r0 = r11
            ads_mobile_sdk.j11 r0 = (ads_mobile_sdk.j11) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f = r1
        L12:
            r7 = r0
            goto L1c
        L14:
            ads_mobile_sdk.j11 r0 = new ads_mobile_sdk.j11
            nt5 r11 = (nt5) r11
            r0.<init>(r9, r11)
            goto L12
        L1c:
            java.lang.Object r11 = r7.d
            px5 r0 = px5.a
            int r1 = r7.f
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L3f
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2f
            defpackage.ybh.y(r11)
            return r11
        L2f:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r9)
            return r4
        L35:
            java.lang.String r9 = r7.c
            fvh r10 = r7.b
            ads_mobile_sdk.q11 r1 = r7.a
            defpackage.ybh.y(r11)
            goto L72
        L3f:
            defpackage.ybh.y(r11)
            fvh r11 = new fvh
            r11.<init>()
            java.lang.String r10 = r10.toString()
            rma r1 = new rma
            r5 = 4
            r1.<init>(r5)
            r1.o(r10, r4)
            hra r10 = r1.d()
            r11.a = r10
            eyo r10 = r9.b
            r7.a = r9
            r7.b = r11
            java.lang.String r1 = "User-Agent"
            r7.c = r1
            r7.f = r3
            java.lang.Object r10 = r10.a(r7)
            if (r10 == r0) goto L9e
            r8 = r1
            r1 = r9
            r9 = r8
            r8 = r11
            r11 = r10
            r10 = r8
        L72:
            java.lang.String r11 = (java.lang.String) r11
            r10.a(r9, r11)
            java.lang.String r9 = "HEAD"
            r10.e(r9, r4)
            r9 = r2
            kvh r2 = new kvh
            r2.<init>(r10)
            t9f r10 = r1.i
            if (r10 != 0) goto L8c
            t9f r10 = r1.h
            if (r10 != 0) goto L8c
            r3 = r4
            goto L8d
        L8c:
            r3 = r10
        L8d:
            r7.a = r4
            r7.b = r4
            r7.c = r4
            r7.f = r9
            r4 = 0
            r6 = 1
            r5 = 0
            java.lang.Object r9 = r1.a(r2, r3, r4, r5, r6, r7)
            if (r9 != r0) goto L9f
        L9e:
            return r0
        L9f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.q11.a(java.net.URL, mt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x02a5, code lost:
    
        if (r6.a(r0, r15, (mt5) r3) == r4) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x036d A[Catch: Exception -> 0x0395, TRY_LEAVE, TryCatch #1 {Exception -> 0x0395, blocks: (B:116:0x0367, B:118:0x036d), top: B:131:0x0367 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0367 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02c4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kvh r20, t9f r21, boolean r22, ads_mobile_sdk.h21 r23, boolean r24, mt5 r25) {
        /*
            Method dump skipped, instructions count: 926
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.q11.a(kvh, t9f, boolean, ads_mobile_sdk.h21, boolean, mt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e5, code lost:
    
        if (r0.a("onNetworkRequestError", r2, r3, r4) != r5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0141, code lost:
    
        if (r2.a("onNetworkResponseBody", r0, r3, r4) == r5) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(pzh r18, java.util.UUID r19, mt5 r20) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.q11.a(pzh, java.util.UUID, mt5):java.lang.Object");
    }

    @Override // defpackage.vkp
    public final void a(d91 d91Var) {
        this.f = d91Var;
    }

    @Override // defpackage.vkp
    public final void a(ws wsVar) {
        this.e = wsVar;
    }
}
