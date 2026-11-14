package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class n2m implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b3m b;

    public /* synthetic */ n2m(b3m b3mVar, byte b) {
        this.a = b;
        this.b = b3mVar;
    }

    public final Object invoke() {
        byte b = this.a;
        b3m b3mVar = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf((Intrinsics.a(b3mVar.d.getValue(), b3mVar.c()) && b3mVar.h.h() == Long.MIN_VALUE && !((Boolean) b3mVar.i.getValue()).booleanValue()) ? false : true);
            default:
                return Long.valueOf(b3mVar.b());
        }
    }
}
