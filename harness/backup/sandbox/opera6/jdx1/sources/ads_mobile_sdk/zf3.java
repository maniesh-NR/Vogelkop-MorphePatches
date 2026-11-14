package ads_mobile_sdk;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import defpackage.mip;
import defpackage.opo;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class zf3 implements opo {
    public long a = -1;
    public long b = -1;
    public long c = -1;
    public long d = -1;
    public long e = -1;
    public long f = -1;
    public long g = -1;
    public long h = -1;
    public final mip i;
    public final long j;

    public zf3(mip mipVar) {
        this.i = mipVar;
        mipVar.getClass();
        this.j = SystemClock.uptimeMillis();
    }

    public static boolean a(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            View viewB = b(view);
            Object objInvoke = viewB.getClass().getMethod("getAdConfiguration", null).invoke(viewB, null);
            Integer num = (Integer) objInvoke.getClass().getField("adType").get(objInvoke);
            num.getClass();
            String str = (String) objInvoke.getClass().getMethod("adTypeToString", Integer.TYPE).invoke(null, num);
            if (str.contains("INTERSTITIAL") || str.contains("APP_OPEN")) {
                return true;
            }
            return str.contains("REWARDED");
        } catch (NullPointerException | ReflectiveOperationException | SecurityException unused) {
            return false;
        }
    }

    public static View b(View view) {
        return view.getClass().getName().contains("DebugGestureViewWrapper") ? ((ViewGroup) view).getChildAt(0) : view;
    }

    @Override // defpackage.opo
    public final synchronized void a(HashMap map) {
        this.b = this.a;
        this.i.getClass();
        this.a = SystemClock.uptimeMillis();
        c(map);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0092 A[Catch: all -> 0x009b, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0018, B:6:0x001a, B:8:0x0020, B:19:0x0045, B:21:0x004c, B:23:0x0052, B:25:0x005b, B:27:0x0061, B:29:0x006c, B:32:0x0087, B:34:0x008d, B:36:0x0094, B:35:0x0092, B:10:0x0026, B:13:0x0032, B:14:0x003b, B:16:0x003f), top: B:43:0x0001, inners: #1 }] */
    @Override // defpackage.opo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void a(java.util.HashMap r6, android.content.Context r7, android.view.View r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            long r0 = r5.c     // Catch: java.lang.Throwable -> L9b
            r5.d = r0     // Catch: java.lang.Throwable -> L9b
            mip r0 = r5.i     // Catch: java.lang.Throwable -> L9b
            r0.getClass()     // Catch: java.lang.Throwable -> L9b
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L9b
            r5.c = r0     // Catch: java.lang.Throwable -> L9b
            long r0 = r5.e     // Catch: java.lang.Throwable -> L9b
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1a
            r5.f = r0     // Catch: java.lang.Throwable -> L9b
        L1a:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L9b
            r1 = 33
            if (r0 < r1) goto L26
            boolean r0 = r7.isUiContext()     // Catch: java.lang.Throwable -> L9b
            if (r0 == 0) goto L30
        L26:
            java.lang.String r0 = "window"
            java.lang.Object r7 = r7.getSystemService(r0)     // Catch: java.lang.Throwable -> L9b
            android.view.WindowManager r7 = (android.view.WindowManager) r7     // Catch: java.lang.Throwable -> L9b
            if (r7 != 0) goto L32
        L30:
            r7 = 0
            goto L43
        L32:
            android.view.Display r7 = r7.getDefaultDisplay()     // Catch: java.lang.Throwable -> L9b
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics     // Catch: java.lang.Throwable -> L9b
            r0.<init>()     // Catch: java.lang.Throwable -> L9b
            r7.getRealMetrics(r0)     // Catch: java.lang.NoSuchMethodError -> L3f java.lang.Throwable -> L9b
            goto L42
        L3f:
            r7.getMetrics(r0)     // Catch: java.lang.Throwable -> L9b
        L42:
            r7 = r0
        L43:
            if (r7 == 0) goto L92
            int r0 = r7.widthPixels     // Catch: java.lang.Throwable -> L9b
            int r1 = r7.heightPixels     // Catch: java.lang.Throwable -> L9b
            int r0 = r0 * r1
            if (r8 == 0) goto L92
            int r1 = r8.getVisibility()     // Catch: java.lang.Throwable -> L9b
            if (r1 != 0) goto L92
            float r1 = r8.getAlpha()     // Catch: java.lang.Throwable -> L9b
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 <= 0) goto L92
            boolean r1 = r8.isShown()     // Catch: java.lang.Throwable -> L9b
            if (r1 == 0) goto L6c
            android.graphics.Rect r1 = new android.graphics.Rect     // Catch: java.lang.Throwable -> L9b
            r1.<init>()     // Catch: java.lang.Throwable -> L9b
            boolean r1 = r8.getGlobalVisibleRect(r1)     // Catch: java.lang.Throwable -> L9b
            if (r1 == 0) goto L92
        L6c:
            int r1 = r8.getWidth()     // Catch: java.lang.Throwable -> L9b
            int r4 = r7.widthPixels     // Catch: java.lang.Throwable -> L9b
            int r1 = java.lang.Math.min(r1, r4)     // Catch: java.lang.Throwable -> L9b
            int r4 = r8.getHeight()     // Catch: java.lang.Throwable -> L9b
            int r7 = r7.heightPixels     // Catch: java.lang.Throwable -> L9b
            int r7 = java.lang.Math.min(r4, r7)     // Catch: java.lang.Throwable -> L9b
            int r7 = r7 * r1
            int r1 = r7 << 1
            if (r1 >= r0) goto L8d
            if (r7 != 0) goto L92
            boolean r7 = a(r8)     // Catch: java.lang.Throwable -> L9b
            if (r7 == 0) goto L92
        L8d:
            long r7 = r5.c     // Catch: java.lang.Throwable -> L9b
            r5.e = r7     // Catch: java.lang.Throwable -> L9b
            goto L94
        L92:
            r5.e = r2     // Catch: java.lang.Throwable -> L9b
        L94:
            r5.c(r6)     // Catch: java.lang.Throwable -> L9b
            monitor-exit(r5)
            return
        L99:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L9b
            throw r6
        L9b:
            r6 = move-exception
            goto L99
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zf3.a(java.util.HashMap, android.content.Context, android.view.View):void");
    }

    @Override // defpackage.opo
    public final synchronized void b(HashMap map) {
        this.h = this.g;
        this.i.getClass();
        this.g = SystemClock.uptimeMillis();
        c(map);
    }

    public final void c(HashMap map) {
        map.put("tcq", Long.valueOf(this.a));
        map.put("tpq", Long.valueOf(this.b));
        map.put("tcc", Long.valueOf(this.g));
        map.put("tpc", Long.valueOf(this.h));
        map.put("tpv", Long.valueOf(this.d));
        map.put("tcv", Long.valueOf(this.c));
        map.put("tchv", Long.valueOf(this.e));
        map.put("tphv", Long.valueOf(this.f));
        map.put("tst", Long.valueOf(this.j));
    }
}
