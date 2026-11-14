package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class ahl implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ w2m b;

    public /* synthetic */ ahl(w2m w2mVar, byte b) {
        this.a = b;
        this.b = w2mVar;
    }

    public final Object invoke(Object obj) {
        m1i m1iVar = (m1i) obj;
        switch (this.a) {
            case 0:
                m1iVar.c(((Number) this.b.h.getValue()).floatValue());
                break;
            case 1:
                m1iVar.c(((Number) this.b.h.getValue()).floatValue());
                break;
            default:
                m1iVar.c(((Number) this.b.h.getValue()).floatValue());
                break;
        }
        return Unit.a;
    }
}
