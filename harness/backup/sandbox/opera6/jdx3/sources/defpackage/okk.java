package defpackage;

/* loaded from: classes.dex */
public enum okk {
    UNDEFINED("", 0),
    /* JADX INFO: Fake field, exist only in values array */
    ARIANOTREADY("Aria is not ready", -32001),
    /* JADX INFO: Fake field, exist only in values array */
    USERNOTLOGGEDIN("User is not logged in", -32002),
    /* JADX INFO: Fake field, exist only in values array */
    CHATNOTFOUND("Chat does not exist", -32003),
    /* JADX INFO: Fake field, exist only in values array */
    FILENOTFOUND("File not found", -32005);

    public final long a;
    public final String b;

    okk(String str, long j) {
        this.a = j;
        this.b = str;
    }
}
