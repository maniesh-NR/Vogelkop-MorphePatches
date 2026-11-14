package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class eqd {
    public int a;
    public int b;

    public final boolean equals(Object obj) {
        int i = this.b;
        int i2 = this.a;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eqd)) {
            return false;
        }
        eqd eqdVar = (eqd) obj;
        int i3 = eqdVar.b;
        int i4 = eqdVar.a;
        return (i2 < 0 || i4 < 0) ? i == i3 : i2 == i4 && i == i3;
    }

    public final int hashCode() {
        return Objects.hash("android.media.session.MediaController", Integer.valueOf(this.b));
    }
}
