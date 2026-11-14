package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class i7l implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q7l b;
    public final /* synthetic */ m7l c;

    public /* synthetic */ i7l(q7l q7lVar, m7l m7lVar, byte b) {
        this.a = b;
        this.b = q7lVar;
        this.c = m7lVar;
    }

    public final Object invoke(Object obj) throws cam {
        byte b = this.a;
        m7l m7lVar = this.c;
        q7l q7lVar = this.b;
        switch (b) {
            case 0:
                if (((t0i) obj).a instanceof q0i) {
                    m7lVar = null;
                }
                q7lVar.invoke(m7lVar);
                break;
            default:
                q7lVar.invoke(m7lVar);
                break;
        }
        return Unit.a;
    }
}
