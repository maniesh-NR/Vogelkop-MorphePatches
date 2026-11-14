package defpackage;

/* loaded from: classes.dex */
public final class pgg {
    public static final pgg c = new pgg(0, false);
    public final boolean a;
    public final int b;

    public pgg() {
        this.a = false;
        this.b = 0;
    }

    public pgg(int i, boolean z) {
        this.a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pgg)) {
            return false;
        }
        pgg pggVar = (pgg) obj;
        return this.a == pggVar.a && this.b == pggVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.a + ", emojiSupportMatch=" + ez7.a(this.b) + ")";
    }
}
