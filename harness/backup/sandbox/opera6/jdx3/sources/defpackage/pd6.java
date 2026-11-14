package defpackage;

import com.leanplum.utils.SizeUtil;
import java.io.File;
import java.util.Locale;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class pd6 {
    public static FutureTask a;
    public static final AtomicBoolean b = new AtomicBoolean();

    public static File a(int i, String str) {
        int i2;
        String str2 = od6.a;
        switch (i) {
            case 1:
                i2 = 0;
                break;
            case 2:
                i2 = 1;
                break;
            case 3:
                i2 = 2;
                break;
            case 4:
                i2 = 3;
                break;
            case 5:
                i2 = 4;
                break;
            case 6:
                i2 = 5;
                break;
            case 7:
                i2 = 6;
                break;
            case 8:
                i2 = 7;
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                i2 = 8;
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                i2 = 9;
                break;
            case 11:
                i2 = 10;
                break;
            case 12:
                i2 = 11;
                break;
            case 13:
                i2 = 12;
                break;
            case 14:
                i2 = 13;
                break;
            case 15:
                i2 = 14;
                break;
            case 16:
                i2 = 15;
                break;
            case 17:
                i2 = 16;
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                i2 = 17;
                break;
            case 19:
                i2 = 18;
                break;
            default:
                throw null;
        }
        return new File(new File(str2, Integer.toHexString(i2).toUpperCase(Locale.US)), str);
    }
}
