package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.connection.RealCall;

/* loaded from: classes.dex */
public final class yy1 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ RealCall b;

    public /* synthetic */ yy1(RealCall realCall, byte b) {
        this.a = b;
        this.b = realCall;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        RealCall realCall = this.b;
        switch (b) {
            case 0:
                realCall.cancel();
                break;
            default:
                realCall.cancel();
                break;
        }
        return Unit.a;
    }
}
