package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class v5l implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z5l b;
    public final /* synthetic */ b2l c;

    public /* synthetic */ v5l(z5l z5lVar, b2l b2lVar, byte b) {
        this.a = b;
        this.b = z5lVar;
        this.c = b2lVar;
    }

    public final Object invoke() {
        int iA;
        byte b = this.a;
        b2l b2lVar = this.c;
        z5l z5lVar = this.b;
        switch (b) {
            case 0:
                iA = z5lVar.v.o.a(b2lVar);
                break;
            default:
                iA = z5lVar.v.o.a(b2lVar);
                break;
        }
        return Integer.valueOf(iA);
    }
}
