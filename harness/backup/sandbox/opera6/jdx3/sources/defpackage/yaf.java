package defpackage;

import android.view.View;
import com.opera.android.bar.OmniButtonView;

/* loaded from: classes.dex */
public final class yaf implements View.OnClickListener, View.OnLongClickListener {
    public final wub a;
    public final /* synthetic */ OmniButtonView b;

    public yaf(OmniButtonView omniButtonView, wub wubVar) {
        this.b = omniButtonView;
        this.a = wubVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        bp bpVar;
        OmniButtonView omniButtonView = this.b;
        if (omniButtonView.h == null && omniButtonView.i == null && (bpVar = omniButtonView.g) != null) {
            ((dbf) this.a.a).v(view, ((uaf) bpVar.b).a, (bpVar.a & 1) != 0, hbf.b);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        bp bpVar = this.b.g;
        if (bpVar == null) {
            return false;
        }
        taf tafVar = ((uaf) bpVar.b).a;
        boolean z = (bpVar.a & 1) != 0;
        dbf dbfVar = (dbf) this.a.a;
        hbf hbfVar = hbf.a;
        return dbfVar.w(view, tafVar, z);
    }
}
