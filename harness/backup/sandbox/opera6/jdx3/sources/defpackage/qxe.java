package defpackage;

import J.N;
import android.content.Context;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.opera.android.OperaApplication;
import org.chromium.components.embedder_support.view.ContentViewRenderView;
import org.chromium.ui.base.WindowAndroid;

/* loaded from: classes.dex */
public abstract class qxe extends ContentViewRenderView implements pwe {
    public final qwe i;
    public boolean j;

    /* JADX WARN: Multi-variable type inference failed */
    public qxe(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        c5o c5oVar = new c5o();
        ((ContentViewRenderView) this).c = c5oVar;
        SurfaceView surfaceView = new SurfaceView(getContext());
        c5oVar.a = surfaceView;
        surfaceView.setBackgroundColor(-1);
        addView((SurfaceView) c5oVar.a, new FrameLayout.LayoutParams(-1, -1));
        ((SurfaceView) c5oVar.a).setVisibility(8);
        Context context = viewGroup.getContext();
        String[] strArr = OperaApplication.K;
        this.i = ((OperaApplication) context.getApplicationContext()).B();
    }

    @Override // defpackage.pwe
    public final void a(bp bpVar) {
        if (this.j) {
            N.MQ_YfC8P(((ContentViewRenderView) this).a, bpVar.a);
        }
    }

    public final void f(WindowAndroid windowAndroid) {
        ((ContentViewRenderView) this).a = N.MGnYpjUQ(this, windowAndroid);
        ((ContentViewRenderView) this).b = (qi) windowAndroid;
        yr5 yr5Var = new yr5(this);
        c5o c5oVar = ((ContentViewRenderView) this).c;
        c5oVar.b = yr5Var;
        ((SurfaceView) c5oVar.a).getHolder().addCallback((yr5) c5oVar.b);
        ((SurfaceView) c5oVar.a).setVisibility(0);
        this.j = true;
        N.MQ_YfC8P(((ContentViewRenderView) this).a, this.i.a.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
        qwe qweVar = this.i;
        qweVar.b.b(this);
        bp bpVar = qweVar.a;
        if (this.j) {
            N.MQ_YfC8P(((ContentViewRenderView) this).a, bpVar.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        this.i.b.c(this);
    }
}
