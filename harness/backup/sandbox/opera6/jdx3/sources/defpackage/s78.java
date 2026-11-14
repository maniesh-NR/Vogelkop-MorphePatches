package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class s78 extends kr implements fr9 {
    public final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        k78 k78Var;
        h78 h78Var = (h78) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        z88 z88Var = (z88) obj3;
        boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
        def defVar = (def) obj5;
        ((n78) ((kr) this).a).getClass();
        if (!(z88Var instanceof x88) && zBooleanValue2) {
            sxh sxhVar = new sxh(2132018895, new Object[]{new rxh(2132018889)});
            int iOrdinal = defVar.ordinal();
            if (iOrdinal == 0) {
                k78Var = null;
            } else if (iOrdinal == 1) {
                k78Var = new k78(new rxh(2132020191), new rxh(2132020190), new rxh(2132018886), sxhVar, new rxh(2132018101));
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    h9o.p();
                    return null;
                }
                k78Var = new k78(new rxh(2132020191), new rxh(2132020190), new rxh(2132018886), sxhVar, new rxh(2132018101));
            } else {
                k78Var = new k78(new rxh(2132018888), new txh(new Object[]{3, 3}, 2131886130, 3), new rxh(2132018885), sxhVar, new rxh(2132018883));
            }
            if (k78Var != null) {
                return new i78(h78.a(h78Var, new qxh(""), 4), k78Var, zBooleanValue);
            }
        }
        if (Intrinsics.a(z88Var, x88.a)) {
            return new i78(h78Var, l78.a, zBooleanValue);
        }
        if (z88Var instanceof w88) {
            w88 w88Var = (w88) z88Var;
            return new i78(h78Var, new j78(new qxh(n78.a(w88Var.a, w88Var.b)), new rxh(2132020523)), zBooleanValue);
        }
        if (z88Var instanceof y88) {
            y88 y88Var = (y88) z88Var;
            return new i78(h78Var, new j78(new qxh(n78.a(y88Var.a, y88Var.b)), new rxh(2132017427)), zBooleanValue);
        }
        h9o.p();
        return null;
    }
}
