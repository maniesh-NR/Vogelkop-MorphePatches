package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* loaded from: classes.dex */
public final class smo implements zhp {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ smo(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.zhp
    public final void a(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ImageView imageView = (ImageView) obj;
                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                imageView.setImageBitmap(bbp.IMAGE_PLACEHOLDER.h());
                break;
            case 1:
                t8p t8pVar = (t8p) obj;
                t8pVar.y = null;
                upj.j(t8pVar.v);
                break;
            default:
                ((g94) obj).l(false);
                break;
        }
    }

    @Override // defpackage.zhp
    public final void b(Bitmap bitmap, Drawable drawable, boolean z) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ImageView imageView = (ImageView) obj;
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                upj.h(imageView, bitmap, drawable);
                break;
            case 1:
                upj.h(((t8p) obj).v, bitmap, drawable);
                break;
            default:
                ((g94) obj).l(Boolean.valueOf((bitmap == null && drawable == null) ? false : true));
                break;
        }
    }
}
