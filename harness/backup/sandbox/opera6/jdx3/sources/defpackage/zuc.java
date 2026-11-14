package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.opera.android.OperaApplication;
import com.opera.android.annotations.WeakOwner;
import com.opera.android.custom_views.CapturableButton;

/* loaded from: classes.dex */
public final class zuc extends lx8 implements xa2 {
    public final View d;
    public final TextView e;
    public final yqa f;

    @Nullable
    @WeakOwner
    private yuc g;

    public zuc(View view) {
        super(view);
        yqa yqaVar = new yqa((byte) 21);
        this.f = yqaVar;
        this.d = view;
        this.e = (TextView) view.findViewById(2131362334);
        ((CapturableButton) view.findViewById(2131362301)).setOnClickListener(new sma(this, (byte) 20));
        yqaVar.c = new yzb((Object) this, (byte) 10);
    }

    @Override // defpackage.xa2
    public final void J(wa2 wa2Var) {
    }

    @Override // defpackage.ab2
    public final int U() {
        return -1;
    }

    @Override // defpackage.ab2
    public final void V(ja2 ja2Var, boolean z) {
        this.g = new yuc(this);
        Context context = this.d.getContext();
        String[] strArr = OperaApplication.K;
        ((OperaApplication) context.getApplicationContext()).y().c().g(this.g);
    }

    @Override // defpackage.ab2
    public final void Y() {
        this.g = null;
    }
}
