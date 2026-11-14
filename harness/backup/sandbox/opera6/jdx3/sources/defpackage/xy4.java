package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.opera.android.browser.chromium.ChromiumContainerView;
import com.opera.android.custom_views.TopPaddingFadingScrollView;
import java.util.Objects;
import org.chromium.components.embedder_support.view.ContentViewRenderView;

/* loaded from: classes.dex */
public final class xy4 {
    public final int a;
    public boolean b;
    public boolean c;
    public final FrameLayout d;
    public View e;

    public xy4(ChromiumContainerView chromiumContainerView, ContentViewRenderView contentViewRenderView, int i) {
        this.d = contentViewRenderView;
        this.a = i;
        Objects.requireNonNull(chromiumContainerView);
        this.e = chromiumContainerView;
    }

    public xy4(TopPaddingFadingScrollView topPaddingFadingScrollView, Context context) {
        this.d = topPaddingFadingScrollView;
        this.a = context.getResources().getDimensionPixelSize(2131167407);
    }

    public final void a(boolean z) {
        View view = this.e;
        if (view == null) {
            return;
        }
        view.setPaddingRelative(view.getPaddingStart(), this.e.getPaddingTop() + ((z ? 1 : -1) * this.a), this.e.getPaddingEnd(), this.e.getPaddingBottom());
        this.b = z;
    }
}
