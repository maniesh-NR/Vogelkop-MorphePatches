package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class dol {
    public static final dol a;
    public static final dol b;
    public static final dol c;
    public static final dol d;
    public static final dol e;
    public static final /* synthetic */ dol[] f;

    static {
        dol dolVar = new dol("SITE_ICON", 0);
        a = dolVar;
        dol dolVar2 = new dol("SITE_IMAGE", 1);
        b = dolVar2;
        dol dolVar3 = new dol("SITE_IMAGE_SKIP_LOGOS", 2);
        c = dolVar3;
        dol dolVar4 = new dol("SCREENSHOT", 3);
        d = dolVar4;
        dol dolVar5 = new dol("WALLPAPER", 4);
        e = dolVar5;
        f = new dol[]{dolVar, dolVar2, dolVar3, dolVar4, dolVar5};
    }

    public static dol valueOf(String str) {
        return (dol) Enum.valueOf(dol.class, str);
    }

    public static dol[] values() {
        return (dol[]) f.clone();
    }
}
