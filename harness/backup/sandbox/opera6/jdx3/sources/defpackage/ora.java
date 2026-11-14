package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ViewSwitcher;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.opera.hype.image.editor.EditImage;

/* loaded from: classes.dex */
public final class ora implements a5n {
    public final ConstraintLayout a;
    public final ImageView b;
    public final ImageView c;
    public final ViewSwitcher d;
    public final EditImage e;
    public final ImageView f;
    public final ImageView g;
    public final View h;
    public final ProgressBar i;
    public final LinearLayout j;
    public final LinearLayout k;
    public final ImageView l;
    public final ImageView m;
    public final ImageView n;
    public final ImageView o;
    public final View p;

    public ora(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ViewSwitcher viewSwitcher, EditImage editImage, ImageView imageView3, ImageView imageView4, View view, ProgressBar progressBar, LinearLayout linearLayout, LinearLayout linearLayout2, ImageView imageView5, ImageView imageView6, ImageView imageView7, ImageView imageView8, View view2) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = imageView2;
        this.d = viewSwitcher;
        this.e = editImage;
        this.f = imageView3;
        this.g = imageView4;
        this.h = view;
        this.i = progressBar;
        this.j = linearLayout;
        this.k = linearLayout2;
        this.l = imageView5;
        this.m = imageView6;
        this.n = imageView7;
        this.o = imageView8;
        this.p = view2;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        return this.a;
    }
}
