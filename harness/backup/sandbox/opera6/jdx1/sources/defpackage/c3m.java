package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class c3m implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b3m b;

    public /* synthetic */ c3m(b3m b3mVar, byte b) {
        this.a = b;
        this.b = b3mVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        b3m b3mVar = this.b;
        switch (b) {
            case 0:
                return new d3m(b3mVar, (byte) 1);
            default:
                return new d3m(b3mVar, (byte) 0);
        }
    }
}
