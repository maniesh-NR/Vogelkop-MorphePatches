package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class po1 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tul b;

    public /* synthetic */ po1(tul tulVar, byte b) {
        this.a = b;
        this.b = tulVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        tul tulVar = this.b;
        switch (b) {
            case 0:
                tulVar.a = -(((int) (((gcb) obj).a & 4294967295L)) - tulVar.c.h());
                break;
            default:
                tulVar.b(((Number) ((ve1) obj).e.getValue()).floatValue());
                break;
        }
        return Unit.a;
    }
}
