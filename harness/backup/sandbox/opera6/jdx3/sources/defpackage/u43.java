package defpackage;

import android.content.res.Configuration;
import com.opera.android.custom_views.LayoutDirectionFrameLayout;

/* loaded from: classes.dex */
public abstract class u43 extends LayoutDirectionFrameLayout {
    public t43 c;

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        t43 t43Var = this.c;
        if (t43Var != null) {
            t43Var.onConfigurationChanged(configuration);
        }
    }
}
