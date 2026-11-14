package defpackage;

import android.net.Uri;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ldb {
    public final Uri a;
    public final byte[] b;

    public ldb(Uri uri, byte[] bArr) {
        this.a = uri;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ldb)) {
            return false;
        }
        ldb ldbVar = (ldb) obj;
        return Intrinsics.a(this.a, ldbVar.a) && Intrinsics.a(this.b, ldbVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
