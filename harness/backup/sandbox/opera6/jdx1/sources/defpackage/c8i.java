package defpackage;

import android.content.Context;
import android.view.OrientationEventListener;

/* loaded from: classes.dex */
public final class c8i extends OrientationEventListener {
    public final /* synthetic */ f8i a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8i(Context context, f8i f8iVar) {
        super(context);
        this.a = f8iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0048  */
    @Override // android.view.OrientationEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onOrientationChanged(int r8) {
        /*
            r7 = this;
            r0 = -1
            if (r8 == r0) goto L96
            f8i r1 = r7.a
            int r2 = r1.d
            r3 = 1
            r4 = 2
            r5 = 3
            r6 = 0
            if (r2 != r0) goto L26
            r0 = 45
            if (r8 < 0) goto L13
            if (r8 < r0) goto L34
        L13:
            r1 = 135(0x87, float:1.89E-43)
            if (r0 > r8) goto L19
            if (r8 < r1) goto L3e
        L19:
            r0 = 225(0xe1, float:3.15E-43)
            if (r1 > r8) goto L1f
            if (r8 < r0) goto L48
        L1f:
            if (r0 > r8) goto L34
            r0 = 315(0x13b, float:4.41E-43)
            if (r8 >= r0) goto L34
            goto L54
        L26:
            if (r8 < 0) goto L2c
            r0 = 40
            if (r8 < r0) goto L34
        L2c:
            r0 = 320(0x140, float:4.48E-43)
            if (r0 > r8) goto L36
            r0 = 360(0x168, float:5.04E-43)
            if (r8 >= r0) goto L36
        L34:
            r3 = r6
            goto L54
        L36:
            r0 = 50
            if (r0 > r8) goto L40
            r0 = 130(0x82, float:1.82E-43)
            if (r8 >= r0) goto L40
        L3e:
            r3 = r5
            goto L54
        L40:
            r0 = 140(0x8c, float:1.96E-43)
            if (r0 > r8) goto L4a
            r0 = 220(0xdc, float:3.08E-43)
            if (r8 >= r0) goto L4a
        L48:
            r3 = r4
            goto L54
        L4a:
            r0 = 230(0xe6, float:3.22E-43)
            if (r0 > r8) goto L52
            r0 = 310(0x136, float:4.34E-43)
            if (r8 < r0) goto L54
        L52:
            int r3 = r1.d
        L54:
            f8i r7 = r7.a
            int r8 = r7.d
            if (r8 == r3) goto L96
            r7.d = r3
            java.lang.Object r8 = r7.a
            monitor-enter(r8)
            java.util.LinkedHashMap r7 = r7.c     // Catch: java.lang.Throwable -> L93
            java.util.Collection r7 = r7.values()     // Catch: java.lang.Throwable -> L93
            java.lang.Iterable r7 = (java.lang.Iterable) r7     // Catch: java.lang.Throwable -> L93
            java.util.List r7 = kotlin.collections.CollectionsKt.k0(r7)     // Catch: java.lang.Throwable -> L93
            monitor-exit(r8)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L72:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L96
            java.lang.Object r8 = r7.next()
            e8i r8 = (defpackage.e8i) r8
            java.util.concurrent.atomic.AtomicBoolean r0 = r8.c
            boolean r0 = r0.get()
            if (r0 == 0) goto L72
            java.util.concurrent.ScheduledExecutorService r0 = r8.b     // Catch: java.util.concurrent.RejectedExecutionException -> L72
            br r1 = new br     // Catch: java.util.concurrent.RejectedExecutionException -> L72
            r2 = 22
            r1.<init>(r8, r3, r2)     // Catch: java.util.concurrent.RejectedExecutionException -> L72
            r0.execute(r1)     // Catch: java.util.concurrent.RejectedExecutionException -> L72
            goto L72
        L93:
            r7 = move-exception
            monitor-exit(r8)
            throw r7
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c8i.onOrientationChanged(int):void");
    }
}
