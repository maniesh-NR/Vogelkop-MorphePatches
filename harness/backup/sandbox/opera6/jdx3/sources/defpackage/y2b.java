package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class y2b {
    public static final ix5 b;
    public static final y2b c;
    public static final y2b d;
    public static final y2b e;
    public static final /* synthetic */ y2b[] f;
    public static final /* synthetic */ h58 g;
    public final int a;

    static {
        b3b[] b3bVarArr = b3b.a;
        y2b y2bVar = new y2b("SYNC_PASSPHRASE_ERROR", 0, -1);
        c = y2bVar;
        y2b y2bVar2 = new y2b("DOWNLOAD_LOCATION_ERROR", 1, -2);
        y2b y2bVar3 = new y2b("TIMEOUT_ERROR", 2, -3);
        d = y2bVar3;
        y2b y2bVar4 = new y2b("DOWNLOAD_NO_SPACE_ERROR", 3, -4);
        y2b y2bVar5 = new y2b("DOWNLOAD_FILE_NAME_ERROR", 4, -5);
        y2b y2bVar6 = new y2b("DOWNLOAD_FILE_NOT_EXIST_ERROR", 5, -6);
        y2b y2bVar7 = new y2b("UNKNOWN_ERROR", 6, 0);
        e = y2bVar7;
        y2b[] y2bVarArr = {y2bVar, y2bVar2, y2bVar3, y2bVar4, y2bVar5, y2bVar6, y2bVar7, new y2b("IO_ERROR", 7, 1), new y2b("BAD_FORMAT", 8, 2), new y2b("MAX_FILE_SIZE", 9, 3), new y2b("IMPORT_ALREADY_ACTIVE", 10, 4), new y2b("NUM_PASSWORDS_EXCEEDED", 11, 5)};
        f = y2bVarArr;
        g = new h58(y2bVarArr);
        b = new ix5((byte) 14);
    }

    public y2b(String str, int i, int i2) {
        this.a = i2;
    }

    public static y2b valueOf(String str) {
        return (y2b) Enum.valueOf(y2b.class, str);
    }

    public static y2b[] values() {
        return (y2b[]) f.clone();
    }
}
