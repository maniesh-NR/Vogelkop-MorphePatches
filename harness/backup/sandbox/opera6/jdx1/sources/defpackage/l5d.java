package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class l5d implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m5d b;

    public /* synthetic */ l5d(m5d m5dVar, byte b) {
        this.a = b;
        this.b = m5dVar;
    }

    public final Object invoke() {
        byte b = this.a;
        m5d m5dVar = this.b;
        switch (b) {
            case 0:
                m5dVar.V0();
                return Unit.a;
            case 1:
                return new y8f(m5dVar.C);
            default:
                b2c b2cVar = (b2c) m5dVar.A.getValue();
                return new y8f(b2cVar != null ? b2cVar.U(0L) : 9205357640488583168L);
        }
    }
}
