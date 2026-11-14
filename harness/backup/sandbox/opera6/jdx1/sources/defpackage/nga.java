package defpackage;

import android.view.ViewGroup;
import com.opera.android.StatusBarDrawingFrameLayout;

/* loaded from: classes.dex */
public final class nga {
    public int a;
    public float b;
    public final Object c;

    public nga(int i, kg5 kg5Var) {
        this.a = i;
        this.c = kg5Var;
    }

    public nga(ViewGroup viewGroup, boolean z) {
        this.c = viewGroup;
        float fH = z ? z7h.h(viewGroup.getContext(), 80.0f) : 0.0f;
        this.b = fH;
        this.a = z ? -1 : 0;
        viewGroup.setTranslationY(fH);
    }

    public nga(StatusBarDrawingFrameLayout statusBarDrawingFrameLayout, int i) {
        this.c = statusBarDrawingFrameLayout;
        this.a = i;
    }

    public nga(ljl ljlVar) {
        this.c = ljlVar;
        this.a = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(boolean r6, boolean r7, boolean r8, int r9) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.c
            ljl r0 = (defpackage.ljl) r0
            r1 = 1
            r2 = 0
            if (r6 == 0) goto L1e
            android.text.Layout r3 = r0.f
            int r3 = defpackage.zi4.B(r3, r9, r6)
            android.text.Layout r4 = r0.f
            int r4 = r4.getLineStart(r3)
            int r3 = r0.f(r3)
            if (r9 == r4) goto L1c
            if (r9 != r3) goto L1e
        L1c:
            r3 = r1
            goto L1f
        L1e:
            r3 = r2
        L1f:
            int r4 = r9 << 2
            if (r8 == 0) goto L27
            if (r3 == 0) goto L2c
            r1 = r2
            goto L2c
        L27:
            if (r3 == 0) goto L2b
            r1 = 2
            goto L2c
        L2b:
            r1 = 3
        L2c:
            int r4 = r4 + r1
            int r1 = r5.a
            if (r1 != r4) goto L34
            float r5 = r5.b
            return r5
        L34:
            if (r8 == 0) goto L3b
            float r6 = r0.j(r9, r6)
            goto L3f
        L3b:
            float r6 = r0.k(r9, r6)
        L3f:
            if (r7 == 0) goto L45
            r5.a = r4
            r5.b = r6
        L45:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nga.a(boolean, boolean, boolean, int):float");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(float r5, nt5 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ysh
            if (r0 == 0) goto L13
            r0 = r6
            ysh r0 = (defpackage.ysh) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            ysh r0 = new ysh
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            defpackage.ybh.y(r6)
            goto L43
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.ybh.y(r6)
            java.lang.Object r6 = r4.c
            kg5 r6 = (defpackage.kg5) r6
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r5)
            r0.v = r3
            java.lang.Object r6 = r6.invoke(r2, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            java.lang.Number r6 = (java.lang.Number) r6
            float r5 = r6.floatValue()
            float r6 = r4.b
            float r6 = r6 + r5
            r4.b = r6
            kotlin.Unit r4 = kotlin.Unit.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nga.b(float, nt5):java.lang.Object");
    }
}
