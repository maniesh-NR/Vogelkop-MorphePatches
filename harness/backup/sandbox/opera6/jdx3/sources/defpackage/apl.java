package defpackage;

import androidx.recyclerview.widget.i;
import com.opera.android.mainmenu.tiles.MainMenuTileLayout;

/* loaded from: classes.dex */
public final class apl extends i {
    public final MainMenuTileLayout b;
    public final y53 c;
    public wol d;
    public final j7d e;
    public final g9l f;
    public ekc g;
    public final kze h;

    public apl(MainMenuTileLayout mainMenuTileLayout, y53 y53Var) {
        super(mainMenuTileLayout);
        this.b = mainMenuTileLayout;
        this.c = y53Var;
        this.e = new j7d(this, (byte) 1);
        this.f = new g9l(this, (byte) 5);
        this.h = (kze) new z61(mainMenuTileLayout).b;
        mainMenuTileLayout.setOnClickListener(new h4i((Object) this, (byte) 23));
    }

    public final void U() {
        wol wolVar = this.d;
        if (wolVar != null) {
            p1f p1fVarS = this.c.S(wolVar);
            if (p1fVarS != null) {
                if (p1fVarS.a.c(this.e)) {
                    p1fVarS.c.run();
                }
            }
            this.d = null;
        }
        ekc ekcVar = this.g;
        if (ekcVar != null) {
            ekcVar.p(this.f);
        }
        this.g = null;
        MainMenuTileLayout mainMenuTileLayout = this.b;
        if (mainMenuTileLayout.f) {
            mainMenuTileLayout.f = false;
            mainMenuTileLayout.b();
        }
    }
}
