package ads_mobile_sdk;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import defpackage.f43;
import defpackage.zzo;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class ne3 extends zt1 {
    public final nx5 g;
    public final zzo h;
    public final z2 i;
    public final a2 j;
    public final zv1 k;
    public boolean l;

    public ne3(nx5 nx5Var, zzo zzoVar, z2 z2Var, a2 a2Var, zv1 zv1Var) {
        this.g = nx5Var;
        this.h = zzoVar;
        this.i = z2Var;
        this.j = a2Var;
        this.k = zv1Var;
    }

    @Override // ads_mobile_sdk.zt1
    public final void a() {
        this.h.destroy();
    }

    @Override // ads_mobile_sdk.zt1
    public final void a(View view, f43 f43Var, LinkedHashMap linkedHashMap, ImageView.ScaleType scaleType) {
        zzo zzoVar = this.h;
        if (zzoVar.d()) {
            return;
        }
        zzoVar.a(view);
        defpackage.na2.B(this.g, null, null, new ke3(this, null, (byte) 0), 3);
    }

    @Override // ads_mobile_sdk.zt1
    public final void a(FrameLayout frameLayout, ImageView.ScaleType scaleType, Map map) {
        if (this.l) {
            zzo zzoVar = this.h;
            boolean zB = zzoVar.b();
            nx5 nx5Var = this.g;
            if (zB && this.j.p0 == z1.THIRD_PARTY_SDK_CALLBACK) {
                defpackage.na2.B(nx5Var, null, null, new ke3(this, null, (byte) 1), 3);
            } else {
                zzoVar.recordImpression();
                defpackage.na2.B(nx5Var, null, null, new ke3(this, null, (byte) 2), 3);
            }
        }
    }

    @Override // ads_mobile_sdk.zt1
    public final void a(f43 f43Var) {
        if (f43Var != null) {
            this.h.a(f43Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007d A[Catch: RuntimeException -> 0x0025, LOOP:1: B:22:0x007b->B:23:0x007d, LOOP_END, TryCatch #0 {RuntimeException -> 0x0025, blocks: (B:21:0x0067, B:23:0x007d, B:24:0x008d, B:26:0x0097), top: B:46:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0097 A[Catch: RuntimeException -> 0x0025, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0025, blocks: (B:21:0x0067, B:23:0x007d, B:24:0x008d, B:26:0x0097), top: B:46:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b1  */
    @Override // ads_mobile_sdk.zt1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.ref.WeakReference r9, defpackage.f43 r10, java.util.LinkedHashMap r11, ads_mobile_sdk.ew1 r12, ads_mobile_sdk.ew1 r13) {
        /*
            r8 = this;
            ads_mobile_sdk.a2 r9 = r8.j
            prb r12 = r9.l0
            prb r9 = r9.l0
            hgc r12 = r12.a
            boolean r12 = r12.isEmpty()
            zzo r13 = r8.h
            if (r12 != 0) goto Lb1
            hgc r12 = r9.a
            java.util.Set r12 = r12.keySet()
            r0 = r12
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lb1
            fgc r12 = (fgc) r12
            java.util.Iterator r12 = r12.iterator()
        L25:
            r0 = r12
            egc r0 = (egc) r0
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto Lb1
            r0 = r12
            egc r0 = (egc) r0
            ggc r0 = r0.a()
            java.lang.Object r0 = r0.f
            java.lang.String r0 = (java.lang.String) r0
            wpb r1 = ads_mobile_sdk.bw2.e(r9, r0)
            if (r1 == 0) goto L25
            java.lang.String r2 = "3010"
            boolean r2 = r0.equals(r2)
            r3 = 0
            if (r2 == 0) goto L53
            android.view.View r0 = r13.a()
            if (r0 == 0) goto Lb2
            java.lang.Class r0 = r0.getClass()
            goto L67
        L53:
            java.lang.Object r0 = r11.get(r0)
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            if (r0 == 0) goto Lb2
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto Lb2
            java.lang.Class r0 = r0.getClass()
        L67:
            ads_mobile_sdk.zv1 r2 = r8.k     // Catch: java.lang.RuntimeException -> L25
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.RuntimeException -> L25
            r5 = 10
            int r5 = k95.o(r1, r5)     // Catch: java.lang.RuntimeException -> L25
            r4.<init>(r5)     // Catch: java.lang.RuntimeException -> L25
            java.util.ArrayList r1 = r1.a     // Catch: java.lang.RuntimeException -> L25
            int r5 = r1.size()     // Catch: java.lang.RuntimeException -> L25
            r6 = r3
        L7b:
            if (r6 >= r5) goto L8d
            java.lang.Object r7 = r1.get(r6)     // Catch: java.lang.RuntimeException -> L25
            int r6 = r6 + 1
            pqb r7 = (pqb) r7     // Catch: java.lang.RuntimeException -> L25
            java.lang.String r7 = r7.n()     // Catch: java.lang.RuntimeException -> L25
            r4.add(r7)     // Catch: java.lang.RuntimeException -> L25
            goto L7b
        L8d:
            r2.getClass()     // Catch: java.lang.RuntimeException -> L25
            int r1 = r4.size()     // Catch: java.lang.RuntimeException -> L25
            r5 = r3
        L95:
            if (r5 >= r1) goto Lb2
            java.lang.Object r6 = r4.get(r5)     // Catch: java.lang.RuntimeException -> L25
            int r5 = r5 + 1
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.RuntimeException -> L25
            android.content.Context r7 = r2.a     // Catch: java.lang.Throwable -> L95
            java.lang.ClassLoader r7 = r7.getClassLoader()     // Catch: java.lang.Throwable -> L95
            java.lang.Class r6 = java.lang.Class.forName(r6, r3, r7)     // Catch: java.lang.Throwable -> L95
            boolean r6 = r6.isAssignableFrom(r0)     // Catch: java.lang.Throwable -> L95
            if (r6 == 0) goto L95
            goto L25
        Lb1:
            r3 = 1
        Lb2:
            r8.l = r3
            if (r10 == 0) goto Lf9
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Set r9 = r11.entrySet()
            java.util.Iterator r9 = r9.iterator()
        Lc3:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto Lf0
            java.lang.Object r11 = r9.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r12 = r11.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r11 = r11.getValue()
            java.lang.ref.WeakReference r11 = (java.lang.ref.WeakReference) r11
            java.lang.Object r11 = r11.get()
            android.view.View r11 = (android.view.View) r11
            if (r11 == 0) goto Le9
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r12, r11)
            goto Lea
        Le9:
            r0 = 0
        Lea:
            if (r0 == 0) goto Lc3
            r8.add(r0)
            goto Lc3
        Lf0:
            java.util.Map r8 = rbd.h(r8)
            n08 r9 = n08.a
            r13.a(r10, r8, r9)
        Lf9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ne3.a(java.lang.ref.WeakReference, f43, java.util.LinkedHashMap, ads_mobile_sdk.ew1, ads_mobile_sdk.ew1):void");
    }
}
