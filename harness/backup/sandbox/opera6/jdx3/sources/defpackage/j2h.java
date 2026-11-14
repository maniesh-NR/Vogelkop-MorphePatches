package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j2h {
    public static final /* synthetic */ j2h[] a = {new j2h("OFA_DEV", 0), new j2h("OFA_BETA", 1), new j2h("OFA_FINAL", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    j2h EF5;

    public static j2h valueOf(String str) {
        return (j2h) Enum.valueOf(j2h.class, str);
    }

    public static j2h[] values() {
        return (j2h[]) a.clone();
    }
}
