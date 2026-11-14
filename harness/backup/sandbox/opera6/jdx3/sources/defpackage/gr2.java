package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.opera.android.autofill.Address;

/* loaded from: classes.dex */
public final class gr2 {
    public final String a;
    public final CharSequence b;
    public final Address c;

    /* JADX WARN: Multi-variable type inference failed */
    public gr2(mr2 mr2Var, Address address) {
        this.a = address.a;
        int iW = qbe.W(mr2Var.s, address);
        String str = address.n;
        if (iW != 1) {
            int iT = f03.t(2130969303, mr2Var.requireContext(), 2131100356);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            spannableStringBuilder.append((CharSequence) mr2Var.requireContext().getString(2132017671));
            int length = spannableStringBuilder.length();
            Context contextRequireContext = mr2Var.requireContext();
            int iA = vep.A(iW);
            spannableStringBuilder.append((CharSequence) contextRequireContext.getString(iA != 1 ? iA != 2 ? iA != 3 ? iA != 4 ? iA != 5 ? 0 : 2132020398 : 2132020391 : 2132020404 : 2132020409 : 2132020395));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(iT), length, spannableStringBuilder.length(), 33);
            str = spannableStringBuilder;
        }
        this.b = str;
        this.c = address;
    }

    public gr2(mr2 mr2Var, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = null;
    }

    public final String toString() {
        return this.b.toString();
    }
}
