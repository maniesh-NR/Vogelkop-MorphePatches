package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;

/* loaded from: classes.dex */
public final class e8g extends yrf {
    @Override // defpackage.yrf, defpackage.dej
    public final View a(Context context) {
        View viewA = super.a(context);
        Resources resources = context.getResources();
        d(c8g.a(resources, 5));
        d(c8g.a(resources, 30));
        d(new c8g(3600000L, resources.getString(2132022184, resources.getQuantityString(2131886128, 1, 1))));
        return viewA;
    }

    @Override // defpackage.yrf
    public final boolean e(lrf lrfVar) {
        return false;
    }
}
