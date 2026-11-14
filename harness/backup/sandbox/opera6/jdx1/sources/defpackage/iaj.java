package defpackage;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* loaded from: classes.dex */
public final class iaj extends CharacterStyle implements UpdateAppearance {
    public final haj a;
    public final float b;
    public final t0g c = hyg.k(new bpj(9205357640488583168L));
    public final i37 d = luj.b(new j3i(this, (byte) 22));

    public iaj(haj hajVar, float f) {
        this.a = hajVar;
        this.b = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        ic4.I(textPaint, this.b);
        textPaint.setShader((Shader) this.d.getValue());
    }
}
