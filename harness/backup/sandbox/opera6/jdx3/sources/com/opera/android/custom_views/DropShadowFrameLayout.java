package com.opera.android.custom_views;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.opera.android.custom_views.DropShadowFrameLayout;
import defpackage.laj;
import defpackage.qm7;
import defpackage.wg5;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/opera/android/custom_views/DropShadowFrameLayout;", "Landroid/widget/FrameLayout;", "graphics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public class DropShadowFrameLayout extends FrameLayout {
    public static final /* synthetic */ int b = 0;
    public final zi4 a;

    public DropShadowFrameLayout(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        final byte b2 = 0;
        final byte b3 = 1;
        this.a = Build.VERSION.SDK_INT >= 31 ? new pm7(new Function0(this) { // from class: nm7
            public final /* synthetic */ DropShadowFrameLayout b;

            {
                this.b = this;
            }

            public final Object invoke() {
                int width;
                byte b4 = b2;
                DropShadowFrameLayout dropShadowFrameLayout = this.b;
                switch (b4) {
                    case 0:
                        int i = DropShadowFrameLayout.b;
                        width = dropShadowFrameLayout.getWidth();
                        break;
                    default:
                        int i2 = DropShadowFrameLayout.b;
                        width = dropShadowFrameLayout.getHeight();
                        break;
                }
                return Integer.valueOf(width);
            }
        }, new Function0(this) { // from class: nm7
            public final /* synthetic */ DropShadowFrameLayout b;

            {
                this.b = this;
            }

            public final Object invoke() {
                int width;
                byte b4 = b3;
                DropShadowFrameLayout dropShadowFrameLayout = this.b;
                switch (b4) {
                    case 0:
                        int i = DropShadowFrameLayout.b;
                        width = dropShadowFrameLayout.getWidth();
                        break;
                    default:
                        int i2 = DropShadowFrameLayout.b;
                        width = dropShadowFrameLayout.getHeight();
                        break;
                }
                return Integer.valueOf(width);
            }
        }) : new qm7();
    }

    public static final Unit a(DropShadowFrameLayout dropShadowFrameLayout, Canvas canvas) {
        super.dispatchDraw(canvas);
        return Unit.a;
    }

    public final void b(laj lajVar) {
        if (this.a.Y(lajVar)) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        wg5 wg5Var = new wg5(this, (byte) 26);
        zi4 zi4Var = this.a;
        if (zi4Var.F() || canvas.isHardwareAccelerated()) {
            zi4Var.k(canvas, wg5Var);
        }
        wg5Var.invoke(canvas);
    }
}
