package defpackage;

import android.content.Context;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract /* synthetic */ class o18 {
    public static boolean a(b2l b2lVar, int i) {
        return i != 1 ? i == 2 : ((d7l) b2lVar).j.m();
    }

    public static final boolean b(int i) {
        return i == 2 || i == 4;
    }

    public static String c(String str, char c) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(c);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    public static String d(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            char cCharAt = str.charAt(i);
            if (!Character.isLetter(cCharAt)) {
                i++;
            } else if (!Character.isUpperCase(cCharAt)) {
                char upperCase = Character.toUpperCase(cCharAt);
                if (i == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i) + upperCase + str.substring(i + 1);
            }
        }
        return str;
    }

    public static /* synthetic */ byte e(int i) {
        byte b = 1;
        if (i != 1) {
            b = 2;
            if (i != 2) {
                if (i == 3) {
                    return (byte) 3;
                }
                throw null;
            }
        }
        return b;
    }

    public static /* synthetic */ String f(int i) {
        switch (i) {
            case 1:
                return "utm_campaign";
            case 2:
                return "utm_content";
            case 3:
                return "utm_medium";
            case 4:
                return "utm_source";
            case 5:
                return "utm_term";
            case 6:
                return "ofa_cb";
            case 7:
                return "gad_source";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String g(int i) {
        switch (i) {
            case 1:
                return "home_feed";
            case 2:
                return "channel_feed";
            case 3:
                return "related";
            case 4:
                return "video_detail";
            case 5:
                return "video_theater";
            case 6:
                return "publisher_detail";
            case 7:
                return "subscribed_videos";
            case 8:
                return "following_publishers";
            case 9:
                return "publishers_bar";
            case 10:
                return "native";
            case 11:
                return "web_page";
            default:
                throw null;
        }
    }

    public static int h(Context context, rxh rxhVar) {
        return rxhVar.a(context.getResources()).length();
    }

    public static ro9 i(evd evdVar) {
        ro9 ro9Var = new ro9(evdVar);
        ro9Var.v();
        return ro9Var;
    }

    public static orb j(String str, String str2, String str3, String str4) {
        orb orbVar = new orb();
        orbVar.p(str2, str);
        orbVar.p(str4, str3);
        return orbVar;
    }

    public static pxb k(String str) {
        d8b.b(str);
        return new pxb();
    }

    public static etk l(htk htkVar, ftk ftkVar, etk etkVar, ArrayList arrayList, etk etkVar2) {
        etkVar.a(drj.c(htkVar, ftkVar));
        arrayList.add(etkVar2);
        return new etk();
    }

    public static etk m(ArrayList arrayList, etk etkVar) {
        arrayList.add(etkVar);
        return new etk();
    }

    public static String n(w6g w6gVar, String str) {
        return str + w6gVar;
    }

    public static String o(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static String p(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static void q(int i, int i2, int i3, int i4, int i5) {
        c26.c(i);
        c26.c(i2);
        c26.c(i3);
        c26.c(i4);
        c26.c(i5);
    }

    public static void r(int i, ue5 ue5Var, vt9 vt9Var, boolean z) {
        ue5Var.invoke(vt9Var, Integer.valueOf(i));
        vt9Var.p(z);
    }

    public static void s(int i, k1b k1bVar, String str, int i2, String str2) {
        k1bVar.e(str, Integer.valueOf(i));
        k1bVar.e(str2, Integer.valueOf(i2));
    }

    public static void t(vx3 vx3Var, boolean z, vx3 vx3Var2) {
        vx3Var.a(z);
        ac8.a(new ay3(vx3Var2));
    }

    public static void u(htk htkVar, ftk ftkVar, etk etkVar, htk htkVar2, ftk ftkVar2) {
        etkVar.a(drj.c(htkVar, ftkVar));
        etkVar.a(drj.c(htkVar2, ftkVar2));
    }

    public static /* synthetic */ String v(int i) {
        switch (i) {
            case 1:
                return "CONFIGURED";
            case 2:
                return "STARTED";
            case 3:
                return "PAUSED";
            case 4:
                return "STOPPING";
            case 5:
                return "PENDING_START";
            case 6:
                return "PENDING_START_PAUSED";
            case 7:
                return "PENDING_RELEASE";
            case 8:
                return "ERROR";
            case 9:
                return "RELEASED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String w(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String x(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }
}
