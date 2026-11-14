package defpackage;

import android.widget.FrameLayout;
import com.opera.android.custom_views.AnimationEmptyListView;
import com.opera.android.custom_views.EmptyListView;

/* loaded from: classes.dex */
public final class vz7 extends xz7 {
    public final /* synthetic */ byte b;
    public final FrameLayout c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vz7(FrameLayout frameLayout, byte b) {
        super(frameLayout);
        this.b = b;
        this.c = frameLayout;
    }

    @Override // defpackage.xz7
    public final void U(int i) {
        byte b = this.b;
        FrameLayout frameLayout = this.c;
        switch (b) {
            case 0:
                ((AnimationEmptyListView) frameLayout).b(i);
                break;
            default:
                ((EmptyListView) frameLayout).e(i);
                break;
        }
    }

    @Override // defpackage.xz7
    public final void V(int i) {
        byte b = this.b;
        FrameLayout frameLayout = this.c;
        switch (b) {
            case 0:
                ((AnimationEmptyListView) frameLayout).c(i);
                break;
            default:
                ((EmptyListView) frameLayout).g(i);
                break;
        }
    }
}
