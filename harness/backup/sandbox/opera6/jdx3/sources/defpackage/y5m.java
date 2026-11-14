package defpackage;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.i;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;
import java.util.Objects;

/* loaded from: classes.dex */
public class y5m extends z5m {
    public final StylingImageView c;
    public final TextView d;
    public final StylingTextView e;
    public final /* synthetic */ fl3 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, com.opera.android.custom_views.StylingImageView] */
    public y5m(fl3 fl3Var, View view) {
        super(view);
        Objects.requireNonNull(fl3Var);
        this.f = fl3Var;
        ?? r0 = (StylingImageView) view.findViewById(2131363256);
        this.c = r0;
        this.e = (StylingTextView) view.findViewById(2131363263);
        this.d = (TextView) view.findViewById(2131363251);
        view.setOnClickListener(new ks8(new j5g(this, fl3Var, (byte) 25), (byte) 2));
        q9n.e(r0, new svk(this, (byte) 12));
    }

    @Override // defpackage.z5m
    public void U(ll3 ll3Var) {
        this.b = ll3Var;
        boolean zI0 = this.f.I0(ll3Var);
        ((i) this).itemView.setEnabled(zI0);
        Y(ll3Var);
        CharSequence charSequenceC = ll3Var.c(((i) this).itemView.getResources());
        yq1 yq1Var = this.e;
        if (yq1Var != null) {
            if (TextUtils.isEmpty(charSequenceC)) {
                yq1Var.setVisibility(8);
            } else {
                yq1Var.setVisibility(0);
                yq1Var.setText(charSequenceC);
            }
        }
        String strA = ll3Var.a(((i) this).itemView.getResources());
        TextView textView = this.d;
        if (textView != null) {
            if (TextUtils.isEmpty(strA)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(strA);
            }
        }
        q9n.I(((i) this).itemView, zI0 ? q9n.c : q9n.d);
    }

    public void X() {
        ll3 ll3Var = this.b;
        if (ll3Var != null) {
            Y(ll3Var);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, com.opera.android.custom_views.StylingImageView] */
    public final void Y(ll3 ll3Var) {
        StylingTextView stylingTextView;
        Drawable drawableB = ll3Var.b(((i) this).itemView.getContext());
        ?? r1 = this.c;
        if (r1 == 0) {
            if (drawableB == null || (stylingTextView = this.e) == null) {
                return;
            }
            stylingTextView.s(drawableB, null);
            return;
        }
        r1.setImageDrawable(drawableB);
        if (this.f.I0(ll3Var)) {
            r1.setAlpha(1.0f);
        } else {
            r1.setAlpha(0.18f);
        }
    }
}
