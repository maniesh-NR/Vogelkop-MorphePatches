package defpackage;

import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: classes.dex */
public final class zz3 extends x6g {
    public zz3(View view, Drawable drawable, float f) {
        super(drawable, view.getWidth(), view.getHeight());
        this.b.addRoundRect(new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight()), f, f, Path.Direction.CW);
    }
}
