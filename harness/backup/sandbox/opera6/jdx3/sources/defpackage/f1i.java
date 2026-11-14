package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class f1i implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d8e b;
    public final /* synthetic */ d1i c;

    public /* synthetic */ f1i(d8e d8eVar, d1i d1iVar, byte b) {
        this.a = b;
        this.b = d8eVar;
        this.c = d1iVar;
    }

    public final Object invoke() {
        byte b = this.a;
        d1i d1iVar = this.c;
        d8e d8eVar = this.b;
        switch (b) {
            case 0:
                if (!((Boolean) d8eVar.invoke()).booleanValue()) {
                    rdc rdcVar = d1iVar.a;
                    if (((pcc) rdcVar.c) == pcc.e) {
                        rdcVar.onPause();
                    }
                }
                break;
            case 1:
                if (!((Boolean) d8eVar.invoke()).booleanValue()) {
                    vtp.Z(d1iVar.a);
                }
                break;
            default:
                if (!((Boolean) d8eVar.invoke()).booleanValue()) {
                    vtp.B(d1iVar.a);
                }
                break;
        }
        return Unit.a;
    }
}
