package defpackage;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class bz0 extends zp1 implements DialogInterface {
    public final zy0 g;

    public bz0(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, g(i, contextThemeWrapper));
        this.g = new zy0(getContext(), this, getWindow());
    }

    public static int g(int i, Context context) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(2130968638, typedValue, true);
        return typedValue.resourceId;
    }

    public final Button f(int i) {
        zy0 zy0Var = this.g;
        if (i == -3) {
            return zy0Var.s;
        }
        if (i == -2) {
            return zy0Var.o;
        }
        if (i == -1) {
            return zy0Var.k;
        }
        zy0Var.getClass();
        return null;
    }

    @Override // defpackage.zp1, defpackage.ce5, android.app.Dialog
    public void onCreate(Bundle bundle) {
        int i;
        View view;
        ListAdapter listAdapter;
        View viewFindViewById;
        super.onCreate(bundle);
        zy0 zy0Var = this.g;
        zy0Var.b.setContentView(zy0Var.E);
        Context context = zy0Var.a;
        Window window = zy0Var.c;
        View viewFindViewById2 = window.findViewById(2131363850);
        View viewFindViewById3 = viewFindViewById2.findViewById(2131364807);
        View viewFindViewById4 = viewFindViewById2.findViewById(2131362415);
        View viewFindViewById5 = viewFindViewById2.findViewById(2131362217);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(2131362469);
        View viewInflate = zy0Var.h;
        if (viewInflate == null) {
            viewInflate = zy0Var.i != 0 ? LayoutInflater.from(context).inflate(zy0Var.i, viewGroup, false) : null;
        }
        boolean z = viewInflate != null;
        if (!z || !zy0.a(viewInflate)) {
            window.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(2131362468);
            frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
            if (zy0Var.j) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (zy0Var.g != null) {
                ((LinearLayout.LayoutParams) ((zec) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(2131364807);
        View viewFindViewById7 = viewGroup.findViewById(2131362415);
        View viewFindViewById8 = viewGroup.findViewById(2131362217);
        ViewGroup viewGroupB = zy0.b(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupB2 = zy0.b(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupB3 = zy0.b(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(2131364137);
        zy0Var.w = nestedScrollView;
        nestedScrollView.setFocusable(false);
        zy0Var.w.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupB2.findViewById(R.id.message);
        zy0Var.A = textView;
        if (textView != null) {
            CharSequence charSequence = zy0Var.f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                zy0Var.w.removeView(zy0Var.A);
                if (zy0Var.g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) zy0Var.w.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(zy0Var.w);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(zy0Var.g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupB2.setVisibility(8);
                }
            }
        }
        int i2 = zy0Var.d;
        Button button = (Button) viewGroupB3.findViewById(R.id.button1);
        zy0Var.k = button;
        View.OnClickListener onClickListener = zy0Var.K;
        button.setOnClickListener(onClickListener);
        if (TextUtils.isEmpty(zy0Var.l) && zy0Var.n == null) {
            zy0Var.k.setVisibility(8);
            i = 0;
        } else {
            zy0Var.k.setText(zy0Var.l);
            Drawable drawable = zy0Var.n;
            if (drawable != null) {
                drawable.setBounds(0, 0, i2, i2);
                zy0Var.k.setCompoundDrawables(zy0Var.n, null, null, null);
            }
            zy0Var.k.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) viewGroupB3.findViewById(R.id.button2);
        zy0Var.o = button2;
        button2.setOnClickListener(onClickListener);
        if (TextUtils.isEmpty(zy0Var.p) && zy0Var.r == null) {
            zy0Var.o.setVisibility(8);
        } else {
            zy0Var.o.setText(zy0Var.p);
            Drawable drawable2 = zy0Var.r;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, i2, i2);
                zy0Var.o.setCompoundDrawables(zy0Var.r, null, null, null);
            }
            zy0Var.o.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) viewGroupB3.findViewById(R.id.button3);
        zy0Var.s = button3;
        button3.setOnClickListener(onClickListener);
        if (TextUtils.isEmpty(zy0Var.t) && zy0Var.v == null) {
            zy0Var.s.setVisibility(8);
            view = null;
        } else {
            zy0Var.s.setText(zy0Var.t);
            Drawable drawable3 = zy0Var.v;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, i2, i2);
                view = null;
                zy0Var.s.setCompoundDrawables(zy0Var.v, null, null, null);
            } else {
                view = null;
            }
            zy0Var.s.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(2130968636, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button4 = zy0Var.k;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button5 = zy0Var.o;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button6 = zy0Var.s;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupB3.setVisibility(8);
        }
        if (zy0Var.B != null) {
            viewGroupB.addView(zy0Var.B, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(2131364779).setVisibility(8);
        } else {
            zy0Var.y = (ImageView) window.findViewById(R.id.icon);
            if (TextUtils.isEmpty(zy0Var.e) || !zy0Var.I) {
                window.findViewById(2131364779).setVisibility(8);
                zy0Var.y.setVisibility(8);
                viewGroupB.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(2131362006);
                zy0Var.z = textView2;
                textView2.setText(zy0Var.e);
                Drawable drawable4 = zy0Var.x;
                if (drawable4 != null) {
                    zy0Var.y.setImageDrawable(drawable4);
                } else {
                    zy0Var.z.setPadding(zy0Var.y.getPaddingLeft(), zy0Var.y.getPaddingTop(), zy0Var.y.getPaddingRight(), zy0Var.y.getPaddingBottom());
                    zy0Var.y.setVisibility(8);
                }
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i3 = (viewGroupB == null || viewGroupB.getVisibility() == 8) ? 0 : 1;
        boolean z3 = viewGroupB3.getVisibility() != 8;
        if (!z3 && (viewFindViewById = viewGroupB2.findViewById(2131364712)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i3 != 0) {
            NestedScrollView nestedScrollView2 = zy0Var.w;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = (zy0Var.f == null && zy0Var.g == null) ? view : viewGroupB.findViewById(2131364765);
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupB2.findViewById(2131364713);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = zy0Var.g;
        if (alertController$RecycleListView != null && (!z3 || i3 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i3 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.a, alertController$RecycleListView.getPaddingRight(), z3 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.b);
        }
        if (!z2) {
            View view2 = zy0Var.g;
            if (view2 == null) {
                view2 = zy0Var.w;
            }
            if (view2 != null) {
                int i4 = z3 ? 2 : 0;
                View viewFindViewById11 = window.findViewById(2131364136);
                View viewFindViewById12 = window.findViewById(2131364135);
                WeakHashMap weakHashMap = r5n.a;
                view2.setScrollIndicators(i3 | i4, 3);
                if (viewFindViewById11 != null) {
                    viewGroupB2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupB2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = zy0Var.g;
        if (alertController$RecycleListView2 == null || (listAdapter = zy0Var.C) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i5 = zy0Var.D;
        if (i5 > -1) {
            alertController$RecycleListView2.setItemChecked(i5, true);
            alertController$RecycleListView2.setSelection(i5);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.g.w;
        if (nestedScrollView == null || !nestedScrollView.m(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.g.w;
        if (nestedScrollView == null || !nestedScrollView.m(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // defpackage.zp1, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        zy0 zy0Var = this.g;
        zy0Var.e = charSequence;
        TextView textView = zy0Var.z;
        if (textView != null) {
            textView.setText(charSequence);
        }
        zy0Var.c.setTitle(charSequence);
    }
}
