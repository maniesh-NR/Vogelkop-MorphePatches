package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;
import java.util.Locale;

/* loaded from: classes.dex */
public final class ttl extends ReplacementSpan {
    public final View a;
    public final int b;
    public final /* synthetic */ byte c;

    public ttl(View view, int i, byte b) {
        this.c = b;
        this.a = view;
        this.b = i;
    }

    private final void a(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }

    public final String b() {
        String strV;
        if (this.a.getContext().getResources().getConfiguration().keyboard != 2 || (strV = c37.r().v(this.b)) == null) {
            return null;
        }
        Locale locale = Locale.US;
        return sko.k("(", strV, ")");
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        switch (this.c) {
            case 0:
                break;
            default:
                String strB = b();
                if (strB != null) {
                    canvas.drawText(strB, f, i4, paint);
                    break;
                }
                break;
        }
    }

    @Override // android.text.style.ReplacementSpan
    public final CharSequence getContentDescription() {
        switch (this.c) {
            case 1:
                return b();
            default:
                return super.getContentDescription();
        }
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        double dCeil;
        if (fontMetricsInt != null && (fontMetricsInt.ascent != 0 || fontMetricsInt.descent != 0 || fontMetricsInt.leading != 0 || fontMetricsInt.bottom != 0 || fontMetricsInt.top != 0)) {
            paint.getFontMetricsInt(fontMetricsInt);
        }
        switch (this.c) {
            case 0:
                if (b() == null) {
                    return 0;
                }
                dCeil = Math.ceil(paint.measureText(" "));
                break;
            default:
                if (b() == null) {
                    return 0;
                }
                dCeil = Math.ceil(paint.measureText(r0));
                break;
        }
        return (int) dCeil;
    }
}
