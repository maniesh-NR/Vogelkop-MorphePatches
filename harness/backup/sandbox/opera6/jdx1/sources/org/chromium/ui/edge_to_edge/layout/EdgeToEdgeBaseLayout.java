package org.chromium.ui.edge_to_edge.layout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.p3o;
import defpackage.r9b;
import org.chromium.base.CommandLine;

/* loaded from: classes.dex */
public class EdgeToEdgeBaseLayout extends FrameLayout {
    public final Rect a;
    public final Rect b;
    public final Rect c;
    public final Rect d;
    public final Rect e;
    public final Rect f;
    public final Rect g;
    public final Rect h;
    public final Rect i;
    public final Rect j;
    public final Paint k;
    public final Paint l;
    public final Paint m;
    public final Paint n;
    public final Paint o;
    public final r9b p;
    public final r9b q;
    public final r9b r;
    public final r9b s;
    public final r9b t;
    public final r9b u;

    public EdgeToEdgeBaseLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Rect();
        this.b = new Rect();
        this.c = new Rect();
        this.d = new Rect();
        this.e = new Rect();
        this.f = new Rect();
        this.g = new Rect();
        this.h = new Rect();
        this.i = new Rect();
        this.j = new Rect();
        Paint paint = new Paint();
        this.k = paint;
        this.l = new Paint();
        Paint paint2 = new Paint();
        this.m = paint2;
        this.n = new Paint();
        Paint paint3 = new Paint();
        this.o = paint3;
        r9b r9bVar = r9b.e;
        this.p = r9bVar;
        this.q = r9bVar;
        this.r = r9bVar;
        this.s = r9bVar;
        this.t = r9bVar;
        this.u = r9bVar;
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        paint3.setColor(-16777216);
        paint.setColor(CommandLine.d.c("enable-edge-to-edge-debug-layers") ? 1690829000 : 0);
    }

    public static void a(Canvas canvas, Rect rect, Paint paint) {
        if (rect.isEmpty()) {
            return;
        }
        canvas.save();
        canvas.clipRect(rect);
        canvas.drawPaint(paint);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Rect rect = this.b;
        Paint paint = this.l;
        a(canvas, rect, paint);
        a(canvas, this.h, paint);
        a(canvas, this.c, this.m);
        Rect rect2 = this.e;
        Paint paint2 = this.o;
        a(canvas, rect2, paint2);
        a(canvas, this.f, paint2);
        a(canvas, this.g, paint2);
        Rect rect3 = this.d;
        if (!rect3.isEmpty()) {
            Paint paint3 = this.n;
            if (paint3.getAlpha() > 0) {
                a(canvas, rect3, paint3);
            }
        }
        if (CommandLine.d.c("enable-edge-to-edge-debug-layers")) {
            Rect rect4 = this.i;
            Paint paint4 = this.k;
            a(canvas, rect4, paint4);
            a(canvas, this.j, paint4);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int left = getLeft();
        int top = getTop();
        int right = getRight();
        int bottom = getBottom();
        Rect rect = this.a;
        rect.set(left, top, right, bottom);
        Rect rectA = p3o.a(rect, this.p);
        Rect rect2 = this.b;
        rect2.set(rectA);
        r9b r9bVar = this.q;
        Rect rectA2 = p3o.a(rect, r9bVar);
        int i5 = r9bVar.c;
        int i6 = r9bVar.a;
        Rect rect3 = this.c;
        rect3.set(rectA2);
        Rect rectA3 = p3o.a(rect, this.u);
        Rect rect4 = this.h;
        rect4.set(rectA3);
        if (Rect.intersects(rect2, rect3)) {
            rect2.left += i6;
            rect2.right -= i5;
        }
        if (Rect.intersects(rect4, rect3)) {
            rect4.left += i6;
            rect4.right -= i5;
        }
        this.e.set(p3o.a(rect, this.r));
        r9b r9bVar2 = this.s;
        Rect rectA4 = p3o.a(rect, r9bVar2);
        int i7 = r9bVar2.a;
        Rect rect5 = this.f;
        rect5.set(rectA4);
        r9b r9bVar3 = this.t;
        Rect rectA5 = p3o.a(rect, r9bVar3);
        int i8 = r9bVar3.c;
        Rect rect6 = this.g;
        rect6.set(rectA5);
        if (!rect5.isEmpty() || !rect6.isEmpty()) {
            if (Rect.intersects(rect2, rect5)) {
                rect2.left += i7;
            }
            if (Rect.intersects(rect2, rect6)) {
                rect2.right -= i8;
            }
            if (Rect.intersects(rect4, rect5)) {
                rect4.left += i7;
            }
            if (Rect.intersects(rect4, rect6)) {
                rect4.right -= i8;
            }
            if (Rect.intersects(rect3, rect5)) {
                rect3.left += i7;
            }
            if (Rect.intersects(rect3, rect6)) {
                rect3.right -= i8;
            }
        }
        Rect rect7 = new Rect(rect3);
        if (r9bVar.d > 0) {
            rect7.bottom = rect7.top + 1;
        } else if (i6 > 0) {
            rect7.left = rect7.right - 1;
        } else if (i5 > 0) {
            rect7.right = rect7.left + 1;
        }
        this.d.set(rect7);
        if (CommandLine.d.c("enable-edge-to-edge-debug-layers")) {
            Rect rect8 = this.i;
            rect8.set(rect2);
            rect8.inset(rect2.width() / 4, 0);
            Rect rect9 = this.j;
            rect9.set(rect3);
            rect9.inset(rect3.width() / 4, 0);
        }
    }
}
