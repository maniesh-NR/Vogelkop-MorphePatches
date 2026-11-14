package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.opera.android.annotations.WeakOwner;
import com.opera.android.flow.MyFlowMessageRoot;
import java.util.Collections;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class ac9 extends ab2 {
    public final nb9 d;
    public final MyFlowMessageRoot e;

    @NonNull
    @WeakOwner
    private final TextView f;
    public final TextView g;
    public final ImageView h;
    public final ImageView i;
    public final ProgressBar j;
    public zb9 k;
    public ob9 l;

    public ac9(View view, nb9 nb9Var) {
        int i;
        super(view);
        MyFlowMessageRoot myFlowMessageRoot = (MyFlowMessageRoot) view;
        this.e = myFlowMessageRoot;
        myFlowMessageRoot.a(true, false);
        myFlowMessageRoot.b(1);
        WeakHashMap weakHashMap = r5n.a;
        ((TextView) ((View) m5n.f(view, 2131364755))).setText(2132019065);
        this.d = nb9Var;
        TextView textView = (TextView) ((View) m5n.f(view, 2131362869));
        this.f = textView;
        this.g = (TextView) ((View) m5n.f(view, 2131364480));
        this.h = (ImageView) ((View) m5n.f(view, 2131363933));
        ImageView imageView = (ImageView) ((View) m5n.f(view, 2131364860));
        this.i = imageView;
        ProgressBar progressBar = (ProgressBar) ((View) m5n.f(view, 2131363953));
        this.j = progressBar;
        progressBar.setVisibility(0);
        ob9 ob9Var = new ob9(textView);
        ob9 ob9Var2 = this.l;
        if (ob9Var2 != null) {
            myFlowMessageRoot.c.c(ob9Var2);
            this.l = null;
        }
        this.l = ob9Var;
        if (myFlowMessageRoot.c.b(ob9Var) && (ob9Var.a != (i = myFlowMessageRoot.i) || !ob9Var.c)) {
            ob9Var.c = true;
            ob9Var.a = i;
            View view2 = (View) ob9Var.b.get();
            if (view2 != null) {
                ob9.b(i, view2);
            }
        }
        q9n.e(textView, ob9Var);
        q9n.e(imageView, new pc5((Object) this, (byte) 21));
        ((View) m5n.f(view, 2131361862)).setVisibility(8);
    }

    @Override // defpackage.ab2
    public final void V(ja2 ja2Var, boolean z) {
        if (!z) {
            zb9 zb9Var = (zb9) ja2Var;
            this.k = zb9Var;
            zb9Var.j = this;
        }
        e0();
        c0();
        b0();
    }

    @Override // defpackage.ab2
    public final void Y() {
        this.k.j = null;
        this.k = null;
    }

    public final void b0() {
        zb9 zb9Var = this.k;
        if (zb9Var == null) {
            return;
        }
        this.f.setText(zb9Var.e);
        zb9 zb9Var2 = this.k;
        bc9.u(this.i, zb9Var2.e, zb9Var2.f);
    }

    public final void c0() {
        zb9 zb9Var = this.k;
        if (zb9Var == null) {
            return;
        }
        Uri uri = zb9Var.g;
        ImageView imageView = this.h;
        if (uri == null) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setVisibility(0);
        dwh dwhVarG = yne.b.g(this.k.g);
        dwhVarG.d = true;
        dwhVarG.a();
        dwhVarG.m(wqm.r(this.k.g.toString()) ? Collections.singletonList(this.d) : Collections.EMPTY_LIST);
        dwhVarG.b.k = true;
        dwhVarG.g(imageView, (d94) null);
    }

    public final void e0() {
        if (this.k == null) {
            return;
        }
        TextView textView = this.g;
        Context context = textView.getContext();
        zb9 zb9Var = this.k;
        textView.setText(this.f.getResources().getString(2132018722, aik.h(Math.round(zb9Var.i * zb9Var.h), context), aik.h(this.k.h, context)));
        float f = this.k.i;
        this.j.setProgress(Math.round(f * r6.getMax()));
    }

    @Override // defpackage.ab2
    public final void onDestroy() {
        ob9 ob9Var = this.l;
        if (ob9Var != null) {
            this.e.c.c(ob9Var);
            this.l = null;
        }
    }
}
