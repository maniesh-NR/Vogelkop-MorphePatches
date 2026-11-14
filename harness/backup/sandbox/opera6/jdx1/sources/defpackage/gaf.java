package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class gaf implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ haf b;

    public /* synthetic */ gaf(haf hafVar, byte b) {
        this.a = b;
        this.b = hafVar;
    }

    public final Object invoke() {
        byte b = this.a;
        haf hafVar = this.b;
        switch (b) {
            case 0:
                synchronized (haf.g) {
                    haf.f.remove(((w6g) hafVar.e.getValue()).a.w());
                }
                return Unit.a;
            default:
                gb3 gb3Var = hafVar.d;
                w6g w6gVar = (w6g) gb3Var.invoke();
                if (f.c(w6gVar) != -1) {
                    return s16.o(w6gVar.a.w(), true);
                }
                throw new IllegalStateException(("OkioStorage requires absolute paths, but did not get an absolute path from producePath = " + gb3Var + ", instead got " + w6gVar).toString());
        }
    }
}
