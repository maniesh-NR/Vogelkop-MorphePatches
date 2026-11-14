package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;

/* loaded from: classes.dex */
public final class nxa extends LayerDrawable {
    public final Context a;

    /* JADX WARN: Illegal instructions before constructor call */
    public nxa(Context context, dll dllVar, kze kzeVar) {
        ShapeDrawable shapeDrawableO = ui6.o(context);
        Drawable drawableU = w8h.u(2131231724, context);
        j14.n0(drawableU, j7h.k(2130969263, context));
        super(new Drawable[]{shapeDrawableO, new w3a(drawableU, 17, false)});
        this.a = context;
        a26.U(dllVar, kzeVar, new rw0(this, (byte) 6), new al7(this, (byte) 25));
    }
}
