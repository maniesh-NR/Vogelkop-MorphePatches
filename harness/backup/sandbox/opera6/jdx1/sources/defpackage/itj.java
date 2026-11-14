package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class itj implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mqh b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ itj(mqh mqhVar, Function1 function1, byte b) {
        this.a = b;
        this.b = mqhVar;
        this.c = function1;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        Function1 function1 = this.c;
        mqh mqhVar = this.b;
        float fFloatValue = ((Float) obj).floatValue();
        switch (b) {
            case 0:
                float f = mqhVar.a - fFloatValue;
                mqhVar.a = f;
                function1.invoke(Float.valueOf(f));
                break;
            default:
                float f2 = mqhVar.a - fFloatValue;
                mqhVar.a = f2;
                function1.invoke(Float.valueOf(f2));
                break;
        }
        return Unit.a;
    }
}
