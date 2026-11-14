package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.opera.android.mainmenu.tiles.MainMenuTileLayout;
import com.opera.android.settings.SettingsManager;
import com.opera.android.ui.catalog.widget.OperaListItem;

/* loaded from: classes.dex */
public final class t6n extends z6n implements h4a {
    public final fbl b;
    public final tjn c;

    /* JADX WARN: Illegal instructions before constructor call */
    public t6n(fbl fblVar, tjn tjnVar, final SettingsManager settingsManager) throws Resources.NotFoundException {
        ConstraintLayout constraintLayout = fblVar.b;
        super(constraintLayout);
        this.b = fblVar;
        this.c = tjnVar;
        final byte b = 1;
        ((MainMenuTileLayout) fblVar.d).setOnClickListener(new n6n(tjnVar, (byte) 1));
        ((MainMenuTileLayout) fblVar.c).setOnClickListener(new n6n(tjnVar, (byte) 2));
        ((LinearLayout) fblVar.f).setOnClickListener(new pkm(this, (byte) 3));
        ((OperaListItem) fblVar.e).setChecked(tjnVar.d());
        if (settingsManager != null) {
            final ezg ezgVar = new ezg(this, (byte) 10);
            final byte b2 = 0;
            q9n.g(constraintLayout, new tu4(new Runnable() { // from class: s6n
                @Override // java.lang.Runnable
                public final void run() {
                    byte b3 = b2;
                    ezg ezgVar2 = ezgVar;
                    SettingsManager settingsManager2 = settingsManager;
                    switch (b3) {
                        case 0:
                            settingsManager2.F(ezgVar2);
                            break;
                        default:
                            settingsManager2.H(ezgVar2);
                            break;
                    }
                }
            }, new Runnable() { // from class: s6n
                @Override // java.lang.Runnable
                public final void run() {
                    byte b3 = b;
                    ezg ezgVar2 = ezgVar;
                    SettingsManager settingsManager2 = settingsManager;
                    switch (b3) {
                        case 0:
                            settingsManager2.F(ezgVar2);
                            break;
                        default:
                            settingsManager2.H(ezgVar2);
                            break;
                    }
                }
            }, (byte) 7));
        }
    }

    public final void U(boolean z) {
        fbl fblVar = this.b;
        ((OperaListItem) fblVar.e).setChecked(z);
        OperaListItem operaListItem = (OperaListItem) fblVar.e;
        if (z) {
            u35.k(am2.b(am2.a(this.c.f())), operaListItem);
        } else {
            u35.k(2132022339, operaListItem);
        }
    }

    @Override // defpackage.h4a
    public final void l(Rect rect) {
        rect.setEmpty();
    }
}
