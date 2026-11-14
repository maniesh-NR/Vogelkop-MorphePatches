package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class lol implements Function1 {
    public final /* synthetic */ LayerDrawable a;
    public final /* synthetic */ c9i b;
    public final /* synthetic */ int c;
    public final /* synthetic */ float d;

    public /* synthetic */ lol(LayerDrawable layerDrawable, c9i c9iVar, int i, float f) {
        this.a = layerDrawable;
        this.b = c9iVar;
        this.c = i;
        this.d = f;
    }

    public final Object invoke(Object obj) {
        Drawable hq4Var;
        xw0 xw0Var = (xw0) obj;
        if (Intrinsics.a(xw0Var, uw0.a)) {
            hq4Var = new f08(0);
        } else if (xw0Var instanceof vw0) {
            vw0 vw0Var = (vw0) xw0Var;
            int i = vw0Var.b;
            c9i c9iVar = this.b;
            if (i != c9iVar.b) {
                c9iVar.b = i;
                c9iVar.invalidateSelf();
            }
            Drawable drawable = vw0Var.a;
            Integer num = vw0Var.c;
            if (num != null) {
                j14.n0(drawable, num.intValue());
            }
            hq4Var = new w3a(drawable, 17, false);
        } else {
            if (!(xw0Var instanceof ww0)) {
                h9o.p();
                return null;
            }
            hq4Var = new hq4(this.d, this.c, 12, ((ww0) xw0Var).a);
        }
        LayerDrawable layerDrawable = this.a;
        layerDrawable.setDrawable(1, hq4Var);
        layerDrawable.invalidateSelf();
        return Unit.a;
    }
}
