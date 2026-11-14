package defpackage;

import android.icu.text.TimeZoneFormat;
import android.net.Uri;
import java.util.TimeZone;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;

/* loaded from: classes.dex */
public final class ehj implements ufj {
    public static final long i;
    public static final esd j;
    public static final crb k;
    public final dx5 a;
    public final jg8 b;
    public final zyk c;
    public final zyk d;
    public final zyk e;
    public final zyk f = z4c.b(new gzh((byte) 28));
    public final zyk g = z4c.b(new gzh((byte) 29));
    public final zyk h;

    static {
        on7 on7Var = pn7.b;
        i = cs5.x0(30, un7.e);
        Regex regex = esd.e;
        j = wyh.x("application/json");
        k = phj.o(rpb.d, new bli((byte) 20));
    }

    public ehj(ii iiVar, t1 t1Var, t1 t1Var2, kw3 kw3Var, dx5 dx5Var, jg8 jg8Var) {
        this.a = dx5Var;
        this.b = jg8Var;
        this.c = z4c.b(new ry1(iiVar, (byte) 1));
        this.d = z4c.b(new j3i(t1Var, (byte) 26));
        this.e = z4c.b(new j3i(t1Var2, (byte) 27));
        this.h = z4c.b(new j3i(kw3Var, (byte) 28));
    }

