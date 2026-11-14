package defpackage;

import android.app.slice.Slice;
import android.graphics.Insets;
import android.service.autofill.InlinePresentation;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;
import android.widget.inline.InlinePresentationSpec;

/* loaded from: classes.dex */
public abstract /* synthetic */ class dz0 {
    public static /* synthetic */ InlinePresentation a(Slice slice, InlinePresentationSpec inlinePresentationSpec) {
        return new InlinePresentation(slice, inlinePresentationSpec, false);
    }

    public static /* synthetic */ WindowInsetsAnimation.Bounds b(Insets insets, Insets insets2) {
        return new WindowInsetsAnimation.Bounds(insets, insets2);
    }

    public static /* synthetic */ WindowInsetsAnimation c(int i, Interpolator interpolator, long j) {
        return new WindowInsetsAnimation(i, interpolator, j);
    }

    public static /* synthetic */ void d() {
    }

    public static /* synthetic */ InlinePresentation e(Slice slice, InlinePresentationSpec inlinePresentationSpec) {
        return new InlinePresentation(slice, inlinePresentationSpec, true);
    }

    public static /* synthetic */ void f() {
    }

    public static /* synthetic */ InlinePresentation g(Slice slice, InlinePresentationSpec inlinePresentationSpec) {
        return new InlinePresentation(slice, inlinePresentationSpec, false);
    }
}
