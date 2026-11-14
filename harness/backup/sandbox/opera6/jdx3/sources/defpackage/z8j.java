package defpackage;

import android.content.res.ColorStateList;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.widget.MenuSettingsListItem;

/* loaded from: classes.dex */
public final class z8j extends b9j {
    public static final /* synthetic */ int e = 0;
    public l6j c;
    public ColorStateList d;

    public final void U(l6j l6jVar) {
        this.c = l6jVar;
        MenuSettingsListItem menuSettingsListItem = ((e9j) this.b).a;
        ((StylingTextView) menuSettingsListItem.b.f).setText(l6jVar.c);
        ((StylingTextView) menuSettingsListItem.b.b).setText(l6jVar.d);
        ((StylingImageView) menuSettingsListItem.b.e).setImageResource(l6jVar.e);
        ((StylingImageView) menuSettingsListItem.b.e).c(l6jVar.f ? this.d : null);
    }
}
