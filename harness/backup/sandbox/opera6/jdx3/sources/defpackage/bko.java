package defpackage;

import android.app.Activity;
import android.app.Application;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class bko extends ejo {
    public final Application b;
    public final WeakHashMap c;
    public final ws8 d;

    public bko(Application application, h9o h9oVar) {
        super(h9oVar);
        this.b = application;
        this.c = new WeakHashMap();
        ws8 ws8Var = new ws8(this, (byte) 3);
        this.d = ws8Var;
        application.registerActivityLifecycleCallbacks(ws8Var);
    }

    @Override // defpackage.ejo
    public final void b() {
        this.b.unregisterActivityLifecycleCallbacks(this.d);
        this.a = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c4 A[PHI: r2
      0x00c4: PHI (r2v18 java.lang.Boolean) = (r2v4 java.lang.Boolean), (r2v10 java.lang.Boolean) binds: [B:24:0x0061, B:42:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(android.app.Activity r7) {
        /*
            r6 = this;
            java.util.WeakHashMap r0 = r6.c
            boolean r0 = r0.containsKey(r7)
            if (r0 != 0) goto Lcd
            boolean r0 = r7.isDestroyed()
            if (r0 != 0) goto Lcd
            boolean r0 = r7 instanceof ndc
            if (r0 == 0) goto L25
            r0 = r7
            ndc r0 = (ndc) r0
            tcc r0 = r0.getLifecycle()
            qdc r0 = (qdc) r0
            qcc r0 = r0.i
            qcc r1 = qcc.d
            boolean r0 = r0.d(r1)
            goto Lca
        L25:
            r0 = 1
            r1 = 0
            p0i r2 = t0i.b     // Catch: java.lang.Throwable -> L51
            java.lang.String r2 = "mResumed"
            java.lang.Class<android.app.Activity> r3 = android.app.Activity.class
            java.lang.reflect.Field r2 = r3.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L51
            r2.setAccessible(r0)     // Catch: java.lang.Throwable -> L51
            boolean r2 = r2.getBoolean(r7)     // Catch: java.lang.Throwable -> L51
            if (r2 == 0) goto L3d
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L51
            goto L5a
        L3d:
            java.lang.String r2 = "mStopped"
            java.lang.reflect.Field r2 = r3.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L51
            r2.setAccessible(r0)     // Catch: java.lang.Throwable -> L51
            boolean r2 = r2.getBoolean(r7)     // Catch: java.lang.Throwable -> L51
            if (r2 == 0) goto L4f
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L51
            goto L5a
        L4f:
            r2 = r1
            goto L5a
        L51:
            r2 = move-exception
            p0i r3 = t0i.b
            q0i r3 = new q0i
            r3.<init>(r2)
            r2 = r3
        L5a:
            boolean r3 = r2 instanceof q0i
            if (r3 == 0) goto L5f
            r2 = r1
        L5f:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 != 0) goto Lc4
            java.util.Set r2 = mzg.d()     // Catch: java.lang.Throwable -> Laf
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Laf
        L6b:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> Laf
            if (r3 == 0) goto La7
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> Laf
            java.lang.Class r4 = r3.getClass()     // Catch: java.lang.Throwable -> Laf
            java.lang.String r5 = "activity"
            java.lang.reflect.Field r4 = r4.getDeclaredField(r5)     // Catch: java.lang.Throwable -> Laf
            r4.setAccessible(r0)     // Catch: java.lang.Throwable -> Laf
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Throwable -> Laf
            boolean r5 = r4 instanceof android.app.Activity     // Catch: java.lang.Throwable -> Laf
            if (r5 == 0) goto L8d
            android.app.Activity r4 = (android.app.Activity) r4     // Catch: java.lang.Throwable -> Laf
            goto L8e
        L8d:
            r4 = r1
        L8e:
            if (r4 != r7) goto L6b
            java.lang.Class r2 = r3.getClass()     // Catch: java.lang.Throwable -> Laf
            java.lang.String r4 = "stopped"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r4)     // Catch: java.lang.Throwable -> Laf
            r2.setAccessible(r0)     // Catch: java.lang.Throwable -> Laf
            boolean r2 = r2.getBoolean(r3)     // Catch: java.lang.Throwable -> Laf
            r2 = r2 ^ r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> Laf
            goto Lb8
        La7:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> Laf
            java.lang.String r2 = "Collection contains no element matching the predicate."
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Laf
            throw r0     // Catch: java.lang.Throwable -> Laf
        Laf:
            r0 = move-exception
            p0i r2 = t0i.b
            q0i r2 = new q0i
            r2.<init>(r0)
            r0 = r2
        Lb8:
            p0i r2 = t0i.b
            boolean r2 = r0 instanceof q0i
            if (r2 != 0) goto Lbf
            r1 = r0
        Lbf:
            r2 = r1
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto Lc9
        Lc4:
            boolean r0 = r2.booleanValue()
            goto Lca
        Lc9:
            r0 = 0
        Lca:
            r6.i(r7, r0)
        Lcd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bko.h(android.app.Activity):void");
    }

    public final void i(Activity activity, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        WeakHashMap weakHashMap = this.c;
        weakHashMap.put(activity, boolValueOf);
        boolean zContains = weakHashMap.values().contains(Boolean.TRUE);
        h9o h9oVar = (h9o) this.a;
        if (h9oVar != null) {
            h9oVar.c(zContains);
        }
    }
}
