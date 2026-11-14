package defpackage;

/* loaded from: classes.dex */
public final class ean {
    public final ydb a;

    public ean(ydb ydbVar) {
        this.a = ydbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ean) && this.a == ((ean) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "";
    }
}
