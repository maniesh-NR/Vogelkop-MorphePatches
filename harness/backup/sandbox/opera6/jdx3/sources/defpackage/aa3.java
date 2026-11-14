package defpackage;

import android.graphics.PointF;

/* loaded from: classes.dex */
public final class aa3 extends a7f {
    public final /* synthetic */ byte c;
    public final /* synthetic */ ba3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aa3(Object obj, ba3 ba3Var, byte b) {
        super(obj);
        this.c = b;
        this.d = ba3Var;
    }

    @Override // defpackage.a7f
    public final void a(Object obj, Object obj2) {
        byte b = this.c;
        ba3 ba3Var = this.d;
        switch (b) {
            case 0:
                ba3Var.c(2131363166, (String) obj, (String) obj2);
                break;
            case 1:
                PointF pointF = (PointF) obj2;
                PointF pointF2 = (PointF) obj;
                if (Math.abs(pointF2.x - pointF.x) >= 0.001f || Math.abs(pointF2.y - pointF.y) >= 0.001f) {
                    ba3Var.c(2131363161, pointF2, pointF);
                    break;
                }
                break;
            case 2:
                float fFloatValue = ((Number) obj2).floatValue();
                float fFloatValue2 = ((Number) obj).floatValue();
                if (!c26.C(fFloatValue2, fFloatValue)) {
                    ba3Var.c(2131363163, Float.valueOf(fFloatValue2), Float.valueOf(fFloatValue));
                    break;
                }
                break;
            default:
                float fFloatValue3 = ((Number) obj2).floatValue();
                float fFloatValue4 = ((Number) obj).floatValue();
                if (!c26.C(fFloatValue4, fFloatValue3)) {
                    ba3Var.c(2131363162, Float.valueOf(fFloatValue4), Float.valueOf(fFloatValue3));
                    break;
                }
                break;
        }
    }
}
