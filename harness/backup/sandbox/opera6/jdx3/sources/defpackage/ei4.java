package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.AbstractList;

/* loaded from: classes.dex */
public final class ei4 extends ArrayAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ro9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ei4(Object obj, Context context, AbstractList abstractList, ro9 ro9Var, byte b) {
        super(context, 2131558595, abstractList);
        this.a = b;
        this.b = ro9Var;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Drawable drawableF;
        Drawable drawableF2;
        byte b = this.a;
        ro9 ro9Var = this.b;
        switch (b) {
            case 0:
                TextView textView = (TextView) super.getView(i, view, viewGroup);
                if (i == ro9Var.b) {
                    drawableF = sgb.F(2131232018, getContext());
                    j14.n0(drawableF, f03.C(getContext()));
                } else {
                    drawableF = null;
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawableF, (Drawable) null);
                return textView;
            default:
                TextView textView2 = (TextView) super.getView(i, view, viewGroup);
                if (i == ro9Var.b) {
                    drawableF2 = sgb.F(2131232018, getContext());
                    j14.n0(drawableF2, f03.C(getContext()));
                } else {
                    drawableF2 = null;
                }
                textView2.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawableF2, (Drawable) null);
                return textView2;
        }
    }
}
