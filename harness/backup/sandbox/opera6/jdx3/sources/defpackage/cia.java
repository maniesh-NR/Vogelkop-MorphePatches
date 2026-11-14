package defpackage;

/* loaded from: classes.dex */
public final class cia {
    public final dia a;

    public cia(dia diaVar) {
        this.a = diaVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof cia) && this.a.equals(((cia) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ActionsV1PauseAudioCommentaryData(error=" + this.a + ")";
    }
}
