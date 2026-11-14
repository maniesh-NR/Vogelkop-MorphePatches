package defpackage;

import android.view.ViewStub;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class q4k implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c5k b;

    public /* synthetic */ q4k(c5k c5kVar, byte b) {
        this.a = b;
        this.b = c5kVar;
    }

    public final Object invoke() {
        byte b = this.a;
        boolean z = true;
        c5k c5kVar = this.b;
        switch (b) {
            case 0:
                return (ViewStub) c5kVar.c.findViewById(2131362364);
            case 1:
                xf8.F0(c5kVar.f0, Boolean.valueOf(c5kVar.l.canScrollVertically(1)));
                return Unit.a;
            default:
                int iOrdinal = c5kVar.e.c.ordinal();
                if (iOrdinal == 0) {
                    z = false;
                } else if (iOrdinal != 1 && iOrdinal != 2) {
                    throw new RuntimeException(null, null);
                }
                return Boolean.valueOf(z);
        }
    }
}
