package defpackage;

import android.database.Cursor;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.Closeable;

/* loaded from: classes.dex */
public final class hlh implements Closeable {
    public final Cursor a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;

    public hlh(Cursor cursor) {
        this.a = cursor;
        this.b = cursor.getColumnIndex("id");
        this.c = cursor.getColumnIndex(ImagesContract.URL);
        this.d = cursor.getColumnIndex("title");
        this.e = cursor.getColumnIndex("timestamp");
        this.f = cursor.getColumnIndex("image_path");
        this.g = cursor.getColumnIndex("content_path");
        this.h = cursor.getColumnIndex("transcoded");
        this.i = cursor.getColumnIndex("filesize");
        this.j = cursor.getColumnIndex("content_mime_type");
        this.k = cursor.getColumnIndex("visit_count");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        xvg.l(this.a);
    }
}
