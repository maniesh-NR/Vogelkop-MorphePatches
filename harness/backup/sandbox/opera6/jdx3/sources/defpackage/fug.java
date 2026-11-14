package defpackage;

import android.content.Context;
import com.opera.android.Lazy;

/* loaded from: classes.dex */
public final class fug extends b23 {
    public final boolean b;
    public final rii c;
    public wb0 d;

    public fug(boolean z, rii riiVar) {
        super((byte) 0);
        this.b = z;
        this.c = riiVar;
        this.d = wb0.d;
    }

    @Override // defpackage.b23
    public final CharSequence g(Context context) {
        return context.getString(this.b ? 2132019166 : 2132019168);
    }

    @Override // defpackage.nz0
    public final String getNegativeButtonText(Context context) {
        return context.getString(2132019498);
    }

    @Override // defpackage.nz0
    public final String getPositiveButtonText(Context context) {
        return context.getString(2132021652);
    }

    @Override // defpackage.nz0
    public final int getTheme() {
        return 2132083346;
    }

    @Override // defpackage.b23
    public final CharSequence i(Context context) {
        return context.getString(this.b ? 2132019167 : 2132019169);
    }

    @Override // defpackage.nz0
    public final void onDismissDialog(bz0 bz0Var, hjm hjmVar) {
        ((x5f) ((w7j) this.c.b).d).L(4, this.d, null);
    }

    @Override // defpackage.nz0
    public final void onNegativeButtonClicked(bz0 bz0Var) {
        this.d = wb0.c;
    }

    @Override // defpackage.nz0
    public final void onPositiveButtonClicked(bz0 bz0Var) {
        this.d = wb0.b;
        ((yug) ((Lazy) ((w7j) this.c.b).c).get()).a(14);
    }
}
