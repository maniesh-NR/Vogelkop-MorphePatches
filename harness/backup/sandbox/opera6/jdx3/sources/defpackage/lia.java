package defpackage;

/* loaded from: classes.dex */
public final class lia {
    public final mia a;

    public lia(mia miaVar) {
        this.a = miaVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof lia) && this.a.equals(((lia) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ActionsV1StopAudioCommentaryData(error=" + this.a + ")";
    }
}
