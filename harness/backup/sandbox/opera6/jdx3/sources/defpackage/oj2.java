package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.opera.android.FullscreenWebActivity;

/* loaded from: classes.dex */
public final class oj2 extends ClickableSpan {
    public final int a;
    public final String b;
    public final qxh c;
    public final boolean d;
    public final /* synthetic */ pj2 e;

    public oj2(pj2 pj2Var, int i, String str, qxh qxhVar, boolean z) {
        this.e = pj2Var;
        this.a = i;
        this.b = str;
        this.c = qxhVar;
        this.d = z;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        FullscreenWebActivity.A0(this.e.getContext(), this.b, this.c);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(this.d);
        textPaint.setColor(this.a);
    }
}
