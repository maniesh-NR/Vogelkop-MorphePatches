package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class dnk {
    public final Uri a;
    public final String b;

    public dnk(Uri uri, String str) {
        this.a = uri;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnk)) {
            return false;
        }
        dnk dnkVar = (dnk) obj;
        return Intrinsics.a(this.a, dnkVar.a) && this.b.equals(dnkVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
