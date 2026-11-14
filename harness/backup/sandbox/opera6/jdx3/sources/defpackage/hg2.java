package defpackage;

import com.opera.android.startpage.layout.feed_specific.HiddenStartPageContentHintView;

/* loaded from: classes.dex */
public final /* synthetic */ class hg2 implements j3d {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hg2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void onResult(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ig2 ig2Var = (ig2) obj2;
                ig2Var.o((p2d) obj);
                ig2Var.invalidateSelf();
                break;
            case 1:
                HiddenStartPageContentHintView hiddenStartPageContentHintView = (HiddenStartPageContentHintView) obj2;
                rxh rxhVar = HiddenStartPageContentHintView.p;
                f3d f3dVar = new f3d();
                f3dVar.o((p2d) obj);
                f3dVar.b.setRepeatCount(0);
                f3dVar.setCallback(hiddenStartPageContentHintView);
                hiddenStartPageContentHintView.j = f3dVar;
                hiddenStartPageContentHintView.i = f3dVar;
                hiddenStartPageContentHintView.a(false);
                if (hiddenStartPageContentHintView.n) {
                    hiddenStartPageContentHintView.n = false;
                    f3d f3dVar2 = hiddenStartPageContentHintView.j;
                    if (f3dVar2 != null) {
                        f3dVar2.p(0);
                        f3dVar2.k();
                    } else {
                        hiddenStartPageContentHintView.n = true;
                    }
                }
                hiddenStartPageContentHintView.invalidate();
                break;
            case 2:
                ((lvk) obj2).o((p2d) obj);
                break;
            default:
                ocn ocnVar = (ocn) obj2;
                ncn ncnVar = ocnVar.a;
                ncnVar.o((p2d) obj);
                ocnVar.T();
                if (((f3d) ncnVar).a != null) {
                    int iA = vep.A(ocnVar.g);
                    if (iA != 0) {
                        if (iA == 1) {
                            ocnVar.S(ocn.m);
                            break;
                        } else if (iA == 2) {
                            ocnVar.S(ocn.k);
                            break;
                        } else if (iA != 3) {
                        }
                    }
                    ocnVar.h = null;
                    break;
                }
                break;
        }
    }
}
