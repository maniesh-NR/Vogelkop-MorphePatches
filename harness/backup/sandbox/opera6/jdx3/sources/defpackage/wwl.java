package defpackage;

import android.graphics.Rect;
import android.view.TouchDelegate;
import com.opera.android.custom_views.StylingImageView;

/* loaded from: classes.dex */
public final class wwl {
    public final StylingImageView a;
    public final Rect b;
    public final TouchDelegate c;

    /* JADX WARN: Multi-variable type inference failed */
    public wwl(StylingImageView stylingImageView) {
        this.a = stylingImageView;
        Rect rect = new Rect(0, 0, stylingImageView.getWidth(), stylingImageView.getHeight());
        this.b = rect;
        this.c = new TouchDelegate(rect, stylingImageView);
    }
}
