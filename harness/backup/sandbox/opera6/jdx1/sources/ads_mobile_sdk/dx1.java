package ads_mobile_sdk;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class dx1 extends ozb implements Function0 {
    public final /* synthetic */ hv0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ double c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dx1(hv0 hv0Var, String str, double d, int i, int i2) {
        super(0);
        this.a = hv0Var;
        this.b = str;
        this.c = d;
        this.d = i;
        this.e = i2;
    }

    public final Object invoke() {
        return new zf1(new BitmapDrawable(Resources.getSystem(), (Bitmap) this.a.b), Uri.parse(this.b), this.c, this.d, this.e);
    }
}
