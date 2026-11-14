package defpackage;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class exa extends ixa {
    public final Intent a;

    public exa(Intent intent) {
        this.a = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof exa) && Intrinsics.a(this.a, ((exa) obj).a);
    }

    public final int hashCode() {
        Intent intent = this.a;
        if (intent == null) {
            return 0;
        }
        return intent.hashCode();
    }

    public final String toString() {
        return "";
    }
}
