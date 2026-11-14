package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d2c {
    public static final d2c a;
    public static final d2c b;
    public static final /* synthetic */ d2c[] c;

    static {
        d2c d2cVar = new d2c("Ltr", 0);
        a = d2cVar;
        d2c d2cVar2 = new d2c("Rtl", 1);
        b = d2cVar2;
        c = new d2c[]{d2cVar, d2cVar2};
    }

    public static d2c valueOf(String str) {
        return (d2c) Enum.valueOf(d2c.class, str);
    }

    public static d2c[] values() {
        return (d2c[]) c.clone();
    }
}
