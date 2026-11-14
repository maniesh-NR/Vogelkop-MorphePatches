package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.leanplum.utils.SizeUtil;
import okhttp3.internal.connection.RealCall;

/* loaded from: classes.dex */
public abstract /* synthetic */ class j7c {
    public static int[] _values() {
        return vep.B(42);
    }

    public static final boolean a(int i, int i2) {
        return vep.A(i) >= vep.A(i2);
    }

    public static int b(Boolean bool) {
        if (bool == null) {
            return 1;
        }
        return bool.booleanValue() ? 2 : 3;
    }

    public static int c(String str) {
        return (str.equalsIgnoreCase("hot_topic") || str.equals("trending") || str.equals("publishers") || str.equals("double_videos") || str.equals("top_news_group") || str.equals("roundups") || str.equals("audios") || str.equals("carousel")) ? 2 : 1;
    }

    public static /* synthetic */ byte d(int i) {
        if (i == 1) {
            return (byte) 1;
        }
        if (i == 2) {
            return (byte) 2;
        }
        throw null;
    }

    public static /* synthetic */ byte e(int i) {
        byte b = 1;
        if (i != 1) {
            b = 2;
            if (i != 2) {
                if (i == 3) {
                    return (byte) 4;
                }
                throw null;
            }
        }
        return b;
    }

    public static /* synthetic */ byte f(int i) {
        switch (i) {
            case 1:
                return (byte) 1;
            case 2:
                return (byte) 2;
            case 3:
                return (byte) 8;
            case 4:
                return (byte) 9;
            case 5:
                return (byte) 10;
            case 6:
                return (byte) 11;
            case 7:
                return (byte) 12;
            case 8:
                return (byte) 13;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return (byte) 14;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return (byte) 15;
            case 11:
                return (byte) 16;
            case 12:
                return (byte) 17;
            case 13:
                return (byte) 18;
            case 14:
                return (byte) 19;
            case 15:
                return (byte) 20;
            case 16:
                return (byte) 21;
            case 17:
                return (byte) 22;
            case SizeUtil.textSize0_1 /* 18 */:
                return (byte) 23;
            case 19:
                return (byte) 24;
            case SizeUtil.textSize0 /* 20 */:
                return (byte) 25;
            case 21:
                return (byte) 26;
            case SizeUtil.textSize1 /* 22 */:
                return (byte) 27;
            case 23:
                return (byte) 28;
            case SizeUtil.textSize2 /* 24 */:
                return (byte) 29;
            case 25:
                return (byte) 30;
            case 26:
                return (byte) 31;
            case 27:
                return (byte) 32;
            case 28:
                return (byte) 33;
            case 29:
                return (byte) 34;
            case 30:
                return (byte) 35;
            case 31:
                return (byte) 36;
            case 32:
                return (byte) 37;
            case 33:
                return (byte) 38;
            case 34:
                return (byte) 39;
            case 35:
                return (byte) 40;
            case 36:
                return (byte) 41;
            case 37:
                return (byte) 42;
            case 38:
                return (byte) 43;
            case 39:
                return (byte) 44;
            case 40:
                return (byte) 45;
            case 41:
                return (byte) 46;
            case 42:
                return (byte) 47;
            default:
                throw null;
        }
    }

    public static /* synthetic */ byte g(int i) {
        if (i == 1) {
            return (byte) 0;
        }
        if (i == 2) {
            return (byte) 1;
        }
        if (i == 3) {
            return (byte) 2;
        }
        throw null;
    }

    public static /* synthetic */ String h(int i) {
        if (i == 1) {
            return "com.opera.minisettingsmocker";
        }
        if (i == 2) {
            return "com.opera.ofasettingsmocker";
        }
        throw null;
    }

    public static /* synthetic */ String i(int i) {
        switch (i) {
            case 1:
                return "NAME";
            case 2:
                return "PHONE";
            case 3:
                return "EMAIL";
            case 4:
                return "GENDER";
            case 5:
                return "AGE";
            case 6:
                return "ADDRESS1";
            case 7:
                return "ADDRESS2";
            case 8:
                return "COMPANY";
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return "COUNTRY";
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return "SURNAME";
            case 11:
                return "ILLEGAL";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String j(int i) {
        switch (i) {
            case 1:
                return "ulq";
            case 2:
                return "lq";
            case 3:
                return "mq";
            case 4:
                return "hq";
            case 5:
                return "uhq";
            case 6:
                return "og";
            default:
                throw null;
        }
    }

    public static int k(int i, int i2, int i3, int i4) {
        return w75.e(i) + i2 + i3 + i4;
    }

    public static int l(int i, int i2, int i3, int i4, int i5) {
        int i6 = i + i2 + i3;
        return ((i6 << i4) | (i6 >>> (32 - i4))) + i5;
    }

    public static tlj m(qc3 qc3Var, i8e i8eVar) {
        tlj tljVar = new tlj(qc3Var);
        i8eVar.a(tljVar);
        return tljVar;
    }

    public static View n(ViewGroup viewGroup, int i, ViewGroup viewGroup2, boolean z) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup2, z);
    }

    public static String o(long j, String str, StringBuilder sb) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static String p(StringBuilder sb, char c, String str, char c2, rhk rhkVar) {
        sb.append(c);
        sb.append(str);
        sb.append(c2);
        sb.append(rhkVar);
        return sb.toString();
    }

    public static RealCall q(fvh fvhVar, t9f t9fVar) {
        return t9fVar.c(new kvh(fvhVar));
    }

    public static void r(to9 to9Var, String str, String str2, String str3, String str4) {
        to9Var.n(str);
        to9Var.n(str2);
        to9Var.n(str3);
        to9Var.n(str4);
    }

    public static int s(int i, int i2, int i3, int i4) {
        return x75.h(i) + i2 + i3 + i4;
    }

    public static /* synthetic */ String t(int i) {
        switch (i) {
            case 1:
                return "NOT_REQUIRED";
            case 2:
                return "CONNECTED";
            case 3:
                return "UNMETERED";
            case 4:
                return "NOT_ROAMING";
            case 5:
                return "METERED";
            case 6:
                return "TEMPORARILY_UNMETERED";
            default:
                return "null";
        }
    }
}
