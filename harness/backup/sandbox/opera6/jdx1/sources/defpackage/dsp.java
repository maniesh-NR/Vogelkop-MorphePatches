package defpackage;

import android.R;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.fragment.app.a;
import androidx.fragment.app.w;
import com.google.android.tv.ads.controls.ErrorMessageFragment;
import com.google.android.tv.ads.controls.WhyThisAdFragment;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class dsp implements zbl {
    public final a76 a;
    public final ImageView b;
    public final /* synthetic */ WhyThisAdFragment c;

    public dsp(WhyThisAdFragment whyThisAdFragment, ImageView imageView) {
        this.c = whyThisAdFragment;
        qyn.l(imageView, "Argument must not be null");
        this.b = imageView;
        this.a = new a76(imageView);
    }

    @Override // defpackage.zbl
    public final void a(zlj zljVar) {
        this.a.b.remove(zljVar);
    }

    @Override // defpackage.zbl
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.c.a.setImageDrawable((Drawable) obj);
    }

    @Override // defpackage.zbl
    public final void c(zlj zljVar) {
        this.b.setTag(2131363043, zljVar);
    }

    @Override // defpackage.zbl
    public final void d() {
        w parentFragmentManager = this.c.getParentFragmentManager();
        a aVarF = u35.f(parentFragmentManager, parentFragmentManager);
        aVarF.r = true;
        aVarF.e(R.id.content, aVarF.d(ErrorMessageFragment.class, null), null, 2);
        aVarF.h();
    }

    @Override // defpackage.zbl
    public final void e(Drawable drawable) {
        a76 a76Var = this.a;
        ViewTreeObserver viewTreeObserver = a76Var.a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(a76Var.c);
        }
        a76Var.c = null;
        a76Var.b.clear();
        this.c.a.setImageDrawable(drawable);
    }

    @Override // defpackage.zbl
    public final void f(zlj zljVar) throws Throwable {
        a76 a76Var = this.a;
        ArrayList arrayList = a76Var.b;
        ImageView imageView = a76Var.a;
        int paddingRight = imageView.getPaddingRight() + imageView.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int iA = a76Var.a(imageView.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        int paddingBottom = imageView.getPaddingBottom() + imageView.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        int iA2 = a76Var.a(imageView.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iA > 0 || iA == Integer.MIN_VALUE) && (iA2 > 0 || iA2 == Integer.MIN_VALUE)) {
            zljVar.j(iA, iA2);
            return;
        }
        if (!arrayList.contains(zljVar)) {
            arrayList.add(zljVar);
        }
        if (a76Var.c == null) {
            ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
            rv5 rv5Var = new rv5(a76Var);
            a76Var.c = rv5Var;
            viewTreeObserver.addOnPreDrawListener(rv5Var);
        }
    }

    @Override // defpackage.zbl
    public final zlj getRequest() {
        Object tag = this.b.getTag(2131363043);
        if (tag != null) {
            if (tag instanceof zlj) {
                return (zlj) tag;
            }
            qp2.o("You must not pass non-R.id ids to setTag(id)");
        }
        return null;
    }

    @Override // defpackage.kdc
    public final void onDestroy() {
    }

    @Override // defpackage.kdc
    public final void onStart() {
    }

    @Override // defpackage.kdc
    public final void onStop() {
    }

    public final String toString() {
        return "Target for: " + this.b;
    }
}
