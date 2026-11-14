package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class r26 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b3m b;

    public /* synthetic */ r26(b3m b3mVar, byte b) {
        this.a = b;
        this.b = b3mVar;
    }

    public final Object invoke() {
        byte b = this.a;
        b3m b3mVar = this.b;
        switch (b) {
            case 0:
                return b3mVar.d.getValue();
            default:
                return b3mVar.f();
        }
    }
}
