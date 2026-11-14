package defpackage;

import android.net.Uri;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v12 extends o0g {
    public final Uri i;
    public final File j;

    public v12(Uri uri, File file) {
        this.i = uri;
        this.j = file;
    }

    public final File V() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v12)) {
            return false;
        }
        v12 v12Var = (v12) obj;
        return Intrinsics.a(this.i, v12Var.i) && this.j.equals(v12Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + (this.i.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
