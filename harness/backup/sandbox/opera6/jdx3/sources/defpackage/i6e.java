package defpackage;

import kotlin.coroutines.h;

/* loaded from: classes.dex */
public final /* synthetic */ class i6e implements esk {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k6e b;

    public /* synthetic */ i6e(k6e k6eVar, byte b) {
        this.a = b;
        this.b = k6eVar;
    }

    public final Object get() {
        byte b = this.a;
        k6e k6eVar = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(((f8f) k6eVar.a.getValue()).i());
            default:
                try {
                    return ((i1a) scd.g0(h.a, new a7b(k6eVar, (byte) 16))).b();
                } catch (InterruptedException e) {
                    rqd.p(e);
                    return null;
                }
        }
    }
}
