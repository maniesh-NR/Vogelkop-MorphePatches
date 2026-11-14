package ads_mobile_sdk;

import androidx.core.app.NotificationCompat;
import defpackage.t44;
import defpackage.u7p;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class c implements lap {
    public final byte[] a;

    public c(byte[] bArr, byte b) {
        switch (b) {
            case 1:
                this.a = bArr;
                break;
            default:
                this.a = new byte[NotificationCompat.FLAG_LOCAL_ONLY];
                for (int i = 0; i < 256; i++) {
                    this.a[i] = (byte) i;
                }
                int i2 = 0;
                for (int i3 = 0; i3 < 256; i3++) {
                    byte[] bArr2 = this.a;
                    byte b2 = bArr2[i3];
                    i2 = (i2 + b2 + bArr[i3 % bArr.length]) & 255;
                    bArr2[i3] = bArr2[i2];
                    bArr2[i2] = b2;
                }
                break;
        }
    }

    public final Object a() {
        return this.a;
    }

    public final Object a(FileInputStream fileInputStream) {
        try {
            return t44.b(fileInputStream);
        } catch (IOException e) {
            throw new u7p("Cannot read bytes.", e);
        }
    }

    public final void a(Object obj, FileOutputStream fileOutputStream) throws IOException {
        fileOutputStream.write((byte[]) obj);
    }
}
