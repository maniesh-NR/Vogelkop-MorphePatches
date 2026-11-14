package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class y7o implements kr9 {
    public final /* synthetic */ zh5 a;

    public y7o(zh5 zh5Var) {
        this.a = zh5Var;
    }

    @Override // defpackage.kr9
    public final br9 a() {
        return new nr9(1, this.a, zh5.class, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;", 0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y7o) {
            return Intrinsics.a(a(), ((kr9) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }
}
