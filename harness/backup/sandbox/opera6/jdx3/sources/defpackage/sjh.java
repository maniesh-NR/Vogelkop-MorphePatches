package defpackage;

import android.content.SharedPreferences;
import com.google.android.gms.tasks.Task;
import com.opera.android.BrowserActivity;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class sjh {
    public static boolean q;
    public final BrowserActivity a;
    public final k6l b;
    public final SettingsManager c;
    public final orm d;
    public final skm e;
    public final qjh f;
    public final cq5 g;
    public final xi5 h;
    public final oji i;
    public final rjh j;
    public final long k;
    public int l;
    public mcj m;
    public Task n;
    public long o;
    public long p;

    /* JADX WARN: Multi-variable type inference failed */
    public sjh(BrowserActivity browserActivity, k6l k6lVar, SettingsManager settingsManager, orm ormVar, skm skmVar, qjh qjhVar, cq5 cq5Var) {
        this.a = browserActivity;
        this.b = k6lVar;
        this.c = settingsManager;
        this.d = ormVar;
        this.e = skmVar;
        this.f = qjhVar;
        this.g = cq5Var;
        xi5 xi5VarA = xi5.a(browserActivity);
        this.h = xi5VarA;
        this.i = oji.y(browserActivity);
        rjh rjhVar = new rjh(this);
        this.j = rjhVar;
        this.k = r9n.u(browserActivity, browserActivity.getPackageName(), 0L).firstInstallTime;
        xi5VarA.i.b(rjhVar);
        k6lVar.b(rjhVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r9 = this;
            com.opera.android.BrowserActivity r0 = r9.a
            tcc r1 = r0.getLifecycle()
            qdc r1 = (qdc) r1
            qcc r1 = r1.i
            qcc r2 = qcc.e
            boolean r1 = r1.d(r2)
            if (r1 == 0) goto Led
            int r1 = r9.l
            r2 = 3
            if (r1 < r2) goto L81
            tjh r1 = defpackage.tjh.a(r0)
            b59 r1 = r1.a
            java.lang.Object r1 = r1.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r2 = "rated"
            r3 = 0
            boolean r1 = r1.getBoolean(r2, r3)
            if (r1 != 0) goto L81
            oji r1 = r9.i
            java.lang.Object r1 = r1.a
            b59 r1 = (defpackage.b59) r1
            java.lang.Object r1 = r1.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r2 = "TOTAL_PAGE_LOADS"
            int r1 = r1.getInt(r2, r3)
            long r1 = (long) r1
            r3 = 75
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L81
            xi5 r1 = r9.h
            long r1 = r1.b()
            r3 = 10
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L81
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = r9.k
            long r1 = r1 - r3
            dj9 r3 = defpackage.dj9.t(r0)
            java.lang.Object r3 = r3.i()
            cj9 r3 = (defpackage.cj9) r3
            java.lang.String r3 = r3.b
            java.lang.String r4 = "us"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L70
            r3 = 345600000(0x14997000, double:1.70749087E-315)
            goto L73
        L70:
            r3 = 72000000(0x44aa200, double:3.55727265E-316)
        L73:
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L81
            com.opera.android.settings.SettingsManager r1 = r9.c
            java.lang.String r2 = "feedback_in_app_notification"
            boolean r1 = r1.i(r2)
            if (r1 != 0) goto L85
        L81:
            boolean r1 = defpackage.sjh.q
            if (r1 == 0) goto Led
        L85:
            com.google.android.gms.tasks.Task r1 = r9.n
            r2 = 0
            if (r1 != 0) goto Lb7
            long r3 = android.os.SystemClock.uptimeMillis()
            r9.o = r3
            android.content.Context r1 = r0.getApplicationContext()
            if (r1 == 0) goto L97
            r0 = r1
        L97:
            mcj r1 = new mcj
            ctp r3 = new ctp
            r3.<init>(r0)
            r1.<init>(r3)
            r9.m = r1
            com.google.android.gms.tasks.Task r0 = r1.k()
            if (r0 == 0) goto Lb4
            r9g r1 = new r9g
            r2 = 14
            r1.<init>(r9, r2)
            com.google.android.gms.tasks.Task r2 = r0.addOnCompleteListener(r1)
        Lb4:
            r9.n = r2
            return
        Lb7:
            boolean r0 = r1.isComplete()
            r1 = 1
            if (r0 == r1) goto Lcb
            long r3 = android.os.SystemClock.uptimeMillis()
            long r5 = r9.o
            r7 = 10000(0x2710, double:4.9407E-320)
            long r5 = r5 + r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto Led
        Lcb:
            com.google.android.gms.tasks.Task r0 = r9.n
            if (r0 == 0) goto Lea
            boolean r0 = r0.isComplete()
            if (r0 != r1) goto Lea
            com.google.android.gms.tasks.Task r0 = r9.n
            if (r0 == 0) goto Lea
            boolean r0 = r0.isSuccessful()
            if (r0 != r1) goto Lea
            com.google.android.gms.tasks.Task r0 = r9.n
            if (r0 == 0) goto Lea
            java.lang.Object r0 = r0.getResult()
            r2 = r0
            z1i r2 = (z1i) r2
        Lea:
            r9.b(r2)
        Led:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sjh.a():void");
    }

    public final void b(z1i z1iVar) {
        Long lValueOf;
        s9i s9iVar;
        long j = this.o;
        if (j == 0) {
            lValueOf = null;
        } else {
            long j2 = this.p;
            lValueOf = j2 == 0 ? -1L : Long.valueOf(j2 - j);
        }
        byte b = 0;
        q = false;
        fp1 fp1Var = this.a;
        ((SharedPreferences) tjh.a(fp1Var).a.get()).edit().putBoolean("rated", true).apply();
        am2.x(((SharedPreferences) tjh.a(fp1Var).a.get()).edit(), "lastShown");
        mcj mcjVar = this.m;
        boolean zO = ((f8f) this.g.getValue()).o();
        xi5 xi5Var = this.h;
        if (zO) {
            s9iVar = new s9i(new sxh(2132020614, new Object[]{new rxh(2132017591)}), new qxh(""));
        } else {
            long jB = xi5Var.b();
            int i = jB > 2147483647L ? Integer.MAX_VALUE : (int) jB;
            s9iVar = new s9i(new txh(new Object[]{Integer.valueOf(i)}, 2131886170, i), new sxh(2132020614, new Object[]{new rxh(2132017591)}));
        }
        a87 a87Var = new a87(s9iVar, new xbf((byte) 7), b);
        s2g s2gVar = new s2g((Object) this, (Object) z1iVar, (Object) lValueOf, (byte) 4);
        qjh qjhVar = this.f;
        a87Var.s0((qim) qjhVar.b.get(), new ai(qjhVar, a87Var, mcjVar, z1iVar, s2gVar, (byte) 6));
        h7f h7fVar = xi5Var.i;
        rjh rjhVar = this.j;
        h7fVar.c(rjhVar);
        this.b.v(rjhVar);
    }
}
