package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class rqn extends coh {
    public final String a;
    public final Uri b;
    public final ioh c;

    public rqn(String str, Uri uri, ioh iohVar) {
        this.a = str;
        this.b = uri;
        this.c = iohVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rqn)) {
            return false;
        }
        rqn rqnVar = (rqn) obj;
        return Intrinsics.a(this.a, rqnVar.a) && Intrinsics.a(this.b, rqnVar.b) && this.c.equals(rqnVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
