package defpackage;

import ads_mobile_sdk.xu0;
import ads_mobile_sdk.yb1;
import com.leanplum.internal.Constants;
import com.leanplum.internal.ResourceQualifiers;
import com.leanplum.utils.SizeUtil;
import java.util.List;

/* loaded from: classes.dex */
public abstract /* synthetic */ class sko {
    public static int _a(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return 10;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            default:
                return 0;
        }
    }

    public static int _a$1(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 1000 ? 0 : 4;
        }
        return 3;
    }

    public static int _a$2(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static final int _getNumber$1(int i) {
        if (i == 8) {
            byte[] bArr = yb1.a;
            qp2.o("Can't get the number of an unknown enum value.");
            return 0;
        }
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return -1;
            default:
                throw null;
        }
    }

    public static /* synthetic */ short a(int i) {
        if (i == 1) {
            return (short) 0;
        }
        if (i == 2) {
            return (short) 1;
        }
        if (i == 3) {
            return (short) 2;
        }
        if (i == 4) {
            return (short) 1000;
        }
        throw null;
    }

    public static /* synthetic */ byte b(int i) {
        if (i == 1) {
            return (byte) 0;
        }
        if (i == 2) {
            return (byte) 1;
        }
        if (i == 3) {
            return (byte) 2;
        }
        if (i == 4) {
            return (byte) 3;
        }
        throw null;
    }

    public static /* synthetic */ int c(int i) {
        switch (i) {
            case 1:
                return 1;
            case 2:
                return 3;
            case 3:
                return 5;
            case 4:
                return 7;
            case 5:
                return 9;
            case 6:
                return 11;
            case 7:
                return 13;
            case 8:
                return 15;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return 17;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return 19;
            case 11:
                return 2;
            case 12:
                return 4;
            case 13:
                return 8;
            case 14:
                return 16;
            case 15:
                return 32;
            case 16:
                return 64;
            case 17:
                return ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL;
            case SizeUtil.textSize0_1 /* 18 */:
                return Constants.Crypt.KEY_LENGTH;
            case 19:
                return 512;
            case SizeUtil.textSize0 /* 20 */:
                return 1024;
            case 21:
                return 2048;
            case SizeUtil.textSize1 /* 22 */:
                return 4096;
            case 23:
                return 8192;
            case SizeUtil.textSize2 /* 24 */:
                return 16384;
            case 25:
                return 32768;
            case 26:
                return 65536;
            case 27:
                return 131072;
            default:
                throw null;
        }
    }

    public static int d(float f, int i, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    public static w4 e(h58 h58Var, h58 h58Var2) {
        h58Var.getClass();
        return new w4(h58Var2, (byte) 0);
    }

    public static pqh f(Object obj) {
        ybh.y(obj);
        return new pqh();
    }

    public static ClassCastException g(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static String h(int i, int i2, String str, String str2) {
        return str + i + str2 + i2;
    }

    public static String i(int i, String str) {
        return str + i;
    }

    public static String j(String str, String str2) {
        return str + str2;
    }

    public static String k(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String l(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String m(String str, String str2, List list) {
        return str + list + str2;
    }

    public static String n(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    public static StringBuilder o(int i, int i2, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder p(int i, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(i);
        sb.append(str4);
        return sb;
    }

    public static StringBuilder q(long j, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static void r(int i, int i2, String str, String str2, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
    }

    public static /* synthetic */ void s(Object obj) {
        if (obj == null) {
            return;
        }
        h9o.t();
    }

    public static void t(String str, String str2, String str3, Throwable th) {
        xu0.b(str + str2 + str3, th);
    }

    public static String u(String str, String str2) {
        return str + str2;
    }

    public static String v(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static /* synthetic */ String w(int i) {
        switch (i) {
            case 1:
                return "verbose";
            case 2:
                return "debug";
            case 3:
                return Constants.Params.INFO;
            case 4:
                return "warning";
            case 5:
                return "error";
            case 6:
                return "none";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String x(int i) {
        switch (i) {
            case 1:
                return "IMPRESSION";
            case 2:
                return "VIEWABLE_IMPRESSION";
            case 3:
                return "IMPRESSION_FAIL";
            case 4:
                return "CLICK";
            case 5:
                return "DISCARD";
            case 6:
                return "MISSING";
            case 7:
                return "VIDEO_LOAD";
            case 8:
                return "VIDEO_START";
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return "VIDEO_FIRSTQUARTILE";
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return "VIDEO_MIDPOINT";
            case 11:
                return "VIDEO_THIRDQUARTILE";
            case 12:
                return "VIDEO_COMPLETE";
            case 13:
                return "VIDEO_PROGRESS_2S";
            case 14:
                return "VIDEO_PROGRESS_15S";
            case 15:
                return "VIDEO_PROGRESS_97_PERCENT";
            case 16:
                return "VIDEO_ERROR";
            case 17:
                return "VIDEO_MUTE";
            case SizeUtil.textSize0_1 /* 18 */:
                return "VIDEO_UNMUTE";
            case 19:
                return "VIDEO_SKIP";
            case SizeUtil.textSize0 /* 20 */:
                return "VIDEO_STOP";
            case 21:
                return "VIDEO_PAUSE";
            case SizeUtil.textSize1 /* 22 */:
                return "VIDEO_RESUME";
            case 23:
                return "VIDEO_FULLSCREEN";
            case SizeUtil.textSize2 /* 24 */:
                return "VIDEO_EXIT_FULLSCREEN";
            case 25:
                return "AD_CHOICE";
            case 26:
                return "ILLEGAL";
            default:
                throw null;
        }
    }
}
