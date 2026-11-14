package defpackage;

import android.content.res.Resources;
import android.view.ContextThemeWrapper;

/* loaded from: classes.dex */
public final class j39 extends ContextThemeWrapper {
    @Override // android.view.ContextThemeWrapper
    public final void onApplyThemeResource(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, false);
    }
}
