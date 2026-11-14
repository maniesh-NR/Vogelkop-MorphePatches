package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class m5j {
    public static final m5j a;
    public static final m5j b;
    public static final /* synthetic */ m5j[] c;

    static {
        m5j m5jVar = new m5j("Text", 0);
        a = m5jVar;
        m5j m5jVar2 = new m5j("Number", 1);
        b = m5jVar2;
        c = new m5j[]{m5jVar, m5jVar2};
    }

    public static m5j valueOf(String str) {
        return (m5j) Enum.valueOf(m5j.class, str);
    }

    public static m5j[] values() {
        return (m5j[]) c.clone();
    }
}
