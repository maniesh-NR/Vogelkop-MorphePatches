package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class hwa {
    public final Uri a;

    public hwa(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof hwa) && Intrinsics.a(this.a, ((hwa) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        Uri uri = this.a;
        if (uri == null) {
            return 0;
        }
        return uri.hashCode();
    }

    public final String toString() {
        return "";
    }
}
