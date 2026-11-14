package defpackage;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ly1 {
    public final Uri a;
    public final String b;
    public final String c;
    public final o29 d;

    public ly1(Uri uri, String str) {
        this.a = uri;
        this.b = str;
        this.c = MimeTypeMap.getFileExtensionFromUrl(uri.toString());
        this.d = c5o.m().o(uri.toString(), str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ly1)) {
            return false;
        }
        ly1 ly1Var = (ly1) obj;
        return this.a.equals(ly1Var.a) && Intrinsics.a(this.b, ly1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "";
    }
}
