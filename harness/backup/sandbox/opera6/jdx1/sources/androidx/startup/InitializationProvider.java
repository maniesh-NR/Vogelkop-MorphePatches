package androidx.startup;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Trace;
import androidx.core.app.NotificationCompat;
import defpackage.e22;

/* loaded from: classes.dex */
public class InitializationProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            throw new e22("Context cannot be null");
        }
        if (context.getApplicationContext() == null) {
            return true;
        }
        l45 l45VarG = l45.G(context);
        Class<?> cls = getClass();
        Context context2 = (Context) l45VarG.c;
        try {
            try {
                Trace.beginSection("Startup");
                l45VarG.s(context2.getPackageManager().getProviderInfo(new ComponentName(context2, cls), NotificationCompat.FLAG_HIGH_PRIORITY).metaData);
                return true;
            } catch (PackageManager.NameNotFoundException e) {
                throw new e22(e);
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}
