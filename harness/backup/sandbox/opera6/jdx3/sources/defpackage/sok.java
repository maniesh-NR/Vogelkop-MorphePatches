package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class sok extends sgb {
    public final /* synthetic */ byte k = 0;
    public Object l;

    public /* synthetic */ sok() {
    }

    public sok(s2g s2gVar) {
        this.l = s2gVar;
    }

    public final void U(Bitmap bitmap, boolean z) {
        switch (this.k) {
            case 0:
                this.l = bitmap;
                break;
            default:
                ((s2g) this.l).run(Boolean.valueOf(bitmap != null));
                break;
        }
    }
}
