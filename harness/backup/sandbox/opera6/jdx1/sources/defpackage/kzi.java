package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class kzi implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xe1 b;

    public /* synthetic */ kzi(xe1 xe1Var, byte b) {
        this.a = b;
        this.b = xe1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        xe1 xe1Var = this.b;
        switch (b) {
            case 0:
                y8f y8fVar = (y8f) xe1Var.b.getValue();
                long j = y8fVar.a;
                break;
            case 1:
                xe1Var.f = false;
                break;
            default:
                xe1Var.f = false;
                break;
        }
        return Unit.a;
    }
}
