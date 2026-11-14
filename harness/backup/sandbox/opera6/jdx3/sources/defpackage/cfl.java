package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.text.SpannableString;
import android.text.TextWatcher;
import com.opera.hype.image.editor.TextBoxEditText;

/* loaded from: classes.dex */
public final class cfl implements TextWatcher {
    public SpannableString a;
    public int b;
    public int c;
    public final /* synthetic */ TextBoxEditText d;

    public cfl(TextBoxEditText textBoxEditText) {
        this.d = textBoxEditText;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.TextView, com.opera.hype.image.editor.TextBoxEditText] */
    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ?? r0 = this.d;
        int maxLines = r0.getMaxLines();
        int i = 0;
        if (editable != null) {
            int i2 = 0;
            while (i < editable.length()) {
                if (editable.charAt(i) == '\n') {
                    i2++;
                }
                i++;
            }
            i = i2;
        }
        int i3 = i + 1;
        if (maxLines <= 0 || i3 > maxLines) {
            r0.removeTextChangedListener(this);
            r0.setText(this.a);
            Selection.setSelection(r0.getText(), this.b, this.c);
            r0.addTextChangedListener(this);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence == null) {
            charSequence = "";
        }
        this.a = new SpannableString(charSequence);
        this.b = i;
        this.c = i + i2;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
