package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class yx9 {

    @NotNull
    public static final xx9 Companion = new xx9();
    public final String a;

    public /* synthetic */ yx9(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            x7d.I(i, 1, wx9.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yx9) && Intrinsics.a(this.a, ((yx9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "";
    }
}
