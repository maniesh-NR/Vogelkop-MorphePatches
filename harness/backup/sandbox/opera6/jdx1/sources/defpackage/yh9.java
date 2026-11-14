package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class yh9 {
    public static final y3d a = new y3d(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final hkj d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new hg((byte) 3));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new hkj(0);
    }

    public static String a(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((th9) list.get(i2)).h);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004a A[Catch: all -> 0x0094, TryCatch #1 {all -> 0x0094, blocks: (B:3:0x0007, B:5:0x000f, B:7:0x0016, B:8:0x001a, B:27:0x004a, B:28:0x0050, B:30:0x0056, B:32:0x0063, B:38:0x0078, B:41:0x0084, B:34:0x0068, B:35:0x006b, B:36:0x006c, B:12:0x0027, B:14:0x002f, B:16:0x0032, B:18:0x0036, B:23:0x0042, B:42:0x008a, B:31:0x005d), top: B:50:0x0007, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050 A[Catch: all -> 0x0094, TryCatch #1 {all -> 0x0094, blocks: (B:3:0x0007, B:5:0x000f, B:7:0x0016, B:8:0x001a, B:27:0x004a, B:28:0x0050, B:30:0x0056, B:32:0x0063, B:38:0x0078, B:41:0x0084, B:34:0x0068, B:35:0x006b, B:36:0x006c, B:12:0x0027, B:14:0x002f, B:16:0x0032, B:18:0x0036, B:23:0x0042, B:42:0x008a, B:31:0x005d), top: B:50:0x0007, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.xh9 b(android.content.Context r8, java.util.List r9, java.lang.String r10, int r11) {
        /*
            y3d r0 = defpackage.yh9.a
            java.lang.String r1 = "getFontSync"
            android.os.Trace.beginSection(r1)
            java.lang.Object r1 = r0.get(r10)     // Catch: java.lang.Throwable -> L94
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1     // Catch: java.lang.Throwable -> L94
            if (r1 == 0) goto L16
            xh9 r8 = new xh9     // Catch: java.lang.Throwable -> L94
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L94
            goto L90
        L16:
            mi9 r9 = defpackage.sh9.a(r8, r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8a java.lang.Throwable -> L94
            java.util.List r1 = r9.b     // Catch: java.lang.Throwable -> L94
            boolean r9 = r9.c     // Catch: java.lang.Throwable -> L94
            r2 = 1
            r3 = -3
            r4 = 0
            if (r9 == 0) goto L27
            if (r9 != r2) goto L3e
            r9 = -2
            goto L48
        L27:
            java.lang.Object r9 = r1.get(r4)     // Catch: java.lang.Throwable -> L94
            ni9[] r9 = (defpackage.ni9[]) r9     // Catch: java.lang.Throwable -> L94
            if (r9 == 0) goto L47
            int r5 = r9.length     // Catch: java.lang.Throwable -> L94
            if (r5 == 0) goto L47
            int r5 = r9.length     // Catch: java.lang.Throwable -> L94
            r6 = r4
        L34:
            if (r6 >= r5) goto L45
            r7 = r9[r6]     // Catch: java.lang.Throwable -> L94
            int r7 = r7.f     // Catch: java.lang.Throwable -> L94
            if (r7 == 0) goto L42
            if (r7 >= 0) goto L40
        L3e:
            r9 = r3
            goto L48
        L40:
            r9 = r7
            goto L48
        L42:
            int r6 = r6 + 1
            goto L34
        L45:
            r9 = r4
            goto L48
        L47:
            r9 = r2
        L48:
            if (r9 == 0) goto L50
            xh9 r8 = new xh9     // Catch: java.lang.Throwable -> L94
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L94
            goto L90
        L50:
            int r9 = r1.size()     // Catch: java.lang.Throwable -> L94
            if (r9 <= r2) goto L6c
            drj r9 = defpackage.ham.a     // Catch: java.lang.Throwable -> L94
            java.lang.String r9 = "TypefaceCompat.createFromFontInfoWithFallback"
            android.os.Trace.beginSection(r9)     // Catch: java.lang.Throwable -> L94
            drj r9 = defpackage.ham.a     // Catch: java.lang.Throwable -> L67
            android.graphics.Typeface r8 = r9.d(r8, r1, r11)     // Catch: java.lang.Throwable -> L67
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L94
            goto L76
        L67:
            r8 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L94
            throw r8     // Catch: java.lang.Throwable -> L94
        L6c:
            java.lang.Object r9 = r1.get(r4)     // Catch: java.lang.Throwable -> L94
            ni9[] r9 = (defpackage.ni9[]) r9     // Catch: java.lang.Throwable -> L94
            android.graphics.Typeface r8 = defpackage.ham.a(r8, r9, r11)     // Catch: java.lang.Throwable -> L94
        L76:
            if (r8 == 0) goto L84
            r0.put(r10, r8)     // Catch: java.lang.Throwable -> L94
            xh9 r9 = new xh9     // Catch: java.lang.Throwable -> L94
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L94
            android.os.Trace.endSection()
            return r9
        L84:
            xh9 r8 = new xh9     // Catch: java.lang.Throwable -> L94
            r8.<init>(r3)     // Catch: java.lang.Throwable -> L94
            goto L90
        L8a:
            xh9 r8 = new xh9     // Catch: java.lang.Throwable -> L94
            r9 = -1
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L94
        L90:
            android.os.Trace.endSection()
            return r8
        L94:
            r8 = move-exception
            android.os.Trace.endSection()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yh9.b(android.content.Context, java.util.List, java.lang.String, int):xh9");
    }

    public static Typeface c(Context context, List list, int i, wd2 wd2Var, s6h s6hVar) {
        String strA = a(i, list);
        Typeface typeface = (Typeface) a.get(strA);
        if (typeface != null) {
            ((wd2) s6hVar.b).execute(new vr9((qyn) s6hVar.a, typeface, (byte) 4));
            return typeface;
        }
        ms7 ms7Var = new ms7(s6hVar, (byte) 1);
        synchronized (c) {
            hkj hkjVar = d;
            ArrayList arrayList = (ArrayList) hkjVar.get(strA);
            if (arrayList != null) {
                arrayList.add(ms7Var);
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(ms7Var);
            hkjVar.put(strA, arrayList2);
            wh9 wh9Var = new wh9(strA, context, list, i, (byte) 1);
            Executor executor = wd2Var;
            if (wd2Var == null) {
                executor = b;
            }
            ms7 ms7Var2 = new ms7(strA, (byte) 2);
            Handler handler = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
            iv ivVar = new iv();
            ivVar.b = wh9Var;
            ivVar.c = ms7Var2;
            ivVar.d = handler;
            executor.execute(ivVar);
            return null;
        }
    }
}
