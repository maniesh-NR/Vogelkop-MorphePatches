package defpackage;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class hzd {
    public static final hzd b = new hzd();
    public final HashSet a = new HashSet();

    public static bp a(byte[] bArr) throws IOException {
        izd izdVar = new izd(new ByteArrayInputStream(bArr));
        if (izdVar.readUnsignedByte() != 1) {
            s49.m("Unrecognised response encoding version.");
            return null;
        }
        int unsignedShort = izdVar.readUnsignedShort();
        if (unsignedShort == 0) {
            s49.m("Cannot fulfill request.");
            return null;
        }
        int unsignedShort2 = izdVar.readUnsignedShort();
        if (unsignedShort2 > 0 && izdVar.skipBytes(unsignedShort2) != unsignedShort2) {
            throw new EOFException("Unexpected end of file while skipping bytes.");
        }
        int unsignedShort3 = izdVar.readUnsignedShort();
        if (unsignedShort3 > 0 && izdVar.skipBytes(unsignedShort3) != unsignedShort3) {
            throw new EOFException("Unexpected end of file while skipping bytes.");
        }
        int unsignedShort4 = izdVar.readUnsignedShort();
        HashMap map = new HashMap(unsignedShort4);
        for (int i = 0; i < unsignedShort4; i++) {
            map.put(izdVar.h(), izdVar.h());
        }
        int unsignedByte = izdVar.readUnsignedByte();
        if (unsignedByte == 6) {
            s49.m("Error message from server: ".concat(String.valueOf(izdVar.h())));
            return null;
        }
        if (unsignedByte != 0) {
            s49.m("Incorrect response body format.");
            return null;
        }
        int iAvailable = izdVar.available();
        gzd gzdVar = new gzd(bArr, bArr.length - iAvailable, iAvailable);
        bp bpVar = new bp();
        bpVar.a = unsignedShort;
        bpVar.b = gzdVar;
        return bpVar;
    }
}
