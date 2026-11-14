package defpackage;

import android.widget.FrameLayout;
import androidx.recyclerview.widget.i;
import com.google.android.material.button.MaterialButton;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.ui.catalog.widget.OperaMaterialButton;

/* loaded from: classes.dex */
public final class lmh extends pa3 {
    public final q5g b;
    public final eek c;

    public lmh(q5g q5gVar, eek eekVar) {
        super((FrameLayout) q5gVar.b);
        this.b = q5gVar;
        this.c = eekVar;
    }

    @Override // defpackage.pa3
    public final void U(gqk gqkVar, String str) {
        aqk aqkVar = (aqk) gqkVar;
        q5g q5gVar = this.b;
        ((StylingTextView) q5gVar.d).setText(aqkVar.c.a(((i) this).itemView.getResources()));
        MaterialButton materialButton = (OperaMaterialButton) q5gVar.c;
        materialButton.setText(aqkVar.d.a(((i) this).itemView.getResources()));
        materialButton.setOnClickListener(new zvd(this, (byte) 28));
    }

    @Override // defpackage.pa3
    public final void Y() {
        ((OperaMaterialButton) this.b.c).setOnClickListener(null);
    }
}
