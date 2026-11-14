package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class xhe extends ozb implements Function0 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ bie j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xhe(bie bieVar, byte b) {
        super(0);
        this.i = b;
        this.j = bieVar;
    }

    public final Object invoke() {
        byte b = this.i;
        bie bieVar = this.j;
        switch (b) {
            case 0:
                return bieVar.a(whe.b);
            default:
                return bieVar.a(zhe.b);
        }
    }
}
