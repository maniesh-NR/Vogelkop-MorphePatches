package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public final class mz extends AsyncTask {
    public final Context a;
    public final ab b;
    public final CountDownLatch c = new CountDownLatch(1);
    public String d;
    public String e;
    public boolean f;

    public mz(Context context, ab abVar) {
        this.a = context.getApplicationContext();
        this.b = abVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.nz a() throws java.lang.InterruptedException {
        /*
            r25 = this;
            r0 = r25
            android.content.Context r1 = r0.a
            long r2 = defpackage.i0l.a(r1)
            r4 = 1024(0x400, double:5.06E-321)
            long r2 = r2 / r4
            long r7 = r2 / r4
            int r2 = com.google.android.gms.common.GooglePlayServicesUtil.isGooglePlayServicesAvailable(r1)
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L1f
            java.lang.String r2 = "com.android.vending"
            boolean r2 = r9n.D(r1, r2)
            if (r2 == 0) goto L1f
            r9 = r4
            goto L20
        L1f:
            r9 = r3
        L20:
            java.lang.String r2 = "com.facebook.katana"
            boolean r2 = r9n.D(r1, r2)
            if (r2 != 0) goto L3a
            java.lang.String r2 = "com.facebook.lite"
            boolean r2 = r9n.D(r1, r2)
            if (r2 != 0) goto L3a
            java.lang.String r2 = "com.instagram.android"
            boolean r2 = r9n.D(r1, r2)
            if (r2 != 0) goto L3a
            r10 = r3
            goto L3b
        L3a:
            r10 = r4
        L3b:
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.String r11 = sfe.b0(r2)
            java.lang.String r12 = r1.getPackageName()
            java.lang.String r2 = r1.getPackageName()
            r3 = 0
            android.content.pm.PackageInfo r2 = r9n.u(r1, r2, r3)
            java.lang.String r13 = r2.versionName
            android.content.pm.PackageManager r2 = r1.getPackageManager()
            java.lang.String r3 = r1.getPackageName()
            java.lang.String r2 = r2.getInstallerPackageName(r3)
            java.lang.String r15 = defpackage.aik.o(r2)
            u59 r2 = defpackage.u59.C(r1)
            t59 r2 = r2.H()
            long r3 = r2.b
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r5
            int r3 = (int) r3
            java.lang.Object r2 = r2.c
            r17 = r2
            java.lang.String r17 = (java.lang.String) r17
            java.lang.String r2 = ""
            java.lang.String r4 = "phone"
            java.lang.Object r4 = r1.getSystemService(r4)     // Catch: java.lang.Throwable -> L8c
            android.telephony.TelephonyManager r4 = (android.telephony.TelephonyManager) r4     // Catch: java.lang.Throwable -> L8c
            if (r4 == 0) goto L8c
            java.lang.String r4 = r4.getNetworkOperator()     // Catch: java.lang.Throwable -> L8c
            if (r4 == 0) goto L8c
            r18 = r4
            goto L8e
        L8c:
            r18 = r2
        L8e:
            com.opera.android.Lazy r2 = defpackage.i0l.h(r1)
            java.lang.Object r2 = r2.get()
            r19 = r2
            java.lang.String r19 = (java.lang.String) r19
            n9a r2 = defpackage.hs3.a
            r2.getClass()
            java.lang.String r2 = "beta"
            hs3 r2 = n9a.n(r2)
            java.lang.String r21 = r2.d(r1)
            s16 r2 = defpackage.rv8.b
            r2.getClass()
            android.graphics.Rect r2 = r9n.i(r1)
            int r4 = r2.width()
            int r2 = r2.height()
            int r2 = java.lang.Math.max(r4, r2)
            r4 = 1148452864(0x44740000, float:976.0)
            int r1 = z7h.h(r1, r4)
            if (r2 <= r1) goto Lc9
            rv8 r1 = defpackage.rv8.GRID
            goto Lcb
        Lc9:
            rv8 r1 = defpackage.rv8.LIST
        Lcb:
            byte r1 = r1.a
            java.util.concurrent.CountDownLatch r2 = r0.c     // Catch: java.lang.InterruptedException -> Le9
            r2.await()     // Catch: java.lang.InterruptedException -> Le9
            nz r6 = new nz
            java.lang.String r2 = r0.d
            java.lang.String r0 = r0.e
            r14 = 1910404306(0x71de74d2, float:2.2031008E30)
            java.lang.String r20 = "44056845"
            r23 = r0
            r24 = r1
            r22 = r2
            r16 = r3
            r6.<init>(r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r6
        Le9:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mz.a():nz");
    }

    @Override // android.os.AsyncTask
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void onPostExecute(nz nzVar) {
        this.b.run(nzVar == null ? new nz(0L, false, false, "", "", "", 0, null, 0, "", "", "", "", "", "", "", 1) : nzVar);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }
}
