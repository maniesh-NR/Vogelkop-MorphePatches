package defpackage;

import android.content.res.ColorStateList;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import android.util.StateSet;

/* loaded from: classes.dex */
public final class tpm extends CharacterStyle implements UpdateAppearance {
    public ColorStateList a;
    public int[] b = StateSet.WILD_CARD;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.a.getColorForState(this.b, 0));
    }
}
