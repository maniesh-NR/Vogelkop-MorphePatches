package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.style.ImageSpan;
import com.opera.android.text.ThemeDependentSpan;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Laua;", "Landroid/text/style/ImageSpan;", "Lcom/opera/android/text/ThemeDependentSpan;", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class aua extends ImageSpan implements ThemeDependentSpan {
    public final esk a;
    public final Function0 b;
    public final int c;
    public final Paint d;

    public aua(esk eskVar, Function0 function0, int i) {
        super(new LayerDrawable(new ColorDrawable[]{new ColorDrawable(0)}));
        this.a = eskVar;
        this.b = function0;
        this.c = i;
        this.d = new Paint();
        b();
    }

    @Override // com.opera.android.text.ThemeDependentSpan
    public final void a(Context context) {
        b();
    }

    public final void b() {
        Paint paint = this.d;
        if (paint.getColor() != 0) {
            paint.setColor(((Number) this.a.get()).intValue());
        }
        Rect bounds = ((LayerDrawable) super.getDrawable()).getBounds();
        Drawable drawable = (Drawable) this.b.invoke();
        int iWidth = drawable.getBounds().width();
        int iHeight = drawable.getBounds().height();
        ((LayerDrawable) super.getDrawable()).setDrawable(0, drawable);
        LayerDrawable layerDrawable = (LayerDrawable) super.getDrawable();
        int i = bounds.left;
        int i2 = bounds.top;
        layerDrawable.setBounds(i, i2, iWidth + i, iHeight + i2);
        ((LayerDrawable) super.getDrawable()).invalidateSelf();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6 = this.c;
        LayerDrawable layerDrawable = (LayerDrawable) super.getDrawable();
        int iSave = canvas.save();
        try {
            canvas.drawRect(f, i3, layerDrawable.getBounds().width() + f + i6, i5, this.d);
            canvas.translate(i6 + f, ((i5 - i3) / 2) - (layerDrawable.getBounds().height() / 2));
            layerDrawable.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.text.style.ImageSpan, android.text.style.DynamicDrawableSpan
    public final Drawable getDrawable() {
        return (LayerDrawable) super.getDrawable();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return super.getSize(paint, charSequence, i, i2, fontMetricsInt) + this.c;
    }
}
