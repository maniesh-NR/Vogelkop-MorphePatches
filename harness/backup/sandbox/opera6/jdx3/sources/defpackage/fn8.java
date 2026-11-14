package defpackage;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
public interface fn8 {
    cn8[] createExtractors();

    default cn8[] f(Uri uri, Map map) {
        return createExtractors();
    }
}
