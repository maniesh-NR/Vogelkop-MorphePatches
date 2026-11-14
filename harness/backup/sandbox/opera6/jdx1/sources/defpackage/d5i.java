package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class d5i extends ozb implements Function1 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ e5i j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d5i(e5i e5iVar, byte b) {
        super(1);
        this.i = b;
        this.j = e5iVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.i;
        e5i e5iVar = this.j;
        switch (b) {
            case 0:
                return Double.valueOf(e5iVar.n.d(djh.a(((Number) obj).doubleValue(), e5iVar.e, e5iVar.f)));
            default:
                return Double.valueOf(djh.a(e5iVar.k.d(((Number) obj).doubleValue()), e5iVar.e, e5iVar.f));
        }
    }
}
