package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class hh8 implements rxa {
    @Override // defpackage.rxa
    public final int a(InputStream inputStream, jl6 jl6Var) {
        int iD = new gh8(inputStream).d(1, "Orientation");
        if (iD == 0) {
            return -1;
        }
        return iD;
    }

    @Override // defpackage.rxa
    public final ImageHeaderParser$ImageType b(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // defpackage.rxa
    public final ImageHeaderParser$ImageType c(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }
}
