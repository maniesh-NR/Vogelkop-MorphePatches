package defpackage;

/* loaded from: classes.dex */
public final class eia {
    public final fia a;

    public eia(fia fiaVar) {
        this.a = fiaVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof eia) && this.a.equals(((eia) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ActionsV1PlayAudioCommentaryData(error=" + this.a + ")";
    }
}
