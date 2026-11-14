package com.opera.android.custom_views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.opera.android.custom_views.AnimationEmptyListView;
import com.opera.android.widget.ThemeableLottieAnimationView;
import defpackage.khh;
import defpackage.ov0;
import defpackage.q9n;
import defpackage.u7;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/opera/android/custom_views/AnimationEmptyListView;", "Landroid/widget/FrameLayout;", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnimationEmptyListView extends FrameLayout {
    public static final /* synthetic */ int e = 0;
    public final ov0 a;
    public int b;
    public int c;
    public int d;

    public AnimationEmptyListView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AnimationEmptyListView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, 0, 0);
        LayoutInflater.from(context).inflate(2131558689, this);
        int i2 = 2131362034;
        n2d n2dVar = (ThemeableLottieAnimationView) w1h.j(2131362034, this);
        if (n2dVar != null) {
            i2 = 2131363509;
            StylingTextView stylingTextView = (StylingTextView) w1h.j(2131363509, this);
            if (stylingTextView != null) {
                this.a = new ov0(this, n2dVar, stylingTextView, (byte) 12);
                this.c = -1;
                u7 u7Var = new u7(this, (byte) 9);
                q9n.e(n2dVar, u7Var);
                u7Var.a(n2dVar);
                if (attributeSet != null) {
                    TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khh.c, 0, 0);
                    c(typedArrayObtainStyledAttributes.getResourceId(2, 0));
                    b(typedArrayObtainStyledAttributes.getResourceId(0, 0));
                    int integer = typedArrayObtainStyledAttributes.getInteger(1, -1);
                    this.c = integer >= -1 ? integer : -1;
                    typedArrayObtainStyledAttributes.recycle();
                    return;
                }
                return;
            }
        }
        t3p.q("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final void a() {
        if (getVisibility() == 0) {
            ov0 ov0Var = this.a;
            ((ThemeableLottieAnimationView) ov0Var.c).p(this.c);
            ((ThemeableLottieAnimationView) ov0Var.c).h();
        }
    }

    public final void b(int i) {
        if (i == this.b) {
            return;
        }
        this.b = i;
        ov0 ov0Var = this.a;
        ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) ov0Var.c;
        ThemeableLottieAnimationView themeableLottieAnimationView2 = (ThemeableLottieAnimationView) ov0Var.c;
        themeableLottieAnimationView.j(i);
        dvb dvbVar = new dvb(new String[]{"**", "IconTheme", "**"});
        PointF pointF = k3d.a;
        final byte b = 1;
        final byte b2 = 0;
        themeableLottieAnimationView2.v(dvbVar, 1, new ykj(this) { // from class: ne1
            public final /* synthetic */ AnimationEmptyListView b;

            {
                this.b = this;
            }

            public final Object k(g3d g3dVar) {
                byte b3 = b2;
                AnimationEmptyListView animationEmptyListView = this.b;
                switch (b3) {
                }
                return Integer.valueOf(animationEmptyListView.d);
            }
        });
        themeableLottieAnimationView2.v(new dvb(new String[]{"**", "IconThemeStroke", "**"}), 2, new ykj(this) { // from class: ne1
            public final /* synthetic */ AnimationEmptyListView b;

            {
                this.b = this;
            }

            public final Object k(g3d g3dVar) {
                byte b3 = b;
                AnimationEmptyListView animationEmptyListView = this.b;
                switch (b3) {
                }
                return Integer.valueOf(animationEmptyListView.d);
            }
        });
    }

    public final void c(int i) {
        ((StylingTextView) this.a.d).setText(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        isInEditMode();
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            a();
        } else {
            ((ThemeableLottieAnimationView) this.a.c).f();
        }
    }
}
