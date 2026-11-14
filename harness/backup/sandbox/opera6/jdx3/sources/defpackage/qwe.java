package defpackage;

import android.app.Dialog;
import android.view.View;

/* loaded from: classes.dex */
public final class qwe implements w6f {
    public bp a = new bp(-1);
    public final i7f b = new i7f();

    @Override // defpackage.w6f
    public final void F(Object obj) {
        this.b.b((pwe) obj);
    }

    @Override // defpackage.w6f
    public final void H(Object obj) {
        this.b.c((pwe) obj);
    }

    public final void a(Dialog dialog) {
        if (dialog.getWindow() == null) {
            return;
        }
        b(dialog.getWindow().getDecorView());
    }

    public final void b(View view) {
        new txe(this, view);
    }
}
