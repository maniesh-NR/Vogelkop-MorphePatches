package defpackage;

import java.io.DataInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
public class izd extends DataInputStream {
    public final String h() throws IOException {
        byte[] bArr;
        int unsignedShort = readUnsignedShort();
        if (unsignedShort == 0) {
            bArr = null;
        } else {
            bArr = new byte[unsignedShort];
            readFully(bArr);
        }
        if (bArr == null) {
            return null;
        }
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public final long k() {
        return readInt() & 4294967295L;
    }
}
