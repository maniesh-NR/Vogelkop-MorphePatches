package defpackage;

import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;

/* loaded from: classes.dex */
public final class gji implements InputFilter {
    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        CharSequence charSequenceSubSequence = charSequence.subSequence(i, i2);
        SpannableStringBuilder spannableStringBuilderF = lg7.f(charSequenceSubSequence);
        int length = spannableStringBuilderF.length();
        int iB = (255 - lg7.b(spanned.subSequence(0, i3).toString())) - lg7.b(spanned.subSequence(i4, spanned.length()).toString());
        CharSequence charSequenceSubSequence2 = spannableStringBuilderF;
        while (lg7.b(charSequenceSubSequence2.toString()) > iB) {
            if (Character.isLowSurrogate(charSequenceSubSequence2.charAt(length - 1))) {
                length--;
            }
            length--;
            if (length <= 0) {
                return "";
            }
            charSequenceSubSequence2 = charSequenceSubSequence2.subSequence(0, length);
        }
        if (charSequenceSubSequence.toString().contentEquals(charSequenceSubSequence2)) {
            return null;
        }
        return charSequenceSubSequence2;
    }
}
