package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

/* loaded from: classes.dex */
public final class gq1 extends RatingBar {
    public final f1p a;

    public gq1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130970618);
        gll.a(getContext(), this);
        f1p f1pVar = new f1p(this);
        this.a = f1pVar;
        f1pVar.u(attributeSet, 2130970618);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = (Bitmap) this.a.b;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
