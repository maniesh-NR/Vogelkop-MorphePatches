package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class w5i {
    public static final w5i a;
    public static final w5i b;
    public static final /* synthetic */ w5i[] c;

    /* JADX INFO: Fake field, exist only in values array */
    w5i EF0;

    static {
        w5i w5iVar = new w5i("AUTOMATIC", 0);
        w5i w5iVar2 = new w5i("TRUNCATE", 1);
        a = w5iVar2;
        w5i w5iVar3 = new w5i("WRITE_AHEAD_LOGGING", 2);
        b = w5iVar3;
        c = new w5i[]{w5iVar, w5iVar2, w5iVar3};
    }

    public static w5i valueOf(String str) {
        return (w5i) Enum.valueOf(w5i.class, str);
    }

    public static w5i[] values() {
        return (w5i[]) c.clone();
    }
}
