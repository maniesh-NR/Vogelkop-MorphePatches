package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class q4i {
    public static final q4i a;
    public static final q4i b;
    public static final /* synthetic */ q4i[] c;

    static {
        q4i q4iVar = new q4i("WALLPAPER", 0);
        a = q4iVar;
        q4i q4iVar2 = new q4i("APP_ICON", 1);
        b = q4iVar2;
        c = new q4i[]{q4iVar, q4iVar2};
    }

    public static q4i valueOf(String str) {
        return (q4i) Enum.valueOf(q4i.class, str);
    }

    public static q4i[] values() {
        return (q4i[]) c.clone();
    }
}
