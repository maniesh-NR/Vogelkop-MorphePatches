package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* loaded from: classes.dex */
public final class deh implements yb6 {
    public static final String[] k = {"_data"};
    public final Context a;
    public final v7e b;
    public final v7e c;
    public final Uri d;
    public final int e;
    public final int f;
    public final trf g;
    public final Class h;
    public volatile boolean i;
    public volatile yb6 j;

    public deh(Context context, v7e v7eVar, v7e v7eVar2, Uri uri, int i, int i2, trf trfVar, Class cls) {
        this.a = context.getApplicationContext();
        this.b = v7eVar;
        this.c = v7eVar2;
        this.d = uri;
        this.e = i;
        this.f = i2;
        this.g = trfVar;
        this.h = cls;
    }

    @Override // defpackage.yb6
    public final Class a() {
        return this.h;
    }

    public final yb6 b() throws Throwable {
        u7e u7eVarA;
        Throwable th;
        boolean zIsExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Uri requireOriginal = this.d;
        Cursor cursor = null;
        trf trfVar = this.g;
        int i = this.f;
        int i2 = this.e;
        Context context = this.a;
        if (zIsExternalStorageLegacy) {
            try {
                Cursor cursorQuery = context.getContentResolver().query(requireOriginal, k, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                            if (TextUtils.isEmpty(string)) {
                                throw new FileNotFoundException("File path was empty in media store for: " + requireOriginal);
                            }
                            File file = new File(string);
                            cursorQuery.close();
                            u7eVarA = this.b.a(file, i2, i, trfVar);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = cursorQuery;
                        if (cursor == null) {
                            throw th;
                        }
                        cursor.close();
                        throw th;
                    }
                }
                throw new FileNotFoundException("Failed to media store entry for: " + requireOriginal);
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
            }
            u7eVarA = this.c.a(requireOriginal, i2, i, trfVar);
        }
        if (u7eVarA != null) {
            return u7eVarA.c;
        }
        return null;
    }

    @Override // defpackage.yb6
    public final void c() {
        yb6 yb6Var = this.j;
        if (yb6Var != null) {
            yb6Var.c();
        }
    }

    @Override // defpackage.yb6
    public final void cancel() {
        this.i = true;
        yb6 yb6Var = this.j;
        if (yb6Var != null) {
            yb6Var.cancel();
        }
    }

    @Override // defpackage.yb6
    public final void e(nyg nygVar, xb6 xb6Var) throws Throwable {
        try {
            yb6 yb6VarB = b();
            if (yb6VarB == null) {
                xb6Var.d(new IllegalArgumentException("Failed to build fetcher for: " + this.d));
            } else {
                this.j = yb6VarB;
                if (this.i) {
                    cancel();
                } else {
                    yb6VarB.e(nygVar, xb6Var);
                }
            }
        } catch (FileNotFoundException e) {
            xb6Var.d(e);
        }
    }

    @Override // defpackage.yb6
    public final int f() {
        return 1;
    }
}
