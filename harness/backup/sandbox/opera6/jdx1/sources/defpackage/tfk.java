package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class tfk implements oyh {
    public final ArrayList a;
    public final e34 b;
    public final jl6 c;

    public tfk(ArrayList arrayList, e34 e34Var, jl6 jl6Var) {
        this.a = arrayList;
        this.b = e34Var;
        this.c = jl6Var;
    }

    @Override // defpackage.oyh
    public final boolean a(Object obj, trf trfVar) {
        InputStream inputStream = (InputStream) obj;
        if (((Boolean) trfVar.c(vx9.b)).booleanValue()) {
            return false;
        }
        return p37.K(this.c, inputStream, this.a) == ImageHeaderParser$ImageType.GIF;
    }

    @Override // defpackage.oyh
    public final kyh b(Object obj, int i, int i2, trf trfVar) throws IOException {
        byte[] byteArray;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i3 = inputStream.read(bArr);
                if (i3 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i3);
            }
            byteArrayOutputStream.flush();
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            byteArray = null;
        }
        if (byteArray == null) {
            return null;
        }
        return this.b.b(ByteBuffer.wrap(byteArray), i, i2, trfVar);
    }
}
