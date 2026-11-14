package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class s5l implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z5l b;

    public /* synthetic */ s5l(z5l z5lVar, byte b) {
        this.a = b;
        this.b = z5lVar;
    }

    public final Object invoke() {
        byte b = this.a;
        z5l z5lVar = this.b;
        switch (b) {
            case 0:
                return (pde) z5lVar.B.k;
            case 1:
                return z5lVar.w;
            case 2:
                return z5lVar.w;
            case 3:
                return z5lVar.w;
            case 4:
                return Integer.valueOf(((Number) z5lVar.v.o.f.getValue()).intValue());
            case 5:
                return Integer.valueOf(((Number) z5lVar.v.o.f.getValue()).intValue());
            default:
                return Boolean.valueOf(z5lVar.d.g() != null);
        }
    }
}
