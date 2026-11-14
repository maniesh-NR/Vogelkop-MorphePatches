package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class nza {
    public final Bitmap a;

    public nza(Bitmap bitmap) {
        Uri uri = Uri.EMPTY;
        this.a = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nza)) {
            return false;
        }
        nza nzaVar = (nza) obj;
        Uri uri = Uri.EMPTY;
        return Intrinsics.a(uri, uri) && this.a.equals(nzaVar.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (Uri.EMPTY.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
