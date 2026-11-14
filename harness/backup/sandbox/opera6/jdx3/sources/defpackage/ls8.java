package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class ls8 extends fs8 {
    public final ks8 i;
    public final er8 j;

    public ls8(er8 er8Var) {
        super(er8Var);
        this.i = new ks8(this, (byte) 0);
        er8Var.setId(2131362851);
        this.j = er8Var;
    }

    @Override // defpackage.fs8
    public final void a0(hq8 hq8Var, boolean z) {
        er8 er8Var;
        hq8 hq8Var2;
        super.a0(hq8Var, z);
        if (this.d == null || (hq8Var2 = (er8Var = this.j).s) == hq8Var) {
            return;
        }
        if (hq8Var2 != null) {
            hq8Var2.o(er8Var);
        }
        er8Var.s = hq8Var;
        if (hq8Var != null) {
            hq8Var.b(er8Var);
        }
        yr8 yr8Var = er8Var.t;
        yr8Var.f = er8Var.s;
        yr8Var.j = 0;
        yr8Var.e();
        yr8Var.k = null;
        yr8Var.l = null;
        er8Var.u = false;
        er8Var.t();
        if (er8Var.s != null) {
            er8Var.q(z);
            er8Var.s();
        }
        er8Var.invalidate();
        er8Var.x();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.i.onClick(view);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        ns8 ns8Var;
        hq8 hq8Var = this.f;
        if (hq8Var == null || (ns8Var = this.d) == null) {
            return false;
        }
        return ns8Var.L(this, hq8Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    @Override // defpackage.th7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(boolean r9) {
        /*
            r8 = this;
            er8 r8 = r8.j
            int r0 = r8.z
            boolean r1 = r8.u
            r2 = 0
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 != 0) goto L15
            if (r9 == 0) goto L11
            r8.u = r4
            goto L15
        L11:
            r8.t()
            goto L45
        L15:
            java.lang.Float r1 = r8.t()
            r6 = 1066611507(0x3f933333, float:1.15)
            if (r1 == 0) goto L23
            float r1 = r1.floatValue()
            goto L28
        L23:
            if (r9 == 0) goto L27
            r1 = r5
            goto L28
        L27:
            r1 = r6
        L28:
            if (r9 != 0) goto L2b
            r6 = r5
        L2b:
            float[] r7 = new float[r3]
            r7[r2] = r1
            r7[r4] = r6
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r7)
            r8.v = r1
            long r6 = (long) r0
            r1.setDuration(r6)
            android.animation.ValueAnimator r1 = r8.v
            r1.addUpdateListener(r8)
            android.animation.ValueAnimator r1 = r8.v
            r1.start()
        L45:
            android.animation.ValueAnimator r1 = r8.w
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L60
            java.lang.Object r1 = r1.getAnimatedValue()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            android.animation.ValueAnimator r7 = r8.w
            r7.cancel()
            android.animation.ValueAnimator r7 = r8.w
            r7.removeUpdateListener(r8)
            goto L65
        L60:
            if (r9 == 0) goto L64
            r1 = r5
            goto L65
        L64:
            r1 = r6
        L65:
            if (r9 == 0) goto L68
            r5 = r6
        L68:
            float[] r9 = new float[r3]
            r9[r2] = r1
            r9[r4] = r5
            android.animation.ValueAnimator r9 = android.animation.ValueAnimator.ofFloat(r9)
            r8.w = r9
            long r0 = (long) r0
            r9.setDuration(r0)
            android.animation.ValueAnimator r9 = r8.w
            r9.addUpdateListener(r8)
            android.animation.ValueAnimator r9 = r8.w
            r9.start()
            r8.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ls8.x(boolean):void");
    }
}
