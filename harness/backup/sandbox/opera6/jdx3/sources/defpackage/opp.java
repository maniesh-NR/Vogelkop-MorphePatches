package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgChannel;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType;
import com.google.ads.interactivemedia.v3.impl.data.zzaz;
import com.google.ads.interactivemedia.v3.internal.zzfe;
import com.google.ads.interactivemedia.v3.internal.zzou;
import com.google.ads.interactivemedia.v3.internal.zzqj;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class opp extends ImageView implements View.OnClickListener {
    public final zzaz a;
    public final wpp b;
    public final String c;
    public final ArrayList d;
    public final zzfe e;

    public opp(Context context, wpp wppVar, zzaz zzazVar, String str, ArrayList arrayList, zzfe zzfeVar) {
        super(context);
        this.b = wppVar;
        this.a = zzazVar;
        this.c = str;
        this.d = arrayList;
        this.e = zzfeVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.e.a(this.a.a())) {
            Iterator it = this.d.iterator();
            if (it.hasNext()) {
                throw p3p.g(it);
            }
        }
    }

    @Override // android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        String strB = this.a.b();
        if (zzou.b(strB)) {
            return;
        }
        String str = this.c;
        if (zzou.b(str)) {
            return;
        }
        HashMap mapA = zzqj.a(1);
        mapA.put("companionId", strB);
        this.b.a(new wmb(JavaScriptMessage$MsgChannel.displayContainer, JavaScriptMessage$MsgType.companionView, str, mapA));
    }
}
