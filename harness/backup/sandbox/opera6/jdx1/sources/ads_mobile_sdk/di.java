package ads_mobile_sdk;

import defpackage.jjj;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class di implements zcp {
    public final List a;

    public di(List list) {
        this.a = list;
    }

    public final void a(jjj jjjVar) {
        jjjVar.grantedPermissions.addAll(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof di) && Intrinsics.a(this.a, ((di) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return sko.m("AppPermissionsSignal(grantedPermissionsList=", ")", this.a);
    }
}
