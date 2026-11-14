package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class cc6 implements a5n {
    public final /* synthetic */ byte a;
    public final LinearLayout b;
    public final TextView c;

    public /* synthetic */ cc6(LinearLayout linearLayout, TextView textView, byte b) {
        this.a = b;
        this.b = linearLayout;
        this.c = textView;
    }

    public static cc6 a(View view) {
        TextView textView = (TextView) w1h.j(2131363296, view);
        if (textView != null) {
            return new cc6((LinearLayout) view, textView, (byte) 1);
        }
        t3p.q("Missing required view with ID: ".concat(view.getResources().getResourceName(2131363296)));
        return null;
    }

    public static cc6 b(LayoutInflater layoutInflater, LinearLayout linearLayout) {
        byte b = 0;
        View viewInflate = layoutInflater.inflate(2131558638, (ViewGroup) linearLayout, false);
        linearLayout.addView(viewInflate);
        TextView textView = (TextView) w1h.j(2131363485, viewInflate);
        if (textView != null) {
            return new cc6((LinearLayout) viewInflate, textView, b);
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(2131363485)));
        return null;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        byte b = this.a;
        return this.b;
    }
}
