package defpackage;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ywn {
    public final Context a;

    public ywn(Context context) {
        this.a = context;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ywn) && Intrinsics.a(this.a, ((ywn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "WebViewFactoryParam(context=" + this.a + ")";
    }
}
