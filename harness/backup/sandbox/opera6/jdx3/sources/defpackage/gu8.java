package defpackage;

import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.i;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.ui.catalog.widget.OperaTextView;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class gu8 extends lx8 implements View.OnClickListener, y9n, o0c {
    public final r9i d;
    public final TextView e;
    public final OperaTextView f;
    public final ImageView g;
    public final TextView h;
    public final ov0 i;
    public final ga6 j;
    public final p0c k;
    public Locale l;

    public gu8(View view, r9i r9iVar, p0c p0cVar) {
        super(view);
        this.l = Locale.getDefault();
        view.setOnClickListener(this);
        this.d = r9iVar;
        this.e = (TextView) view.findViewById(2131362904);
        this.f = view.findViewById(2131362918);
        ImageView imageView = (ImageView) view.findViewById(f0());
        this.g = imageView;
        this.h = (TextView) view.findViewById(2131362917);
        View viewFindViewById = view.findViewById(2131362915);
        this.i = viewFindViewById != null ? ov0.d(viewFindViewById) : null;
        this.j = imageView != null ? i0(imageView, view) : null;
        this.k = p0cVar;
        p0cVar.c.b(this);
        p(p0cVar.d);
    }

    public static void g0(String str, ImageView imageView, ga6 ga6Var) {
        h0(str, imageView, ga6Var, false, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void h0(String str, ImageView imageView, ga6 ga6Var, boolean z, d94 d94Var) {
        Drawable drawable;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        dwh dwhVarI = yne.b.i(str);
        if (z) {
            dwhVarI.l(3);
        }
        boolean z2 = false;
        if ((!(imageView instanceof StylingImageView) || !((StylingImageView) imageView).d()) && (drawable = imageView.getDrawable()) != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
                shapeDrawable.setIntrinsicHeight(intrinsicHeight);
                shapeDrawable.setIntrinsicWidth(intrinsicWidth);
                shapeDrawable.getPaint().setColor(0);
                dwhVarI.k(shapeDrawable);
            }
        }
        Point point = (Point) ga6Var.b;
        int i = point.x;
        if (i > 0 && point.y > 0) {
            z2 = true;
        }
        if (z2) {
            dwhVarI.b.b(i, point.y);
        } else {
            dwhVarI.d = true;
        }
        dwhVarI.a();
        dwhVarI.g(imageView, d94Var);
    }

    public static ga6 i0(View view, View view2) {
        Resources resources = view.getResources();
        ga6 ga6VarM = view instanceof ImageView ? ga6.m((ImageView) view, view2) : ga6.j(view, view2, true);
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        int iMin = Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
        Point point = (Point) ga6VarM.b;
        int i = point.x;
        if (i > 0 && point.y > 0) {
            return ga6VarM;
        }
        if (i > 0) {
            iMin = i;
        } else {
            int i2 = point.y;
            if (i2 > 0) {
                iMin = (i2 << 4) / 9;
            }
        }
        return new ga6((Object) new Point(iMin, (iMin * 9) / 16), (byte) 11);
    }

    public static void k0(TextView textView, j82 j82Var, r9i r9iVar) {
        nre nreVar;
        if (textView == null) {
            return;
        }
        oqe oqeVar = ((pue) j82Var).c;
        String str = j82Var.d;
        Object obj = null;
        if (str.equals("topnews")) {
            String str2 = !(oqeVar instanceof msh) ? null : ((msh) oqeVar).y;
            if (str2 != null) {
                textView.setVisibility(0);
                textView.setText(str2);
                return;
            }
        }
        r9iVar.getClass();
        msh mshVar = (msh) oqeVar;
        String str3 = mshVar.r;
        String[] strArr = aik.a;
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        if (TextUtils.isEmpty(str3) || str3.equals(str)) {
            textView.setVisibility(8);
            return;
        }
        uqe uqeVar = (uqe) r9iVar.b;
        String str5 = mshVar.r;
        if (str5 == null) {
            str5 = "";
        }
        String str6 = oqeVar.a;
        if (str6 == null) {
            if (!TextUtils.isEmpty(str5) && (nreVar = (nre) uqeVar.h().b) != null) {
                Iterator it = nreVar.d.iterator();
                it.getClass();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((yqe) next).a.equals(str5)) {
                        obj = next;
                        break;
                    }
                }
                yqe yqeVar = (yqe) obj;
                if (yqeVar != null) {
                    str4 = yqeVar.b;
                }
            }
            oqeVar.a = str4;
            str6 = str4;
        }
        if (TextUtils.isEmpty(str6)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str6);
        }
    }

    public static void l0(ov0 ov0Var, oqe oqeVar, r9i r9iVar, View.OnClickListener onClickListener) {
        if (ov0Var == null) {
            return;
        }
        LinearLayout linearLayout = (LinearLayout) ov0Var.b;
        r9iVar.getClass();
        xlg xlgVar = ((msh) oqeVar).z;
        Long lValueOf = xlgVar == null ? null : Long.valueOf(xlgVar.h);
        if (lValueOf == null) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        ((TextView) ov0Var.c).setText(String.format(Locale.US, "%d:%02d", Long.valueOf(lValueOf.longValue() / 60), Long.valueOf(lValueOf.longValue() % 60)));
        linearLayout.setOnClickListener(onClickListener);
    }

    @Override // defpackage.y9n
    public void T(View view, int i, int i2) {
        int i3;
        int i4;
        j82 j82Var = (j82) this.b;
        if (j82Var != null) {
            ov0 ov0Var = this.i;
            if (ov0Var != null) {
                i3 = i;
                i4 = i2;
                this.d.c(j82Var, ov0Var, c0(), i3, i4);
            } else {
                i3 = i;
                i4 = i2;
            }
            r9i r9iVar = this.d;
            r9iVar.getClass();
            if (r9i.K(i3, i4)) {
                r9iVar.O(j82Var, true);
            } else {
                if (i4 <= 33 || i3 > 33) {
                    return;
                }
                r9iVar.O(j82Var, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x013b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.ab2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void V(defpackage.ja2 r26, boolean r27) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gu8.V(ja2, boolean):void");
    }

    @Override // defpackage.ab2
    public void Y() {
        ImageView imageView = this.g;
        if (imageView != null) {
            yne.b.c(imageView);
        }
    }

    public oqe e0() {
        return ((pue) ((j82) a0())).c;
    }

    public int f0() {
        return 2131362907;
    }

    public void j0() {
        ga6 ga6Var;
        ImageView imageView = this.g;
        if (imageView == null || (ga6Var = this.j) == null) {
            return;
        }
        g0(this.d.F(e0(), ga6Var), imageView, ga6Var);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        j82 j82Var = (j82) this.b;
        if (j82Var != null) {
            View view2 = ((i) this).itemView;
            r9i r9iVar = this.d;
            if (view == view2) {
                r9iVar.r(this, j82Var);
                return;
            }
            ov0 ov0Var = this.i;
            if (ov0Var == null || view != ((LinearLayout) ov0Var.b)) {
                return;
            }
            r9iVar.N(this, j82Var);
        }
    }

    @Override // defpackage.ab2
    public final void onDestroy() {
        this.k.c.c(this);
    }

    @Override // defpackage.o0c
    public final void p(l0c l0cVar) {
        this.l = l0cVar == null ? Locale.getDefault() : l0cVar.b();
    }
}
