package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class qy1 {
    public final ContentResolver a;

    public qy1(ContentResolver contentResolver) {
        this.a = contentResolver;
    }

    public final oy1 a(Uri uri, File file) throws IOException {
        if (!z4o.P(file)) {
            qp2.n("Check failed.");
            return null;
        }
        if (s29.g(uri)) {
            String path = uri.getPath();
            if (path == null) {
                path = "";
            }
            return s29.b(new File(path), file) ? oy1.a : oy1.b;
        }
        try {
            InputStream inputStreamOpenInputStream = this.a.openInputStream(uri);
            try {
                if (inputStreamOpenInputStream == null) {
                    oy1 oy1Var = oy1.b;
                    vtp.v(inputStreamOpenInputStream, (Throwable) null);
                    return oy1Var;
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file.getPath());
                fileOutputStream.write(aib.E(inputStreamOpenInputStream));
                fileOutputStream.close();
                oy1 oy1Var2 = oy1.a;
                inputStreamOpenInputStream.close();
                return oy1Var2;
            } finally {
            }
        } catch (Exception unused) {
            return oy1.b;
        }
    }
}
