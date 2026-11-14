package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class urk implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vrk b;

    public /* synthetic */ urk(vrk vrkVar, byte b) {
        this.a = b;
        this.b = vrkVar;
    }

    public final Object invoke() {
        byte b = this.a;
        vrk vrkVar = this.b;
        switch (b) {
            case 0:
                vrkVar.j0(srk.a);
                break;
            default:
                vrkVar.j0(srk.b);
                vrkVar.dismiss();
                break;
        }
        return Unit.a;
    }
}
