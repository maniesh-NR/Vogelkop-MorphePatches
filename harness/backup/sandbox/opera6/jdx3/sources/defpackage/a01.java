package defpackage;

import android.text.InputFilter;
import android.text.Spanned;

/* loaded from: classes.dex */
public final class a01 extends InputFilter.AllCaps {
    public boolean a;

    @Override // android.text.InputFilter.AllCaps, android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        return this.a ? super.filter(charSequence, i, i2, spanned, i3, i4) : charSequence;
    }
}
