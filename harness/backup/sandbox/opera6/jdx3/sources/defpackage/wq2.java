package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* loaded from: classes.dex */
public final class wq2 implements r8n {
    public final /* synthetic */ byte a = 0;
    public int b;

    public /* synthetic */ wq2() {
    }

    public wq2(eq1 eq1Var, int i) {
        this.b = i;
        View view = (View) eq1Var.getContentView().getParent();
        u8n.b(q9n.s(view), view, this);
    }

    @Override // defpackage.r8n
    public final void a(View view) {
        switch (this.a) {
            case 0:
                if (this.b != 0) {
                    ImageView imageView = view instanceof ImageView ? (ImageView) view : null;
                    if (imageView != null) {
                        imageView.setImageDrawable(f03.x(this.b, imageView.getContext()));
                        break;
                    }
                }
                break;
            default:
                TypedArray typedArrayObtainStyledAttributes = view.getContext().obtainStyledAttributes(null, zhh.t, this.b, 0);
                Context context = view.getContext();
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                Drawable drawableF = resourceId != 0 ? sgb.F(resourceId, context) : null;
                typedArrayObtainStyledAttributes.recycle();
                q9n.B(view, drawableF);
                break;
        }
    }
}
