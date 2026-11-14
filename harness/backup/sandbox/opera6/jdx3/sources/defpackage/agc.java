package defpackage;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import com.opera.android.text.ThemeDependentSpan;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lagc;", "Landroid/text/style/ClickableSpan;", "Lcom/opera/android/text/ThemeDependentSpan;", "text"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class agc extends ClickableSpan implements ThemeDependentSpan {
    public boolean a;
    public int b;
    public int c;
    public boolean d;

    public agc(Context context) {
        c(context);
    }

    @Override // com.opera.android.text.ThemeDependentSpan
    public final void a(Context context) {
        c(context);
    }

    public final void c(Context context) {
        int iT = f03.t(R.attr.textColorLink, context, 2131101243);
        this.b = iT;
        this.c = Color.argb(68, Color.red(iT), Color.green(iT), Color.blue(iT));
        this.d = f03.V(2130971218, context);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.bgColor = this.a ? this.c : 0;
        textPaint.setColor(this.b);
        textPaint.setUnderlineText(this.d);
    }
}
