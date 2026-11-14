package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class wqo {
    public static final HashMap c = new HashMap();
    public static volatile wqo d;
    public final Context a;
    public volatile ArrayList b;

    public wqo(Context context) {
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        this.a = applicationContext;
        c.put("FireTVFOSDAT", f7p.a(applicationContext));
    }

    public static wqo a(Context context) {
        if (d == null) {
            synchronized (wqo.class) {
                if (d == null) {
                    d = new wqo(context);
                }
            }
        }
        return d;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0054 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x001f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List b() {
        /*
            r5 = this;
            java.util.ArrayList r0 = r5.b
            if (r0 == 0) goto L7
            java.util.ArrayList r5 = r5.b
            return r5
        L7:
            monitor-enter(r5)
            java.util.ArrayList r0 = r5.b     // Catch: java.lang.Throwable -> L6b
            if (r0 == 0) goto L10
            java.util.ArrayList r0 = r5.b     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L6b
            return r0
        L10:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L6b
            r0.<init>()     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L6b
            java.util.HashMap r1 = defpackage.wqo.c     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L6b
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L6b
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L6b
        L1f:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L6b
            if (r2 == 0) goto L58
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L6b
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L6b
            java.lang.Object r3 = r2.getValue()     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L6b
            f7p r3 = (defpackage.f7p) r3     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L6b
            boolean r3 = r3.b()     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L6b
            if (r3 == 0) goto L1f
            java.lang.Object r2 = r2.getKey()     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L6b
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L6b
            android.content.Context r3 = r5.a     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L6b
            if (r2 == 0) goto L51
            if (r3 == 0) goto L51
            java.lang.String r4 = "FireTVFOSDAT"
            boolean r2 = r4.equals(r2)     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L6b
            if (r2 == 0) goto L51
            v5p r2 = new v5p     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L6b
            r2.<init>(r3)     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L6b
            goto L52
        L51:
            r2 = 0
        L52:
            if (r2 == 0) goto L1f
            r0.add(r2)     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L6b
            goto L1f
        L58:
            r5.b = r0     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L6b
            java.util.ArrayList r0 = r5.b     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L6b
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L6b
            return r0
        L5e:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L6b
            r0.<init>()     // Catch: java.lang.Throwable -> L6b
            r5.b = r0     // Catch: java.lang.Throwable -> L6b
            java.util.ArrayList r0 = r5.b     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L6b
            return r0
        L69:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L6b
            throw r0
        L6b:
            r0 = move-exception
            goto L69
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wqo.b():java.util.List");
    }
}
