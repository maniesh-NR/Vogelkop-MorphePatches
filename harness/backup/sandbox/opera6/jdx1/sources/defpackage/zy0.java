package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class zy0 {
    public TextView A;
    public View B;
    public ListAdapter C;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final boolean I;
    public final xy0 J;
    public final Context a;
    public final bz0 b;
    public final Window c;
    public final int d;
    public CharSequence e;
    public CharSequence f;
    public AlertController$RecycleListView g;
    public View h;
    public int i;
    public Button k;
    public CharSequence l;
    public Message m;
    public Drawable n;
    public Button o;
    public CharSequence p;
    public Message q;
    public Drawable r;
    public Button s;
    public CharSequence t;
    public Message u;
    public Drawable v;
    public NestedScrollView w;
    public Drawable x;
    public ImageView y;
    public TextView z;
    public boolean j = false;
    public int D = -1;
    public final ic K = new ic(this, (byte) 1);

    public zy0(Context context, bz0 bz0Var, Window window) {
        this.a = context;
        this.b = bz0Var;
        this.c = window;
        xy0 xy0Var = new xy0();
        xy0Var.b = new WeakReference(bz0Var);
        this.J = xy0Var;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, zhh.f, 2130968637, 0);
        this.E = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.F = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.G = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.H = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.I = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        bz0Var.d().g(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static ViewGroup b(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void c(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Drawable drawable) {
        Message messageObtainMessage = onClickListener != null ? this.J.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.t = charSequence;
            this.u = messageObtainMessage;
            this.v = drawable;
        } else if (i == -2) {
            this.p = charSequence;
            this.q = messageObtainMessage;
            this.r = drawable;
        } else {
            if (i != -1) {
                qp2.o("Button does not exist");
                return;
            }
            this.l = charSequence;
            this.m = messageObtainMessage;
            this.n = drawable;
        }
    }
}
