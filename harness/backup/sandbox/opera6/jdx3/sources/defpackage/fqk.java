package defpackage;

import com.opera.android.suggestion.Suggestion;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fqk extends gqk {
    public final Suggestion c;

    public fqk(Suggestion suggestion, int i, xpk xpkVar) {
        super(i, xpkVar);
        this.c = suggestion;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !fqk.class.equals(obj.getClass())) {
            return false;
        }
        return Intrinsics.a(this.c, ((fqk) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
