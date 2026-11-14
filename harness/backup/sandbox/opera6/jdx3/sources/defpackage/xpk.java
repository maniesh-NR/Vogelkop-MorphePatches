package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class xpk {
    public static final tmj b;
    public static final xpk c;
    public static final xpk d;
    public static final xpk e;
    public static final xpk f;
    public static final xpk g;
    public static final xpk h;
    public static final xpk i;
    public static final xpk j;
    public static final /* synthetic */ xpk[] k;
    public static final /* synthetic */ h58 l;
    public final u1b a;

    static {
        xpk xpkVar = new xpk(0, "COPY", 14);
        c = xpkVar;
        xpk xpkVar2 = new xpk(1, "PASTE", 12, 13);
        d = xpkVar2;
        xpk xpkVar3 = new xpk(2, "NTP", 33);
        xpk xpkVar4 = new xpk(3, "SPEED_DIALS", 15);
        xpk xpkVar5 = new xpk(4, "SEARCH", 8);
        xpk xpkVar6 = new xpk(5, "RECENT", 11);
        e = xpkVar6;
        xpk xpkVar7 = new xpk(6, "TRENDING", 10);
        f = xpkVar7;
        xpk xpkVar8 = new xpk(7, "AI_FILE_UPLOAD_PROMPT_SUGGESTIONS", 27, 28, 30, 31);
        xpk xpkVar9 = new xpk(8, "CHAT_SUGGESTIONS", 25);
        g = xpkVar9;
        xpk xpkVar10 = new xpk(9, "RECENT_AI_ACTIVITY", 26);
        h = xpkVar10;
        xpk xpkVar11 = new xpk(10, "OTHERS", 0, 1, 2, 3, 4, 5, 6, 7, 9, 16, 34, 17, 18, 19, 21, 22, 23, 24, 32);
        i = xpkVar11;
        xpk xpkVar12 = new xpk(11, "SETTINGS", 20);
        j = xpkVar12;
        xpk[] xpkVarArr = {xpkVar, xpkVar2, xpkVar3, xpkVar4, xpkVar5, xpkVar6, xpkVar7, xpkVar8, xpkVar9, xpkVar10, xpkVar11, xpkVar12};
        k = xpkVarArr;
        l = new h58(xpkVarArr);
        b = new tmj((byte) 3);
    }

    public xpk(int i2, String str, int... iArr) {
        this.a = u1b.r(b82.l(iArr));
    }

    public static xpk valueOf(String str) {
        return (xpk) Enum.valueOf(xpk.class, str);
    }

    public static xpk[] values() {
        return (xpk[]) k.clone();
    }
}
