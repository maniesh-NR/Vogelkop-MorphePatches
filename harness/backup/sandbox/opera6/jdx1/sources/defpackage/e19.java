package defpackage;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class e19 extends zb2 {
    public final /* synthetic */ byte e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e19(AssetManager assetManager, String str, byte b) {
        super((byte) 0, str, assetManager);
        this.e = b;
    }

    public final Class a() {
        switch (this.e) {
            case 0:
                return ParcelFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    public final void g(Object obj) throws IOException {
        switch (this.e) {
            case 0:
                ((ParcelFileDescriptor) obj).close();
                break;
            default:
                ((InputStream) obj).close();
                break;
        }
    }

    public final Object i(AssetManager assetManager, String str) {
        switch (this.e) {
            case 0:
                return assetManager.openFd(str).getParcelFileDescriptor();
            default:
                return assetManager.open(str);
        }
    }
}
