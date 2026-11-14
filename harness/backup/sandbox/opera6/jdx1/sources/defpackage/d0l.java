package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class d0l implements esk, kr9 {
    public static final d0l a = new d0l();

    @Override // defpackage.kr9
    public final br9 a() {
        return new nr9(0, s9g.class, "getInstance", "getInstance()Lcom/opera/android/permissions/PermissionController;", 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof esk) && (obj instanceof kr9)) {
            return Intrinsics.a(a(), ((kr9) obj).a());
        }
        return false;
    }

    @Override // defpackage.esk
    public final Object get() {
        return s9g.h;
    }

    public final int hashCode() {
        return a().hashCode();
    }
}
