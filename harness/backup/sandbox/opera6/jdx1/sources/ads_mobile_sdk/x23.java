package ads_mobile_sdk;

import defpackage.cip;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class x23 extends ozb implements Function1 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x23(int i) {
        super(1);
        this.a = i;
    }

    public final Object invoke(Object obj) {
        cip cipVar = ((c33) obj).a;
        cipVar.b$1();
        u23 u23Var = (u23) cipVar.b;
        u23Var.bitField0_ |= 2;
        u23Var.totalInflightAdLimit_ = this.a;
        return Unit.a;
    }
}
