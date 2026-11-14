package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class m32 {
    public static final m32 a;
    public static final m32 b;
    public static final /* synthetic */ m32[] c;

    static {
        m32 m32Var = new m32("CAMERA_PERMISSION_DENIED", 0);
        a = m32Var;
        m32 m32Var2 = new m32("PHOTO_MAYBE_TAKEN", 1);
        b = m32Var2;
        c = new m32[]{m32Var, m32Var2};
    }

    public static m32 valueOf(String str) {
        return (m32) Enum.valueOf(m32.class, str);
    }

    public static m32[] values() {
        return (m32[]) c.clone();
    }
}
