package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.opera.android.bookmarks.ImportBookmarksBanner;
import com.opera.android.custom_views.AnimationEmptyListView;
import com.opera.android.custom_views.OrientationFitConstraintLayout;
import com.opera.android.utilities.DisplayUtil;

/* loaded from: classes.dex */
public final class wl3 extends FrameLayout {
    public static final /* synthetic */ int c = 0;
    public final pt1 a;
    public boolean b;

    public wl3(Context context) {
        super(context, null, 0, 0);
        LayoutInflater.from(context).inflate(2131558554, this);
        int i = 2131362036;
        AnimationEmptyListView animationEmptyListView = (AnimationEmptyListView) w1h.j(2131362036, this);
        if (animationEmptyListView != null) {
            i = 2131362124;
            ImportBookmarksBanner importBookmarksBanner = (ImportBookmarksBanner) w1h.j(2131362124, this);
            if (importBookmarksBanner != null) {
                i = 2131362240;
                ConstraintLayout constraintLayout = (OrientationFitConstraintLayout) w1h.j(2131362240, this);
                if (constraintLayout != null) {
                    i = 2131363190;
                    MaterialButton materialButtonJ = w1h.j(2131363190, this);
                    if (materialButtonJ != null) {
                        i = 2131364073;
                        MaterialButton materialButtonJ2 = w1h.j(2131364073, this);
                        if (materialButtonJ2 != null) {
                            this.a = new pt1((ViewGroup) this, (View) animationEmptyListView, (Object) importBookmarksBanner, (View) constraintLayout, (View) materialButtonJ, (View) materialButtonJ2, (byte) 2);
                            this.b = true;
                            animationEmptyListView.setVisibility(a(getResources().getConfiguration()) ? 0 : 8);
                            return;
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    public final boolean a(Configuration configuration) {
        int i;
        return i0l.g() || DisplayUtil.e(getContext()) || (i = configuration.orientation) == 1 || (i == 2 && this.b);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ((AnimationEmptyListView) this.a.e).setVisibility(a(configuration) ? 0 : 8);
    }
}
