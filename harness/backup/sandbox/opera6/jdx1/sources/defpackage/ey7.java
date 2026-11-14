package defpackage;

import android.os.Handler;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class ey7 extends wxe implements Runnable {
    public final WeakReference m;
    public final WeakReference n;

    public ey7(TextView textView, fy7 fy7Var) {
        this.m = new WeakReference(textView);
        this.n = new WeakReference(fy7Var);
    }

    @Override // defpackage.wxe
    public final void S() {
        Handler handler;
        TextView textView = (TextView) this.m.get();
        if (textView == null || (handler = textView.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        InputFilter[] filters;
        CharSequence text;
        CharSequence charSequenceK;
        TextView textView = (TextView) this.m.get();
        InputFilter inputFilter = (InputFilter) this.n.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (!textView.isAttachedToWindow() || text == (charSequenceK = xx7.a().k((text = textView.getText())))) {
                    return;
                }
                int selectionStart = Selection.getSelectionStart(charSequenceK);
                int selectionEnd = Selection.getSelectionEnd(charSequenceK);
                textView.setText(charSequenceK);
                if (charSequenceK instanceof Spannable) {
                    Spannable spannable = (Spannable) charSequenceK;
                    if (selectionStart < 0) {
                        if (selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionEnd);
                            return;
                        }
                        return;
                    } else if (selectionEnd >= 0) {
                        Selection.setSelection(spannable, selectionStart, selectionEnd);
                        return;
                    } else {
                        Selection.setSelection(spannable, selectionStart);
                        return;
                    }
                }
                return;
            }
        }
    }
}
