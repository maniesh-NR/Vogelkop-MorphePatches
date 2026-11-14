package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputEditText;
import com.opera.android.custom_views.OperaTextInputEditText;
import kotlin.text.Regex;
import kotlin.text.c;

/* loaded from: classes.dex */
public final class hcd implements TextWatcher {
    public final OperaTextInputEditText a;
    public boolean b;
    public boolean c;
    public int d;

    public hcd(OperaTextInputEditText operaTextInputEditText) {
        this.a = operaTextInputEditText;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        Character chA;
        int i = 0;
        if (this.c) {
            this.c = false;
            return;
        }
        if (this.b) {
            return;
        }
        this.c = true;
        int i2 = this.d;
        String strO = c.o("##/##", String.valueOf('#'), "");
        CharSequence charSequenceReplace = strO.length() == 0 ? editable : new Regex(sko.k("[", strO, "]")).replace(editable, "");
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        while (i < 5 && (chA = pik.A(i3, charSequenceReplace)) != null) {
            if ("##/##".charAt(i) == '#' || "##/##".charAt(i) == chA.charValue()) {
                sb.append(chA.charValue());
                i++;
                i3++;
            } else {
                Character chA2 = pik.A(i, "##/##");
                while (i < 5 && (chA2 == null || chA2.charValue() != '#')) {
                    sb.append(chA2);
                    i++;
                    chA2 = pik.A(i, "##/##");
                }
            }
        }
        Character chA3 = pik.A(i, "##/##");
        while (i < 5 && (chA3 == null || chA3.charValue() != '#')) {
            sb.append(chA3);
            i++;
            chA3 = pik.A(i, "##/##");
        }
        CharSequence charSequenceC = pik.C(5, sb);
        TextInputEditText textInputEditText = this.a;
        textInputEditText.setText(charSequenceC);
        if (i2 == editable.length()) {
            textInputEditText.setSelection(charSequenceC.length());
            return;
        }
        int length = charSequenceC.length();
        if (i2 > length) {
            i2 = length;
        }
        textInputEditText.setSelection(i2);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.b = i2 > 0 && i3 == 0;
        this.d = i + i3;
    }
}
