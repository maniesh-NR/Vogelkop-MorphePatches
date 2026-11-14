package defpackage;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public abstract class fap {
    public static volatile boolean c;
    public static final zyk a = z4c.b(xvo.m);
    public static final long b = Build.TIME;
    public static volatile String d = "";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public static Location a(LocationManager locationManager) {
        Location lastKnownLocation;
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                return locationManager.getLastKnownLocation("fused");
            } catch (Exception unused) {
            }
        }
        List listAsList = Arrays.asList("gps", "network", "passive");
        ArrayList arrayList = new ArrayList();
        Iterator it = listAsList.iterator();
        while (true) {
            lastKnownLocation = null;
            if (!it.hasNext()) {
                break;
            }
            try {
                lastKnownLocation = locationManager.getLastKnownLocation((String) it.next());
            } catch (Exception unused2) {
            }
            if (lastKnownLocation != null) {
                arrayList.add(lastKnownLocation);
            }
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            ?? next = it2.next();
            if (it2.hasNext()) {
                long time = ((Location) next).getTime();
                do {
                    Object next2 = it2.next();
                    long time2 = ((Location) next2).getTime();
                    next = next;
                    if (time < time2) {
                        next = next2;
                        time = time2;
                    }
                } while (it2.hasNext());
            }
            lastKnownLocation = next;
        }
        return lastKnownLocation;
    }

    public static String b(String str) {
        if (str != null) {
            if (StringsKt.N(str) || str.length() < 5 || !TextUtils.isDigitsOnly(str)) {
                str = null;
            }
            if (str != null) {
                String strSubstring = str.substring(0, 3);
                int length = str.length();
                if (length > 6) {
                    length = 6;
                }
                return strSubstring + '-' + str.substring(3, length);
            }
        }
        return null;
    }

    public static Size c(Context context) {
        DisplayMetrics displayMetricsA = r8p.a(context);
        return new Size(displayMetricsA.widthPixels, displayMetricsA.heightPixels);
    }

    public static Size d(Context context) {
        DisplayMetrics displayMetricsA = r8p.a(context);
        return new Size(nxg.f(context, displayMetricsA.widthPixels), nxg.f(context, displayMetricsA.heightPixels));
    }
}
