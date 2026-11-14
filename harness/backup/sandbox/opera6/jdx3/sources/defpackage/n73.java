package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;

/* loaded from: classes.dex */
public final class n73 implements cll {
    public final /* synthetic */ o73 a;

    public n73(o73 o73Var) {
        this.a = o73Var;
    }

    @Override // defpackage.cll
    public final void K() {
        o73 o73Var = this.a;
        Context baseContext = o73Var.b.getBaseContext();
        dkf dkfVar = o73Var.b;
        Resources.Theme theme = baseContext.getTheme();
        TypedValue typedValue = new TypedValue();
        baseContext.getTheme().resolveAttribute(2130970353, typedValue, true);
        u8n.i(dkfVar, theme, typedValue.resourceId);
    }
}
