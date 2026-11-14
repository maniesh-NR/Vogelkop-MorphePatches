package defpackage;

import android.view.View;
import com.opera.android.custom_views.LayoutDirectionLinearLayout;

/* loaded from: classes.dex */
public final class jq2 implements a5n {
    public final /* synthetic */ byte a;
    public final LayoutDirectionLinearLayout b;

    public /* synthetic */ jq2(LayoutDirectionLinearLayout layoutDirectionLinearLayout, byte b) {
        this.a = b;
        this.b = layoutDirectionLinearLayout;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        byte b = this.a;
        return this.b;
    }
}
