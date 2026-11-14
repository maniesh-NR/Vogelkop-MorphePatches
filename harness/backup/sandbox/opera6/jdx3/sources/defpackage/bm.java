package defpackage;

/* loaded from: classes.dex */
public enum bm {
    d("no suitable ad", new int[]{-1, -104, -105, -106, -107, -116, -117}),
    /* JADX INFO: Fake field, exist only in values array */
    INVALID_PARAMETER(-2, "invalid parameter"),
    /* JADX INFO: Fake field, exist only in values array */
    NO_PRIVILEGE(-4, "no privilege"),
    /* JADX INFO: Fake field, exist only in values array */
    FORCE_STOPPED(-5, "ad or material force stopped"),
    /* JADX INFO: Fake field, exist only in values array */
    BUNDLE_BLOCKED(-12, "bundle is blocked"),
    /* JADX INFO: Fake field, exist only in values array */
    INVALID_PLACEMENT_KEY(-100, "invalid placement key"),
    /* JADX INFO: Fake field, exist only in values array */
    EF7("failed to get placement info", new int[]{-101, -103}),
    /* JADX INFO: Fake field, exist only in values array */
    PLACEMENT_IS_OFFLINE(-102, "placement is offline"),
    /* JADX INFO: Fake field, exist only in values array */
    INVALID_JSON_FORMAT(-108, "invalid json format"),
    /* JADX INFO: Fake field, exist only in values array */
    EF10("medium error", new int[]{-109, -110, -111}),
    /* JADX INFO: Fake field, exist only in values array */
    EF11("publisher error", new int[]{-112, -113, -120, -121}),
    /* JADX INFO: Fake field, exist only in values array */
    BUNDLE_NOT_MATCH(-114, "bundle id is not match"),
    /* JADX INFO: Fake field, exist only in values array */
    EF13("empty article info", new int[]{-118, -119}),
    VAST_FAILED_TO_DOWNLOAD_VIDEO(-200, "failed to download video of interstitial"),
    VAST_PLAYBACK_ERROR(-201, "internal vast error from IMA SDK"),
    /* JADX INFO: Fake field, exist only in values array */
    VAST_IGNORE_SKIPPABLE_AD(-202, "ignore skippable ad"),
    INTERNAL_ERROR(-300, "internal error"),
    NETWORK_ERROR(-400, "network error"),
    PERSISTENT_STORAGE_EMPTY(-500, "persistent storage is empty"),
    PERSISTENT_STORAGE_EXPIRED(-501, "persistent storage has expired"),
    PERSISTENT_STORAGE_INTERNAL_ERROR(-502, "persistent storage internal error"),
    PERSISTENT_STORAGE_PARSING_ERROR(-503, "persistent storage parsing error"),
    PERSISTENT_STORAGE_INITIALIZATION_ERROR(-504, "persistent storage initialization error"),
    UNKNOWN(-1000, "unknown");

    public final int a;
    public final int[] b;
    public final String c;

    bm(String str, int[] iArr) {
        this.b = iArr;
        this.c = str;
    }

    bm(int i, String str) {
        this.a = i;
        this.c = str;
    }

    public static bm d(int i) {
        loop0: for (bm bmVar : values()) {
            int[] iArr = bmVar.b;
            if (iArr != null && iArr.length > 0) {
                int i2 = 0;
                while (true) {
                    int[] iArr2 = bmVar.b;
                    if (i2 >= iArr2.length) {
                        break;
                    }
                    if (iArr2[i2] == i) {
                        break loop0;
                    }
                    i2++;
                }
            } else if (bmVar.a != i) {
            }
            return bmVar;
        }
        return UNKNOWN;
    }
}
