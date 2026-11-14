package com.opera.android.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.util.AttributeSet;
import com.google.android.material.slider.h;
import defpackage.dll;
import defpackage.f0a;
import defpackage.hjf;
import defpackage.kkf;
import defpackage.q9n;
import defpackage.u8n;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/opera/android/widget/ScheduleRangeSlider;", "Lcom/google/android/material/slider/h;", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScheduleRangeSlider extends h {
    public boolean h1;
    public ColorStateList i1;
    public ColorStateList j1;
    public ColorStateList k1;
    public ColorStateList l1;
    public final f0a m1;

    /* JADX WARN: Multi-variable type inference failed */
    public ScheduleRangeSlider(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i1 = x0();
        this.j1 = y0();
        this.k1 = v0();
        this.l1 = w0();
        this.m1 = new f0a();
        boolean z = this.h1;
        ArrayList arrayListY = y();
        float fE0 = E0(0.25f);
        Float f = (Float) CollectionsKt.M(z ? 1 : 0, arrayListY);
        a0(Float.valueOf(f != null ? f.floatValue() : fE0), Float.valueOf(F0()));
        kkf kkfVar = new kkf(this, (byte) 13);
        l5b l5bVar = q9n.c;
        dll dllVarV = hjf.v(getContext());
        if (dllVarV == null) {
            return;
        }
        u8n.b(dllVarV, this, kkfVar);
    }

    public final float E0(float f) {
        return djh.b(((x() - w()) * f) + w(), w(), x());
    }

    public final float F0() {
        int i = !this.h1 ? 1 : 0;
        ArrayList arrayListY = y();
        float fE0 = E0(0.75f);
        Float f = (Float) CollectionsKt.M(i, arrayListY);
        return f != null ? f.floatValue() : fE0;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SimplifyVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v12 boolean, still in use, count: 1, list:
          (r0v12 boolean) from 0x0069: IF  (r0v12 boolean) != (wrap:boolean:NOT (r1v7 boolean) = 
          (wrap:boolean:0x0065: IGET (r0v12 boolean) = (r3v0 'this' com.opera.android.widget.ScheduleRangeSlider A[IMMUTABLE_TYPE, THIS]) A[DONT_GENERATE, FORCE_ASSIGN_INLINE, REMOVE, WRAPPED] com.opera.android.widget.ScheduleRangeSlider.h1 boolean)
         A[WRAPPED])  -> B:17:0x006b A[HIDDEN]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.unbindArgUsage(InsnRemover.java:174)
        	at jadx.core.utils.InsnRemover.unbindAllArgs(InsnRemover.java:106)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:90)
        	at jadx.core.utils.InsnRemover.unbindArgUsage(InsnRemover.java:174)
        	at jadx.core.dex.instructions.args.InsnArg.wrapInstruction(InsnArg.java:141)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyArgs(SimplifyVisitor.java:116)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyInsn(SimplifyVisitor.java:132)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyBlock(SimplifyVisitor.java:86)
        	at jadx.core.dex.visitors.SimplifyVisitor.visit(SimplifyVisitor.java:71)
        */
    public final void G0(java.util.List r4) {
        /*
            r3 = this;
            boolean r0 = r3.h1
            java.util.ArrayList r1 = r3.y()
            r2 = 1048576000(0x3e800000, float:0.25)
            float r2 = r3.E0(r2)
            java.lang.Object r0 = kotlin.collections.CollectionsKt.M(r0, r1)
            java.lang.Float r0 = (java.lang.Float) r0
            if (r0 == 0) goto L18
            float r2 = r0.floatValue()
        L18:
            r0 = 0
            java.lang.Object r0 = kotlin.collections.CollectionsKt.M(r0, r4)
            java.lang.Float r0 = (java.lang.Float) r0
            if (r0 == 0) goto L25
            float r2 = r0.floatValue()
        L25:
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
            float r1 = r3.F0()
            r2 = 1
            java.lang.Object r4 = kotlin.collections.CollectionsKt.M(r2, r4)
            java.lang.Float r4 = (java.lang.Float) r4
            if (r4 == 0) goto L3a
            float r1 = r4.floatValue()
        L3a:
            java.lang.Float r4 = java.lang.Float.valueOf(r1)
            java.lang.Float[] r4 = new java.lang.Float[]{r0, r4}
            java.util.List r4 = java.util.Arrays.asList(r4)
            int r0 = r4.size()
            r1 = 2
            if (r0 != r1) goto L70
            java.lang.Object r0 = kotlin.collections.CollectionsKt.K(r4)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            java.lang.Object r1 = kotlin.collections.CollectionsKt.Q(r4)
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L70
            boolean r0 = r3.h1
            r1 = r0 ^ 1
            if (r0 == r1) goto L70
            r3.h1 = r1
            r3.H0(r1)
        L70:
            super.D0(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.opera.android.widget.ScheduleRangeSlider.G0(java.util.List):void");
    }

    public final void H0(boolean z) {
        super.U(z ? this.l1 : this.k1);
        super.V(z ? this.k1 : this.l1);
        super.W(z ? this.j1 : this.i1);
        super.Y(z ? this.i1 : this.j1);
    }

    public final void U(ColorStateList colorStateList) {
        this.k1 = colorStateList;
        if (this.h1) {
            colorStateList = this.l1;
        }
        super.U(colorStateList);
    }

    public final void V(ColorStateList colorStateList) {
        this.l1 = colorStateList;
        if (this.h1) {
            colorStateList = this.k1;
        }
        super.V(colorStateList);
    }

    public final void W(ColorStateList colorStateList) {
        this.i1 = colorStateList;
        if (this.h1) {
            colorStateList = this.j1;
        }
        super.W(colorStateList);
    }

    public final void Y(ColorStateList colorStateList) {
        this.j1 = colorStateList;
        if (this.h1) {
            colorStateList = this.i1;
        }
        super.Y(colorStateList);
    }

    public final void a0(Float... fArr) {
        G0(e82.p(fArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        zyk zykVar = this.m1.a;
        ((Rect) zykVar.getValue()).set(0, 0, getWidth(), getHeight());
        setSystemGestureExclusionRects(Collections.singletonList((Rect) zykVar.getValue()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072 A[PHI: r0
      0x0072: PHI (r0v3 float) = (r0v2 float), (r0v8 float) binds: [B:23:0x0070, B:16:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            boolean r0 = super.onTouchEvent(r7)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r6.u0()
            r2 = 1
            if (r0 < 0) goto L87
            int r3 = r7.getActionMasked()
            r4 = 2
            if (r3 != r4) goto L87
            int r3 = r0 + (-1)
            int r3 = java.lang.Math.abs(r3)
            float r7 = r7.getX()
            int r4 = r6.z0()
            float r4 = (float) r4
            float r7 = r7 - r4
            int r4 = r6.A0()
            float r4 = (float) r4
            float r7 = r7 / r4
            int r4 = r6.getLayoutDirection()
            if (r4 != r2) goto L36
            r4 = 1065353216(0x3f800000, float:1.0)
            float r7 = r4 - r7
        L36:
            float r7 = r6.E0(r7)
            java.util.ArrayList r4 = r6.y()
            java.lang.Object r4 = r4.get(r3)
            java.lang.Float r4 = (java.lang.Float) r4
            if (r0 == 0) goto L66
            if (r0 == r2) goto L55
            float r0 = r4.floatValue()
            float r4 = r4.floatValue()
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 <= 0) goto L73
            goto L72
        L55:
            float r0 = r4.floatValue()
            float r4 = r4.floatValue()
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 >= 0) goto L62
            r1 = r2
        L62:
            r5 = r0
            r0 = r7
            r7 = r5
            goto L73
        L66:
            float r0 = r4.floatValue()
            float r4 = r4.floatValue()
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 <= 0) goto L73
        L72:
            r1 = r2
        L73:
            if (r1 == 0) goto L87
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Float[] r7 = new java.lang.Float[]{r7, r0}
            r6.a0(r7)
            r6.K(r3)
        L87:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.opera.android.widget.ScheduleRangeSlider.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
