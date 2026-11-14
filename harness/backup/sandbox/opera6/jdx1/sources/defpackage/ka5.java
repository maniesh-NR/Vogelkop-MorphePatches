package defpackage;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public final class ka5 extends awb {
    public final /* synthetic */ byte i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ka5(List list, byte b) {
        super(list);
        this.i = b;
    }

    @Override // defpackage.a73
    public final Object f(zvb zvbVar, float f) {
        Object obj;
        switch (this.i) {
            case 0:
                return Integer.valueOf(k(zvbVar, f));
            case 1:
                return Integer.valueOf(k(zvbVar, f));
            default:
                Object obj2 = zvbVar.b;
                ua7 ua7Var = this.e;
                if (ua7Var == null) {
                    return (f != 1.0f || (obj = zvbVar.c) == null) ? (bd7) obj2 : (bd7) obj;
                }
                float f2 = zvbVar.g;
                Float f3 = zvbVar.h;
                float fFloatValue = f3 == null ? Float.MAX_VALUE : f3.floatValue();
                bd7 bd7Var = (bd7) obj2;
                Object obj3 = zvbVar.c;
                return (bd7) ua7Var.z(f2, fFloatValue, bd7Var, obj3 == null ? bd7Var : (bd7) obj3, f, c(), this.d);
        }
    }

    public final int k(zvb zvbVar, float f) {
        Float f2;
        float f3;
        switch (this.i) {
            case 0:
                Object obj = zvbVar.b;
                Object obj2 = zvbVar.b;
                if (obj != null && zvbVar.c != null) {
                    ua7 ua7Var = this.e;
                    if (ua7Var != null && (f2 = zvbVar.h) != null && (r12 = (Integer) ua7Var.z(zvbVar.g, f2.floatValue(), (Integer) obj2, (Integer) zvbVar.c, f, d(), this.d)) != null) {
                        break;
                    } else {
                        break;
                    }
                } else {
                    qp2.n("Missing values for keyframe.");
                    break;
                }
            default:
                Object obj3 = zvbVar.b;
                Object obj4 = zvbVar.b;
                if (obj3 != null && zvbVar.c != null) {
                    ua7 ua7Var2 = this.e;
                    if (ua7Var2 != null) {
                        f3 = f;
                        Integer num = (Integer) ua7Var2.z(zvbVar.g, zvbVar.h.floatValue(), (Integer) obj4, (Integer) zvbVar.c, f3, d(), this.d);
                        if (num != null) {
                            break;
                        }
                    } else {
                        f3 = f;
                    }
                    int iIntValue = zvbVar.k;
                    if (iIntValue == 784923401) {
                        iIntValue = ((Integer) obj4).intValue();
                        zvbVar.k = iIntValue;
                    }
                    int iIntValue2 = zvbVar.l;
                    if (iIntValue2 == 784923401) {
                        iIntValue2 = ((Integer) zvbVar.c).intValue();
                        zvbVar.l = iIntValue2;
                    }
                    PointF pointF = l1e.a;
                    break;
                } else {
                    qp2.n("Missing values for keyframe.");
                    break;
                }
                break;
        }
        return 0;
    }
}
