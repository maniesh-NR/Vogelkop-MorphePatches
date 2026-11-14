package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.opera.android.Lazy;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class tz5 {
    public static final Object a = new Object();
    public static final AtomicReference b = new AtomicReference();

    public static int a() {
        return c().getInt("crashcount", 0);
    }

    public static String b() {
        String string;
        SharedPreferences sharedPreferencesC = c();
        synchronized (a) {
            string = sharedPreferencesC.getString("installation_id", null);
            if (TextUtils.isEmpty(string)) {
                string = e(sharedPreferencesC);
            }
        }
        return string;
    }

    public static SharedPreferences c() {
        return (SharedPreferences) ((Lazy) b.get()).get();
    }

    public static void d(boolean z) {
        if (ocp.k()) {
            SharedPreferences.Editor editorEdit = c().edit();
            editorEdit.putInt("crashcount", a() + 1);
            if (z) {
                editorEdit.putInt("nativecrashcount", c().getInt("nativecrashcount", 0) + 1);
            }
            editorEdit.apply();
        }
    }

    public static String e(SharedPreferences sharedPreferences) {
        int iNextInt = new Random().nextInt();
        String str = String.format(Locale.US, "%02x %02x %02x", Integer.valueOf((iNextInt >> 16) & 255), Integer.valueOf((iNextInt >> 8) & 255), Integer.valueOf(iNextInt & 255));
        f(sharedPreferences, str);
        return str;
    }

    public static void f(SharedPreferences sharedPreferences, String str) {
        synchronized (a) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString("installation_id", str);
            editorEdit.apply();
        }
    }
}
