package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class rkj implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ skj b;

    public /* synthetic */ rkj(skj skjVar, byte b) {
        this.a = b;
        this.b = skjVar;
    }

    public final Object invoke() {
        byte b = this.a;
        skj skjVar = this.b;
        switch (b) {
            case 0:
                skjVar.j0(pkj.a);
                break;
            default:
                skjVar.j0(pkj.b);
                break;
        }
        return Boolean.TRUE;
    }
}
