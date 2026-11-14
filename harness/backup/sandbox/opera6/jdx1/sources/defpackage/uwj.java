package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* loaded from: classes.dex */
public final class uwj implements LeadingMarginSpan.LeadingMarginSpan2 {
    public final int a;
    public final int b;

    public uwj(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        if (z) {
            return this.a;
        }
        return 0;
    }

    @Override // android.text.style.LeadingMarginSpan.LeadingMarginSpan2
    public final int getLeadingMarginLineCount() {
        return this.b;
    }
}
