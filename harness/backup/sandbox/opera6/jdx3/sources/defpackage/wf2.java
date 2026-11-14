package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.ContentObserver;
import android.database.Cursor;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.leanplum.internal.Constants;
import com.opera.android.settings.UserSettingsContentProvider;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class wf2 extends ContentObserver implements y9j {
    public final /* synthetic */ byte a = 1;
    public final ContentResolver b;
    public final Object c;
    public final Object d;

    public wf2(Context context) {
        super(new Handler(Looper.getMainLooper()));
        this.c = new CopyOnWriteArrayList();
        this.b = context.getContentResolver();
        this.d = context;
        UriMatcher uriMatcher = UserSettingsContentProvider.f;
        context.getContentResolver().registerContentObserver(UserSettingsContentProvider.a(context), true, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wf2(xf2 xf2Var, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.d = xf2Var;
        this.b = contentResolver;
        this.c = uri;
    }

    @Override // defpackage.y9j
    public final void a(ezg ezgVar) {
        ((CopyOnWriteArrayList) this.c).add(ezgVar);
    }

    public final void b(Uri uri, ContentValues contentValues) {
        try {
            this.b.update(uri, contentValues, null, null);
        } catch (IllegalArgumentException unused) {
        }
    }

    @Override // defpackage.y9j
    public final boolean contains(String str) {
        Uri uriBuild = UserSettingsContentProvider.a((Context) this.d).buildUpon().appendPath("contains").appendPath("anytype").appendPath(str).build();
        Cursor cursorQuery = null;
        try {
            cursorQuery = this.b.query(uriBuild, null, null, null, null);
            boolean z = false;
            if (cursorQuery != null && cursorQuery.moveToFirst()) {
                if (cursorQuery.getInt(0) == 1) {
                    z = true;
                }
            }
            return z;
        } finally {
            xvg.l(cursorQuery);
        }
    }

    @Override // defpackage.y9j
    public final boolean d(String str) {
        Uri uriBuild = UserSettingsContentProvider.a((Context) this.d).buildUpon().appendPath("containsDefault").appendPath("anytype").appendPath(str).build();
        Cursor cursorQuery = null;
        try {
            cursorQuery = this.b.query(uriBuild, null, null, null, null);
            boolean z = false;
            if (cursorQuery != null && cursorQuery.moveToFirst()) {
                if (cursorQuery.getInt(0) == 1) {
                    z = true;
                }
            }
            return z;
        } finally {
            xvg.l(cursorQuery);
        }
    }

    @Override // defpackage.y9j
    public final void e(String str, String str2) {
        Uri uriD = UserSettingsContentProvider.d((Context) this.d, "wallpaper_current", "String");
        ContentValues contentValues = new ContentValues(2);
        contentValues.put("wallpaper_current", str);
        contentValues.put("__uscp_predefined_default", str2);
        b(uriD, contentValues);
    }

    @Override // defpackage.y9j
    public final int getInt(String str, int i) {
        Uri uriC = UserSettingsContentProvider.c((Context) this.d, str, "int");
        Cursor cursorQuery = null;
        try {
            cursorQuery = this.b.query(uriC, null, null, null, null);
            return (cursorQuery == null || !cursorQuery.moveToFirst()) ? i : cursorQuery.getInt(0);
        } finally {
            xvg.l(cursorQuery);
        }
    }

    @Override // defpackage.y9j
    public final long getLong(String str, long j) {
        Uri uriC = UserSettingsContentProvider.c((Context) this.d, str, "long");
        Cursor cursorQuery = null;
        try {
            cursorQuery = this.b.query(uriC, null, null, null, null);
            if (cursorQuery != null && cursorQuery.moveToFirst()) {
                j = cursorQuery.getLong(0);
            }
            return j;
        } finally {
            xvg.l(cursorQuery);
        }
    }

    @Override // defpackage.y9j
    public final String getString(String str, String str2) {
        Uri uriC = UserSettingsContentProvider.c((Context) this.d, str, "String");
        Cursor cursorQuery = null;
        try {
            cursorQuery = this.b.query(uriC, null, null, null, null);
            return (cursorQuery == null || !cursorQuery.moveToFirst()) ? str2 : cursorQuery.getString(0);
        } finally {
            xvg.l(cursorQuery);
        }
    }

    @Override // defpackage.y9j
    public final void i(long j, long j2, String str) {
        Uri uriC = UserSettingsContentProvider.c((Context) this.d, str, "long");
        ContentValues contentValues = new ContentValues(2);
        contentValues.put(str, Long.valueOf(j));
        contentValues.put("__uscp_predefined_default", Long.valueOf(j2));
        b(uriC, contentValues);
    }

    @Override // defpackage.y9j
    public final void m(String str, String str2, String str3) {
        Uri uriC = UserSettingsContentProvider.c((Context) this.d, str, "String");
        ContentValues contentValues = new ContentValues(2);
        contentValues.put(str, str2);
        contentValues.put("__uscp_predefined_default", str3);
        b(uriC, contentValues);
    }

    @Override // defpackage.y9j
    public final void n(int i, String str) {
        Uri uriD = UserSettingsContentProvider.d((Context) this.d, str, "int");
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("__uscp_predefined_default", Integer.valueOf(i));
        b(uriD, contentValues);
    }

    @Override // defpackage.y9j
    public final void o(int i, int i2, String str) {
        Uri uriD = UserSettingsContentProvider.d((Context) this.d, str, "int");
        ContentValues contentValues = new ContentValues(2);
        contentValues.put(str, Integer.valueOf(i));
        contentValues.put("__uscp_predefined_default", Integer.valueOf(i2));
        b(uriD, contentValues);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        switch (this.a) {
            case 0:
                xf2 xf2Var = (xf2) this.d;
                xf2Var.a(uf2.b((Context) xf2Var.b, (pf2) xf2Var.j, (AudioDeviceInfo) xf2Var.i));
                break;
            default:
                super.onChange(z);
                break;
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        String str;
        switch (this.a) {
            case 1:
                super.onChange(z, uri);
                try {
                    UriMatcher uriMatcher = UserSettingsContentProvider.f;
                    str = uri.getPathSegments().get(2);
                } catch (Exception unused) {
                    str = null;
                }
                if (str != null) {
                    Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
                    while (it.hasNext()) {
                        ((p5j) it.next()).M(str);
                    }
                    break;
                }
                break;
            default:
                super.onChange(z, uri);
                break;
        }
    }

    @Override // defpackage.y9j
    public final void q(int i, int i2, String str) {
        Uri uriC = UserSettingsContentProvider.c((Context) this.d, str, "int");
        ContentValues contentValues = new ContentValues(2);
        contentValues.put(str, Integer.valueOf(i));
        contentValues.put("__uscp_predefined_default", Integer.valueOf(i2));
        b(uriC, contentValues);
    }

    @Override // defpackage.y9j
    public final void remove(String str) {
        try {
            this.b.delete(UserSettingsContentProvider.a((Context) this.d).buildUpon().appendPath("remove").appendPath(Constants.Params.TYPE).appendPath(str).build(), null, null);
        } catch (IllegalArgumentException unused) {
        }
    }
}
