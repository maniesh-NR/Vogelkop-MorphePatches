package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;

/* loaded from: classes.dex */
public class dkf extends ContextThemeWrapper {
    public final boolean a;

    public dkf(Context context, int i) {
        super(context, i);
        this.a = ozk.b(context);
    }

    @Override // android.view.ContextThemeWrapper
    public final void onApplyThemeResource(Resources.Theme theme, int i, boolean z) {
        super.onApplyThemeResource(theme, i, z);
        ozk.a(theme, this.a);
    }
}
