package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* loaded from: classes.dex */
public abstract class l4h {
    public static final byh a = new byh();
    public static final Object b = new Object();
    public static ir5 c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? t8.s(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static ir5 b() {
        ir5 ir5Var = new ir5();
        c = ir5Var;
        a.j(ir5Var);
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0042 A[Catch: all -> 0x00fd, TryCatch #4 {, blocks: (B:8:0x000b, B:10:0x000f, B:13:0x0015, B:19:0x002a, B:30:0x003c, B:32:0x0042, B:33:0x0045, B:35:0x0048, B:41:0x006b, B:47:0x008e, B:48:0x0092, B:50:0x00a3, B:58:0x00b1, B:60:0x00b7, B:74:0x00d2, B:77:0x00d8, B:80:0x00df, B:82:0x00e8, B:85:0x00f1, B:86:0x00f4, B:84:0x00ee, B:52:0x00a8, B:53:0x00ab, B:88:0x00f6, B:89:0x00f9, B:28:0x003a, B:27:0x0037), top: B:104:0x000b, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0048 A[Catch: all -> 0x00fd, TryCatch #4 {, blocks: (B:8:0x000b, B:10:0x000f, B:13:0x0015, B:19:0x002a, B:30:0x003c, B:32:0x0042, B:33:0x0045, B:35:0x0048, B:41:0x006b, B:47:0x008e, B:48:0x0092, B:50:0x00a3, B:58:0x00b1, B:60:0x00b7, B:74:0x00d2, B:77:0x00d8, B:80:0x00df, B:82:0x00e8, B:85:0x00f1, B:86:0x00f4, B:84:0x00ee, B:52:0x00a8, B:53:0x00ab, B:88:0x00f6, B:89:0x00f9, B:28:0x003a, B:27:0x0037), top: B:104:0x000b, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(android.content.Context r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l4h.c(android.content.Context, boolean):void");
    }
}
