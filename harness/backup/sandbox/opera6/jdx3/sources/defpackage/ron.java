package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class ron extends b23 {
    public final m91 b;
    public boolean c;

    public ron(m91 m91Var) {
        super((byte) 1);
        this.b = m91Var;
    }

    @Override // defpackage.b23
    public final CharSequence g(Context context) {
        return context.getString(2132022369);
    }

    @Override // defpackage.nz0
    public final String getNegativeButtonText(Context context) {
        return context.getString(2132020043);
    }

    @Override // defpackage.nz0
    public final String getPositiveButtonText(Context context) {
        return context.getString(2132018835);
    }

    @Override // defpackage.nz0
    public final int getTheme() {
        return 2132083349;
    }

    @Override // defpackage.b23
    public final CharSequence i(Context context) {
        return context.getString(2132022370);
    }

    @Override // defpackage.b23
    public final Drawable j(Context context) {
        return sgb.F(2131232158, context);
    }

    @Override // defpackage.d63
    public final void onFinished(hjm hjmVar) {
        super.onFinished(hjmVar);
        this.b.invoke(Boolean.valueOf(this.c));
    }

    @Override // defpackage.nz0
    public final void onPositiveButtonClicked(bz0 bz0Var) {
        this.c = true;
    }
}
