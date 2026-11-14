package defpackage;

import android.content.res.Resources;
import android.util.Base64;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final /* synthetic */ class fd6 implements dsk {
    public final /* synthetic */ byte a;

    public final Object get() throws Resources.NotFoundException {
        switch (this.a) {
            case 0:
                jjc jjcVarNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                if (jjcVarNewSingleThreadExecutor instanceof jjc) {
                    return jjcVarNewSingleThreadExecutor;
                }
                return jjcVarNewSingleThreadExecutor instanceof ScheduledExecutorService ? new v9e((ScheduledExecutorService) jjcVarNewSingleThreadExecutor) : new s9e(jjcVarNewSingleThreadExecutor);
            case 1:
                byte[] bArr = new byte[12];
                ju6.i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            case 2:
                return new xs6();
            case 3:
                Resources system = Resources.getSystem();
                int dimensionPixelSize = system.getDisplayMetrics().widthPixels;
                try {
                    dimensionPixelSize = system.getDimensionPixelSize(system.getIdentifier("config_mediaMetadataBitmapMaxSize", "dimen", "android"));
                } catch (Resources.NotFoundException unused) {
                }
                return Integer.valueOf(dimensionPixelSize);
            case 4:
                return new ArrayList();
            default:
                try {
                    return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                } catch (Exception e) {
                    h9o.o(e);
                    return null;
                }
        }
    }
}
