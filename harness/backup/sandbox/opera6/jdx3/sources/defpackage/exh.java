package defpackage;

import android.content.res.ColorStateList;

/* loaded from: classes.dex */
public final class exh extends cxh {
    public final ColorStateList a;

    public exh(ColorStateList colorStateList) {
        this.a = colorStateList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof exh) && this.a.equals(((exh) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "";
    }
}
