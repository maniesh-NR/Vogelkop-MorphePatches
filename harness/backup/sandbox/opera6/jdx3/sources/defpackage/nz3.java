package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.widget.ImageView;

/* loaded from: classes.dex */
public final class nz3 implements kz3, cll {
    public final ImageView a;
    public final dll b;
    public Drawable c;

    public nz3(ImageView imageView) {
        this.a = imageView;
        l5b l5bVar = q9n.c;
        this.b = hjf.v(imageView.getContext());
    }

    @Override // defpackage.cll
    public final void K() {
        a();
    }

    public final void a() {
        ImageView imageView = this.a;
        Context context = imageView.getContext();
        int iQ = f03.q(context);
        int iA = fan.a(40.0f, imageView.getResources());
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.setIntrinsicWidth(iA);
        shapeDrawable.setIntrinsicHeight(iA);
        shapeDrawable.getPaint().setColor(p37.a0(0.12f, iQ));
        Drawable drawableF = sgb.F(2131232196, context);
        j14.n0(drawableF, iQ);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{new w3a(shapeDrawable, 119, false), new w3a(drawableF, 17, false)});
        layerDrawable.setId(0, 0);
        layerDrawable.setId(1, 1);
        imageView.setImageDrawable(new b0j(layerDrawable, 0, 1));
        imageView.setImageDrawable(layerDrawable);
    }

    @Override // defpackage.kz3
    public final void b(hjm hjmVar) {
        this.a.setImageDrawable(this.c);
        dll dllVar = this.b;
        if (dllVar != null) {
            dllVar.H(this);
        }
    }

    @Override // defpackage.kz3
    public final void g(lz3 lz3Var) {
        this.c = this.a.getDrawable();
        dll dllVar = this.b;
        if (dllVar != null) {
            dllVar.F(this);
        }
        a();
    }
}
