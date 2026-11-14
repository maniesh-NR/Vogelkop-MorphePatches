package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.jetbrains.compose.resources.AndroidContextProvider;

/* loaded from: classes.dex */
public final class fl6 {
    public static final fl6 a = new fl6();

    public static InputStream a(String str) throws lv0, FileNotFoundException {
        AssetManager assets;
        InputStream inputStreamOpen;
        try {
            try {
                try {
                    Context context = AndroidContextProvider.a;
                    AssetManager assets2 = context != null ? context.getAssets() : null;
                    if (assets2 == null || (inputStreamOpen = assets2.open(str)) == null) {
                        throw new FileNotFoundException("Current AssetManager is null.");
                    }
                    return inputStreamOpen;
                } catch (NoClassDefFoundError unused) {
                    assets = null;
                    if (assets != null || (resourceAsStream = assets.open(str)) == null) {
                        throw new FileNotFoundException("Current AssetManager is null.");
                    }
                    return resourceAsStream;
                }
            } catch (FileNotFoundException unused2) {
                ClassLoader classLoader = fl6.class.getClassLoader();
                if (classLoader == null) {
                    qp2.n("Cannot find class loader");
                    return null;
                }
                InputStream resourceAsStream = classLoader.getResourceAsStream(str);
                if (resourceAsStream == null) {
                    c(str);
                    throw null;
                }
                return resourceAsStream;
            }
        } catch (FileNotFoundException unused3) {
            assets = r41.b().getAssets();
            if (assets != null) {
            }
            throw new FileNotFoundException("Current AssetManager is null.");
        }
    }

    public static Object b(String str) throws lv0, IOException {
        InputStream inputStreamA = a(str);
        try {
            byte[] bArrE = aib.E(inputStreamA);
            inputStreamA.close();
            return bArrE;
        } finally {
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: lv0 */
    public static void c(String str) throws lv0 {
        if (AndroidContextProvider.a != null) {
            throw new lv0(str, (byte) 12);
        }
        throw new lv0(str.concat(". Android context is not initialized. If it happens in the Preview mode then call PreviewContextConfigurationEffect() function."), (byte) 12);
    }
}
