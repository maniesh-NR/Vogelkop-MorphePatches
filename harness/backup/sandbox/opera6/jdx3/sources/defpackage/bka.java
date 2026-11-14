package defpackage;

/* loaded from: classes.dex */
public final class bka {
    public final tfb a;

    public bka(tfb tfbVar) {
        this.a = tfbVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof bka) && this.a.equals(((bka) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ChatV1GetChatItemData(chatItem=" + this.a + ")";
    }
}
