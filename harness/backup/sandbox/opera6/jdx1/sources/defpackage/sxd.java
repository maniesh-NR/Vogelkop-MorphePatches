package defpackage;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class sxd implements Callable {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public /* synthetic */ sxd(byte b, Object obj, Object obj2, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ sxd(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final Boolean a() throws Throwable {
        String strW;
        BufferedOutputStream bufferedOutputStream;
        File file = (File) this.b;
        HashMap map = (HashMap) this.c;
        File file2 = new File(file.getAbsolutePath() + ".tmp");
        boolean z = false;
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                strW = fsp.w();
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException unused) {
        }
        try {
            fsp.K(bufferedOutputStream, map, strW);
            xvg.l(bufferedOutputStream);
            if (file2.renameTo(file)) {
                z = true;
            } else {
                file2.delete();
            }
        } catch (IOException unused2) {
            bufferedOutputStream2 = bufferedOutputStream;
            file2.delete();
            xvg.l(bufferedOutputStream2);
            return Boolean.valueOf(z);
        } catch (Throwable th2) {
            th = th2;
            bufferedOutputStream2 = bufferedOutputStream;
            xvg.l(bufferedOutputStream2);
            throw th;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p0k */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0346 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013a  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object call() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sxd.call():java.lang.Object");
    }

    public final void finalize() throws Throwable {
        switch (this.a) {
            case 2:
                ((e6i) this.b).release();
                break;
            default:
                super.finalize();
                break;
        }
    }
}
