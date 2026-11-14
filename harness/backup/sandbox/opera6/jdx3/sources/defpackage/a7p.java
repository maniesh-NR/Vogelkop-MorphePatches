package defpackage;

import kotlin.jvm.functions.Function0;
import kotlinx.serialization.json.c;

/* loaded from: classes.dex */
public final class a7p extends ozb implements Function0 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ d7p j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a7p(d7p d7pVar, byte b) {
        super(0);
        this.i = b;
        this.j = d7pVar;
    }

    public final Object invoke() {
        byte b = this.i;
        d7p d7pVar = this.j;
        switch (b) {
            case 0:
                zyk zykVar = x9p.a;
                rpb rpbVarD = fcp.d();
                rpbVarD.getClass();
                return qqb.h(ddh.A(rpbVarD, d7pVar, d7p.Companion.serializer()));
            default:
                return ((c) d7pVar.e.getValue()).toString();
        }
    }
}
