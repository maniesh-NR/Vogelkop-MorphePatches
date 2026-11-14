package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfp7;", "Lk24;", "<init>", "()V", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class fp7 extends k24 {
    public FrameLayout f;

    @Override // defpackage.k24
    public final View n0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        this.f = frameLayout;
        o0(LayoutInflater.from(frameLayout.getContext()), frameLayout);
        return frameLayout;
    }

    public abstract void o0(LayoutInflater layoutInflater, FrameLayout frameLayout);

    @Override // defpackage.k24
    public final void onDestroyView() {
        FrameLayout frameLayout = this.f;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        super.onDestroyView();
    }
}
