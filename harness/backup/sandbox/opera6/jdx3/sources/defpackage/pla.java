package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class pla {
    public final List a;

    public pla(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pla) && Intrinsics.a(this.a, ((pla) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return sko.m("HostStateNotificationSubscriptionsData(match=", ")", this.a);
    }
}
