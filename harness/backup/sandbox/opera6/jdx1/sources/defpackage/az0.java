package defpackage;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* loaded from: classes.dex */
public class az0 {
    public final wy0 a;
    public final int b;

    public az0(Context context) {
        this(context, bz0.g(0, context));
    }

    public az0(Context context, int i) {
        this.a = new wy0(new ContextThemeWrapper(context, bz0.g(i, context)));
        this.b = i;
    }

    public final void a(int i) {
        wy0 wy0Var = this.a;
        wy0Var.f = wy0Var.a.getText(i);
    }

    public final void b(int i) {
        wy0 wy0Var = this.a;
        wy0Var.d = wy0Var.a.getText(i);
    }

    public final bz0 c() {
        bz0 bz0VarCreate = create();
        bz0VarCreate.show();
        return bz0VarCreate;
    }

    public bz0 create() {
        wy0 wy0Var = this.a;
        bz0 bz0Var = new bz0(wy0Var.a, this.b);
        View view = wy0Var.e;
        zy0 zy0Var = bz0Var.g;
        byte b = 0;
        if (view != null) {
            zy0Var.B = view;
        } else {
            CharSequence charSequence = wy0Var.d;
            if (charSequence != null) {
                zy0Var.e = charSequence;
                TextView textView = zy0Var.z;
                if (textView != null) {
                    textView.setText(charSequence);
                }
                zy0Var.c.setTitle(charSequence);
            }
            Drawable drawable = wy0Var.c;
            if (drawable != null) {
                zy0Var.x = drawable;
                ImageView imageView = zy0Var.y;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    zy0Var.y.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = wy0Var.f;
        if (charSequence2 != null) {
            zy0Var.f = charSequence2;
            TextView textView2 = zy0Var.A;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = wy0Var.g;
        if (charSequence3 != null) {
            zy0Var.c(-1, charSequence3, wy0Var.h, null);
        }
        CharSequence charSequence4 = wy0Var.i;
        if (charSequence4 != null) {
            zy0Var.c(-2, charSequence4, wy0Var.j, null);
        }
        if (wy0Var.o != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) wy0Var.b.inflate(zy0Var.F, (ViewGroup) null);
            int i = wy0Var.s ? zy0Var.G : zy0Var.H;
            yy0 yy0Var = wy0Var.o;
            if (yy0Var == null) {
                yy0Var = new yy0(wy0Var.a, i, R.id.text1, (Object[]) null);
            }
            zy0Var.C = yy0Var;
            zy0Var.D = wy0Var.t;
            if (wy0Var.p != null) {
                alertController$RecycleListView.setOnItemClickListener(new vy0(wy0Var, zy0Var, b));
            }
            if (wy0Var.s) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            zy0Var.g = alertController$RecycleListView;
        }
        View view2 = wy0Var.r;
        if (view2 != null) {
            zy0Var.h = view2;
            zy0Var.i = 0;
            zy0Var.j = false;
        } else {
            int i2 = wy0Var.q;
            if (i2 != 0) {
                zy0Var.h = null;
                zy0Var.i = i2;
                zy0Var.j = false;
            }
        }
        bz0Var.setCancelable(wy0Var.k);
        if (wy0Var.k) {
            bz0Var.setCanceledOnTouchOutside(true);
        }
        bz0Var.setOnCancelListener(wy0Var.l);
        bz0Var.setOnDismissListener(wy0Var.m);
        ktd ktdVar = wy0Var.n;
        if (ktdVar != null) {
            bz0Var.setOnKeyListener(ktdVar);
        }
        return bz0Var;
    }

    public Context getContext() {
        return this.a.a;
    }

    public az0 setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        wy0 wy0Var = this.a;
        wy0Var.i = wy0Var.a.getText(i);
        wy0Var.j = onClickListener;
        return this;
    }

    public az0 setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        wy0 wy0Var = this.a;
        wy0Var.g = wy0Var.a.getText(i);
        wy0Var.h = onClickListener;
        return this;
    }

    public az0 setTitle(CharSequence charSequence) {
        this.a.d = charSequence;
        return this;
    }

    public az0 setView(View view) {
        wy0 wy0Var = this.a;
        wy0Var.r = view;
        wy0Var.q = 0;
        return this;
    }
}
