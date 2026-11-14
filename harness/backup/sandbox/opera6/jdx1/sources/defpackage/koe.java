package defpackage;

import android.net.NetworkRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class koe {
    public static final /* synthetic */ int b = 0;
    public final NetworkRequest a;

    static {
        qs7.B("NetworkRequestCompat");
    }

    public koe(NetworkRequest networkRequest) {
        this.a = networkRequest;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof koe) && Intrinsics.a(this.a, ((koe) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        NetworkRequest networkRequest = this.a;
        if (networkRequest == null) {
            return 0;
        }
        return networkRequest.hashCode();
    }

    public final String toString() {
        return "NetworkRequestCompat(wrapped=" + this.a + ')';
    }
}
