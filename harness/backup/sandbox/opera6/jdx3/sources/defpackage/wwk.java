package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class wwk extends cej {
    public final boolean a;
    public final View b;

    public wwk(View view, boolean z) {
        this.a = z;
        this.b = view;
    }

    @Override // defpackage.cej
    public final dej createSheet(mej mejVar, b2l b2lVar) {
        return new xwk(mejVar, this.a);
    }
}
