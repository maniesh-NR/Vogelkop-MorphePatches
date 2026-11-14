package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class hb6 {
    public final SharedPreferences a;

    public hb6(Context context, byte b) {
        boolean zIsEmpty;
        switch (b) {
            case 1:
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
                this.a = sharedPreferences;
                File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
                if (file.exists()) {
                    return;
                }
                try {
                    if (file.createNewFile()) {
                        synchronized (this) {
                            zIsEmpty = sharedPreferences.getAll().isEmpty();
                        }
                        if (zIsEmpty) {
                            return;
                        }
                        synchronized (this) {
                            sharedPreferences.edit().clear().commit();
                        }
                        return;
                    }
                    return;
                } catch (IOException e) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        e.getMessage();
                        return;
                    }
                    return;
                }
            default:
                this.a = context.getSharedPreferences("dashboard", 0);
                return;
        }
    }

    public static String a(String str, String str2) {
        return p3p.w(str, "|T|", str2, "|*");
    }

    public static ArrayList c(String str) throws JSONException {
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList(jSONArray.length());
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject.isNull("id")) {
                    return null;
                }
                arrayList.add(jSONObject.getString("id"));
            }
            return arrayList;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final d5o b() throws JSONException {
        SharedPreferences sharedPreferences = this.a;
        String string = sharedPreferences.getString("ordered_all_categories", null);
        if (!TextUtils.isEmpty(string)) {
            HashSet hashSetM = w1h.m(sharedPreferences, "user_subscribed_category_codes");
            Set<String> stringSet = sharedPreferences.getStringSet("user_subscribed_unlisted_category_codes", null);
            if (stringSet != null) {
                stringSet = Collections.unmodifiableSet(stringSet);
            }
            if (stringSet != null) {
                hashSetM.addAll(stringSet);
            }
            HashSet hashSetM2 = w1h.m(sharedPreferences, "user_unsubscribed_category_codes");
            ArrayList arrayListC = c(string);
            if (arrayListC != null) {
                return new d5o(arrayListC, hashSetM, hashSetM2);
            }
        }
        return null;
    }

    public final d5o d() throws JSONException {
        HashSet hashSet;
        ArrayList arrayListC;
        JSONArray jSONArray;
        int i;
        SharedPreferences sharedPreferences = this.a;
        String string = sharedPreferences.getString("categories", null);
        String string2 = sharedPreferences.getString("subscribed_categories", null);
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            return null;
        }
        try {
            jSONArray = new JSONArray(string2);
            hashSet = new HashSet(jSONArray.length());
        } catch (JSONException unused) {
        }
        for (i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject.isNull("code")) {
                hashSet = null;
                break;
            }
            hashSet.add(jSONObject.getString("code"));
        }
        if (hashSet == null || (arrayListC = c(string)) == null) {
            return null;
        }
        return new d5o(arrayListC, hashSet, Collections.EMPTY_SET);
    }
}