    public static fvh h(ehj ehjVar, String str) {
        return ehjVar.g(str, null, (Uri) ehjVar.d.getValue(), new bli((byte) 18));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // defpackage.ufj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.i9c r9, long r10, esd r12, nt5 r13) {
        /*
            r8 = this;
            java.lang.String r0 = "Unexpected response: "
            boolean r1 = r13 instanceof defpackage.wgj
            if (r1 == 0) goto L15
            r1 = r13
            wgj r1 = (defpackage.wgj) r1
            int r2 = r1.v
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.v = r2
            goto L1a
        L15:
            wgj r1 = new wgj
            r1.<init>(r8, r13)
        L1a:
            java.lang.Object r13 = r1.t
            px5 r2 = px5.a
            int r3 = r1.v
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L34
            if (r3 != r5) goto L2e
            ybh.y(r13)
            t0i r13 = (t0i) r13
            java.lang.Object r8 = r13.a
            goto L6e
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r8)
            return r4
        L34:
            ybh.y(r13)
            java.lang.String r13 = "api/v2/files/upload_failure"
            fvh r13 = h(r8, r13)
            qvh r3 = rvh.Companion
            qpb r6 = rpb.d
            ogj r7 = new ogj
            java.lang.String r12 = r12.a
            r7.<init>(r12, r10)
            r6.getClass()
            ngj r10 = defpackage.ogj.Companion
            kotlinx.serialization.KSerializer r10 = r10.serializer()
            kotlinx.serialization.KSerializer r10 = (kotlinx.serialization.KSerializer) r10
            java.lang.String r10 = r6.b(r7, r10)
            r3.getClass()
            esd r11 = defpackage.ehj.j
            pvh r10 = qvh.b(r10, r11)
            java.lang.String r11 = "POST"
            r13.e(r11, r10)
            r1.v = r5
            java.lang.Object r8 = r8.i(r13, r9, r4, r1)
            if (r8 != r2) goto L6e
            return r2
        L6e:
            p0i r9 = t0i.b
            boolean r9 = r8 instanceof q0i
            if (r9 != 0) goto L9a
            sgj r8 = (defpackage.sgj) r8     // Catch: java.lang.Throwable -> L91
            int r9 = r8.a     // Catch: java.lang.Throwable -> L91
            r10 = 202(0xca, float:2.83E-43)
            if (r9 != r10) goto L7f
            kotlin.Unit r8 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L91
            return r8
        L7f:
            lv0 r9 = new lv0     // Catch: java.lang.Throwable -> L91
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L91
            r10.<init>(r0)     // Catch: java.lang.Throwable -> L91
            r10.append(r8)     // Catch: java.lang.Throwable -> L91
            java.lang.String r8 = r10.toString()     // Catch: java.lang.Throwable -> L91
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L91
            throw r9     // Catch: java.lang.Throwable -> L91
        L91:
            r8 = move-exception
            p0i r9 = t0i.b
            q0i r9 = new q0i
            r9.<init>(r8)
            return r9
        L9a:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ehj.a(i9c, long, esd, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ufj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r6, nt5 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.tgj
            if (r0 == 0) goto L13
            r0 = r7
            tgj r0 = (defpackage.tgj) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            tgj r0 = new tgj
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ybh.y(r7)
            t0i r7 = (t0i) r7
            java.lang.Object r6 = r7.a
            goto L5b
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r5)
            r5 = 0
            return r5
        L32:
            ybh.y(r7)
            zyk r7 = r5.e
            java.lang.Object r7 = r7.getValue()
            android.net.Uri r7 = (android.net.Uri) r7
            bli r2 = new bli
            r4 = 19
            r2.<init>(r4)
            java.lang.String r4 = "api/v1/chat_suggestions/for_client/ofa_chat/"
            fvh r6 = r5.g(r4, r6, r7, r2)
            r6.c()
            kvh r7 = new kvh
            r7.<init>(r6)
            r0.v = r3
            java.lang.Object r6 = r5.k(r7, r0)
            if (r6 != r1) goto L5b
            return r1
        L5b:
            p0i r7 = t0i.b
            boolean r7 = r6 instanceof q0i
            if (r7 != 0) goto L8e
            sgj r6 = (defpackage.sgj) r6     // Catch: java.lang.Throwable -> L86
            nfj r7 = new nfj     // Catch: java.lang.Throwable -> L86
            crb r0 = defpackage.ehj.k     // Catch: java.lang.Throwable -> L86
            java.lang.String r6 = r6.b     // Catch: java.lang.Throwable -> L86
            r0.getClass()     // Catch: java.lang.Throwable -> L86
            lfj r1 = defpackage.mfj.Companion     // Catch: java.lang.Throwable -> L86
            kotlinx.serialization.KSerializer r1 = r1.serializer()     // Catch: java.lang.Throwable -> L86
            kotlinx.serialization.KSerializer r1 = (kotlinx.serialization.KSerializer) r1     // Catch: java.lang.Throwable -> L86
            java.lang.Object r6 = r0.a(r6, r1)     // Catch: java.lang.Throwable -> L86
            mfj r6 = (defpackage.mfj) r6     // Catch: java.lang.Throwable -> L86
            zyk r5 = r5.h     // Catch: java.lang.Throwable -> L86
            java.lang.Object r5 = r5.getValue()     // Catch: java.lang.Throwable -> L86
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L86
            r7.<init>(r6, r5)     // Catch: java.lang.Throwable -> L86
            return r7
        L86:
            r5 = move-exception
            p0i r6 = t0i.b
            q0i r6 = new q0i
            r6.<init>(r5)
        L8e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ehj.b(java.lang.String, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ufj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.i9c r8, long r9, esd r11, nt5 r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof defpackage.vgj
            if (r0 == 0) goto L13
            r0 = r12
            vgj r0 = (defpackage.vgj) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            vgj r0 = new vgj
            r0.<init>(r7, r12)
        L18:
            java.lang.Object r12 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2c
            ybh.y(r12)
            t0i r12 = (t0i) r12
            java.lang.Object r7 = r12.a
            goto L6c
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r7)
            return r3
        L32:
            ybh.y(r12)
            java.lang.String r12 = "api/v2/files/upload"
            fvh r12 = h(r7, r12)
            qvh r2 = rvh.Companion
            qpb r5 = rpb.d
            ogj r6 = new ogj
            java.lang.String r11 = r11.a
            r6.<init>(r11, r9)
            r5.getClass()
            ngj r9 = defpackage.ogj.Companion
            kotlinx.serialization.KSerializer r9 = r9.serializer()
            kotlinx.serialization.KSerializer r9 = (kotlinx.serialization.KSerializer) r9
            java.lang.String r9 = r5.b(r6, r9)
            r2.getClass()
            esd r10 = defpackage.ehj.j
            pvh r9 = qvh.b(r9, r10)
            java.lang.String r10 = "POST"
            r12.e(r10, r9)
            r0.v = r4
            java.lang.Object r7 = r7.i(r12, r8, r3, r0)
            if (r7 != r1) goto L6c
            return r1
        L6c:
            p0i r8 = t0i.b
            boolean r8 = r7 instanceof q0i
            if (r8 != 0) goto L93
            sgj r7 = (defpackage.sgj) r7     // Catch: java.lang.Throwable -> L8a
            crb r8 = defpackage.ehj.k     // Catch: java.lang.Throwable -> L8a
            java.lang.String r7 = r7.b     // Catch: java.lang.Throwable -> L8a
            r8.getClass()     // Catch: java.lang.Throwable -> L8a
            afj r9 = defpackage.bfj.Companion     // Catch: java.lang.Throwable -> L8a
            kotlinx.serialization.KSerializer r9 = r9.serializer()     // Catch: java.lang.Throwable -> L8a
            kotlinx.serialization.KSerializer r9 = (kotlinx.serialization.KSerializer) r9     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r7 = r8.a(r7, r9)     // Catch: java.lang.Throwable -> L8a
            bfj r7 = (defpackage.bfj) r7     // Catch: java.lang.Throwable -> L8a
            return r7
        L8a:
            r7 = move-exception
            p0i r8 = t0i.b
            q0i r8 = new q0i
            r8.<init>(r7)
            return r8
        L93:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ehj.c(i9c, long, esd, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ufj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.i9c r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, nt5 r14) {
        /*
            r8 = this;
            boolean r0 = r14 instanceof defpackage.dhj
            if (r0 == 0) goto L13
            r0 = r14
            dhj r0 = (defpackage.dhj) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            dhj r0 = new dhj
            r0.<init>(r8, r14)
        L18:
            java.lang.Object r14 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2c
            ybh.y(r14)
            t0i r14 = (t0i) r14
            java.lang.Object r8 = r14.a
            goto L6f
        L2c:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r8)
            return r3
        L32:
            ybh.y(r14)
            java.lang.String r14 = "api/v2/webpage/content"
            fvh r14 = h(r8, r14)
            qvh r2 = rvh.Companion
            qpb r5 = rpb.d
            rgj r6 = new rgj
            igj r7 = new igj
            r7.<init>(r13)
            r6.<init>(r10, r11, r12, r7)
            r5.getClass()
            qgj r10 = defpackage.rgj.Companion
            kotlinx.serialization.KSerializer r10 = r10.serializer()
            kotlinx.serialization.KSerializer r10 = (kotlinx.serialization.KSerializer) r10
            java.lang.String r10 = r5.b(r6, r10)
            r2.getClass()
            esd r11 = defpackage.ehj.j
            pvh r10 = qvh.b(r10, r11)
            java.lang.String r11 = "POST"
            r14.e(r11, r10)
            r0.v = r4
            java.lang.Object r8 = r8.i(r14, r9, r3, r0)
            if (r8 != r1) goto L6f
            return r1
        L6f:
            p0i r9 = t0i.b
            boolean r9 = r8 instanceof q0i
            if (r9 != 0) goto L96
            sgj r8 = (defpackage.sgj) r8     // Catch: java.lang.Throwable -> L8d
            crb r9 = defpackage.ehj.k     // Catch: java.lang.Throwable -> L8d
            java.lang.String r8 = r8.b     // Catch: java.lang.Throwable -> L8d
            r9.getClass()     // Catch: java.lang.Throwable -> L8d
            ffj r10 = defpackage.gfj.Companion     // Catch: java.lang.Throwable -> L8d
            kotlinx.serialization.KSerializer r10 = r10.serializer()     // Catch: java.lang.Throwable -> L8d
            kotlinx.serialization.KSerializer r10 = (kotlinx.serialization.KSerializer) r10     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r8 = r9.a(r8, r10)     // Catch: java.lang.Throwable -> L8d
            gfj r8 = (defpackage.gfj) r8     // Catch: java.lang.Throwable -> L8d
            return r8
        L8d:
            r8 = move-exception
            p0i r9 = t0i.b
            q0i r9 = new q0i
            r9.<init>(r8)
            return r9
        L96:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ehj.d(i9c, java.lang.String, java.lang.String, java.lang.String, java.lang.String, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ufj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.i9c r6, java.lang.String r7, nt5 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.ugj
            if (r0 == 0) goto L13
            r0 = r8
            ugj r0 = (defpackage.ugj) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            ugj r0 = new ugj
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2c
            ybh.y(r8)
            t0i r8 = (t0i) r8
            java.lang.Object r5 = r8.a
            goto L53
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r5)
            return r3
        L32:
            ybh.y(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r2 = "api/v2/files/"
            r8.<init>(r2)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            fvh r7 = h(r5, r7)
            r7.c()
            r0.v = r4
            java.lang.Object r5 = r5.i(r7, r6, r3, r0)
            if (r5 != r1) goto L53
            return r1
        L53:
            p0i r6 = t0i.b
            boolean r6 = r5 instanceof q0i
            if (r6 != 0) goto L7a
            sgj r5 = (defpackage.sgj) r5     // Catch: java.lang.Throwable -> L71
            crb r6 = defpackage.ehj.k     // Catch: java.lang.Throwable -> L71
            java.lang.String r5 = r5.b     // Catch: java.lang.Throwable -> L71
            r6.getClass()     // Catch: java.lang.Throwable -> L71
            vej r7 = defpackage.wej.Companion     // Catch: java.lang.Throwable -> L71
            kotlinx.serialization.KSerializer r7 = r7.serializer()     // Catch: java.lang.Throwable -> L71
            kotlinx.serialization.KSerializer r7 = (kotlinx.serialization.KSerializer) r7     // Catch: java.lang.Throwable -> L71
            java.lang.Object r5 = r6.a(r5, r7)     // Catch: java.lang.Throwable -> L71
            wej r5 = (defpackage.wej) r5     // Catch: java.lang.Throwable -> L71
            return r5
        L71:
            r5 = move-exception
            p0i r6 = t0i.b
            q0i r6 = new q0i
            r6.<init>(r5)
            return r6
        L7a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ehj.e(i9c, java.lang.String, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.i9c r6, nt5 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.xgj
            if (r0 == 0) goto L13
            r0 = r7
            xgj r0 = (defpackage.xgj) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            xgj r0 = new xgj
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            ybh.y(r7)
            goto L41
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r5)
            return r3
        L2e:
            ybh.y(r7)
            ygj r7 = new ygj
            r7.<init>(r6, r3, r4)
            r0.v = r4
            dx5 r5 = r5.a
            java.lang.Object r7 = na2.Z(r5, r7, r0)
            if (r7 != r1) goto L41
            return r1
        L41:
            t0i r7 = (t0i) r7
            java.lang.Object r5 = r7.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ehj.f(i9c, nt5):java.lang.Object");
    }

    public final fvh g(String str, String str2, Uri uri, Function1 function1) {
        fvh fvhVar = new fvh();
        fvhVar.h(((Uri.Builder) function1.invoke(uri.buildUpon().encodedPath(str))).build().toString());
        fvhVar.d("Accept", j.a);
        zyk zykVar = this.h;
        fvhVar.d("Accept-Language", (String) zykVar.getValue());
        fvhVar.d("X-Opera-Timezone", ((TimeZoneFormat) this.g.getValue()).formatOffsetISO8601Basic(((TimeZone) this.f.getValue()).getOffset(System.currentTimeMillis()), true, true, true));
        if (str2 != null && !str2.equals((String) zykVar.getValue())) {
            fvhVar.b(e74.o);
        }
        return fvhVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0089, code lost:
    
        if (r7 == r2) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(fvh r8, defpackage.i9c r9, java.lang.String r10, nt5 r11) {
        /*
            r7 = this;
            java.lang.String r0 = "Bearer "
            boolean r1 = r11 instanceof defpackage.zgj
            if (r1 == 0) goto L15
            r1 = r11
            zgj r1 = (defpackage.zgj) r1
            int r2 = r1.y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.y = r2
            goto L1a
        L15:
            zgj r1 = new zgj
            r1.<init>(r7, r11)
        L1a:
            java.lang.Object r11 = r1.w
            px5 r2 = px5.a
            int r3 = r1.y
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L45
            if (r3 == r5) goto L37
            if (r3 != r4) goto L31
            ybh.y(r11)     // Catch: java.lang.Throwable -> L9c
            t0i r11 = (t0i) r11     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r7 = r11.a     // Catch: java.lang.Throwable -> L9c
            goto L8c
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r7)
            return r6
        L37:
            java.lang.String r10 = r1.v
            i9c r9 = r1.u
            fvh r8 = r1.t
            ybh.y(r11)
            t0i r11 = (t0i) r11
            java.lang.Object r11 = r11.a
            goto L56
        L45:
            ybh.y(r11)
            r1.t = r8
            r1.u = r9
            r1.v = r10
            r1.y = r5
            java.lang.Object r11 = r7.f(r9, r1)
            if (r11 == r2) goto L8b
        L56:
            p0i r3 = t0i.b
            boolean r3 = r11 instanceof q0i
            if (r3 != 0) goto La5
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> L9c
            boolean r3 = kotlin.jvm.internal.Intrinsics.a(r10, r11)     // Catch: java.lang.Throwable -> L9c
            if (r3 != 0) goto L94
            java.lang.String r3 = "Authorization"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9c
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L9c
            r5.append(r11)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L9c
            r8.d(r3, r0)     // Catch: java.lang.Throwable -> L9c
            kvh r0 = new kvh     // Catch: java.lang.Throwable -> L9c
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L9c
            if (r10 == 0) goto L7d
            r11 = r6
        L7d:
            r1.t = r6     // Catch: java.lang.Throwable -> L9c
            r1.u = r6     // Catch: java.lang.Throwable -> L9c
            r1.v = r6     // Catch: java.lang.Throwable -> L9c
            r1.y = r4     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r7 = r7.j(r0, r9, r11, r1)     // Catch: java.lang.Throwable -> L9c
            if (r7 != r2) goto L8c
        L8b:
            return r2
        L8c:
            ybh.y(r7)     // Catch: java.lang.Throwable -> L9c
            sgj r7 = (defpackage.sgj) r7     // Catch: java.lang.Throwable -> L9c
            p0i r8 = t0i.b     // Catch: java.lang.Throwable -> L9c
            return r7
        L94:
            lv0 r7 = new lv0     // Catch: java.lang.Throwable -> L9c
            java.lang.String r8 = "Authentication error"
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L9c
            throw r7     // Catch: java.lang.Throwable -> L9c
        L9c:
            r7 = move-exception
            p0i r8 = t0i.b
            q0i r8 = new q0i
            r8.<init>(r7)
            return r8
        La5:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ehj.i(fvh, i9c, java.lang.String, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(kvh r12, defpackage.i9c r13, java.lang.String r14, nt5 r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof defpackage.ahj
            if (r0 == 0) goto L13
            r0 = r15
            ahj r0 = (defpackage.ahj) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            ahj r0 = new ahj
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ybh.y(r15)
            goto L48
        L27:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r11)
            r11 = 0
            return r11
        L2e:
            ybh.y(r15)
            r71 r4 = new r71
            r9 = 0
            r10 = 12
            r5 = r11
            r6 = r12
            r8 = r13
            r7 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.v = r3
            jg8 r11 = r5.b
            java.lang.Object r15 = na2.Z(r11, r4, r0)
            if (r15 != r1) goto L48
            return r1
        L48:
            t0i r15 = (t0i) r15
            java.lang.Object r11 = r15.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ehj.j(kvh, i9c, java.lang.String, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(kvh r6, nt5 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.chj
            if (r0 == 0) goto L13
            r0 = r7
            chj r0 = (defpackage.chj) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            chj r0 = new chj
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            ybh.y(r7)
            goto L43
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r5)
            return r3
        L2e:
            ybh.y(r7)
            mz9 r7 = new mz9
            r2 = 24
            r7.<init>(r5, r6, r3, r2)
            r0.v = r4
            jg8 r5 = r5.b
            java.lang.Object r7 = na2.Z(r5, r7, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            t0i r7 = (t0i) r7
            java.lang.Object r5 = r7.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ehj.k(kvh, nt5):java.lang.Object");
    }
}
