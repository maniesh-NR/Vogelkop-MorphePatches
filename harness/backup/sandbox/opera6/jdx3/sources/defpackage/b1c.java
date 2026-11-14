package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.i;
import com.opera.android.custom_views.StylingImageView;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class b1c extends ygc {
    public final vl9 b;
    public Set c;
    public szb d;
    public final /* synthetic */ f1c e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1c(f1c f1cVar) {
        super(new cs((byte) 4));
        this.e = f1cVar;
        this.b = new vl9(this, (byte) 8);
        this.c = Collections.EMPTY_SET;
    }

    public final void onBindViewHolder(i iVar, int i) {
        e1c e1cVar = (e1c) iVar;
        a1c a1cVar = (a1c) ((ygc) this).a.f.get(i);
        y83 y83VarD = y83.d(((i) e1cVar).itemView);
        LinearLayout linearLayout = (LinearLayout) y83VarD.b;
        AppCompatImageView appCompatImageView = (StylingImageView) y83VarD.d;
        TextView textView = (TextView) y83VarD.f;
        String str = a1cVar.b;
        boolean z = a1cVar.c;
        textView.setText(str);
        ((TextView) y83VarD.c).setText(((i) e1cVar).itemView.getResources().getString(a1cVar.a.b == 0 ? 2132021981 : 2132021982));
        appCompatImageView.setOnClickListener(z ? new dv2(this, y83VarD, a1cVar, (byte) 3) : null);
        appCompatImageView.setEnabled(z);
        linearLayout.setOnClickListener(z ? new jf7(this, a1cVar, (byte) 13) : null);
        linearLayout.setClickable(z);
    }

    public final i onCreateViewHolder(ViewGroup viewGroup, int i) {
        y83 y83VarE = y83.e(LayoutInflater.from(viewGroup.getContext()), viewGroup);
        ((View) y83VarE.g).setVisibility(0);
        AppCompatImageView appCompatImageView = (StylingImageView) y83VarE.d;
        appCompatImageView.setVisibility(0);
        appCompatImageView.setImageResource(2131232064);
        ((FrameLayout) y83VarE.e).setOnClickListener(new sma(y83VarE, (byte) 6));
        return new e1c((LinearLayout) y83VarE.b);
    }
}
