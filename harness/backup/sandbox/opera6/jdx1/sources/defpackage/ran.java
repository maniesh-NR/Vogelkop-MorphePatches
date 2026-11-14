package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class ran extends y2m {
    public static final String[] G = {"android:visibility:visibility", "android:visibility:parent"};
    public byte F = 3;

    public static void P(k3m k3mVar) {
        View view = k3mVar.b;
        int visibility = view.getVisibility();
        HashMap map = k3mVar.a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.qan Q(defpackage.k3m r8, defpackage.k3m r9) {
        /*
            qan r0 = new qan
            r0.<init>()
            r1 = 0
            r0.a = r1
            r0.b = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.c = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.e = r6
            goto L33
        L2f:
            r0.c = r3
            r0.e = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.d = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f = r2
            goto L56
        L52:
            r0.d = r3
            r0.f = r2
        L56:
            r2 = 1
            if (r8 == 0) goto L83
            if (r9 == 0) goto L8c
            int r8 = r0.c
            int r9 = r0.d
            if (r8 != r9) goto L75
            android.view.ViewGroup r8 = r0.e
            android.view.ViewGroup r9 = r0.f
            if (r8 == r9) goto L96
            if (r9 != 0) goto L6e
            r0.b = r1
            r0.a = r2
            return r0
        L6e:
            if (r8 != 0) goto L96
            r0.b = r2
            r0.a = r2
            return r0
        L75:
            if (r8 != 0) goto L7c
            r0.b = r1
            r0.a = r2
            return r0
        L7c:
            if (r9 != 0) goto L96
            r0.b = r2
            r0.a = r2
            return r0
        L83:
            int r8 = r0.d
            if (r8 != 0) goto L8c
            r0.b = r2
            r0.a = r2
            return r0
        L8c:
            if (r9 != 0) goto L96
            int r8 = r0.c
            if (r8 != 0) goto L96
            r0.b = r1
            r0.a = r2
        L96:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ran.Q(k3m, k3m):qan");
    }

    public abstract ObjectAnimator R(ViewGroup viewGroup, View view, k3m k3mVar, k3m k3mVar2);

    public abstract ObjectAnimator S(ViewGroup viewGroup, View view, k3m k3mVar, k3m k3mVar2);

    @Override // defpackage.y2m
    public void f(k3m k3mVar) {
        P(k3mVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        if (Q(q(r5, false), u(r5, false)).a == false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01dd  */
    @Override // defpackage.y2m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator n(android.view.ViewGroup r25, defpackage.k3m r26, defpackage.k3m r27) {
        /*
            Method dump skipped, instructions count: 631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ran.n(android.view.ViewGroup, k3m, k3m):android.animation.Animator");
    }

    @Override // defpackage.y2m
    public final String[] t() {
        return G;
    }

    @Override // defpackage.y2m
    public final boolean x(k3m k3mVar, k3m k3mVar2) {
        if (k3mVar == null) {
            if (k3mVar2 == null) {
                return false;
            }
        } else if (k3mVar2 != null && k3mVar2.a.containsKey("android:visibility:visibility") != k3mVar.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        qan qanVarQ = Q(k3mVar, k3mVar2);
        if (qanVarQ.a) {
            return qanVarQ.c == 0 || qanVarQ.d == 0;
        }
        return false;
    }
}
