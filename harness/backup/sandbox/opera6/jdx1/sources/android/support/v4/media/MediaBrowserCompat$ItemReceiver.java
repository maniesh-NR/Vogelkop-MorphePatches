package android.support.v4.media;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import defpackage.cpd;
import defpackage.w0i;

/* loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends w0i {
    @Override // defpackage.w0i
    public final void a(int i, Bundle bundle) {
        if (bundle != null) {
            cpd.a(bundle);
            try {
                bundle.isEmpty();
            } catch (BadParcelableException unused) {
                bundle = null;
            }
        }
        if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
            throw null;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
            throw null;
        }
        throw null;
    }
}
