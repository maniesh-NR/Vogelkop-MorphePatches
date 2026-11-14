package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import androidx.mediarouter.app.d;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;

/* loaded from: classes.dex */
public final class vmd extends AsyncTask {
    public final Bitmap a;
    public final Uri b;
    public int c;
    public long d;
    public final /* synthetic */ d e;

    public vmd(d dVar) {
        this.e = dVar;
        MediaDescriptionCompat mediaDescriptionCompat = dVar.W;
        Bitmap bitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.e;
        if (bitmap != null && bitmap.isRecycled()) {
            bitmap = null;
        }
        this.a = bitmap;
        MediaDescriptionCompat mediaDescriptionCompat2 = dVar.W;
        this.b = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.f : null;
    }

    public final BufferedInputStream a(Uri uri) throws IOException {
        InputStream inputStreamOpenInputStream;
        String lowerCase = uri.getScheme().toLowerCase();
        if ("android.resource".equals(lowerCase) || "content".equals(lowerCase) || "file".equals(lowerCase)) {
            inputStreamOpenInputStream = this.e.k.getContentResolver().openInputStream(uri);
        } else {
            URLConnection uRLConnectionOpenConnection = new URL(uri.toString()).openConnection();
            int i = d.q0;
            uRLConnectionOpenConnection.setConnectTimeout(30000);
            uRLConnectionOpenConnection.setReadTimeout(30000);
            inputStreamOpenInputStream = uRLConnectionOpenConnection.getInputStream();
        }
        if (inputStreamOpenInputStream == null) {
            return null;
        }
        return new BufferedInputStream(inputStreamOpenInputStream);
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x007a: MOVE (r1 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:39:0x007a */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b3  */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doInBackground(java.lang.Object[] r9) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.Void[] r9 = (java.lang.Void[]) r9
            r9 = 0
            r0 = 1
            r1 = 0
            android.graphics.Bitmap r2 = r8.a
            if (r2 != 0) goto L82
            android.net.Uri r2 = r8.b
            if (r2 == 0) goto L81
            java.io.BufferedInputStream r3 = r8.a(r2)     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L6f
            if (r3 != 0) goto L19
            java.util.Objects.toString(r2)     // Catch: java.io.IOException -> L70 java.lang.Throwable -> L79
            if (r3 != 0) goto L69
            return r1
        L19:
            android.graphics.BitmapFactory$Options r4 = new android.graphics.BitmapFactory$Options     // Catch: java.io.IOException -> L70 java.lang.Throwable -> L79
            r4.<init>()     // Catch: java.io.IOException -> L70 java.lang.Throwable -> L79
            r4.inJustDecodeBounds = r0     // Catch: java.io.IOException -> L70 java.lang.Throwable -> L79
            android.graphics.BitmapFactory.decodeStream(r3, r1, r4)     // Catch: java.io.IOException -> L70 java.lang.Throwable -> L79
            int r5 = r4.outWidth     // Catch: java.io.IOException -> L70 java.lang.Throwable -> L79
            if (r5 == 0) goto L69
            int r5 = r4.outHeight     // Catch: java.io.IOException -> L70 java.lang.Throwable -> L79
            if (r5 == 0) goto L69
            r3.reset()     // Catch: java.io.IOException -> L2f java.lang.Throwable -> L79
            goto L3e
        L2f:
            r3.close()     // Catch: java.io.IOException -> L70 java.lang.Throwable -> L79
            java.io.BufferedInputStream r3 = r8.a(r2)     // Catch: java.io.IOException -> L70 java.lang.Throwable -> L79
            if (r3 != 0) goto L3e
            java.util.Objects.toString(r2)     // Catch: java.io.IOException -> L70 java.lang.Throwable -> L79
            if (r3 == 0) goto Lc2
            goto L5d
        L3e:
            r4.inJustDecodeBounds = r9     // Catch: java.io.IOException -> L70 java.lang.Throwable -> L79
            androidx.mediarouter.app.d r5 = r8.e     // Catch: java.io.IOException -> L70 java.lang.Throwable -> L79
            int r6 = r4.outWidth     // Catch: java.io.IOException -> L70 java.lang.Throwable -> L79
            int r7 = r4.outHeight     // Catch: java.io.IOException -> L70 java.lang.Throwable -> L79
            int r5 = r5.m(r6, r7)     // Catch: java.io.IOException -> L70 java.lang.Throwable -> L79
            int r6 = r4.outHeight     // Catch: java.io.IOException -> L70 java.lang.Throwable -> L79
            int r6 = r6 / r5
            int r5 = java.lang.Integer.highestOneBit(r6)     // Catch: java.io.IOException -> L70 java.lang.Throwable -> L79
            int r5 = java.lang.Math.max(r0, r5)     // Catch: java.io.IOException -> L70 java.lang.Throwable -> L79
            r4.inSampleSize = r5     // Catch: java.io.IOException -> L70 java.lang.Throwable -> L79
            boolean r5 = r8.isCancelled()     // Catch: java.io.IOException -> L70 java.lang.Throwable -> L79
            if (r5 == 0) goto L61
        L5d:
            r3.close()     // Catch: java.io.IOException -> Lc2
            goto Lc2
        L61:
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r3, r1, r4)     // Catch: java.io.IOException -> L70 java.lang.Throwable -> L79
            r3.close()     // Catch: java.io.IOException -> L82
            goto L82
        L69:
            r3.close()     // Catch: java.io.IOException -> Lc2
            return r1
        L6d:
            r8 = move-exception
            goto L7b
        L6f:
            r3 = r1
        L70:
            java.util.Objects.toString(r2)     // Catch: java.lang.Throwable -> L79
            if (r3 == 0) goto L81
            r3.close()     // Catch: java.io.IOException -> L81
            goto L81
        L79:
            r8 = move-exception
            r1 = r3
        L7b:
            if (r1 == 0) goto L80
            r1.close()     // Catch: java.io.IOException -> L80
        L80:
            throw r8
        L81:
            r2 = r1
        L82:
            if (r2 == 0) goto L8e
            boolean r3 = r2.isRecycled()
            if (r3 == 0) goto L8e
            java.util.Objects.toString(r2)
            goto Lc2
        L8e:
            if (r2 == 0) goto Lc1
            int r1 = r2.getWidth()
            int r3 = r2.getHeight()
            if (r1 >= r3) goto Lc1
            r72 r1 = new r72
            r1.<init>(r2)
            r1.a = r0
            r9i r0 = r1.c()
            java.lang.Object r0 = r0.b
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.List r1 = java.util.Collections.unmodifiableList(r0)
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto Lbf
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            java.lang.Object r9 = r0.get(r9)
            oyf r9 = (defpackage.oyf) r9
            int r9 = r9.d
        Lbf:
            r8.c = r9
        Lc1:
            r1 = r2
        Lc2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vmd.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        d dVar = this.e;
        dVar.X = null;
        Bitmap bitmap2 = dVar.Y;
        Bitmap bitmap3 = this.a;
        boolean zEquals = Objects.equals(bitmap2, bitmap3);
        Uri uri = this.b;
        if (zEquals && Objects.equals(dVar.Z, uri)) {
            return;
        }
        dVar.Y = bitmap3;
        dVar.b0 = bitmap;
        dVar.Z = uri;
        dVar.c0 = this.c;
        dVar.a0 = true;
        dVar.r(SystemClock.uptimeMillis() - this.d > 120);
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        this.d = SystemClock.uptimeMillis();
        d dVar = this.e;
        dVar.a0 = false;
        dVar.b0 = null;
        dVar.c0 = 0;
    }
}
