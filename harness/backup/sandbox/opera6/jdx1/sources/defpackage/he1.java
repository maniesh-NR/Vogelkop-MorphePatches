package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class he1 extends ozb implements Function1 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ ifg j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ he1(ifg ifgVar, byte b) {
        super(1);
        this.i = b;
        this.j = ifgVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.i;
        ifg ifgVar = this.j;
        switch (b) {
            case 0:
                p1d.f((p1d) obj, ifgVar, 0, 0);
                break;
            case 1:
                p1d.f((p1d) obj, ifgVar, 0, 0);
                break;
            default:
                p1d.f((p1d) obj, ifgVar, 0, 0);
                break;
        }
        return Unit.a;
    }
}
