package defpackage;

/* loaded from: classes.dex */
public final class a42 {
    public final xnm a;

    public a42(xnm xnmVar) {
        this.a = xnmVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a42) && this.a == ((a42) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ActionsV1UpdateChatModifiersData(error=" + this.a + ")";
    }
}
