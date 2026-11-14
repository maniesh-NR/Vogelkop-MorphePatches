package defpackage;

/* loaded from: classes.dex */
public enum nsp {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    /* JADX INFO: Fake field, exist only in values array */
    HTML_DISPLAY("htmlDisplay"),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE_DISPLAY("nativeDisplay"),
    /* JADX INFO: Fake field, exist only in values array */
    VIDEO("video"),
    /* JADX INFO: Fake field, exist only in values array */
    AUDIO("audio");

    public final String a;

    nsp(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
