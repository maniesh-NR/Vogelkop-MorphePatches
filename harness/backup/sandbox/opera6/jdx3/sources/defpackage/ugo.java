package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.opera.ad.interstitial.AdActivity;
import java.util.Locale;

/* loaded from: classes.dex */
public final class ugo implements zhp {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public ugo(ImageView imageView, AdActivity adActivity) {
        this.a = (byte) 0;
        this.b = imageView;
        this.c = adActivity;
    }

    public /* synthetic */ ugo(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    @Override // defpackage.zhp
    public final void a(int i) {
        byte b = this.a;
        Object obj = this.b;
        bbp bbpVar = bbp.IMAGE_PLACEHOLDER;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ((ImageView) obj).setImageDrawable(bbpVar.d((AdActivity) obj2));
                Locale locale = Locale.US;
                break;
            case 1:
                ((ImageView) obj).setImageDrawable(bbpVar.d(((lro) obj2).y));
                Locale locale2 = Locale.US;
                break;
            default:
                u2p u2pVar = (u2p) obj2;
                u2pVar.u.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                u2pVar.u.setImageBitmap(bbpVar.h());
                break;
        }
    }

    @Override // defpackage.zhp
    public final void b(Bitmap bitmap, Drawable drawable, boolean z) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                upj.h((ImageView) obj, bitmap, drawable);
                break;
            case 1:
                upj.h((ImageView) obj, bitmap, drawable);
                break;
            default:
                u2p u2pVar = (u2p) this.c;
                upj.h(u2pVar.u, bitmap, drawable);
                u2pVar.u.setScaleType((ImageView.ScaleType) obj);
                u2pVar.v(u2pVar.u);
                break;
        }
    }
}
