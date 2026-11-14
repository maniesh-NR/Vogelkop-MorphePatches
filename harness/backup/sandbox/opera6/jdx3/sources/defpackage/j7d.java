package defpackage;

import com.opera.android.mainmenu.tiles.MainMenuTileLayout;

/* loaded from: classes.dex */
public final /* synthetic */ class j7d implements t1f {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j7d(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.t1f
    public final void a(boolean z) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                h13 h13Var = (h13) ((k5o) obj).c;
                if (z != h13Var.d) {
                    h13Var.d = z;
                    h13Var.invalidateSelf();
                    break;
                }
                break;
            default:
                MainMenuTileLayout mainMenuTileLayout = ((apl) obj).b;
                mainMenuTileLayout.e = z;
                mainMenuTileLayout.a();
                break;
        }
    }
}
