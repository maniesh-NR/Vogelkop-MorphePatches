package defpackage;

/* loaded from: classes.dex */
public enum z17 {
    UNDEFINED("", 0),
    /* JADX INFO: Fake field, exist only in values array */
    USERNOTLOGGEDIN("User is not logged in", -32002),
    /* JADX INFO: Fake field, exist only in values array */
    CHATNOTFOUND("Chat does not exist", -32003),
    /* JADX INFO: Fake field, exist only in values array */
    CHATINUSE("Chat in use", -32004);

    public final long a;
    public final String b;

    z17(String str, long j) {
        this.a = j;
        this.b = str;
    }
}
