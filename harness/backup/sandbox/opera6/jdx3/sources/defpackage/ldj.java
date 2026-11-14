package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import com.opera.api.Callback;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class ldj extends AsyncTask {
    public final /* synthetic */ Context a;
    public final /* synthetic */ String b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ Callback d;

    public ldj(Context context, String str, byte[] bArr, Callback callback) {
        this.a = context;
        this.b = str;
        this.c = bArr;
        this.d = callback;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) throws Throwable {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            File fileE = n1h.e(this.a, "", this.b);
            if (fileE == null) {
                return null;
            }
            fileOutputStream = new FileOutputStream(fileE);
            try {
                fileOutputStream.write(this.c);
                fileOutputStream.flush();
                fileOutputStream.close();
                xvg.l(fileOutputStream);
                return fileE;
            } catch (IOException unused) {
                xvg.l(fileOutputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                fileOutputStream2 = fileOutputStream;
                xvg.l(fileOutputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            fileOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        File file = (File) obj;
        this.d.run(file == null ? null : w7d.x(file));
    }
}
