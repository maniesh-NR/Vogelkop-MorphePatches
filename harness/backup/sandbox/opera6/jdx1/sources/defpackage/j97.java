package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import com.opera.android.bar.DimmedUrlTextView;
import com.opera.android.custom_views.StylingTextView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j97 extends CharacterStyle implements UpdateAppearance {
    public final /* synthetic */ byte a;
    public final Object b;

    public j97(DimmedUrlTextView dimmedUrlTextView) {
        this.a = (byte) 0;
        this.b = dimmedUrlTextView;
    }

    public /* synthetic */ j97(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                StylingTextView stylingTextView = (DimmedUrlTextView) obj;
                textPaint.setColor(stylingTextView.getHintTextColors().getColorForState(stylingTextView.getDrawableState(), 0));
                break;
            case 1:
                nk7 nk7Var = (nk7) obj;
                if (textPaint != null) {
                    if (!Intrinsics.a(nk7Var, a39.a)) {
                        if (!(nk7Var instanceof qik)) {
                            h9o.p();
                            break;
                        } else {
                            textPaint.setStyle(Paint.Style.STROKE);
                            qik qikVar = (qik) nk7Var;
                            textPaint.setStrokeWidth(qikVar.a);
                            textPaint.setStrokeMiter(qikVar.b);
                            int i = qikVar.d;
                            textPaint.setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 1 ? Paint.Join.ROUND : i == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
                            int i2 = qikVar.c;
                            textPaint.setStrokeCap(i2 == 0 ? Paint.Cap.BUTT : i2 == 1 ? Paint.Cap.ROUND : i2 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
                            textPaint.setPathEffect(null);
                            break;
                        }
                    } else {
                        textPaint.setStyle(Paint.Style.FILL);
                        break;
                    }
                }
                break;
            default:
                ColorStateList colorStateListF = f03.F((Context) obj);
                textPaint.setColor(colorStateListF.getColorForState(textPaint.drawableState, colorStateListF.getDefaultColor()));
                break;
        }
    }
}
