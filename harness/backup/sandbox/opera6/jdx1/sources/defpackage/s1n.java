package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class s1n {
    public static final /* synthetic */ s1n[] a = {new s1n("STRICT", 0), new s1n("LOG", 1), new s1n("QUIET", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    s1n EF5;

    public static s1n valueOf(String str) {
        return (s1n) Enum.valueOf(s1n.class, str);
    }

    public static s1n[] values() {
        return (s1n[]) a.clone();
    }
}
