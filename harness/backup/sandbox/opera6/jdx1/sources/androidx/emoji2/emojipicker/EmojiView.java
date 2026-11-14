package androidx.emoji2.emojipicker;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/emoji2/emojipicker/EmojiView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "emoji2-emojipicker"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EmojiView extends View {
    public boolean a;
    public final TextPaint b;
    public final Bitmap c;
    public CharSequence d;

    public EmojiView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(context.getDrawable(2131233154));
        setImportantForAccessibility(1);
        this.a = true;
        TextPaint textPaint = new TextPaint(3);
        textPaint.setTextSize(TypedValue.applyDimension(2, 30.0f, context.getResources().getDisplayMetrics()));
        this.b = textPaint;
        Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
        int i = fontMetricsInt.bottom - fontMetricsInt.top;
        this.c = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        canvas.save();
        float width = canvas.getWidth();
        Bitmap bitmap = this.c;
        canvas.scale(width / bitmap.getWidth(), canvas.getHeight() / bitmap.getHeight());
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iMin = Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2)) - getContext().getResources().getDimensionPixelSize(2131165648);
        setMeasuredDimension(iMin, iMin);
    }
}
