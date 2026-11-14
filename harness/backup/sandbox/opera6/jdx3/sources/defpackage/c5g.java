package defpackage;

import android.graphics.Typeface;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.leanplum.internal.ResourceQualifiers;

/* loaded from: classes.dex */
public abstract class c5g implements View.OnClickListener {
    public static void a(TextView textView, boolean z) {
        int selectionStart = textView.getSelectionStart();
        int selectionEnd = textView.getSelectionEnd();
        Typeface typeface = textView.getTypeface();
        textView.setInputType((z ? 144 : ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL) | 1);
        textView.setTypeface(typeface);
        if (textView instanceof EditText) {
            ((EditText) textView).setSelection(selectionStart, selectionEnd);
        }
    }
}
