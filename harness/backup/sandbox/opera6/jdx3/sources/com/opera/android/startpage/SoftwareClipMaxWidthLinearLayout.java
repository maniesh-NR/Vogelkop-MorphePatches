package com.opera.android.startpage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import com.jensdriller.libs.undobar.MaxWidthLinearLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/opera/android/startpage/SoftwareClipMaxWidthLinearLayout;", "Lcom/jensdriller/libs/undobar/MaxWidthLinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SoftwareClipMaxWidthLinearLayout extends MaxWidthLinearLayout {
    public final Path d;
    public final RectF e;

    public SoftwareClipMaxWidthLinearLayout(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new Path();
        this.e = new RectF();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (!canvas.isHardwareAccelerated()) {
            Drawable background = getBackground();
            GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
            float cornerRadius = gradientDrawable != null ? gradientDrawable.getCornerRadius() : 0.0f;
            if (cornerRadius > 0.0f) {
                float width = getWidth();
                float height = getHeight();
                RectF rectF = this.e;
                rectF.set(0.0f, 0.0f, width, height);
                Path path = this.d;
                path.rewind();
                path.addRoundRect(rectF, cornerRadius, cornerRadius, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                super.draw(canvas);
                canvas.restore();
                return;
            }
        }
        super.draw(canvas);
    }
}
