package defpackage;

import android.content.Context;
import com.leanplum.utils.SizeUtil;
import com.opera.android.OperaApplication;
import java.util.List;

/* loaded from: classes.dex */
public enum qwf {
    c(1, "RELOAD"),
    d(2, "SHARE"),
    e(3, "TRANSLATE"),
    f(4, "FIND_IN_PAGE"),
    g(5, "SAVE_AS_PDF"),
    h(6, "REPORT_COOKIE_DIALOG"),
    i(7, "FULLSCREEN"),
    j(8, "DESKTOP_SITE"),
    k(9, "ADD_SPEED_DIAL"),
    l(10, "ADD_BOOKMARK"),
    m(11, "ADD_OFFLINE_PAGE"),
    n(12, "ADD_TO_HOMESCREEN"),
    o(13, "READER_MODE"),
    p(14, "SEND_TO_MY_FLOW"),
    q(15, "SNAPSHOT"),
    r(16, "PRINT"),
    s(17, "TAB_NAVIGATION"),
    t(19, "OPEN_IN_APP"),
    u(20, "OPEN_AI_ASSISTANT_SUMMARY"),
    v(21, "ADD_TO"),
    w(22, "FORWARD"),
    x(23, "AI_SETTINGS"),
    y(24, "OPEN_AI_ASSISTANT_ASK_AI"),
    z(25, "ZOOM"),
    A(26, "PICTURE_IN_PICTURE");

    public final int a;
    public final byte b;

    /* JADX WARN: Multi-variable type inference failed */
    qwf(int i2, String str) {
        this.a = i;
        this.b = i2;
    }

    public static boolean d(qwf qwfVar) {
        int iOrdinal = qwfVar.ordinal();
        if (iOrdinal == 4 || iOrdinal == 5 || iOrdinal == 7 || iOrdinal == 10 || iOrdinal == 12 || iOrdinal == 15 || iOrdinal == 17 || iOrdinal == 18) {
            return true;
        }
        switch (iOrdinal) {
            case SizeUtil.textSize1 /* 22 */:
            case 23:
            case SizeUtil.textSize2 /* 24 */:
                return true;
            default:
                return false;
        }
    }

    public static boolean g(qwf qwfVar) {
        int iOrdinal = qwfVar.ordinal();
        if (iOrdinal == 4 || iOrdinal == 5 || iOrdinal == 7 || iOrdinal == 10 || iOrdinal == 12 || iOrdinal == 15 || iOrdinal == 17 || iOrdinal == 18) {
            return true;
        }
        switch (iOrdinal) {
            case SizeUtil.textSize1 /* 22 */:
            case 23:
            case SizeUtil.textSize2 /* 24 */:
                return true;
            default:
                return false;
        }
    }

    public static boolean h(qwf qwfVar) {
        int iOrdinal = qwfVar.ordinal();
        return (iOrdinal == 1 || iOrdinal == 9 || iOrdinal == 14 || iOrdinal == 16 || iOrdinal == 3 || iOrdinal == 4) ? false : true;
    }

    public static boolean i(qwf qwfVar) {
        int iOrdinal = qwfVar.ordinal();
        return iOrdinal == 2 || iOrdinal == 5 || iOrdinal == 8 || iOrdinal == 11 || iOrdinal == 12;
    }

    public static boolean j(qwf qwfVar) {
        int iOrdinal = qwfVar.ordinal();
        return iOrdinal == 2 || iOrdinal == 5 || iOrdinal == 11 || iOrdinal == 7 || iOrdinal == 8;
    }

    public static boolean k(qwf qwfVar) {
        int iOrdinal = qwfVar.ordinal();
        if (iOrdinal == 11) {
            return m5h.q();
        }
        if (iOrdinal == 18) {
            Context context = t8.a;
            String[] strArr = OperaApplication.K;
            return ((Boolean) ((yk6) ((OperaApplication) context.getApplicationContext()).e().get()).m.g()).booleanValue();
        }
        if (iOrdinal == 22) {
            Context context2 = t8.a;
            String[] strArr2 = OperaApplication.K;
            return ((Boolean) ((yk6) ((OperaApplication) context2.getApplicationContext()).e().get()).r.g()).booleanValue();
        }
        if (iOrdinal != 24) {
            return true;
        }
        Context context3 = t8.a;
        List list = fj9.a;
        return context3.getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }
}
