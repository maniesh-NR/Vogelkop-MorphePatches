package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ofh extends an8 {
    public final Intent b;

    public ofh(zcj zcjVar, Intent intent) {
        super(zcjVar);
        this.b = intent;
    }

    @Override // defpackage.wcj
    public final void a(Context context) {
        this.a.e(".qr_share");
        wzg wzgVar = new wzg(null, gcj.class, (byte) 4);
        Bitmap.CompressFormat compressFormat = gcj.y;
        Bundle bundle = new Bundle();
        bundle.putParcelable("share_intent", this.b);
        new zhj(wzgVar, bundle, 1, -1, null, false, Arrays.asList(new n6h[0])).c(context);
    }

    @Override // defpackage.wcj
    public final Drawable b(Context context) {
        return w8h.u(2131232200, context);
    }

    @Override // defpackage.wcj
    public final CharSequence d(Context context) {
        return context.getString(2132020587);
    }

    @Override // defpackage.an8
    public final Icon e(Context context) {
        return Icon.createWithResource(context, 2131232200);
    }

    @Override // defpackage.wcj
    public final String getId() {
        return ".qr_share";
    }
}
