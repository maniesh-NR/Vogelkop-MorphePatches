package defpackage;

import android.content.Intent;
import android.graphics.PointF;
import androidx.fragment.app.r;
import com.opera.hype.image.editor.EditImage;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class x7n extends l7n {
    public final ArrayList b = new ArrayList();

    public final void f(Object obj) {
        boolean z;
        PointF pointF;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            ywa ywaVar = ((twa) obj2).a;
            ixa ixaVar = (ixa) obj;
            xtb[] xtbVarArr = ywa.g;
            if (ixaVar instanceof gxa) {
                ((bz0) ywaVar.d.getValue()).show();
            } else if (ixaVar instanceof exa) {
                r rVarRequireActivity = ywaVar.requireActivity();
                Intent intent = ((exa) ixaVar).a;
                if (intent != null) {
                    rVarRequireActivity.setResult(-1, intent);
                }
                rVarRequireActivity.finish();
            } else if (ixaVar instanceof fxa) {
                ydb ydbVar = ywaVar.h0().e.b.a;
                PointF pointF2 = ydbVar.p;
                ydbVar.p(1.0f, pointF2.x, pointF2.y, 200L);
            } else if (ixaVar instanceof hxa) {
                ywaVar.b = ((hxa) ixaVar).a;
                ((hy7) ywaVar.f.getValue()).show(ywaVar.getParentFragmentManager(), "hy7");
            } else {
                if (!(ixaVar instanceof dxa)) {
                    h9o.p();
                    return;
                }
                EditImage editImage = ywaVar.h0().e;
                dxa dxaVar = (dxa) ixaVar;
                PointF pointF3 = dxaVar.a;
                boolean z2 = dxaVar.b;
                if (pointF3 == null) {
                    pointF3 = new PointF(0.5f, 0.4f);
                }
                PointF pointF4 = pointF3;
                int i2 = editImage.g().a;
                if (z2) {
                    z = false;
                    pointF = new PointF(0.4f, 0.3f);
                } else {
                    z = editImage.g().b;
                    pointF = null;
                }
                oel oelVar = new oel("", pointF4, 1.0f, 0.0f, i2, z, pointF, editImage.g().c, z2, editImage.g().d, editImage.g().e, editImage.g().f);
                bfl bflVarB = editImage.b(oelVar);
                oelVar.d(new cv2(oelVar, bflVarB, (byte) 26));
                editImage.a(bflVarB, !z2);
            }
        }
    }
}
