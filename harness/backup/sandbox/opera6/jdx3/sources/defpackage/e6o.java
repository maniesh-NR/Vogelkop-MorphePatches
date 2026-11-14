package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.opera.android.ui.catalog.widget.OperaTextView;

/* loaded from: classes.dex */
public final class e6o extends d7o {
    public final int k;
    public final float l;

    public e6o(kf kfVar, tsd tsdVar, tsd tsdVar2, lrk lrkVar) {
        super(kfVar, tsdVar, tsdVar2, 2131559575, d6o.a, new q0n((byte) 21), lrkVar);
        this.k = new jxh(2131167809).k(((x6o) this.g).a.getContext());
        this.l = new jxh(2131167810).k(((x6o) this.g).a.getContext());
        ImageView imageView = ((x6o) this.g).c;
        final byte b = 0;
        r8n r8nVar = new r8n(this) { // from class: b6o
            public final /* synthetic */ e6o b;

            {
                this.b = this;
            }

            @Override // defpackage.r8n
            public final void a(View view) {
                c7o c7oVar;
                byte b2 = b;
                e6o e6oVar = this.b;
                switch (b2) {
                    case 0:
                        a5n a5nVar = e6oVar.g;
                        Drawable drawable = ((x6o) a5nVar).c.getDrawable();
                        c7oVar = drawable instanceof c7o ? (c7o) drawable : null;
                        if (c7oVar != null) {
                            c7oVar.a(f03.t(2130969300, ((x6o) a5nVar).c.getContext(), 2131101243));
                            break;
                        }
                        break;
                    default:
                        a5n a5nVar2 = e6oVar.g;
                        Drawable drawable2 = ((x6o) a5nVar2).g.getDrawable();
                        c7oVar = drawable2 instanceof c7o ? (c7o) drawable2 : null;
                        if (c7oVar != null) {
                            c7oVar.a(f03.t(2130969300, ((x6o) a5nVar2).g.getContext(), 2131101243));
                            break;
                        }
                        break;
                }
            }
        };
        dll dllVarS = q9n.s(imageView);
        if (dllVarS != null) {
            u8n.b(dllVarS, imageView, r8nVar);
        }
        ImageView imageView2 = ((x6o) this.g).g;
        final byte b2 = 1;
        r8n r8nVar2 = new r8n(this) { // from class: b6o
            public final /* synthetic */ e6o b;

            {
                this.b = this;
            }

            @Override // defpackage.r8n
            public final void a(View view) {
                c7o c7oVar;
                byte b22 = b2;
                e6o e6oVar = this.b;
                switch (b22) {
                    case 0:
                        a5n a5nVar = e6oVar.g;
                        Drawable drawable = ((x6o) a5nVar).c.getDrawable();
                        c7oVar = drawable instanceof c7o ? (c7o) drawable : null;
                        if (c7oVar != null) {
                            c7oVar.a(f03.t(2130969300, ((x6o) a5nVar).c.getContext(), 2131101243));
                            break;
                        }
                        break;
                    default:
                        a5n a5nVar2 = e6oVar.g;
                        Drawable drawable2 = ((x6o) a5nVar2).g.getDrawable();
                        c7oVar = drawable2 instanceof c7o ? (c7o) drawable2 : null;
                        if (c7oVar != null) {
                            c7oVar.a(f03.t(2130969300, ((x6o) a5nVar2).g.getContext(), 2131101243));
                            break;
                        }
                        break;
                }
            }
        };
        dll dllVarS2 = q9n.s(imageView2);
        if (dllVarS2 == null) {
            return;
        }
        u8n.b(dllVarS2, imageView2, r8nVar2);
    }

    @Override // defpackage.d7o
    public final void b0(a5n a5nVar, p6o p6oVar) {
        final x6o x6oVar = (x6o) a5nVar;
        final i6o i6oVar = (i6o) p6oVar;
        ImageView imageView = x6oVar.c;
        Context context = imageView.getContext();
        r7o r7oVar = r7o.h;
        imageView.setImageDrawable(c0(context, r7oVar.d.f(x6oVar.c.getContext())));
        OperaTextView operaTextView = x6oVar.d;
        operaTextView.setText(r7oVar.c.a(operaTextView.getResources()));
        final byte b = 0;
        x6oVar.b.setOnClickListener(new View.OnClickListener() { // from class: c6o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                x6o x6oVar2 = x6oVar;
                i6o i6oVar2 = i6oVar;
                switch (b2) {
                    case 0:
                        oyj oyjVar = i6oVar2.g;
                        Context context2 = x6oVar2.b.getContext();
                        avj avjVar = r7o.e;
                        oyjVar.invoke(context2, 115783L);
                        break;
                    default:
                        oyj oyjVar2 = i6oVar2.g;
                        Context context3 = x6oVar2.f.getContext();
                        avj avjVar2 = r7o.e;
                        oyjVar2.invoke(context3, 115770L);
                        break;
                }
            }
        });
        ImageView imageView2 = x6oVar.g;
        Context context2 = imageView2.getContext();
        r7o r7oVar2 = r7o.i;
        imageView2.setImageDrawable(c0(context2, r7oVar2.d.f(imageView2.getContext())));
        OperaTextView operaTextView2 = x6oVar.h;
        operaTextView2.setText(r7oVar2.c.a(operaTextView2.getResources()));
        final byte b2 = 1;
        x6oVar.f.setOnClickListener(new View.OnClickListener() { // from class: c6o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b22 = b2;
                x6o x6oVar2 = x6oVar;
                i6o i6oVar2 = i6oVar;
                switch (b22) {
                    case 0:
                        oyj oyjVar = i6oVar2.g;
                        Context context22 = x6oVar2.b.getContext();
                        avj avjVar = r7o.e;
                        oyjVar.invoke(context22, 115783L);
                        break;
                    default:
                        oyj oyjVar2 = i6oVar2.g;
                        Context context3 = x6oVar2.f.getContext();
                        avj avjVar2 = r7o.e;
                        oyjVar2.invoke(context3, 115770L);
                        break;
                }
            }
        });
    }

    public final c7o c0(Context context, Drawable drawable) {
        Bitmap bitmap;
        int iT = f03.t(2130969300, context, 2131101243);
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        if (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) {
            return null;
        }
        hq4 hq4Var = new hq4(bitmap, -1);
        float f = this.l;
        c7o c7oVar = new c7o(new Drawable[]{hq4Var, new p05(f, iT, -1)});
        int i = this.k;
        int i2 = (int) (i - (2.0f * f));
        c7oVar.setLayerGravity(0, 17);
        c7oVar.setLayerSize(0, i2, i2);
        c7oVar.setLayerGravity(1, 17);
        c7oVar.setLayerSize(1, i, i);
        return c7oVar;
    }
}
