package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.opera.android.ui.catalog.widget.OperaTextView;

/* loaded from: classes.dex */
public final class bu extends eu implements h4a, p87 {
    public final kf c;

    public bu(ViewGroup viewGroup) {
        OperaTextView operaTextViewN = j7c.n(viewGroup, 2131558450, viewGroup, false);
        if (operaTextViewN == null) {
            t3p.q("rootView");
            throw null;
        }
        OperaTextView operaTextView = operaTextViewN;
        kf kfVar = new kf((byte) 1, (View) operaTextView, (Object) operaTextView);
        super(operaTextView);
        this.c = kfVar;
    }

    @Override // defpackage.eu
    public final void U(js jsVar) {
        OperaTextView operaTextView = (OperaTextView) this.c.c;
        operaTextView.setText(((gs) jsVar).c.a(operaTextView.getResources()));
    }

    @Override // defpackage.h4a
    public final void l(Rect rect) {
        rect.set(0, 0, 0, 0);
    }
}
