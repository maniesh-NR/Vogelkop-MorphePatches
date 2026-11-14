package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class wx1 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ File b;

    public /* synthetic */ wx1(Uri uri, x12 x12Var, File file) {
        this.a = (byte) 3;
        this.b = file;
    }

    public /* synthetic */ wx1(File file, byte b) {
        this.a = b;
        this.b = file;
    }

    public final Object invoke(Object obj) {
        boolean zExists;
        byte b = this.a;
        File file = this.b;
        switch (b) {
            case 0:
                File parentFile = file.getParentFile();
                if (parentFile == null) {
                    qp2.n("Required value was null.");
                    return null;
                }
                if (!parentFile.exists()) {
                    zMkdirs = parentFile.mkdirs();
                } else if (!parentFile.isDirectory()) {
                    qp2.n("Check failed.");
                    return null;
                }
                return Boolean.valueOf(zMkdirs);
            case 1:
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
                return Unit.a;
            case 2:
                zExists = file.exists();
                break;
            case 3:
                pzh pzhVar = (pzh) obj;
                if (!pzhVar.q) {
                    pzhVar.close();
                    return t12.c;
                }
                InputStream inputStreamByteStream = pzhVar.g.byteStream();
                try {
                    t12 t12VarA = x12.a(inputStreamByteStream, 1, file);
                    vtp.v(inputStreamByteStream, (Throwable) null);
                    return t12VarA;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        vtp.v(inputStreamByteStream, th);
                        throw th2;
                    }
                }
            case 4:
                File file2 = (File) obj;
                return Boolean.valueOf(file2.isDirectory() && !file2.equals(file));
            case 5:
                zExists = file.exists();
                break;
            default:
                zExists = file.exists();
                break;
        }
        return Boolean.valueOf(zExists);
    }
}
