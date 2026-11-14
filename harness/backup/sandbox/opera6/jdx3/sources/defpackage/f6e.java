package defpackage;

import J.N;
import com.opera.android.bookmarks.e;
import com.opera.android.bookmarks.h;
import com.opera.android.favorites.FavoritesBridge;

/* loaded from: classes.dex */
public final class f6e implements ywk {
    public final /* synthetic */ zwk a;
    public final /* synthetic */ h b;

    public f6e(h hVar, zwk zwkVar) {
        this.a = zwkVar;
        this.b = hVar;
    }

    @Override // defpackage.ywk
    public final void B() {
        h hVar = this.b;
        FavoritesBridge.a(new e(hVar));
        if (N.MyZx5kBs()) {
            hVar.r();
        }
        this.a.H(this);
    }

    @Override // defpackage.ywk
    public final void G(int i) {
    }
}
