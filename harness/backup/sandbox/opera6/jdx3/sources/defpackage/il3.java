package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class il3 extends ll3 {
    @Override // defpackage.ll3
    public final String a(Resources resources) {
        String str = (String) ((pl3) this.a).getUrl().b;
        String[] strArr = aik.a;
        return str == null ? "" : str;
    }

    @Override // defpackage.ll3
    public final Drawable b(Context context) {
        String strA = a(context.getResources());
        int i = vmj.g;
        int i2 = tmj.i(context);
        return tmj.m(context, strA, i2, i2, na5.c, 32);
    }

    @Override // defpackage.ll3
    public final String c(Resources resources) {
        return alo.K((pl3) this.a);
    }

    @Override // defpackage.ll3
    public final int d() {
        return 1;
    }
}
