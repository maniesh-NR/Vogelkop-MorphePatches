package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;

/* loaded from: classes.dex */
public abstract class cxh {
    public final int a(Context context) {
        if (this instanceof gxh) {
            return ((gxh) this).a;
        }
        if (this instanceof fxh) {
            return context.getColor(((fxh) this).a);
        }
        if (this instanceof dxh) {
            return j7h.k(((dxh) this).a, context);
        }
        if (this instanceof exh) {
            return ((exh) this).a.getDefaultColor();
        }
        h9o.p();
        return 0;
    }

    public final ColorStateList b(Context context) {
        if (this instanceof gxh) {
            return ColorStateList.valueOf(((gxh) this).a);
        }
        if (this instanceof fxh) {
            ColorStateList colorStateListV = nb6.v(((fxh) this).a, context);
            return colorStateListV != null ? colorStateListV : ColorStateList.valueOf(-256);
        }
        if (this instanceof dxh) {
            return j7h.l(((dxh) this).a, context);
        }
        if (this instanceof exh) {
            return ((exh) this).a;
        }
        h9o.p();
        return null;
    }
}
