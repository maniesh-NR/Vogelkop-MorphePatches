package defpackage;

/* loaded from: classes.dex */
public enum skg {
    /* JADX INFO: Fake field, exist only in values array */
    MINIMIZED("minimized"),
    COLLAPSED("collapsed"),
    NORMAL("normal"),
    /* JADX INFO: Fake field, exist only in values array */
    EXPANDED("expanded"),
    FULLSCREEN("fullscreen");

    public final String a;

    skg(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
