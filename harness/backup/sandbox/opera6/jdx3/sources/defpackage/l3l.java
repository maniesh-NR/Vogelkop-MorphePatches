package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* loaded from: classes.dex */
public final class l3l extends LayerDrawable {
    public final kze a;

    public l3l(Context context, k6l k6lVar, m3l m3lVar) {
        super(new Drawable[]{j14.i0(2131232274, context), m3lVar});
        kze kzeVar = new kze(og.a);
        this.a = kzeVar;
        new shf(kzeVar, k6lVar, m3lVar, new bvk((byte) 4));
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        xf8.G0(this.a, z ? ng.a : og.a);
        return super.setVisible(z, z2);
    }
}
