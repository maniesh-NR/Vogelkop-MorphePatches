package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class g0a implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h0a b;

    public /* synthetic */ g0a(h0a h0aVar, byte b) {
        this.a = b;
        this.b = h0aVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        h0a h0aVar = this.b;
        switch (b) {
            case 0:
                h0aVar.a();
                break;
            default:
                h0aVar.a();
                break;
        }
        return Unit.a;
    }
}
