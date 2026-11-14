package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f3j {
    public final Uri a;
    public final Uri b;
    public final Uri c;
    public final Uri d;
    public final Uri e;

    public f3j(Uri uri, Uri uri2, Uri uri3, Uri uri4, Uri uri5) {
        this.a = uri;
        this.b = uri2;
        this.c = uri3;
        this.d = uri4;
        this.e = uri5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3j)) {
            return false;
        }
        f3j f3jVar = (f3j) obj;
        return Intrinsics.a(this.a, f3jVar.a) && Intrinsics.a(this.b, f3jVar.b) && Intrinsics.a(this.c, f3jVar.c) && Intrinsics.a(this.d, f3jVar.d) && Intrinsics.a(this.e, f3jVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Uri uri = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((iHashCode + (uri == null ? 0 : uri.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
