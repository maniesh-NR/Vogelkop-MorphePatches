package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class x9a implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y9a b;

    public /* synthetic */ x9a(y9a y9aVar, byte b) {
        this.a = b;
        this.b = y9aVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: pxb */
    public final Object invoke() throws pxb {
        byte b = this.a;
        y9a y9aVar = this.b;
        switch (b) {
            case 0:
                sam samVar = y9aVar.v;
                if (samVar == null) {
                    throw o18.k("Font resolution state is not set.");
                }
                samVar.getValue();
                return Unit.a;
            default:
                sam samVar2 = y9aVar.v;
                if (samVar2 == null) {
                    throw o18.k("Font resolution state is not set.");
                }
                samVar2.getValue();
                return Unit.a;
        }
    }
}
