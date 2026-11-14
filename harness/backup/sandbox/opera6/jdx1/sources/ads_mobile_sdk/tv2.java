package ads_mobile_sdk;

import android.net.Uri;
import android.os.SystemClock;
import defpackage.cek;
import defpackage.ld1;
import defpackage.mip;
import defpackage.sbl;
import defpackage.vkp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class tv2 {
    public final qr0 a;
    public final j42 b;
    public final mip c;
    public final nx5 d;
    public final vkp e;
    public final am3 f;
    public final ws g;
    public final ux2 h;
    public final ah3 i;

    public tv2(qr0 qr0Var, j42 j42Var, mip mipVar, nx5 nx5Var, vkp vkpVar, am3 am3Var, ws wsVar, ux2 ux2Var, ah3 ah3Var) {
        this.a = qr0Var;
        this.b = j42Var;
        this.c = mipVar;
        this.d = nx5Var;
        this.e = vkpVar;
        this.f = am3Var;
        this.g = wsVar;
        this.h = ux2Var;
        this.i = ah3Var;
    }

    public static void a(tv2 tv2Var, List list, a2 a2Var, xv xvVar, z2 z2Var, Boolean bool, int i) {
        if ((i & 8) != 0) {
            z2Var = null;
        }
        z2 z2Var2 = z2Var;
        if ((i & 16) != 0) {
            bool = Boolean.FALSE;
        }
        Boolean bool2 = bool;
        tv2Var.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tv2Var.a((Uri) it.next(), a2Var, xvVar, z2Var2, bool2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c5 A[Catch: all -> 0x00ec, TryCatch #9 {all -> 0x00ec, blocks: (B:44:0x00be, B:46:0x00c5, B:48:0x00cc, B:50:0x00d0, B:52:0x00d4, B:53:0x00d5, B:54:0x00da, B:55:0x00db, B:56:0x00e2, B:57:0x00e3, B:58:0x00ea, B:59:0x00eb), top: B:122:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00eb A[Catch: all -> 0x00ec, TRY_LEAVE, TryCatch #9 {all -> 0x00ec, blocks: (B:44:0x00be, B:46:0x00c5, B:48:0x00cc, B:50:0x00d0, B:52:0x00d4, B:53:0x00d5, B:54:0x00da, B:55:0x00db, B:56:0x00e2, B:57:0x00e3, B:58:0x00ea, B:59:0x00eb), top: B:122:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x013f A[Catch: all -> 0x0166, TryCatch #4 {all -> 0x0166, blocks: (B:84:0x0138, B:86:0x013f, B:88:0x0146, B:90:0x014a, B:92:0x014e, B:93:0x014f, B:94:0x0154, B:95:0x0155, B:96:0x015c, B:97:0x015d, B:98:0x0164, B:99:0x0165), top: B:113:0x0138 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0165 A[Catch: all -> 0x0166, TRY_LEAVE, TryCatch #4 {all -> 0x0166, blocks: (B:84:0x0138, B:86:0x013f, B:88:0x0146, B:90:0x014a, B:92:0x014e, B:93:0x014f, B:94:0x0154, B:95:0x0155, B:96:0x015c, B:97:0x015d, B:98:0x0164, B:99:0x0165), top: B:113:0x0138 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.hv0 r13, ads_mobile_sdk.z2 r14, nt5 r15) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.tv2.a(ads_mobile_sdk.hv0, ads_mobile_sdk.z2, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.z2 r9, java.lang.String r10, nt5 r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof ads_mobile_sdk.nv2
            if (r0 == 0) goto L13
            r0 = r11
            ads_mobile_sdk.nv2 r0 = (ads_mobile_sdk.nv2) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.nv2 r0 = new ads_mobile_sdk.nv2
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2c
            java.lang.String r10 = r0.b
            ads_mobile_sdk.tv2 r8 = r0.a
            defpackage.ybh.y(r11)     // Catch: java.lang.Exception -> L76 ksb -> L99
            goto L73
        L2c:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r8)
            r8 = 0
            return r8
        L33:
            defpackage.ybh.y(r11)
            if (r10 == 0) goto Lbc
            int r11 = r10.length()
            if (r11 == 0) goto Lbc
            pqb r11 = defpackage.y9m.c0(r10)     // Catch: java.lang.Exception -> L76 ksb -> L99
            prb r11 = r11.h()     // Catch: java.lang.Exception -> L76 ksb -> L99
            ads_mobile_sdk.o9 r11 = t0h.g(r11)     // Catch: java.lang.Exception -> L76 ksb -> L99
            qq r2 = new qq     // Catch: java.lang.Exception -> L76 ksb -> L99
            xog r5 = r11.c     // Catch: java.lang.Exception -> L76 ksb -> L99
            long r6 = r11.b     // Catch: java.lang.Exception -> L76 ksb -> L99
            java.lang.String r11 = r11.d     // Catch: java.lang.Exception -> L76 ksb -> L99
            r2.<init>(r5, r6, r11)     // Catch: java.lang.Exception -> L76 ksb -> L99
            r0.a = r8     // Catch: java.lang.Exception -> L76 ksb -> L99
            r0.b = r10     // Catch: java.lang.Exception -> L76 ksb -> L99
            r0.e = r4     // Catch: java.lang.Exception -> L76 ksb -> L99
            java.util.concurrent.atomic.AtomicBoolean r11 = r9.e     // Catch: java.lang.Exception -> L76 ksb -> L99
            boolean r11 = r11.getAndSet(r4)     // Catch: java.lang.Exception -> L76 ksb -> L99
            if (r11 == 0) goto L66
            kotlin.Unit r8 = kotlin.Unit.a     // Catch: java.lang.Exception -> L76 ksb -> L99
            goto L70
        L66:
            kotlin.Unit r9 = r9.a(r2, r0)     // Catch: java.lang.Exception -> L76 ksb -> L99
            if (r9 != r1) goto L6e
            r8 = r9
            goto L70
        L6e:
            kotlin.Unit r8 = kotlin.Unit.a     // Catch: java.lang.Exception -> L76 ksb -> L99
        L70:
            if (r8 != r1) goto L73
            return r1
        L73:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        L76:
            r9 = move-exception
            ads_mobile_sdk.ev0 r11 = new ads_mobile_sdk.ev0
            java.lang.String r0 = "Failed while emitting ad paid event for "
            java.lang.String r1 = sko.j(r0, r10)
            r11.<init>(r1)
            ads_mobile_sdk.xh3.a(r11, r3)
            ads_mobile_sdk.ah3 r8 = r8.i
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r0)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r8.a(r10, r9)
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        L99:
            r9 = move-exception
            ads_mobile_sdk.ev0 r11 = new ads_mobile_sdk.ev0
            java.lang.String r0 = "Failed to parse ad event value from JSON: "
            java.lang.String r1 = sko.j(r0, r10)
            r11.<init>(r1)
            ads_mobile_sdk.xh3.a(r11, r3)
            ads_mobile_sdk.ah3 r8 = r8.i
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r0)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r8.a(r10, r9)
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        Lbc:
            ads_mobile_sdk.ev0 r8 = new ads_mobile_sdk.ev0
            java.lang.String r9 = "AdEventValueString is null or empty"
            r8.<init>(r9)
            ads_mobile_sdk.xh3.a(r8, r3)
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.tv2.a(ads_mobile_sdk.z2, java.lang.String, nt5):java.lang.Object");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final java.lang.Object a(android.net.Uri r22, ads_mobile_sdk.u22 r23, int r24, long r25, java.lang.String r27, java.util.Map r28, ads_mobile_sdk.z2 r29, ads_mobile_sdk.a2 r30, java.lang.Boolean r31, nt5 r32) {
        /*
            Method dump skipped, instructions count: 605
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.tv2.a(android.net.Uri, ads_mobile_sdk.u22, int, long, java.lang.String, java.util.Map, ads_mobile_sdk.z2, ads_mobile_sdk.a2, java.lang.Boolean, nt5):java.lang.Object");
    }

    public final String a(Uri uri, int i) {
        if (!((Boolean) this.a.a("gads:include_ping_attempts:enabled", Boolean.TRUE, fo.a)).booleanValue()) {
            return uri.toString();
        }
        String encodedQuery = uri.getEncodedQuery();
        return uri.buildUpon().clearQuery().appendQueryParameter("pa", String.valueOf(i)).build() + "&" + encodedQuery;
    }

    public final void a(Uri uri, a2 a2Var, xv xvVar, z2 z2Var, Boolean bool) {
        qr0 qr0Var = this.a;
        qr0Var.getClass();
        Boolean bool2 = Boolean.TRUE;
        fo foVar = fo.a;
        boolean zBooleanValue = ((Boolean) qr0Var.a("gads:use_retry_strategy:enabled", bool2, foVar)).booleanValue();
        nx5 nx5Var = this.d;
        mt5 mt5Var = null;
        if (zBooleanValue && a2Var.w0 != null) {
            defpackage.na2.B(nx5Var, null, null, new ld1(this, uri, a2Var, xvVar, z2Var, bool, null, (byte) 7), 3);
            return;
        }
        if (z2Var != null && Intrinsics.a(bool, bool2) && ((Boolean) qr0Var.a("gads:ad_events_for_scar:enabled", bool2, foVar)).booleanValue() && a2Var.A0) {
            defpackage.na2.B(nx5Var, null, null, new sbl(this, uri, z2Var, mt5Var, (byte) 18), 3);
            return;
        }
        Map mapA = this.g.a(uri);
        am3 am3Var = this.f;
        am3Var.getClass();
        am3Var.e.b(new Pair(uri, mapA));
    }

    public final void a(Uri uri, u22 u22Var, int i, long j, String str, Map map, z2 z2Var, a2 a2Var, Boolean bool) {
        mt5 mt5Var = null;
        if (i < u22Var.a) {
            defpackage.na2.B(this.d, null, null, new sv2(i, j, uri, a2Var, z2Var, u22Var, this, bool, str, map, null), 3);
            return;
        }
        if (u22Var.c) {
            this.c.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            String strA = a(uri, i + 1);
            b42 b42Var = b42.a;
            c42 c42Var = new c42(jElapsedRealtime, str, strA);
            j42 j42Var = this.b;
            j42Var.getClass();
            defpackage.na2.B(j42Var.a, null, null, new k54(j42Var, new cek((Object) j42Var, (Object) c42Var, mt5Var, (byte) 15), (mt5) null), 3);
        }
    }

    public final void a(List list) {
        ArrayList arrayList = new ArrayList(k95.o(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            arrayList.add(new Pair(uri, this.g.a(uri)));
        }
        am3 am3Var = this.f;
        am3Var.getClass();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Pair pair = (Pair) obj;
            am3Var.e.b(new Pair((Uri) pair.a, (Map) pair.b));
        }
    }
}
