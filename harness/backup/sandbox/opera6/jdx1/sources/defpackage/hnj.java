package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class hnj extends jnj {
    public final IOException a;

    public hnj(IOException iOException) {
        this.a = iOException;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof hnj) && this.a.equals(((hnj) obj).a);
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
