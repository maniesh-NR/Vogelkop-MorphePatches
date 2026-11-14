package defpackage;

import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public final class j4i {
    public final MaterialButton a;

    public j4i(MaterialButton materialButton) {
        this.a = materialButton;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof j4i) && this.a.equals(((j4i) obj).a);
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
