package defpackage;

import android.view.View;
import com.opera.android.custom_views.EmptyListView;
import com.opera.android.custom_views.StylingImageView;

/* loaded from: classes.dex */
public final /* synthetic */ class p73 implements r8n {
    public final /* synthetic */ byte a;
    public final /* synthetic */ StylingImageView b;

    public /* synthetic */ p73(StylingImageView stylingImageView, byte b) {
        this.a = b;
        this.b = stylingImageView;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View, com.opera.android.custom_views.StylingImageView] */
    @Override // defpackage.r8n
    public final void a(View view) {
        byte b = this.a;
        ?? r2 = this.b;
        switch (b) {
            case 0:
                r2.c(null);
                break;
            case 1:
                int i = EmptyListView.e;
                r2.c(f03.u(2130969894, r2.getContext(), 2131099820));
                break;
            default:
                r2.c(f03.v(r2.getContext()));
                break;
        }
    }
}
