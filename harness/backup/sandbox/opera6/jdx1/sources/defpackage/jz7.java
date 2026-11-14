package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.widget.EditText;

/* loaded from: classes.dex */
public final class jz7 implements TextWatcher {
    public final EditText a;
    public iz7 b;
    public boolean c = true;
    public int d;
    public int e;

    public jz7(EditText editText) {
        this.a = editText;
    }

    public static void a(EditText editText, int i) {
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            xx7.a().k(editableText);
            if (selectionStart < 0) {
                if (selectionEnd >= 0) {
                    Selection.setSelection(editableText, selectionEnd);
                }
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else {
                Selection.setSelection(editableText, selectionStart);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        EditText editText = this.a;
        if (!editText.isInEditMode() && this.c && xx7.e()) {
            int i = this.d;
            int i2 = this.e;
            if (i2 > 0) {
                int iC = xx7.a().c();
                if (iC != 0) {
                    if (iC == 1) {
                        xx7.a().j(i, i2 + i, 0, editable);
                        return;
                    } else if (iC != 3) {
                        return;
                    }
                }
                xx7 xx7VarA = xx7.a();
                iz7 iz7Var = this.b;
                if (iz7Var == null) {
                    iz7Var = new iz7(editText);
                    this.b = iz7Var;
                }
                xx7VarA.l(iz7Var);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.d = i;
        this.e = i3;
    }
}
