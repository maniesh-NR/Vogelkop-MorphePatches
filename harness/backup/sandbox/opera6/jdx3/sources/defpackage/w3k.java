package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class w3k implements z3k {
    public final IOException a;

    public w3k(IOException iOException) {
        this.a = iOException;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof w3k) && this.a.equals(((w3k) obj).a);
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
