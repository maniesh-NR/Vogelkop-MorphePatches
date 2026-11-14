package defpackage;

import android.view.View;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.NativeAdMapper;

/* loaded from: classes.dex */
public abstract class hnf extends NativeAdMapper {
    public final MediationAdLoadCallback t;
    public final qhf u;
    public MediationNativeAdCallback v;
    public bie w;
    public ksd x;
    public boolean y;

    public hnf(MediationAdLoadCallback mediationAdLoadCallback, qhf qhfVar) {
        this.t = mediationAdLoadCallback;
        this.u = qhfVar;
    }

    public final void a(String str) {
        this.u.getClass();
        qhf.a();
    }

    public final void destroy() {
        a("destroy");
        this.y = true;
        bie bieVar = this.w;
        if (bieVar != null) {
            bieVar.d();
            this.w = null;
        }
        this.x = null;
        this.v = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void trackViews(android.view.View r11, java.util.Map r12, java.util.Map r13) {
        /*
            r10 = this;
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "trackViews: containerView="
            r13.<init>(r0)
            r13.append(r11)
            java.lang.String r13 = r13.toString()
            r10.a(r13)
            bie r13 = r10.w
            if (r13 == 0) goto La0
            ksd r13 = r10.x
            if (r13 == 0) goto La0
            boolean r13 = r11 instanceof android.widget.FrameLayout
            if (r13 != 0) goto L23
            java.lang.String r11 = "trackViews: Failed to track views, invalid container view type."
            r10.a(r11)
            return
        L23:
            java.lang.String r13 = "3001"
            java.lang.Object r13 = r12.get(r13)
            r2 = r13
            android.view.View r2 = (android.view.View) r2
            java.lang.String r13 = "3004"
            java.lang.Object r13 = r12.get(r13)
            r3 = r13
            android.view.View r3 = (android.view.View) r3
            java.lang.String r13 = "3002"
            java.lang.Object r13 = r12.get(r13)
            r4 = r13
            android.view.View r4 = (android.view.View) r4
            java.lang.String r13 = "3003"
            java.lang.Object r13 = r12.get(r13)
            android.view.View r13 = (android.view.View) r13
            boolean r0 = r13 instanceof android.widget.ImageView
            r1 = 0
            if (r0 == 0) goto L50
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            r5 = r13
            r13 = r1
            goto L52
        L50:
            r13 = r1
            r5 = r13
        L52:
            ksd r1 = r10.x
            java.util.Collection r12 = r12.values()
            if (r12 == 0) goto L90
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            kotlin.collections.CollectionsKt.I(r12, r0)
            r12 = 5
            android.view.View[] r6 = new android.view.View[r12]
            r7 = 0
            r6[r7] = r1
            r8 = 1
            r6[r8] = r2
            r8 = 2
            r6[r8] = r3
            r8 = 3
            r6[r8] = r4
            r8 = 4
            r6[r8] = r5
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
        L79:
            if (r7 >= r12) goto L85
            r9 = r6[r7]
            if (r9 == 0) goto L82
            r8.add(r9)
        L82:
            int r7 = r7 + 1
            goto L79
        L85:
            r0.removeAll(r8)
            boolean r12 = r0.isEmpty()
            if (r12 != 0) goto L90
            r6 = r0
            goto L91
        L90:
            r6 = r13
        L91:
            igi r0 = new igi
            r7 = 29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            bie r10 = r10.w
            android.widget.FrameLayout r11 = (android.widget.FrameLayout) r11
            r10.e(r11, r0)
            return
        La0:
            java.lang.String r11 = "trackViews: Failed to track views, invalid native ad or media view."
            r10.a(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hnf.trackViews(android.view.View, java.util.Map, java.util.Map):void");
    }

    public final void untrackView(View view) {
        a("untrackView: view=" + view);
        bie bieVar = this.w;
        if (bieVar != null) {
            bieVar.g();
        }
    }
}
