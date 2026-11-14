package defpackage;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class nda implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ u6c b;

    public /* synthetic */ nda(u6c u6cVar, byte b) {
        this.a = b;
        this.b = u6cVar;
    }

    public final Object invoke() {
        byte b = this.a;
        u6c u6cVar = this.b;
        switch (b) {
            case 0:
                n6c n6cVar = (n6c) CollectionsKt.R(u6cVar.j().l);
                if (n6cVar != null) {
                    return Integer.valueOf(n6cVar.a);
                }
                return null;
            case 1:
                return Boolean.valueOf(u6cVar.h() == 0 && u6cVar.i() == 0);
            case 2:
                return Integer.valueOf(u6cVar.j().o);
            case 3:
                return Integer.valueOf(((m6c) u6cVar.f.getValue()).k);
            default:
                return Boolean.valueOf(u6cVar.j.a());
        }
    }
}
