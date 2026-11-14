package defpackage;

import java.net.URI;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q3g {
    public final URI a;
    public final URI b;
    public final String c;

    public q3g(URI uri, URI uri2, String str, int i) {
        uri = (i & 1) != 0 ? null : uri;
        uri2 = (i & 2) != 0 ? null : uri2;
        str = (i & 4) != 0 ? null : str;
        this.a = uri;
        this.b = uri2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q3g)) {
            return false;
        }
        q3g q3gVar = (q3g) obj;
        return Intrinsics.a(this.a, q3gVar.a) && Intrinsics.a(this.b, q3gVar.b) && Intrinsics.a(this.c, q3gVar.c);
    }

    public final int hashCode() {
        URI uri = this.a;
        int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        URI uri2 = this.b;
        int iHashCode2 = (iHashCode + (uri2 == null ? 0 : uri2.hashCode())) * 31;
        String str = this.c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "";
    }
}
