package defpackage;

/* loaded from: classes.dex */
public final class jia {
    public final kia a;

    public jia(kia kiaVar) {
        this.a = kiaVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof jia) && this.a.equals(((jia) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return 30969;
    }

    public final String toString() {
        return "ActionsV1StartSpeechOutputData(error=" + this.a + ")";
    }
}
