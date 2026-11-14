package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import kotlin.text.c;

/* loaded from: classes.dex */
public final class mjk implements uil {
    public final boolean a(String str, SpannableStringBuilder spannableStringBuilder) {
        int length;
        if (c.m(str, "b", true)) {
            ljk[] ljkVarArr = (ljk[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ljk.class);
            ljk ljkVar = null;
            if (ljkVarArr.length != 0 && ljkVarArr.length - 1 >= 0) {
                ljkVar = ljkVarArr[length];
                ljkVar.getClass();
            }
            if (ljkVar != null) {
                StyleSpan styleSpan = new StyleSpan(1);
                int spanStart = spannableStringBuilder.getSpanStart(ljkVar);
                spannableStringBuilder.removeSpan(ljkVar);
                int length2 = spannableStringBuilder.length();
                if (spanStart != length2) {
                    spannableStringBuilder.setSpan(styleSpan, spanStart, length2, 33);
                }
                return true;
            }
        }
        return false;
    }

    public final til b(String str, SpannableStringBuilder spannableStringBuilder) {
        if (!str.equalsIgnoreCase("b")) {
            return sil.a;
        }
        ljk ljkVar = new ljk();
        int length = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(ljkVar, length, length, 17);
        return new ril(true);
    }
}
