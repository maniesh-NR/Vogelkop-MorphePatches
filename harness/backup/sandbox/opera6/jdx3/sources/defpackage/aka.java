package defpackage;

/* loaded from: classes.dex */
public final class aka {
    public final sfb a;

    public aka(sfb sfbVar) {
        this.a = sfbVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof aka) && this.a.equals(((aka) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ChatV1GetChatData(chat=" + this.a + ")";
    }
}
