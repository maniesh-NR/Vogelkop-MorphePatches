package defpackage;

/* loaded from: classes.dex */
public final class ezj {
    public final tla a;

    public ezj(tla tlaVar) {
        this.a = tlaVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ezj) && this.a.equals(((ezj) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SpeechState(activeStream=" + this.a + ")";
    }
}
