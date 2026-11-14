package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.opera.android.startpage.SoftwareClipMaxWidthLinearLayout;
import com.opera.android.ui.catalog.widget.OperaTextView;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class d7o extends m6k implements y9n {
    public final Function1 f;
    public final a5n g;
    public final y6o h;
    public final int i;
    public final float j;

    public d7o(kf kfVar, tsd tsdVar, tsd tsdVar2, int i, Function1 function1, Function1 function12, Function1 function13) {
        super(kfVar, tsdVar, tsdVar2);
        this.f = function13;
        kf kfVar2 = this.d;
        a5n a5nVar = (a5n) function1.invoke(LayoutInflater.from(((SoftwareClipMaxWidthLinearLayout) kfVar2.c).getContext()).inflate(i, (ViewGroup) kfVar2.c, true));
        this.g = a5nVar;
        y6o y6oVar = (y6o) function12.invoke(a5nVar);
        this.h = y6oVar;
        this.i = new jxh(2131167807).k(y6oVar.c.getContext());
        jxh jxhVar = new jxh(2131167808);
        ImageView imageView = y6oVar.c;
        this.j = jxhVar.k(imageView.getContext());
        oon oonVar = new oon(this, (byte) 4);
        dll dllVarS = q9n.s(imageView);
        if (dllVarS == null) {
            return;
        }
        u8n.b(dllVarS, imageView, oonVar);
    }

    @Override // defpackage.y9n
    public final void T(View view, int i, int i2) {
        p6o p6oVar;
        if (i != 100 || i2 == 100 || (p6oVar = (p6o) this.b) == null) {
            return;
        }
        this.f.invoke(p6oVar);
    }

    @Override // defpackage.ab2
    public final void V(ja2 ja2Var, boolean z) {
        Bitmap bitmap;
        p6o p6oVar = (p6o) ja2Var;
        y6o y6oVar = this.h;
        ImageView imageView = y6oVar.c;
        Drawable drawableF = p6oVar.c.f(imageView.getContext());
        int iT = f03.t(2130969327, y6oVar.c.getContext(), 2131101243);
        c7o c7oVar = null;
        BitmapDrawable bitmapDrawable = drawableF instanceof BitmapDrawable ? (BitmapDrawable) drawableF : null;
        if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
            hq4 hq4Var = new hq4(bitmap, -1);
            float f = this.j;
            c7oVar = new c7o(new Drawable[]{hq4Var, new p05(f, iT, -1)});
            int i = this.i;
            int i2 = (int) (i - (2.0f * f));
            c7oVar.setLayerGravity(0, 17);
            c7oVar.setLayerSize(0, i2, i2);
            c7oVar.setLayerGravity(1, 17);
            c7oVar.setLayerSize(1, i, i);
        }
        imageView.setImageDrawable(c7oVar);
        OperaTextView operaTextView = y6oVar.e;
        operaTextView.setText(p6oVar.d.a(operaTextView.getResources()));
        OperaTextView operaTextView2 = y6oVar.d;
        operaTextView2.setText(p6oVar.e.a(operaTextView2.getResources()));
        y6oVar.b.setOnClickListener(new gwc(ja2Var, (byte) 5));
        b0(this.g, p6oVar);
    }

    public void b0(a5n a5nVar, p6o p6oVar) {
        z6o z6oVar = (z6o) a5nVar;
        z6oVar.b.setOnClickListener(new obn((o6o) p6oVar, z6oVar, (byte) 11));
    }
}
