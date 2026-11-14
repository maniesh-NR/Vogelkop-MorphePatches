package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.mainmenu.tiles.MainMenuTileLayout;
import com.opera.android.ui.catalog.widget.OperaListItem;
import com.opera.android.ui.catalog.widget.OperaTextView;

/* loaded from: classes.dex */
public final class fbl implements a5n {
    public final /* synthetic */ byte a = 0;
    public final ConstraintLayout b;
    public final View c;
    public final View d;
    public final View e;
    public final View f;

    /* JADX WARN: Multi-variable type inference failed */
    public fbl(ConstraintLayout constraintLayout, StylingImageButton stylingImageButton, StylingImageView stylingImageView, StylingImageButton stylingImageButton2, OperaTextView operaTextView) {
        this.b = constraintLayout;
        this.c = stylingImageButton;
        this.e = stylingImageView;
        this.d = stylingImageButton2;
        this.f = operaTextView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public fbl(ConstraintLayout constraintLayout, MainMenuTileLayout mainMenuTileLayout, MainMenuTileLayout mainMenuTileLayout2, OperaListItem operaListItem, LinearLayout linearLayout) {
        this.b = constraintLayout;
        this.c = mainMenuTileLayout;
        this.d = mainMenuTileLayout2;
        this.e = operaListItem;
        this.f = linearLayout;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        byte b = this.a;
        return this.b;
    }
}
