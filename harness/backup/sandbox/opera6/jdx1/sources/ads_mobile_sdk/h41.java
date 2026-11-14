package ads_mobile_sdk;

import androidx.core.app.NotificationCompat;
import defpackage.dko;
import defpackage.flp;

/* loaded from: classes.dex */
public final class h41 extends ku0 {
    private static final h41 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 13;
    public static final int g = 4;
    public static final int h = 5;
    public static final int i = 6;
    public static final int j = 12;
    public static final int k = 15;
    public static final int l = 7;
    public static final int m = 8;
    public static final int n = 14;
    public static final int o = 9;
    public static final int p = 10;
    public static final int q = 11;
    private int bitField0_;
    private int bucketSize_;
    private int elementMaxLength_;
    private boolean excludeFalse_;
    private boolean excludeTrue_;
    private int maxLength_;
    private int maxSize_;
    private double multiplyingFactor_;
    private int round_;
    private int type_;
    private flp path_ = am2.e;
    private String urlKey_ = "";
    private String arraySeparator_ = ",";
    private String keyValueSeparator_ = "=";
    private String itemSeparator_ = "&";
    private String captureGroup_ = "";

    static {
        h41 h41Var = new h41();
        DEFAULT_INSTANCE = h41Var;
        ku0.a(h41.class, h41Var);
    }

    public final int A() {
        return this.round_;
    }

    public final int B() {
        int i2 = this.type_;
        int i3 = 1;
        if (i2 != 0) {
            if (i2 != 1) {
                i3 = 3;
                if (i2 != 2) {
                    i3 = i2 != 3 ? 0 : 4;
                }
            } else {
                i3 = 2;
            }
        }
        if (i3 == 0) {
            return 5;
        }
        return i3;
    }

    public final String C() {
        return this.urlKey_;
    }

    public final boolean D() {
        return (this.bitField0_ & 64) != 0;
    }

    public final boolean E() {
        return (this.bitField0_ & 8192) != 0;
    }

    public final boolean F() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean G() {
        return (this.bitField0_ & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
    }

    public final boolean H() {
        return (this.bitField0_ & NotificationCompat.FLAG_HIGH_PRIORITY) != 0;
    }

    public final boolean I() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i2, ku0 ku0Var) {
        int iA = zwg.a(i2);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0001\u0000\u0001Ț\u0002ለ\u0000\u0003ဌ\u0001\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဋ\u0005\u0007ဋ\b\bለ\t\tለ\u000b\nለ\f\u000bለ\r\fဋ\u0006\rဋ\u0002\u000eဋ\n\u000fက\u0007", new Object[]{"bitField0_", "path_", "urlKey_", "type_", "excludeTrue_", "excludeFalse_", "round_", "maxSize_", "arraySeparator_", "keyValueSeparator_", "itemSeparator_", "captureGroup_", "bucketSize_", "maxLength_", "elementMaxLength_", "multiplyingFactor_"});
        }
        if (iA == 3) {
            return new h41();
        }
        if (iA == 4) {
            return new dko(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(h41.class);
        }
        throw null;
    }

    public final String o() {
        return this.arraySeparator_;
    }

    public final int p() {
        return this.bucketSize_;
    }

    public final String q() {
        return this.captureGroup_;
    }

    public final int r() {
        return this.elementMaxLength_;
    }

    public final boolean s() {
        return this.excludeFalse_;
    }

    public final boolean t() {
        return this.excludeTrue_;
    }

    public final String u() {
        return this.itemSeparator_;
    }

    public final String v() {
        return this.keyValueSeparator_;
    }

    public final int w() {
        return this.maxLength_;
    }

    public final int x() {
        return this.maxSize_;
    }

    public final double y() {
        return this.multiplyingFactor_;
    }

    public final flp z() {
        return this.path_;
    }
}
