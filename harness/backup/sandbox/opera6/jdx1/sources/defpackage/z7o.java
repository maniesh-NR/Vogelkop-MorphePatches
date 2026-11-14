package defpackage;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class z7o {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.w7o a(defpackage.d4 r6, defpackage.fh5 r7, defpackage.ue5 r8) {
        /*
            java.util.concurrent.atomic.AtomicBoolean r0 = defpackage.nz9.a
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            r3 = 0
            if (r0 == 0) goto L41
            r0 = 6
            p04 r0 = defpackage.xf8.h(r2, r3, r3, r0)
            zyk r2 = defpackage.ob1.l
            java.lang.Object r2 = r2.getValue()
            kotlin.coroutines.CoroutineContext r2 = (kotlin.coroutines.CoroutineContext) r2
            a64 r2 = defpackage.sgb.b(r2)
            mz9 r4 = new mz9
            r4.<init>(r0, r3)
            r5 = 3
            defpackage.na2.B(r2, r3, r3, r4, r5)
            tu7 r2 = new tu7
            r4 = 17
            r2.<init>(r0, r4)
            java.lang.Object r0 = defpackage.ytj.c
            monitor-enter(r0)
            java.util.List r4 = defpackage.ytj.i     // Catch: java.lang.Throwable -> L3e
            java.util.Collection r4 = (java.util.Collection) r4     // Catch: java.lang.Throwable -> L3e
            java.util.ArrayList r2 = kotlin.collections.CollectionsKt.W(r2, r4)     // Catch: java.lang.Throwable -> L3e
            defpackage.ytj.i = r2     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r0)
            defpackage.ytj.c()
            goto L41
        L3e:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        L41:
            int r0 = r6.getChildCount()
            if (r0 <= 0) goto L5b
            android.view.View r0 = r6.getChildAt(r1)
            boolean r1 = r0 instanceof defpackage.v31
            if (r1 == 0) goto L52
            v31 r0 = (defpackage.v31) r0
            goto L53
        L52:
            r0 = r3
        L53:
            if (r0 == 0) goto L59
            r0.Q(r7)
            goto L5f
        L59:
            r0 = r3
            goto L5f
        L5b:
            r6.removeAllViews()
            goto L59
        L5f:
            if (r0 != 0) goto L6f
            v31 r0 = new v31
            android.content.Context r1 = r6.getContext()
            r0.<init>(r1, r7)
            android.view.ViewGroup$LayoutParams r1 = defpackage.z7o.a
            r6.addView(r0, r1)
        L6f:
            r0.Q(r7)
            r6 = 2131365108(0x7f0a0cf4, float:1.8350072E38)
            java.lang.Object r1 = r0.getTag(r6)
            boolean r2 = r1 instanceof defpackage.w7o
            if (r2 == 0) goto L80
            r3 = r1
            w7o r3 = (defpackage.w7o) r3
        L80:
            if (r3 != 0) goto L9b
            w7o r3 = new w7o
            jim r1 = new jim
            m3c r2 = r0.r
            r1.<init>(r2)
            r7.e()
            zh5 r2 = r7.c
            fi5 r4 = new fi5
            r4.<init>(r2, r1)
            r3.<init>(r0, r4)
            r0.setTag(r6, r3)
        L9b:
            r3.b(r8)
            r7.e()
            zh5 r6 = r7.c
            y7o r7 = new y7o
            r7.<init>(r6)
            r0.d = r7
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z7o.a(d4, fh5, ue5):w7o");
    }
}
