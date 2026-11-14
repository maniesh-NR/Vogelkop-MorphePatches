package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public class tim extends d63 {
    public final uim a;

    public tim(uim uimVar) {
        this.a = uimVar;
        uimVar.b = this;
    }

    @Override // defpackage.b87
    public final rim createDialog(Context context, b2l b2lVar) {
        return this.a;
    }
}
