package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import com.opera.android.suggestion.adapter.SuggestionListItem;

/* loaded from: classes.dex */
public final class e3g implements acl {
    public final /* synthetic */ byte a;
    public final Object b;
    public Object c;

    public e3g(ImageView imageView) {
        this.a = (byte) 1;
        this.b = imageView;
    }

    public /* synthetic */ e3g(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public e3g(kol kolVar, qnl qnlVar, Uri uri) {
        this.a = (byte) 3;
        this.b = kolVar;
        this.c = qnlVar;
    }

    private final void d(Exception exc, Drawable drawable) {
    }

    private final void e(Drawable drawable) {
    }

    private final void f(Drawable drawable) {
    }

    public final void a(Exception exc, Drawable drawable) throws Exception {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                f3g f3gVar = (f3g) obj;
                f3gVar.h = null;
                f3gVar.g.run();
                break;
            case 1:
                ((q2g) this.c).run();
                break;
            case 2:
                break;
            default:
                ((kol) obj).k.remove(this);
                ((qnl) this.c).invoke(null);
                break;
        }
    }

    public final void b(Drawable drawable) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((f3g) obj).b.z(new mxh(new ColorDrawable(0)));
                break;
            case 2:
                if (drawable != null) {
                    ((SuggestionListItem) obj).z(new mxh(drawable));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [android.view.View, com.opera.android.suggestion.adapter.SuggestionListItem, com.opera.android.ui.catalog.widget.OperaListItem] */
    public final void c(Bitmap bitmap, int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                f3g f3gVar = (f3g) obj;
                f3gVar.h = null;
                ?? r9 = f3gVar.b;
                Context context = r9.getContext();
                int i2 = f3gVar.e;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{2130970235});
                int i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
                typedArrayObtainStyledAttributes.recycle();
                uq8 uq8Var = new uq8(context, gjf.a(context), i3, bitmap);
                uq8Var.setBounds(0, 0, i2, i2);
                r9.z(new mxh(uq8Var));
                f3gVar.f.D(((fqk) this.c).c);
                break;
            case 1:
                ImageView imageView = (ImageView) obj;
                Context context2 = imageView.getContext();
                TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(new int[]{2130970235});
                int i4 = typedArrayObtainStyledAttributes2.getInt(0, 0);
                typedArrayObtainStyledAttributes2.recycle();
                imageView.setImageDrawable(new uq8(context2, gjf.a(context2), i4, bitmap));
                break;
            case 2:
                float f = ((zri) this.c).h;
                float width = bitmap.getWidth();
                float height = bitmap.getHeight();
                int iMin = (int) ((Math.min(width, height) / Math.max(width, height)) * f);
                PathInterpolator pathInterpolator = s8i.d;
                ((SuggestionListItem) obj).z(new mxh(new q8i(bitmap, iMin, iMin)));
                break;
            default:
                ((kol) obj).k.remove(this);
                ((qnl) this.c).invoke(bitmap);
                break;
        }
    }
}
