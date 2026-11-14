package defpackage;

import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class inj extends jnj {
    public final InputStream a;

    public inj(InputStream inputStream) {
        this.a = inputStream;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof inj) && Intrinsics.a(this.a, ((inj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "";
    }
}
