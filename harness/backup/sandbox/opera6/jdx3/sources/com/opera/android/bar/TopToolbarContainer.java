package com.opera.android.bar;

import J.N;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.opera.android.InputFilterOptimizedFrameLayout;
import com.opera.android.browser.chromium.ChromiumContainerView;
import defpackage.cbl;
import defpackage.xy4;
import defpackage.zy4;
import org.chromium.components.embedder_support.view.ContentViewRenderView;

/* loaded from: classes.dex */
public class TopToolbarContainer extends InputFilterOptimizedFrameLayout {
    public static final /* synthetic */ int j = 0;
    public final Rect c;
    public boolean d;
    public int e;
    public int f;
    public vvl g;
    public xy4 h;
    public final cbl i;

    public TopToolbarContainer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new Rect();
        this.i = new cbl((Object) this, (byte) 14);
    }

    public final void a(Rect rect) {
        vvl vvlVar = this.g;
        if (vvlVar != null) {
            int i = vvlVar.d;
            View view = vvlVar.a;
            Rect rect2 = vvlVar.b;
            if (rect == null) {
                rect2.set(0, 0, view.getWidth(), i);
            } else if (rect.intersect(0, 0, view.getWidth(), i)) {
                rect2.union(rect);
            }
            if (this.d) {
                return;
            }
            this.d = true;
            post(this.i);
        }
    }

    public final void b() {
        xy4 xy4Var = this.h;
        if (xy4Var != null) {
            int width = getWidth();
            int i = this.g.d;
            int i2 = this.e;
            int i3 = this.f;
            ContentViewRenderView contentViewRenderView = xy4Var.d;
            if (!xy4Var.b) {
                xy4Var.b = true;
                N.M_RC1fyW(contentViewRenderView.a, 2131364811);
            }
            boolean z = xy4Var.c;
            if (i2 != 0) {
                if (!z) {
                    xy4Var.c = true;
                    N.M3d_tX46(contentViewRenderView.a, true);
                }
            } else if (z) {
                xy4Var.c = false;
                N.M3d_tX46(contentViewRenderView.a, false);
            }
            zy4 zy4Var = ((ChromiumContainerView) xy4Var.e).b;
            int i4 = zy4Var.g + zy4Var.c.b;
            int i5 = xy4Var.a;
            N.MrBIoQwn(contentViewRenderView.a, width, i4 + i5, i, i5);
            contentViewRenderView.e(i2, i3);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        ViewParent viewParentInvalidateChildInParent = super.invalidateChildInParent(iArr, rect);
        a(rect);
        return viewParentInvalidateChildInParent;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (this.g != null) {
            int iFloor = (int) Math.floor(view.getX());
            int iFloor2 = (int) Math.floor(view.getY());
            int width = view.getWidth() + iFloor;
            int height = view.getHeight() + iFloor2;
            Rect rect = this.c;
            rect.set(iFloor, iFloor2, width, height);
            a(rect);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        b();
    }
}
