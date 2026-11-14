package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.i;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class f0e extends i {
    public static final /* synthetic */ int h = 0;
    public final sf2 b;
    public final pde c;
    public final yhe d;
    public final pde e;
    public final tsd f;
    public final xh7 g;

    /* JADX WARN: Illegal instructions before constructor call */
    public f0e(sf2 sf2Var, pde pdeVar, pde pdeVar2, yhe yheVar, pde pdeVar3) {
        ImageView imageView = sf2Var.b;
        super(imageView);
        this.b = sf2Var;
        this.c = pdeVar2;
        this.d = yheVar;
        this.e = pdeVar3;
        tsd tsdVarW = a26.w(pdeVar, (kze) new z61(imageView).b);
        this.f = tsdVarW;
        xh7 xh7Var = ((z5l) yheVar.b).q.i;
        this.g = xh7Var;
        a26.T(pdeVar2, tsdVarW, new d8d(this, (byte) 8));
        a26.V(xh7Var, tsdVarW, new okb(this, (byte) 1));
        s6h s6hVar = new s6h();
        s6hVar.b = this;
        byte b = 9;
        s6hVar.a = new hpd(this, s6hVar, b);
        this.b.b.addOnLayoutChangeListener(new z22(this, (byte) 10));
        a26.T(this.e, this.f, new d8d(s6hVar, b));
    }

    public final void U() {
        float fA;
        float fFloatValue;
        pde pdeVar = this.c;
        eyj eyjVar = (eyj) pdeVar.g();
        View viewV = V();
        xh7 xh7Var = this.g;
        float fExp = 0.0f;
        if (viewV == null) {
            fFloatValue = 0.0f;
            fA = 0.0f;
        } else {
            fA = xh7Var.a(viewV);
            Float f = (Float) ((LinkedHashMap) xh7Var.e).get(viewV);
            fFloatValue = f != null ? f.floatValue() : 0.0f;
        }
        sf2 sf2Var = this.b;
        ImageView imageView = sf2Var.b;
        ImageView imageView2 = sf2Var.b;
        if (((View) imageView.getParent()) == null) {
            return;
        }
        float width = (r6.getWidth() / 2.0f) - ((imageView2.getTranslationX() + imageView2.getLeft()) + (imageView2.getWidth() / 2));
        if (((eyj) pdeVar.g()).l != null) {
            float width2 = r0.e.getWidth() / 2.0f;
            fExp = (float) Math.exp(((-width) * width) / (width2 * width2));
        }
        float fG = v0g.g(fA, fExp, xh7Var.b(), fExp);
        float f2 = (0.35f * fG) + 1.0f;
        imageView2.setScaleX(f2);
        imageView2.setScaleY(f2);
        imageView2.setTranslationZ(fG);
        imageView2.setAlpha(Math.min(((eyjVar.x - 1.0f) * fFloatValue) + 1.0f, v0g.g(eyjVar.A, 1.0f, fA, 1.0f)));
    }

    public abstract View V();
}
