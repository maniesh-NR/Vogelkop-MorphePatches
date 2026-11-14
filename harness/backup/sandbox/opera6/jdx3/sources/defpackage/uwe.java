package defpackage;

import android.widget.TextView;

/* loaded from: classes.dex */
public final class uwe extends h8n {
    public final /* synthetic */ TextView a;
    public final /* synthetic */ xwe b;

    public uwe(xwe xweVar, TextView textView) {
        this.a = textView;
        this.b = xweVar;
    }

    @Override // defpackage.h8n
    public final void onPageScrolled(int i, float f, int i2) {
        this.a.setText(Math.round(((float) i) + f) == this.b.f.getAdapter().getCount() + (-1) ? 2132018586 : 2132020022);
    }
}
