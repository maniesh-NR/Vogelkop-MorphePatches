package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* loaded from: classes.dex */
public final class nq5 implements oq5 {
    public final ContentInfo.Builder a;

    public nq5(ClipData clipData, int i) {
        this.a = l41.d(clipData, i);
    }

    @Override // defpackage.oq5
    public final void a(Uri uri) {
        this.a.setLinkUri(uri);
    }

    @Override // defpackage.oq5
    public final sq5 build() {
        return new sq5(new qq5(this.a.build()));
    }

    @Override // defpackage.oq5
    public final void d(int i) {
        this.a.setFlags(i);
    }

    @Override // defpackage.oq5
    public final void setExtras(Bundle bundle) {
        this.a.setExtras(bundle);
    }
}
