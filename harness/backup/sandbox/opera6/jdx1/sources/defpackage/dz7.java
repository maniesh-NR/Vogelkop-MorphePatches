package defpackage;

import android.graphics.Paint;
import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class dz7 {
    public float a = -1.0f;

    public final void a(Paint paint) {
        zyk zykVar = oz7.b;
        if (zykVar == null) {
            zykVar = null;
        }
        Typeface typeface = (Typeface) zykVar.getValue();
        if (typeface != null && !typeface.equals(paint.getTypeface())) {
            paint.setTypeface(typeface);
        }
        if (this.a == paint.getTextSize()) {
            return;
        }
        paint.setTextSize(paint.getTextSize() * 1.39f);
        this.a = paint.getTextSize();
    }
}
