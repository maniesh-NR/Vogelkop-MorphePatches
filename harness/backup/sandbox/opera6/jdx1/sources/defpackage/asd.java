package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class asd implements yb6 {
    public static final String[] d = {"_data"};
    public final /* synthetic */ byte a;
    public final Object b;
    public Object c;

    public /* synthetic */ asd(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public asd(String str, j06 j06Var) {
        this.a = (byte) 2;
        this.b = str;
    }

    private final void b() {
    }

    private final void d() {
    }

    private final void g() {
    }

    private final void h() {
    }

    private final void i() {
    }

    @Override // defpackage.yb6
    public final Class a() {
        switch (this.a) {
            case 0:
                return File.class;
            case 1:
                return ((u24) this.c).a();
            default:
                return InputStream.class;
        }
    }

    @Override // defpackage.yb6
    public final void c() throws IOException {
        switch (this.a) {
            case 0:
            case 1:
                break;
            default:
                try {
                    ((ByteArrayInputStream) this.c).close();
                    break;
                } catch (IOException unused) {
                    return;
                }
        }
    }

    @Override // defpackage.yb6
    public final void cancel() {
        byte b = this.a;
    }

    @Override // defpackage.yb6
    public final void e(nyg nygVar, xb6 xb6Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ContentResolver contentResolver = ((Context) obj).getContentResolver();
                Uri uri = (Uri) this.c;
                Cursor cursorQuery = contentResolver.query(uri, d, null, null, null);
                if (cursorQuery != null) {
                    try {
                        string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                    } finally {
                        cursorQuery.close();
                    }
                }
                if (TextUtils.isEmpty(string)) {
                    xb6Var.d(new FileNotFoundException(fki.p(uri, "Failed to find file path for: ")));
                    return;
                } else {
                    xb6Var.g(new File(string));
                    return;
                }
            case 1:
                xb6Var.g(((u24) this.c).g((byte[]) obj));
                return;
            default:
                try {
                    ByteArrayInputStream byteArrayInputStreamJ = j06.j((String) obj);
                    this.c = byteArrayInputStreamJ;
                    xb6Var.g(byteArrayInputStreamJ);
                    return;
                } catch (IllegalArgumentException e) {
                    xb6Var.d(e);
                    return;
                }
        }
    }

    @Override // defpackage.yb6
    public final int f() {
        byte b = this.a;
        return 1;
    }
}
