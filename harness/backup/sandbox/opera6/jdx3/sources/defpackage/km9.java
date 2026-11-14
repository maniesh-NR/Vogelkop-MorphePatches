package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.opera.android.custom_views.CircleImageView;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.widget.MenuSettingsListItem;

/* loaded from: classes.dex */
public final class km9 implements a5n {
    public final LinearLayout a;
    public final ConstraintLayout b;
    public final CircleImageView c;
    public final ImageView d;
    public final StylingTextView e;
    public final StylingTextView f;
    public final MenuSettingsListItem g;
    public final MenuSettingsListItem h;
    public final MenuSettingsListItem i;
    public final MenuSettingsListItem j;
    public final MenuSettingsListItem k;

    public km9(LinearLayout linearLayout, ConstraintLayout constraintLayout, CircleImageView circleImageView, ImageView imageView, StylingTextView stylingTextView, StylingTextView stylingTextView2, MenuSettingsListItem menuSettingsListItem, MenuSettingsListItem menuSettingsListItem2, MenuSettingsListItem menuSettingsListItem3, MenuSettingsListItem menuSettingsListItem4, MenuSettingsListItem menuSettingsListItem5) {
        this.a = linearLayout;
        this.b = constraintLayout;
        this.c = circleImageView;
        this.d = imageView;
        this.e = stylingTextView;
        this.f = stylingTextView2;
        this.g = menuSettingsListItem;
        this.h = menuSettingsListItem2;
        this.i = menuSettingsListItem3;
        this.j = menuSettingsListItem4;
        this.k = menuSettingsListItem5;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        return this.a;
    }
}
