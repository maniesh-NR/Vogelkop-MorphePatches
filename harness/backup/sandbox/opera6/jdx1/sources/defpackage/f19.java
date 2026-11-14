package defpackage;

/* loaded from: classes.dex */
public enum f19 {
    JSON(".json"),
    ZIP(".zip");

    public final String a;

    f19(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
