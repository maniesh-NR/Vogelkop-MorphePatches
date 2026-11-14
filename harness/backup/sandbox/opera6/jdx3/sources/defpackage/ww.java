package defpackage;

import android.widget.ImageView;
import androidx.recyclerview.widget.i;
import com.opera.android.custom_views.LayoutDirectionLinearLayout;

/* loaded from: classes.dex */
public final class ww extends i {
    public final vs b;
    public final /* synthetic */ yw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww(yw ywVar, vs vsVar, boolean z) {
        super((LayoutDirectionLinearLayout) vsVar.b);
        this.c = ywVar;
        this.b = vsVar;
        ((ImageView) vsVar.d).setVisibility(z ? 0 : 8);
    }
}
