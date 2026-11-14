package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.ImageView;
import com.opera.android.custom_views.Spinner;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class ecj implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gcj b;

    public /* synthetic */ ecj(gcj gcjVar, byte b) {
        this.a = b;
        this.b = gcjVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        gcj gcjVar = this.b;
        ijm ijmVar = ijm.b;
        switch (b) {
            case 0:
                Bitmap bitmap = (Bitmap) obj;
                pt1 pt1Var = gcjVar.x;
                if (pt1Var == null) {
                    pt1Var = null;
                }
                ((Spinner) pt1Var.g).animate().alpha(0.0f);
                pt1 pt1Var2 = gcjVar.x;
                if (pt1Var2 == null) {
                    pt1Var2 = null;
                }
                ((ImageView) pt1Var2.e).animate().alpha(1.0f);
                pt1 pt1Var3 = gcjVar.x;
                ((ImageView) (pt1Var3 != null ? pt1Var3 : null).e).setImageBitmap(bitmap);
                if (bitmap == null) {
                    ysj ysjVar = gcjVar.v;
                    ysjVar.b(am2.i(2132019200, 2500, ysjVar), ijmVar);
                }
                break;
            case 1:
                fcj fcjVar = (fcj) obj;
                if (fcjVar != null) {
                    Uri uriX = fcjVar.c;
                    if (s29.g(uriX)) {
                        uriX = w7d.x(fcjVar.b);
                    }
                    new ghf(new i4d(new vvf(uriX, "image/png", (byte) 19))).I(gcjVar.r);
                } else {
                    ysj ysjVar2 = gcjVar.v;
                    ysjVar2.b(am2.i(2132019292, 2500, ysjVar2), ijmVar);
                }
                break;
            default:
                fcj fcjVar2 = (fcj) obj;
                if (fcjVar2 != null) {
                    nej nejVar = gcjVar.u;
                    zfe zfeVar = new zfe(gcjVar, fcjVar2);
                    nejVar.getClass();
                    nejVar.b(zfeVar, ijmVar);
                } else {
                    ysj ysjVar3 = gcjVar.v;
                    glj gljVar = new glj(2132019290, 2500);
                    ysjVar3.getClass();
                    ysjVar3.b(gljVar, ijmVar);
                }
                break;
        }
        return Unit.a;
    }
}
