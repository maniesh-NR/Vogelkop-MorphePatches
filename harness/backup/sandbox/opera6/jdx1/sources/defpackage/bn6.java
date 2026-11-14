package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class bn6 implements kr9 {
    public static final bn6 a = new bn6();

    @Override // defpackage.kr9
    public final br9 a() {
        return new nr9(4, cn6.class, "<init>", "<init>(Lcom/arkivanov/essenty/lifecycle/Lifecycle;Lcom/arkivanov/essenty/statekeeper/StateKeeper;Lcom/arkivanov/essenty/instancekeeper/InstanceKeeper;Lcom/arkivanov/essenty/backhandler/BackHandler;)V", 0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bn6) {
            return Intrinsics.a(a(), ((kr9) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }
}
