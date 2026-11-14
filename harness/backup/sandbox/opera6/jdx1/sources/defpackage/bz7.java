package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes.dex */
public final class bz7 extends MetricAffectingSpan {
    public final /* synthetic */ byte a;
    public final Object b;

    public bz7() {
        this.a = (byte) 0;
        this.b = new dz7();
    }

    public /* synthetic */ bz7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((dz7) obj).a(textPaint);
                textPaint.setColor(ab5.l(textPaint.getColor(), 255));
                break;
            case 1:
                wbd wbdVar = (wbd) obj;
                wbdVar.getClass();
                textPaint.setTypeface(Typeface.MONOSPACE);
                textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
                wbdVar.getClass();
                textPaint.bgColor = xf8.s(textPaint.getColor(), 25);
                break;
            case 2:
                textPaint.setFontFeatureSettings((String) obj);
                break;
            default:
                textPaint.setTypeface((Typeface) obj);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((dz7) obj).a(textPaint);
                break;
            case 1:
                ((wbd) obj).getClass();
                textPaint.setTypeface(Typeface.MONOSPACE);
                textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
                break;
            case 2:
                textPaint.setFontFeatureSettings((String) obj);
                break;
            default:
                textPaint.setTypeface((Typeface) obj);
                break;
        }
    }
}
