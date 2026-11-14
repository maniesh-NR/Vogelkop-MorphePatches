package defpackage;

import android.net.Uri;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w12 extends o0g {
    public final Uri i;
    public final File j;

    public w12(Uri uri, File file) {
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
        if (!(obj instanceof w12)) {
            return false;
        }
        w12 w12Var = (w12) obj;
        return Intrinsics.a(this.i, w12Var.i) && this.j.equals(w12Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + (this.i.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
