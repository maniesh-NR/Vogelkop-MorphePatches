package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class l48 extends ozb implements Function0 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ ndj j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l48(ndj ndjVar, byte b) {
        super(0);
        this.i = b;
        this.j = ndjVar;
    }

    public final Object invoke() {
        byte b = this.i;
        ndj ndjVar = this.j;
        switch (b) {
            case 0:
                return ndjVar;
            default:
                t0g t0gVar = ndjVar.b;
                Boolean bool = Boolean.FALSE;
                t0gVar.setValue(bool);
                ndjVar.c(false);
                p12 p12Var = ndjVar.c;
                ((t0g) p12Var.a).setValue(bool);
                ((t0g) p12Var.c).setValue(bool);
                ((t0g) p12Var.e).setValue(bool);
                ((t0g) p12Var.g).setValue(bool);
                ndjVar.e = u95.f;
                ndjVar.f = 1.0f;
                ndjVar.g = 1.0f;
                k1n k1nVar = ndjVar.j;
                if (k1nVar != null) {
                    b82.i(null, k1nVar.d);
                    k1nVar.e = 0;
                }
                ndjVar.h = a2m.b;
                ndjVar.i = 0L;
                return Unit.a;
        }
    }
}
