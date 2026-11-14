package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class n11 implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ w11 b;
    public final /* synthetic */ mqh c;

    public /* synthetic */ n11(w11 w11Var, mqh mqhVar, byte b) {
        this.a = b;
        this.b = w11Var;
        this.c = mqhVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        mqh mqhVar = this.c;
        w11 w11Var = this.b;
        float fFloatValue = ((Float) obj).floatValue();
        float fFloatValue2 = ((Float) obj2).floatValue();
        switch (b) {
            case 0:
                a21 a21Var = w11Var.a;
                ((p0g) a21Var.k).i(fFloatValue);
                ((p0g) a21Var.l).i(fFloatValue2);
                mqhVar.a = fFloatValue;
                break;
            default:
                a21 a21Var2 = w11Var.a;
                ((p0g) a21Var2.k).i(fFloatValue);
                ((p0g) a21Var2.l).i(fFloatValue2);
                mqhVar.a = fFloatValue;
                break;
        }
        return Unit.a;
    }
}
