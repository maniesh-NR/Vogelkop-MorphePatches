package defpackage;

import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class g34 implements pc6 {
    public final /* synthetic */ byte a;

    @Override // defpackage.pc6
    public final Class a() {
        switch (this.a) {
            case 0:
                return ByteBuffer.class;
            case 1:
                throw new UnsupportedOperationException("Not implemented");
            default:
                return ParcelFileDescriptor.class;
        }
    }

    @Override // defpackage.pc6
    public final qc6 b(Object obj) {
        switch (this.a) {
            case 0:
                return new h34((byte) 0, (ByteBuffer) obj);
            case 1:
                return new tw2(obj, (byte) 25);
            default:
                return new wub((ParcelFileDescriptor) obj);
        }
    }
}
