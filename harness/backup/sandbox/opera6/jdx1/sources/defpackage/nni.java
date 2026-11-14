package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class nni {
    public static final nni a;
    public static final nni b;
    public static final /* synthetic */ nni[] c;

    static {
        nni nniVar = new nni("PREVIEW_VIEW", 0);
        a = nniVar;
        nni nniVar2 = new nni("SCREEN_FLASH_VIEW", 1);
        b = nniVar2;
        c = new nni[]{nniVar, nniVar2};
    }

    public static nni valueOf(String str) {
        return (nni) Enum.valueOf(nni.class, str);
    }

    public static nni[] values() {
        return (nni[]) c.clone();
    }
}
