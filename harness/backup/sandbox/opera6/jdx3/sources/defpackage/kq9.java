package defpackage;

import com.opera.android.FullscreenWebActivity;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class kq9 extends qtn {
    public final /* synthetic */ FullscreenWebActivity b;

    public kq9(FullscreenWebActivity fullscreenWebActivity) {
        this.b = fullscreenWebActivity;
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final boolean shouldCreateWebContents(GURL gurl) {
        this.b.q0(gurl);
        return false;
    }
}
