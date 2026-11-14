package defpackage;

import android.content.Context;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public final class nwn {
    public static final String[] b = {"app_webview/", "databases/", "lib/", "shared_prefs/", "code_cache/"};
    public final File a;

    public nwn(Context context, File file) {
        try {
            this.a = new File(uup.q(file));
            if (a(context)) {
                return;
            }
            throw new IllegalArgumentException("The given directory \"" + file + "\" doesn't exist under an allowed app internal storage directory");
        } catch (IOException e) {
            sjn.l("Failed to resolve the canonical path for the given directory: ", file.getPath(), e);
            throw null;
        }
    }

    public final boolean a(Context context) {
        String strQ = uup.q(this.a);
        String strQ2 = uup.q(context.getCacheDir());
        String strQ3 = uup.q(context.getDataDir());
        if ((strQ.startsWith(strQ2) || strQ.startsWith(strQ3)) && !strQ.equals(strQ2) && !strQ.equals(strQ3)) {
            for (int i = 0; i < 5; i++) {
                if (!strQ.startsWith(strQ3 + b[i])) {
                }
            }
            return true;
        }
        return false;
    }
}
