package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class zpl {
    public static final zpl a;
    public static final zpl b;
    public static final /* synthetic */ zpl[] c;

    static {
        zpl zplVar = new zpl("UPTIME", 0);
        a = zplVar;
        zpl zplVar2 = new zpl("REALTIME", 1);
        b = zplVar2;
        c = new zpl[]{zplVar, zplVar2};
    }

    public static zpl valueOf(String str) {
        return (zpl) Enum.valueOf(zpl.class, str);
    }

    public static zpl[] values() {
        return (zpl[]) c.clone();
    }
}
