package defpackage;

import android.text.Spannable;
import android.view.View;
import android.widget.TextView;
import com.opera.android.text.ThemeDependentSpan;

/* loaded from: classes.dex */
class wwj implements r8n {
    public final TextView a;

    public wwj(TextView textView) {
        this.a = textView;
    }

    @Override // defpackage.r8n
    public final void a(View view) {
        TextView textView = this.a;
        CharSequence text = textView.getText();
        if (text instanceof Spannable) {
            Spannable spannable = (Spannable) text;
            ThemeDependentSpan[] themeDependentSpanArr = (ThemeDependentSpan[]) spannable.getSpans(0, spannable.length(), ThemeDependentSpan.class);
            if (themeDependentSpanArr.length > 0) {
                textView.invalidate();
                for (ThemeDependentSpan themeDependentSpan : themeDependentSpanArr) {
                    themeDependentSpan.a(textView.getContext());
                }
            }
        }
    }
}
