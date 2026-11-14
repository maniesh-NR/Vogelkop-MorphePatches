package defpackage;

import android.content.SharedPreferences;
import com.opera.api.Callback;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class py9 {
    public static final long h;
    public final mcj a;
    public final shf b;
    public final xbf c;
    public final nv1 d;
    public final jtg e;
    public final kze f = new kze(wvg.k);
    public final kze g = new kze(new qtg(-1, 30));

    static {
        on7 on7Var = pn7.b;
        h = cs5.x0(6, un7.g);
    }

    public py9(mcj mcjVar, shf shfVar, xbf xbfVar, nv1 nv1Var, jtg jtgVar) {
        this.a = mcjVar;
        this.b = shfVar;
        this.c = xbfVar;
        this.d = nv1Var;
        this.e = jtgVar;
        ((nrl) mcjVar.b).d(new ld9(this, (byte) 10));
    }

    public final wvg a() {
        ly9 ly9Var;
        String string = ((SharedPreferences) ((b59) this.a.a).get()).getString("giveaway_subscription", null);
        if (string == null || string.length() == 0) {
            ly9Var = null;
        } else {
            try {
                ly9Var = new ly9(z4o.j0(new orb(new JSONObject(string).getJSONObject("free_trial"))));
            } catch (JSONException unused) {
            }
        }
        return xvg.x(ly9Var != null ? ly9Var.a : null, System.currentTimeMillis(), false, 0L, 0L, false, false);
    }

    public final void b(h0d h0dVar, String str, Callback callback) {
        String str2 = (String) this.d.get();
        if (str2 == null || str2.length() == 0) {
            callback.run(iy9.a);
            return;
        }
        if (h0dVar == h0d.c) {
            this.c.A(new xx1((Object) callback, (Object) this, str2, (Object) str, (byte) 3));
            return;
        }
        ((SharedPreferences) ((b59) this.a.a).get()).edit().putLong("last_eligibility_check", System.currentTimeMillis()).apply();
        my9 my9Var = new my9(this, str, callback, (byte) 0);
        shf shfVar = this.b;
        ((wth) shfVar.a).w(new xx1(str2, str, shfVar, my9Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(nt5 r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof defpackage.oy9
            if (r0 == 0) goto L13
            r0 = r14
            oy9 r0 = (defpackage.oy9) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            oy9 r0 = new oy9
            r0.<init>(r13, r14)
        L18:
            java.lang.Object r14 = r0.u
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L38
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            ybh.y(r14)
            return r14
        L2b:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r13)
            return r5
        L31:
            wvg r2 = r0.t
            ybh.y(r14)
        L36:
            r10 = r2
            goto L55
        L38:
            ybh.y(r14)
            wvg r2 = r13.a()
            boolean r14 = r2.a()
            if (r14 != 0) goto L48
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            return r13
        L48:
            r0.t = r2
            r0.w = r4
            xbf r14 = r13.c
            java.lang.Object r14 = w0h.d(r14, r0)
            if (r14 != r1) goto L36
            goto L80
        L55:
            r8 = r14
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L5d
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            return r13
        L5d:
            nv1 r14 = r13.d
            java.lang.Object r14 = r14.get()
            r9 = r14
            java.lang.String r9 = (java.lang.String) r9
            if (r9 != 0) goto L6b
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            return r13
        L6b:
            dze r14 = dze.b
            s71 r6 = new s71
            r11 = 0
            r12 = 18
            r7 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r0.t = r5
            r0.w = r3
            java.lang.Object r13 = na2.Z(r14, r6, r0)
            if (r13 != r1) goto L81
        L80:
            return r1
        L81:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.py9.c(nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.lang.String r9, defpackage.dy9 r10, com.opera.api.Callback r11) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.ay9
            hy9 r1 = defpackage.hy9.a
            gy9 r2 = defpackage.gy9.a
            ey9 r3 = defpackage.ey9.a
            jy9 r4 = defpackage.jy9.a
            iy9 r5 = defpackage.iy9.a
            if (r0 == 0) goto L26
            ay9 r10 = (defpackage.ay9) r10
            int r10 = r10.a
            r0 = 409(0x199, float:5.73E-43)
            if (r10 != r0) goto L18
            r0 = r3
            goto L60
        L18:
            r0 = 429(0x1ad, float:6.01E-43)
            if (r10 == r0) goto L24
            r0 = 500(0x1f4, float:7.0E-43)
            if (r0 > r10) goto L47
            r0 = 600(0x258, float:8.41E-43)
            if (r10 >= r0) goto L47
        L24:
            r0 = r4
            goto L60
        L26:
            boolean r0 = r10 instanceof defpackage.zx9
            if (r0 == 0) goto L3f
            zx9 r10 = (defpackage.zx9) r10
            java.lang.Exception r10 = r10.a
        L2e:
            if (r10 == 0) goto L47
            boolean r0 = r10 instanceof java.net.SocketException
            if (r0 != 0) goto L38
            boolean r0 = r10 instanceof java.net.UnknownHostException
            if (r0 == 0) goto L3a
        L38:
            r0 = r2
            goto L60
        L3a:
            java.lang.Throwable r10 = r10.getCause()
            goto L2e
        L3f:
            by9 r0 = defpackage.by9.a
            boolean r0 = kotlin.jvm.internal.Intrinsics.a(r10, r0)
            if (r0 == 0) goto L49
        L47:
            r0 = r5
            goto L60
        L49:
            boolean r0 = r10 instanceof defpackage.cy9
            if (r0 == 0) goto Lc5
            cy9 r10 = (defpackage.cy9) r10
            boolean r0 = r10.a
            if (r0 == 0) goto L5f
            fy9 r0 = new fy9
            java.lang.String r6 = r10.b
            java.lang.String r7 = r10.c
            int r10 = r10.d
            r0.<init>(r6, r7, r10)
            goto L60
        L5f:
            r0 = r1
        L60:
            boolean r10 = r0 instanceof fy9
            java.lang.String r6 = "DEFAULT"
            mcj r7 = r8.a
            if (r10 == 0) goto L92
            boolean r9 = kotlin.jvm.internal.Intrinsics.a(r9, r6)
            if (r9 == 0) goto Lc1
            r9 = 1
            r7.l(r9)
            r9 = r0
            fy9 r9 = (fy9) r9
            int r9 = r9.c
            java.lang.Object r10 = r7.a
            b59 r10 = (defpackage.b59) r10
            java.lang.Object r10 = r10.get()
            android.content.SharedPreferences r10 = (android.content.SharedPreferences) r10
            android.content.SharedPreferences$Editor r10 = r10.edit()
            java.lang.String r1 = "giveaway_duration"
            android.content.SharedPreferences$Editor r9 = r10.putInt(r1, r9)
            r9.apply()
            r8.f()
            goto Lc1
        L92:
            boolean r10 = r0.equals(r3)
            if (r10 != 0) goto Lb4
            boolean r10 = r0.equals(r1)
            if (r10 != 0) goto Lb4
            boolean r8 = r0.equals(r2)
            if (r8 != 0) goto Lc1
            boolean r8 = r0.equals(r5)
            if (r8 != 0) goto Lc1
            boolean r8 = r0.equals(r4)
            if (r8 != 0) goto Lc1
            h9o.p()
            return
        Lb4:
            boolean r9 = kotlin.jvm.internal.Intrinsics.a(r9, r6)
            if (r9 == 0) goto Lc1
            r9 = 2
            r7.l(r9)
            r8.f()
        Lc1:
            r11.run(r0)
            return
        Lc5:
            h9o.p()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.py9.d(java.lang.String, dy9, com.opera.api.Callback):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(boolean r8, defpackage.u3k r9, defpackage.z3k r10, defpackage.s2g r11) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.py9.e(boolean, u3k, z3k, s2g):void");
    }

    public final qtg f() {
        b59 b59Var = (b59) this.a.a;
        qtg qtgVar = new qtg(!this.e.c() ? 2 : ((SharedPreferences) b59Var.get()).getInt("giveaway_eligibility", 0), ((SharedPreferences) b59Var.get()).getInt("giveaway_duration", 0));
        xf8.G0(this.g, qtgVar);
        return qtgVar;
    }
}
