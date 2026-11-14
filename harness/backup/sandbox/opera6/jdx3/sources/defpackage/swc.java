package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import com.opera.android.custom_views.StylingTextView;

/* loaded from: classes.dex */
public final class swc implements a5n {
    public final /* synthetic */ byte a;
    public final FrameLayout b;
    public final StylingTextView c;

    public /* synthetic */ swc(FrameLayout frameLayout, StylingTextView stylingTextView, byte b) {
        this.a = b;
        this.b = frameLayout;
        this.c = stylingTextView;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        switch (this.a) {
        }
        return this.b;
    }
}
