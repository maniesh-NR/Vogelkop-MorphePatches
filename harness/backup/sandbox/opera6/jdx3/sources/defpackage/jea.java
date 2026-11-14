package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class jea {
    public static final /* synthetic */ jea[] a = {new jea("HIDE_WHILE_INTERACTING", 0), new jea("SHOW_NEVER", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    jea EF5;

    public static jea valueOf(String str) {
        return (jea) Enum.valueOf(jea.class, str);
    }

    public static jea[] values() {
        return (jea[]) a.clone();
    }
}
