package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s2b implements mkf {
    public final /* synthetic */ byte a;
    public final esk b;

    public /* synthetic */ s2b(esk eskVar, byte b) {
        this.a = b;
        this.b = eskVar;
    }

    @Override // defpackage.mkf
    public final l7n a(Class cls) {
        byte b = this.a;
        esk eskVar = this.b;
        switch (b) {
            case 0:
                if (Intrinsics.a(cls, q2b.class)) {
                    return new q2b((u2b) ((ew3) eskVar).get());
                }
                return null;
            default:
                if (Intrinsics.a(cls, nhf.class)) {
                    return new nhf((hxk) ((mw3) eskVar).get());
                }
                return null;
        }
    }
}
