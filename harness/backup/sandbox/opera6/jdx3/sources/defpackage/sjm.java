package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public abstract class sjm {
    public static final qjm b = new qjm(false);
    public final boolean a;

    public sjm(boolean z) {
        this.a = z;
    }

    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && this.a == ((sjm) obj).a;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a));
    }
}
