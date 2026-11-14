package com.opera.android.settings;

import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.text.TextUtils;
import com.leanplum.internal.Constants;
import com.opera.android.utilities.DisplayUtil;
import defpackage.agm;
import defpackage.b59;
import defpackage.bg1;
import defpackage.dtg;
import defpackage.i0l;
import defpackage.lag;
import defpackage.n9h;
import defpackage.oam;
import defpackage.ru9;
import defpackage.sko;
import defpackage.tz5;
import defpackage.vml;
import defpackage.xi5;
import java.io.File;

/* loaded from: classes.dex */
public class UserSettingsContentProvider extends ContentProvider {
    public static UriMatcher f;
    public b59 a;
    public final Object b = new Object();
    public ContentResolver c;
    public int d;
    public boolean e;

    public static Uri a(Context context) {
        return Uri.parse("content://".concat(context.getPackageName() + ".UserSettingsContentProvider"));
    }

    public static String b(String str) {
        return sko.u(str, "_override_default");
    }

    public static Uri c(Context context, String str, String str2) {
        return a(context).buildUpon().appendPath(Constants.Params.VALUE).appendPath(str2).appendPath(str).build();
    }

    public static Uri d(Context context, String str, String str2) {
        return a(context).buildUpon().appendPath("overrideDefault").appendPath(str2).appendPath(str).build();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int e(android.net.Uri r6, defpackage.ovm r7) {
        /*
            java.util.List r0 = r6.getPathSegments()
            r1 = 2
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.util.List r6 = r6.getPathSegments()
            r2 = 1
            java.lang.Object r6 = r6.get(r2)
            java.lang.String r6 = (java.lang.String) r6
            r6.getClass()
            int r3 = r6.hashCode()
            r4 = 0
            r5 = -1
            switch(r3) {
                case -1808118735: goto L36;
                case 104431: goto L2c;
                case 3327612: goto L23;
                default: goto L22;
            }
        L22:
            goto L3e
        L23:
            java.lang.String r2 = "long"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L41
            goto L3e
        L2c:
            java.lang.String r1 = "int"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L3e
            r1 = r2
            goto L41
        L36:
            java.lang.String r1 = "String"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L40
        L3e:
            r1 = r5
            goto L41
        L40:
            r1 = r4
        L41:
            switch(r1) {
                case 0: goto L4f;
                case 1: goto L4a;
                case 2: goto L45;
                default: goto L44;
            }
        L44:
            return r4
        L45:
            int r6 = r7.h(r0)
            return r6
        L4a:
            int r6 = r7.i(r0)
            return r6
        L4f:
            int r6 = r7.f(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.opera.android.settings.UserSettingsContentProvider.e(android.net.Uri, ovm):int");
    }

    public static String j(SharedPreferences sharedPreferences, String str) {
        if (sharedPreferences.contains(str)) {
            return str;
        }
        String strB = b(str);
        if (sharedPreferences.contains(strB)) {
            return strB;
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        if (f.match(uri) != 1) {
            return 0;
        }
        g();
        String str2 = uri.getPathSegments().get(2);
        synchronized (this.b) {
            if ("previous_version_code".equals(str2)) {
                return 0;
            }
            SharedPreferences sharedPreferences = (SharedPreferences) this.a.get();
            if (!sharedPreferences.contains(str2)) {
                return 0;
            }
            sharedPreferences.edit().remove(str2).apply();
            return 1;
        }
    }

    public final void f(Context context, int i, xi5 xi5Var) {
        int i2;
        int i3;
        String strS;
        int i4;
        String strB;
        int i5;
        synchronized (this.b) {
            SharedPreferences sharedPreferences = (SharedPreferences) this.a.get();
            if (sharedPreferences.getInt("settings_first_stored_version_key", -1) < 0) {
                sharedPreferences.edit().putInt("settings_first_stored_version_key", i > 0 ? i : 22).apply();
            }
            if (i < 1) {
                sharedPreferences.edit().remove("image_mode").apply();
            }
            if (i < 2 && (i5 = sharedPreferences.getInt("navigation_bar_placement", -1)) >= 0) {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                if (DisplayUtil.a(context)) {
                    i5 = 1;
                }
                editorEdit.putInt("app_layout", i5).remove("navigation_bar_placement").apply();
            }
            if (i < 4) {
                String string = sharedPreferences.getString("installation_id", null);
                if (!TextUtils.isEmpty(string)) {
                    tz5.f(tz5.c(), string);
                }
                sharedPreferences.edit().remove("installation_id").remove("lib_decompress_done_libopera.so").apply();
            }
            if (i < 5) {
                String string2 = sharedPreferences.getString("install_referrer", null);
                if (!TextUtils.isEmpty(string2) && (strB = dtg.b(string2)) != null) {
                    vtp.L(context).edit().putString("install_referrer", strB).apply();
                }
                sharedPreferences.edit().remove("install_referrer").apply();
            }
            if (i < 7) {
                sharedPreferences.edit().putBoolean("is_pre_news_user", true).apply();
            }
            if (i < 8) {
                int i6 = sharedPreferences.getInt("app_layout", -1);
                if (i6 > 0) {
                    sharedPreferences.edit().putInt("app_layout", i6 - 1).apply();
                }
                String string3 = sharedPreferences.getString("downloads_location", null);
                if (string3 != null && !string3.contains(":")) {
                    sharedPreferences.edit().putString("downloads_location", Uri.fromFile(new File(string3)).toString()).apply();
                }
            }
            if (i < 9) {
                xi5Var.i(sharedPreferences.getLong("turbo_compressed_bytes", 0L), sharedPreferences.getLong("turbo_uncompressed_bytes", 0L));
            }
            if (i < 11 && (i4 = sharedPreferences.getInt("hide_bottombar", -1)) >= 0) {
                sharedPreferences.edit().putInt("toolbar_disposition_classic", i4 == 0 ? 2 : 1).apply();
            }
            if (i < 12) {
                SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                for (lag lagVar : lag.values()) {
                    if (!SettingsManager.K(lagVar) && (strS = SettingsManager.S(lagVar)) != null && sharedPreferences.getInt(strS, -1) == 0) {
                        editorEdit2.putInt(strS, 2);
                    }
                }
                editorEdit2.apply();
            }
            if (i < 13 && (i3 = sharedPreferences.getInt("app_theme", -1)) > -1 && i3 == 2) {
                sharedPreferences.edit().putInt("app_theme", 0).putInt("app_theme_accent", 1).apply();
            }
            if (i < 14 && sharedPreferences.getInt("night_mode", -1) >= 0) {
                sharedPreferences.edit().putInt("night_mode_dimming", 1000 - sharedPreferences.getInt("night_mode_brightness", 500)).putInt("night_mode_temperature", 0).apply();
            }
            if (i < 15 && sharedPreferences.getInt("night_mode_temperature", -1) > 600) {
                sharedPreferences.edit().putInt("night_mode_temperature", 600).apply();
            }
            if (i < 16 && sharedPreferences.getString("offline_pages_location", null) == null) {
                sharedPreferences.edit().putString("offline_pages_location", "").apply();
            }
            if (i < 17 && sharedPreferences.getInt("notifications_permission_defualt", -1) != 2) {
                sharedPreferences.edit().putInt("notifications_permission_defualt", 2).apply();
            }
            if (i < 18) {
                String[] strArr = {"wallet_network", "wallet_custom_server_id"};
                for (int i7 = 0; i7 < 2; i7++) {
                    String str = strArr[i7];
                    if (sharedPreferences.contains(str)) {
                        sharedPreferences.edit().putLong(str, sharedPreferences.getInt(str, 1)).apply();
                    }
                }
            }
            if (i < 20 && i0l.g()) {
                int i8 = sharedPreferences.getInt("app_layout", -1);
                if (i8 != -1 && i8 != 1) {
                    sharedPreferences.edit().putInt("app_layout", 1).apply();
                }
                int i9 = sharedPreferences.getInt("toolbar_disposition_tablet", -1);
                if (i9 != -1 && i9 != 0) {
                    sharedPreferences.edit().putInt("toolbar_disposition_tablet", 0).apply();
                }
            }
            if (i < 21) {
                ru9 ru9VarC = ru9.c(context);
                if (ru9VarC.a.contains("exit_dialog_close_tabs") || ru9VarC.a.contains("exit_dialog_clear_data")) {
                    sharedPreferences.edit().putString("exit_clear_data_categories", z4o.r(z4o.U(context))).apply();
                }
            }
            if (i < 22 && (i2 = sharedPreferences.getInt("external_apps_permission_default", -1)) != -1 && i2 != 2) {
                sharedPreferences.edit().putInt("external_apps_permission_default", 2).apply();
            }
        }
    }

    public final void g() {
        synchronized (this.b) {
            SharedPreferences sharedPreferences = (SharedPreferences) this.a.get();
            int i = sharedPreferences.getInt("settings_version_key", -1);
            if (i != 22) {
                sharedPreferences.edit().putInt("settings_version_key", 22).apply();
                if (i != -1) {
                    f(getContext(), i, xi5.a(getContext()));
                }
            }
        }
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    public final void h() {
        synchronized (this.b) {
            if (this.e) {
                return;
            }
            this.d = ((SharedPreferences) this.a.get()).getInt("version_code", 0);
            this.e = true;
        }
    }

    public final void i(Uri uri) {
        this.c.notifyChange(uri, null);
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        String str = getContext().getPackageName() + ".UserSettingsContentProvider";
        UriMatcher uriMatcher = new UriMatcher(-1);
        f = uriMatcher;
        uriMatcher.addURI(str, "remove/type/*", 1);
        f.addURI(str, "value/*/*", 2);
        f.addURI(str, "overrideDefault/*/*", 3);
        f.addURI(str, "contains/anytype/*", 4);
        f.addURI(str, "containsDefault/anytype/*", 5);
        this.a = w1h.l(getContext(), vml.d, "user_settings", new bg1[0]);
        this.c = getContext().getContentResolver();
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        g();
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{Constants.Params.VALUE});
        int iMatch = f.match(uri);
        if (iMatch == 2) {
            e(uri, new n9h(this, matrixCursor, (byte) 11));
            return matrixCursor;
        }
        if (iMatch == 4) {
            String str3 = uri.getPathSegments().get(2);
            synchronized (this.b) {
                matrixCursor.newRow().add(Integer.valueOf(("previous_version_code".equals(str3) || ((SharedPreferences) this.a.get()).contains(str3)) ? 1 : 0));
            }
            return matrixCursor;
        }
        if (iMatch != 5) {
            return matrixCursor;
        }
        String strB = b(uri.getPathSegments().get(2));
        synchronized (this.b) {
            matrixCursor.newRow().add(Integer.valueOf(((SharedPreferences) this.a.get()).contains(strB) ? 1 : 0));
        }
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        g();
        int iMatch = f.match(uri);
        if (iMatch == 2) {
            return e(uri, new agm(this, contentValues, uri));
        }
        if (iMatch == 3) {
            return e(uri, new oam(this, contentValues, uri));
        }
        return 0;
    }
}
