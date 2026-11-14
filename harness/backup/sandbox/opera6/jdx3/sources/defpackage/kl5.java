package defpackage;

import android.content.res.Configuration;
import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class kl5 {
    public final Configuration a;
    public final Rect b;

    public kl5(Configuration configuration, Rect rect) {
        this.a = configuration;
        this.b = rect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kl5)) {
            return false;
        }
        kl5 kl5Var = (kl5) obj;
        return Intrinsics.a(this.a, kl5Var.a) && Intrinsics.a(this.b, kl5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
