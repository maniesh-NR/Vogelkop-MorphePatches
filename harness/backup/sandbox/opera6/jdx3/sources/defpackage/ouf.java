package defpackage;

/* loaded from: classes.dex */
public final class ouf {
    public final byte a;

    public final boolean equals(Object obj) {
        if (obj instanceof ouf) {
            return this.a == ((ouf) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        byte b = this.a;
        if (b == 0) {
            return "PENDING";
        }
        if (b == 1) {
            return "AVAILABLE";
        }
        if (b == 2) {
            return "UNAVAILABLE";
        }
        switch (b) {
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return "ERROR_OUTPUT_FAILED";
            case 11:
                return "ERROR_OUTPUT_ABORTED";
            case 12:
                return "ERROR_OUTPUT_MISSING";
            case 13:
                return "ERROR_OUTPUT_DROPPED";
            default:
                return fki.r("OutputStatus(value=", b, ')');
        }
    }
}
