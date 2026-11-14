package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class d6c implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e6c b;

    public /* synthetic */ d6c(e6c e6cVar, byte b) {
        this.a = b;
        this.b = e6cVar;
    }

    public final Object invoke() {
        byte b = this.a;
        e6c e6cVar = this.b;
        switch (b) {
            case 0:
                return Float.valueOf(e6cVar.p.e());
            case 1:
                return Float.valueOf(e6cVar.p.b());
            default:
                return Float.valueOf(e6cVar.p.d() - e6cVar.p.a());
        }
    }
}
