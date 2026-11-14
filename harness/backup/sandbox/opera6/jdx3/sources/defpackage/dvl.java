package defpackage;

import com.opera.android.bar.TopToolbarContainer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class dvl {
    public final TopToolbarContainer a;
    public final int b;

    public dvl(TopToolbarContainer topToolbarContainer, int i) {
        this.a = topToolbarContainer;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dvl)) {
            return false;
        }
        dvl dvlVar = (dvl) obj;
        return Intrinsics.a(this.a, dvlVar.a) && this.b == dvlVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
