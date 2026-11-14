package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class xu8 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cv8 b;

    public /* synthetic */ xu8(cv8 cv8Var, byte b) {
        this.a = b;
        this.b = cv8Var;
    }

    public final Object invoke(Object obj) {
        boolean zI;
        byte b = this.a;
        cv8 cv8Var = this.b;
        switch (b) {
            case 0:
                zI = cv8Var.a.i("speed_dial.enabled");
                break;
            case 1:
                zI = cv8Var.a.i("speed_dial.plus_button");
                break;
            default:
                mv8 mv8Var = (mv8) ((jde) cv8Var.w.h).e(((Integer) obj).intValue());
                return mv8Var == null ? iv8.a : mv8Var;
        }
        return Boolean.valueOf(zI);
    }
}
