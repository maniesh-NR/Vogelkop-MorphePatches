package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class v77 extends d4 implements f87, bcf {
    public final Window h;
    public final t0g i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;

    public v77(Context context, Window window) {
        super(context);
        this.h = window;
        this.i = hyg.k(oup.b);
        WeakHashMap weakHashMap = r5n.a;
        h5n.c(this, this);
        n2o.a(this, new fc1(this, (byte) 1));
    }

    @Override // defpackage.d4
    public final void a(ih5 ih5Var, int i) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(1735448596);
        int i2 = (vt9Var.h(this) ? 4 : 2) | i;
        if (vt9Var.N(i2 & 1, (i2 & 3) != 2)) {
            ((Function2) this.i.getValue()).invoke(vt9Var, 0);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new whf(this, i, (byte) 20);
        }
    }

    @Override // defpackage.d4
    public final boolean g() {
        return this.m;
    }

    @Override // defpackage.f87
    public final Window getWindow() {
        return this.h;
    }

    @Override // defpackage.d4
    public final void h(int i, int i2, int i3, int i4, boolean z) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i5 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i6 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    @Override // defpackage.d4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(int r13, int r14) {
        /*
            r12 = this;
            r0 = 0
            android.view.View r1 = r12.getChildAt(r0)
            if (r1 != 0) goto Lb
            super.i(r13, r14)
            return
        Lb:
            int r2 = android.view.View.MeasureSpec.getSize(r13)
            int r3 = android.view.View.MeasureSpec.getSize(r14)
            int r4 = android.view.View.MeasureSpec.getMode(r14)
            r5 = -2
            android.view.Window r6 = r12.h
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 != r7) goto L49
            boolean r8 = r12.j
            if (r8 != 0) goto L49
            android.view.WindowManager$LayoutParams r8 = r6.getAttributes()
            int r8 = r8.height
            if (r8 != r5) goto L49
            boolean r8 = r12.k
            if (r8 == 0) goto L46
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 30
            if (r8 >= r9) goto L3b
            dg1 r8 = defpackage.dg1.a
            int r8 = r8.a(r6)
            goto L4a
        L3b:
            r9 = 32
            if (r8 >= r9) goto L49
            fg1 r8 = defpackage.fg1.a
            int r8 = r8.a(r6)
            goto L4a
        L46:
            int r8 = r3 + 1
            goto L4a
        L49:
            r8 = r3
        L4a:
            int r9 = r12.getPaddingLeft()
            int r10 = r12.getPaddingRight()
            int r10 = r10 + r9
            int r9 = r12.getPaddingTop()
            int r11 = r12.getPaddingBottom()
            int r11 = r11 + r9
            int r9 = r2 - r10
            if (r9 >= 0) goto L61
            r9 = r0
        L61:
            int r8 = r8 - r11
            if (r8 < 0) goto L65
            r0 = r8
        L65:
            int r8 = android.view.View.MeasureSpec.getMode(r13)
            if (r8 == 0) goto L6f
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r7)
        L6f:
            if (r4 == 0) goto L75
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r7)
        L75:
            r1.measure(r13, r14)
            r13 = 1073741824(0x40000000, float:2.0)
            if (r8 == r7) goto L85
            if (r8 == r13) goto L8e
            int r14 = r1.getMeasuredWidth()
            int r2 = r14 + r10
            goto L8e
        L85:
            int r14 = r1.getMeasuredWidth()
            int r14 = r14 + r10
            int r2 = java.lang.Math.min(r2, r14)
        L8e:
            if (r4 == r7) goto L9a
            if (r4 == r13) goto L98
            int r13 = r1.getMeasuredHeight()
            int r13 = r13 + r11
            goto La3
        L98:
            r13 = r3
            goto La3
        L9a:
            int r13 = r1.getMeasuredHeight()
            int r13 = r13 + r11
            int r13 = java.lang.Math.min(r3, r13)
        La3:
            r12.setMeasuredDimension(r2, r13)
            boolean r13 = r12.k
            if (r13 != 0) goto Lc4
            int r13 = r1.getMeasuredHeight()
            int r13 = r13 + r11
            if (r13 <= r3) goto Lc4
            android.view.WindowManager$LayoutParams r13 = r6.getAttributes()
            int r13 = r13.height
            if (r13 != r5) goto Lc4
            r6.addFlags(r7)
            boolean r12 = r12.j
            if (r12 != 0) goto Lc4
            r12 = -1
            r6.setLayout(r12, r12)
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v77.i(int, int):void");
    }

    @Override // defpackage.bcf
    public final g3o l0(View view, g3o g3oVar) {
        if (!this.k) {
            View childAt = getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return g3oVar.a.r(iMax, iMax2, iMax3, iMax4);
            }
        }
        return g3oVar;
    }
}
