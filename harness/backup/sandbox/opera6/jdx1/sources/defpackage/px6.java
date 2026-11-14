package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class px6 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ px6(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke() {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                nul nulVar = ((i8m) obj2).n;
                return new u95(cs5.e0(nulVar.a, nulVar.b, wq7.b.c(((Number) ((Function0) obj).invoke()).floatValue())));
            default:
                ((Function1) obj2).invoke((hea) obj);
                return Unit.a;
        }
    }
}
