package defpackage;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class bqi extends gtg implements dz {
    public static final ir5 o = new ir5();
    public final WeakReference d;
    public final yo e;
    public final rm f;
    public final String g;
    public final i3j h;
    public final ap i;
    public final Context j;
    public final pyl k;
    public final uwh l;
    public final r68 m;
    public final qfb n;

    public bqi(String str, Activity activity, yo yoVar, rm rmVar, String str2, pyl pylVar, uwh uwhVar, qfb qfbVar, r68 r68Var, i3j i3jVar, ap apVar, r9g r9gVar) {
        super(r9gVar);
        this.d = new WeakReference(activity);
        this.e = yoVar;
        this.f = rmVar;
        this.g = str2;
        this.h = i3jVar;
        this.i = apVar;
        this.j = activity.getApplicationContext();
        this.k = pylVar;
        this.l = uwhVar;
        this.m = r68Var;
        this.n = qfbVar;
    }

    public static String n(String str, String str2) {
        Locale locale = Locale.US;
        return sko.v(str2, ": ", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    @Override // defpackage.bz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a() {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            qfb r2 = r5.n
            if (r2 == 0) goto L71
            java.lang.String r3 = android.os.Build.MODEL
            java.lang.String r4 = "M2006C3LG"
            boolean r4 = r4.equalsIgnoreCase(r3)
            if (r4 != 0) goto L6e
            java.lang.String r4 = "vivo 1906"
            boolean r4 = r4.equalsIgnoreCase(r3)
            if (r4 != 0) goto L6e
            java.lang.String r4 = "vivo 1904"
            boolean r4 = r4.equalsIgnoreCase(r3)
            if (r4 != 0) goto L6e
            java.lang.String r4 = "M2006C3LI"
            boolean r4 = r4.equalsIgnoreCase(r3)
            if (r4 != 0) goto L6e
            java.lang.String r4 = "Infinix X6516"
            boolean r4 = r4.equalsIgnoreCase(r3)
            if (r4 != 0) goto L6e
            java.lang.String r4 = "V2037"
            boolean r3 = r4.equalsIgnoreCase(r3)
            if (r3 != 0) goto L6e
            yo r3 = r5.e
            int r3 = r3.ordinal()
            if (r3 == 0) goto L50
            if (r3 == r0) goto L50
            r4 = 3
            if (r3 == r4) goto L50
            r4 = 4
            if (r3 == r4) goto L50
            r4 = 5
            if (r3 == r4) goto L50
            r4 = 6
            if (r3 == r4) goto L50
            r2 = r0
            goto L6f
        L50:
            java.lang.Object r2 = r2.b
            w7h r2 = (defpackage.w7h) r2
            android.app.Activity r2 = r2.a
            java.lang.String[] r3 = com.opera.android.OperaApplication.K
            android.app.Application r2 = r2.getApplication()
            com.opera.android.OperaApplication r2 = (com.opera.android.OperaApplication) r2
            xv1 r2 = r2.r
            j4c r2 = r2.n1
            java.lang.Object r2 = r2.get()
            vwn r2 = (defpackage.vwn) r2
            boolean r2 = r2.a()
            r2 = r2 ^ r0
            goto L6f
        L6e:
            r2 = r1
        L6f:
            if (r2 == 0) goto L8f
        L71:
            r2 = 0
            boolean r2 = r5.o(r2)
            if (r2 != 0) goto L93
            r68 r5 = r5.m
            android.util.SparseArray r5 = r5.b
            r2 = r1
        L7d:
            int r3 = r5.size()
            if (r2 >= r3) goto L93
            java.lang.Object r3 = r5.valueAt(r2)
            q68 r3 = (defpackage.q68) r3
            boolean r3 = r3.a()
            if (r3 != 0) goto L90
        L8f:
            return r1
        L90:
            int r2 = r2 + 1
            goto L7d
        L93:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bqi.a():boolean");
    }

    @Override // defpackage.bz
    public final s50 b() {
        uwh uwhVar = this.l;
        IdentityHashMap identityHashMap = uwhVar.g;
        d14 d14Var = uwhVar.b;
        if (((wnh) uwhVar.a.i()).a(8) && uwhVar.e > 0) {
            return s50.b;
        }
        if (identityHashMap.isEmpty() && !d14Var.a.isEmpty()) {
            return s50.c;
        }
        if (!uwhVar.d) {
            return s50.d;
        }
        int i = 0;
        while (true) {
            int size = d14Var.a.size();
            yo yoVar = this.e;
            String str = this.g;
            s50 s50Var = s50.e;
            if (i >= size) {
                for (k43 k43Var : identityHashMap.keySet()) {
                    if (k43Var != null && k43Var.e == yoVar && k43Var.c.equals(str)) {
                        return s50Var;
                    }
                }
                return s50.f;
            }
            k43 k43Var2 = ((twh) d14Var.a.get(i)).a;
            if (k43Var2.e == yoVar && k43Var2.c.equals(str)) {
                return s50Var;
            }
            i++;
        }
    }

    @Override // defpackage.bz
    public int c() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0036 A[SYNTHETIC] */
    @Override // defpackage.bz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.yz d(defpackage.az r14) {
        /*
            r13 = this;
            boolean r0 = r14.e()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.String r0 = r14.d()
            i3j r2 = r13.h
            r2.getClass()
            px r3 = new px
            yo r4 = r13.e
            rm r5 = r13.f
            java.lang.String r13 = r13.g
            r3.<init>(r4, r5, r13)
            boolean r13 = r2.r(r3)
            java.lang.Object r4 = r2.b
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r5 = r4.get(r3)
            java.util.List r5 = (java.util.List) r5
            if (r5 != 0) goto L32
            if (r13 == 0) goto L8b
            r2.u()
            goto L8b
        L32:
            java.util.Iterator r6 = r5.iterator()
        L36:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L76
            java.lang.Object r7 = r6.next()
            yz r7 = (defpackage.yz) r7
            ap r8 = r7.r
            int r8 = r8.b
            r9 = 1
            if (r8 != r9) goto L52
            if (r0 != 0) goto L4d
            r8 = 0
            goto L53
        L4d:
            boolean r8 = r7.r(r0)
            goto L53
        L52:
            r8 = r9
        L53:
            if (r8 == 0) goto L36
            if (r1 == 0) goto L74
            ap r8 = r7.r
            ap r10 = r1.r
            int r11 = r8.b
            if (r11 != r9) goto L64
            int r12 = r10.b
            if (r12 == r11) goto L6a
            goto L72
        L64:
            int r11 = r10.b
            if (r11 != r9) goto L6a
            r9 = -1
            goto L72
        L6a:
            int r8 = r8.a
            int r9 = r10.a
            int r9 = java.lang.Integer.compare(r8, r9)
        L72:
            if (r9 <= 0) goto L36
        L74:
            r1 = r7
            goto L36
        L76:
            if (r1 == 0) goto L7b
            r5.remove(r1)
        L7b:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L84
            r4.remove(r3)
        L84:
            if (r1 != 0) goto L88
            if (r13 == 0) goto L8b
        L88:
            r2.u()
        L8b:
            if (r1 == 0) goto L93
            dl r13 = r14.a()
            r1.p = r13
        L93:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bqi.d(az):yz");
    }

    @Override // defpackage.bz
    public final void e(zy zyVar, az azVar) {
        h(zyVar, azVar, 1);
    }

    @Override // defpackage.dz
    public final void h(zy zyVar, az azVar, int i) {
        boolean zA = a();
        String str = this.g;
        if (!zA) {
            zyVar.onFailed(n("ads provider not available", str));
            return;
        }
        yz yzVarD = d(azVar);
        if (yzVarD != null) {
            if (zyVar.a(yzVarD)) {
                return;
            }
            yzVarD.b();
            return;
        }
        q68 q68Var = (q68) this.m.b.get(-1000);
        if (q68Var != null && !q68Var.a()) {
            zyVar.onFailed(n("placement no fill delay", str));
            return;
        }
        k43 k43VarL = l(zyVar, azVar);
        if (k43VarL == null) {
            return;
        }
        if (azVar.b()) {
            k43VarL.f(o);
        } else {
            this.l.a(k43VarL, this.i.a);
        }
    }

    @Override // defpackage.gtg
    public final boolean k(String str) {
        return o(str);
    }

    public k43 l(zy zyVar, az azVar) {
        m();
        zyVar.onFailed(n("ads provider not available", this.g));
        return null;
    }

    public final Activity m() {
        Activity activity = (Activity) this.d.get();
        if (activity == null || activity.isDestroyed()) {
            return null;
        }
        return activity;
    }

    public final boolean o(String str) {
        i3j i3jVar = this.h;
        i3jVar.getClass();
        px pxVar = new px(this.e, this.f, this.g);
        if (i3jVar.r(pxVar)) {
            i3jVar.u();
        }
        List<yz> list = (List) ((HashMap) i3jVar.b).get(pxVar);
        if (list != null) {
            for (yz yzVar : list) {
                if (yzVar.r.b == 1 ? str == null ? false : yzVar.r(str) : true) {
                    return true;
                }
            }
        }
        return false;
    }
}
