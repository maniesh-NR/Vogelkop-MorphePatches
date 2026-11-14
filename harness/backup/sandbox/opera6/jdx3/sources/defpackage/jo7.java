package defpackage;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

/* loaded from: classes.dex */
public abstract class jo7 extends kch {
    public final umi a;
    public final qie b = new qie((byte) 19);

    public jo7(umi umiVar) {
        this.a = umiVar;
    }

    public static void h(String str, byte[] bArr, int i, int i2, boolean z) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            File file = new File(str + ".new");
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                if (z) {
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr, i, i2));
                    try {
                        xvg.n(gZIPInputStream, fileOutputStream2);
                        xvg.l(gZIPInputStream);
                    } catch (Throwable th) {
                        xvg.l(gZIPInputStream);
                        throw th;
                    }
                } else {
                    fileOutputStream2.write(bArr, i, i2);
                }
                if (!file.renameTo(new File(str))) {
                    throw new IOException();
                }
                xvg.l(fileOutputStream2);
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                xvg.l(fileOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // defpackage.mch
    public void a(io7 io7Var, int i, nch nchVar, jch jchVar) {
        this.b.n(new oml(this.a.c(new gl6((Object) this, (Object) nchVar.a, (Object) jchVar, (byte) 13))), null);
    }

    public void d(byte[] bArr) {
        umi umiVar = this.a;
        byte b = 3;
        int i = 0;
        try {
            String str = snf.a;
            if (bArr.length == 0) {
                new File(str).delete();
            } else {
                DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr, 0, 4));
                try {
                    int i2 = dataInputStream.readInt();
                    xvg.l(dataInputStream);
                    h(str, bArr, 4, i2, true);
                } catch (Throwable th) {
                    xvg.l(dataInputStream);
                    throw th;
                }
            }
            umiVar.d(new oc4(this, 2, b)).a(null);
        } catch (Throwable th2) {
            umiVar.d(new oc4(this, i, b)).a(null);
            throw th2;
        }
    }

    public void g(jch jchVar, boolean z) {
        jchVar.run(Boolean.valueOf(z));
    }
}
