package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class n74 implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bxf b;
    public final /* synthetic */ p8f c;

    public /* synthetic */ n74(bxf bxfVar, p8f p8fVar, byte b) {
        this.a = b;
        this.b = bxfVar;
        this.c = p8fVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        p8f p8fVar = this.c;
        bxf bxfVar = this.b;
        int iIntValue = ((Integer) obj).intValue();
        int iIntValue2 = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                bxfVar.b(p8fVar, iIntValue, iIntValue2);
                break;
            default:
                bxfVar.b(p8fVar, iIntValue, iIntValue2);
                break;
        }
        return Unit.a;
    }
}
