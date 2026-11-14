package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import defpackage.itd;
import defpackage.l8n;
import defpackage.le;
import defpackage.ne;
import defpackage.qe;
import defpackage.xp1;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {
    public TypedValue a;
    public TypedValue b;
    public TypedValue c;
    public TypedValue d;
    public TypedValue e;
    public TypedValue f;
    public final Rect g;
    public pjn h;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.g = new Rect();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        pjn pjnVar = this.h;
        if (pjnVar != null) {
            pjnVar.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ne neVar;
        super.onDetachedFromWindow();
        pjn pjnVar = this.h;
        if (pjnVar != null) {
            xp1 xp1Var = (xp1) pjnVar.b;
            ActionBarOverlayLayout actionBarOverlayLayout = xp1Var.r;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.h();
                qe qeVar = actionBarOverlayLayout.e.a.a;
                if (qeVar != null && (neVar = qeVar.t) != null) {
                    neVar.j();
                    le leVar = neVar.p;
                    if (leVar != null && leVar.b()) {
                        leVar.j.dismiss();
                    }
                }
            }
            if (xp1Var.w != null) {
                xp1Var.l.getDecorView().removeCallbacks(xp1Var.x);
                if (xp1Var.w.isShowing()) {
                    try {
                        xp1Var.w.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                xp1Var.w = null;
            }
            l8n l8nVar = xp1Var.y;
            if (l8nVar != null) {
                l8nVar.b();
            }
            itd itdVar = xp1Var.A(0).h;
            if (itdVar != null) {
                itdVar.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }
}
