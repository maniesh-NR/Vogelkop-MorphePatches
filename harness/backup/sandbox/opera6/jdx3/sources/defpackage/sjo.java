package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class sjo {
    public static final List a = Arrays.asList("opera.com", "oleads.com", "osite99.com");
    public static final ygo b = new ygo(0);
    public static final AtomicLong c = new AtomicLong(1);
    public static final ikp d = new ikp();

    public static fp1 a(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof fp1) {
            return (fp1) context;
        }
        if (context instanceof ft5) {
            return a(((ft5) context).getBaseContext());
        }
        return null;
    }

    public static File b(int i) {
        File externalCacheDir;
        String str;
        try {
            if ("mounted".equals(Environment.getExternalStorageState()) || !Environment.isExternalStorageRemovable()) {
                externalCacheDir = ((Context) phf.a.a).getExternalCacheDir();
                if (externalCacheDir != null && !externalCacheDir.exists()) {
                    externalCacheDir.mkdirs();
                }
            } else {
                externalCacheDir = null;
            }
            if (externalCacheDir == null) {
                externalCacheDir = ((Context) phf.a.a).getCacheDir();
                if (!externalCacheDir.exists()) {
                    externalCacheDir.mkdirs();
                }
            }
            if (i == 1) {
                str = "adxads";
            } else if (i == 2) {
                str = "adxlib";
            } else {
                if (i != 3) {
                    throw null;
                }
                str = "storage";
            }
            File file = new File(externalCacheDir, str);
            if (!file.exists()) {
                file.mkdir();
            }
            return file;
        } catch (Exception unused) {
            return null;
        }
    }

    public static File c(int i, String str) {
        File fileB = b(i);
        if (fileB == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(fileB.getAbsolutePath());
        return new File(z1m.l(sb, File.separator, str));
    }

    public static String d(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("Name", "UID");
            jSONObject.put("Domain", "adx.opera.com");
            jSONObject.put("Value", str);
            jSONObject.put("Max-Age", 31536000);
            jSONObject.put("Secure", true);
            jSONObject.put("HttpOnly", false);
            jSONObject.put("SameSite", "None");
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public static ArrayList e(String str, String str2, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String string = (String) obj;
            if (w8h.d(string, a)) {
                string = Uri.parse(string).buildUpon().appendQueryParameter(str, str2).build().toString();
            }
            arrayList2.add(string);
        }
        return arrayList2;
    }

    public static void f(Context context, List list, String str, int i) {
        String string;
        SharedPreferences.Editor editorN = n();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append("NewCreativeType");
            sb.append(str);
            sb.append("NewCreativeType");
            sb.append(i);
            String strK = k(context, "NewCreativeTypeRetryData");
            if (TextUtils.isEmpty(strK)) {
                string = sb.toString();
            } else {
                StringBuilder sbH = u35.h(strK, "PlaceHolder");
                sbH.append(sb.toString());
                string = sbH.toString();
            }
            editorN.putString("NewCreativeTypeRetryData", string);
        }
        editorN.apply();
    }

    public static void g(File file) {
        File[] fileArrListFiles;
        if (file.delete() || (fileArrListFiles = file.listFiles()) == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            g(file2);
        }
        file.delete();
    }

    public static void h(String str, long j) {
        ((Context) phf.a.a).getSharedPreferences("ad_config", 0).edit().putLong(str, j).apply();
    }

    public static String i(String str) {
        String strDecode;
        int iLastIndexOf;
        if (str == null || (strDecode = Uri.decode(str)) == null) {
            return null;
        }
        int iIndexOf = strDecode.indexOf(63);
        if (iIndexOf > 0) {
            strDecode = strDecode.substring(0, iIndexOf);
        }
        if (strDecode.endsWith("/") || (iLastIndexOf = strDecode.lastIndexOf(47) + 1) <= 0) {
            return null;
        }
        return strDecode.substring(iLastIndexOf);
    }

    public static void j(String str, String str2) {
        ((Context) phf.a.a).getSharedPreferences("ad_config", 0).edit().putString(str, str2).apply();
    }

    public static String k(Context context, String str) {
        if (context == null) {
            context = (Context) phf.a.a;
        }
        return context.getSharedPreferences("ad_config", 0).getString(str, null);
    }

    public static boolean l(Context context, String str) throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        return packageInfo != null;
    }

    public static String m(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
        } catch (Exception unused) {
            return "";
        }
    }

    public static SharedPreferences.Editor n() {
        return ((Context) phf.a.a).getSharedPreferences("ad_config", 0).edit();
    }

    public static long o() {
        return System.currentTimeMillis() / 1000;
    }

    public static Activity p(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return p(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }
}
