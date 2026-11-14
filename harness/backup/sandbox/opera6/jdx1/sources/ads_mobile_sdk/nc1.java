package ads_mobile_sdk;

import defpackage.ekp;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class nc1 implements f99 {
    public final /* synthetic */ f99 a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ byte c;

    public /* synthetic */ nc1(f99 f99Var, Object obj, byte b) {
        this.c = b;
        this.a = f99Var;
        this.b = obj;
    }

    public final Object collect(l99 l99Var, mt5 mt5Var) {
        byte b = this.c;
        Object obj = this.b;
        f99 f99Var = this.a;
        switch (b) {
            case 0:
                Object objCollect = f99Var.collect(new mc1(l99Var, (qc1) obj, (byte) 0), mt5Var);
                if (objCollect != px5.a) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = f99Var.collect(new mc1(l99Var, (ekp) obj, (byte) 2), mt5Var);
                if (objCollect2 != px5.a) {
                    break;
                }
                break;
            default:
                Object objCollect3 = f99Var.collect(new ym2(l99Var, (on2) obj), mt5Var);
                if (objCollect3 != px5.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
