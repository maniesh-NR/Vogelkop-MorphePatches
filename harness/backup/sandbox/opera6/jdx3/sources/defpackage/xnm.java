package defpackage;

/* loaded from: classes.dex */
public enum xnm {
    UNDEFINED("", 0),
    /* JADX INFO: Fake field, exist only in values array */
    ARIANOTREADY("Aria is not ready", -32001),
    /* JADX INFO: Fake field, exist only in values array */
    CHATNOTFOUND("Chat does not exist", -32003);

    public final long a;
    public final String b;

    xnm(String str, long j) {
        this.a = j;
        this.b = str;
    }
}
