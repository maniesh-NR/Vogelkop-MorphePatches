package defpackage;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class yvc {
    public final Locale a;

    public yvc(Locale locale) {
        this.a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof yvc)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return Intrinsics.a(this.a.toLanguageTag(), ((yvc) obj).a.toLanguageTag());
    }

    public final int hashCode() {
        return this.a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.a.toLanguageTag();
    }
}
