package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.i;

/* loaded from: classes.dex */
public final class uxi extends i {
    public final vs b;
    public final /* synthetic */ vxi c;

    /* JADX WARN: Illegal instructions before constructor call */
    public uxi(vxi vxiVar, vs vsVar) {
        this.c = vxiVar;
        FrameLayout frameLayout = (FrameLayout) vsVar.b;
        super(frameLayout);
        this.b = vsVar;
        Context context = frameLayout.getContext();
        ((TextView) vsVar.e).setTextAppearance(f03.E(2130970991, context, 0));
        ((TextView) vsVar.c).setTextAppearance(f03.E(2130970997, context, 0));
    }
}
