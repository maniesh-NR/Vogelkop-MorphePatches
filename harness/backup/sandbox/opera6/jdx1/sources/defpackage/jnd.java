package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v4.media.MediaDescriptionCompat;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;

/* loaded from: classes.dex */
public final class jnd extends AsyncTask {
    public final Bitmap a;
    public final Uri b;
    public int c;
    public final /* synthetic */ ond d;

    public jnd(ond ondVar) {
        this.d = ondVar;
        MediaDescriptionCompat mediaDescriptionCompat = ondVar.M;
        Bitmap bitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.e;
        if (bitmap != null && bitmap.isRecycled()) {
            bitmap = null;
        }
        this.a = bitmap;
        MediaDescriptionCompat mediaDescriptionCompat2 = ondVar.M;
        this.b = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.f : null;
    }

    public final BufferedInputStream a(Uri uri) throws IOException {
        InputStream inputStreamOpenInputStream;
        String lowerCase = uri.getScheme().toLowerCase();
        if ("android.resource".equals(lowerCase) || "content".equals(lowerCase) || "file".equals(lowerCase)) {
            inputStreamOpenInputStream = this.d.o.getContentResolver().openInputStream(uri);
        } else {
            URLConnection uRLConnectionOpenConnection = new URL(uri.toString()).openConnection();
            uRLConnectionOpenConnection.setConnectTimeout(30000);
            uRLConnectionOpenConnection.setReadTimeout(30000);
            inputStreamOpenInputStream = uRLConnectionOpenConnection.getInputStream();
        }
        if (inputStreamOpenInputStream == null) {
            return null;
        }
        return new BufferedInputStream(inputStreamOpenInputStream);
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x007f: MOVE (r1 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:39:0x007f */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b8  */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doInBackground(java.lang.Object[] r8) throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.Void[] r8 = (java.lang.Void[]) r8
            r8 = 0
            r0 = 1
            r1 = 0
            android.graphics.Bitmap r2 = r7.a
            if (r2 != 0) goto L87
            android.net.Uri r2 = r7.b
            if (r2 == 0) goto L86
            java.io.BufferedInputStream r3 = r7.a(r2)     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L74
            if (r3 != 0) goto L19
            java.util.Objects.toString(r2)     // Catch: java.io.IOException -> L75 java.lang.Throwable -> L7e
            if (r3 != 0) goto L6e
            return r1
        L19:
            android.graphics.BitmapFactory$Options r4 = new android.graphics.BitmapFactory$Options     // Catch: java.io.IOException -> L75 java.lang.Throwable -> L7e
            r4.<init>()     // Catch: java.io.IOException -> L75 java.lang.Throwable -> L7e
            r4.inJustDecodeBounds = r0     // Catch: java.io.IOException -> L75 java.lang.Throwable -> L7e
            android.graphics.BitmapFactory.decodeStream(r3, r1, r4)     // Catch: java.io.IOException -> L75 java.lang.Throwable -> L7e
            int r5 = r4.outWidth     // Catch: java.io.IOException -> L75 java.lang.Throwable -> L7e
            if (r5 == 0) goto L6e
            int r5 = r4.outHeight     // Catch: java.io.IOException -> L75 java.lang.Throwable -> L7e
            if (r5 == 0) goto L6e
            r3.reset()     // Catch: java.io.IOException -> L2f java.lang.Throwable -> L7e
            goto L3e
        L2f:
            r3.close()     // Catch: java.io.IOException -> L75 java.lang.Throwable -> L7e
            java.io.BufferedInputStream r3 = r7.a(r2)     // Catch: java.io.IOException -> L75 java.lang.Throwable -> L7e
            if (r3 != 0) goto L3e
            java.util.Objects.toString(r2)     // Catch: java.io.IOException -> L75 java.lang.Throwable -> L7e
            if (r3 == 0) goto Lc7
            goto L62
        L3e:
            r4.inJustDecodeBounds = r8     // Catch: java.io.IOException -> L75 java.lang.Throwable -> L7e
            ond r5 = r7.d     // Catch: java.io.IOException -> L75 java.lang.Throwable -> L7e
            android.content.Context r5 = r5.o     // Catch: java.io.IOException -> L75 java.lang.Throwable -> L7e
            android.content.res.Resources r5 = r5.getResources()     // Catch: java.io.IOException -> L75 java.lang.Throwable -> L7e
            r6 = 2131166728(0x7f070608, float:1.794771E38)
            int r5 = r5.getDimensionPixelSize(r6)     // Catch: java.io.IOException -> L75 java.lang.Throwable -> L7e
            int r6 = r4.outHeight     // Catch: java.io.IOException -> L75 java.lang.Throwable -> L7e
            int r6 = r6 / r5
            int r5 = java.lang.Integer.highestOneBit(r6)     // Catch: java.io.IOException -> L75 java.lang.Throwable -> L7e
            int r5 = java.lang.Math.max(r0, r5)     // Catch: java.io.IOException -> L75 java.lang.Throwable -> L7e
            r4.inSampleSize = r5     // Catch: java.io.IOException -> L75 java.lang.Throwable -> L7e
            boolean r5 = r7.isCancelled()     // Catch: java.io.IOException -> L75 java.lang.Throwable -> L7e
            if (r5 == 0) goto L66
        L62:
            r3.close()     // Catch: java.io.IOException -> Lc7
            goto Lc7
        L66:
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r3, r1, r4)     // Catch: java.io.IOException -> L75 java.lang.Throwable -> L7e
            r3.close()     // Catch: java.io.IOException -> L87
            goto L87
        L6e:
            r3.close()     // Catch: java.io.IOException -> Lc7
            return r1
        L72:
            r7 = move-exception
            goto L80
        L74:
            r3 = r1
        L75:
            java.util.Objects.toString(r2)     // Catch: java.lang.Throwable -> L7e
            if (r3 == 0) goto L86
            r3.close()     // Catch: java.io.IOException -> L86
            goto L86
        L7e:
            r7 = move-exception
            r1 = r3
        L80:
            if (r1 == 0) goto L85
            r1.close()     // Catch: java.io.IOException -> L85
        L85:
            throw r7
        L86:
            r2 = r1
        L87:
            if (r2 == 0) goto L93
            boolean r3 = r2.isRecycled()
            if (r3 == 0) goto L93
            java.util.Objects.toString(r2)
            goto Lc7
        L93:
            if (r2 == 0) goto Lc6
            int r1 = r2.getWidth()
            int r3 = r2.getHeight()
            if (r1 >= r3) goto Lc6
            r72 r1 = new r72
            r1.<init>(r2)
            r1.a = r0
            r9i r0 = r1.c()
            java.lang.Object r0 = r0.b
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.List r1 = java.util.Collections.unmodifiableList(r0)
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto Lc4
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            java.lang.Object r8 = r0.get(r8)
            oyf r8 = (defpackage.oyf) r8
            int r8 = r8.d
        Lc4:
            r7.c = r8
        Lc6:
            r1 = r2
        Lc7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jnd.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        ond ondVar = this.d;
        ondVar.N = null;
        Bitmap bitmap2 = ondVar.O;
        Bitmap bitmap3 = this.a;
        boolean zEquals = Objects.equals(bitmap2, bitmap3);
        Uri uri = this.b;
        if (zEquals && Objects.equals(ondVar.P, uri)) {
            return;
        }
        ondVar.O = bitmap3;
        ondVar.R = bitmap;
        ondVar.P = uri;
        ondVar.S = this.c;
        ondVar.Q = true;
        ondVar.l();
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        ond ondVar = this.d;
        ondVar.Q = false;
        ondVar.R = null;
        ondVar.S = 0;
    }
}
