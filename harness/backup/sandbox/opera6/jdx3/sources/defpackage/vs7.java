package defpackage;

import android.view.View;
import com.opera.android.sheet.OperaBottomSheetBehavior;
import com.opera.hype.image.editor.EditImage;

/* loaded from: classes.dex */
public final /* synthetic */ class vs7 implements View.OnLayoutChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vs7(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                bfl bflVar = (bfl) obj;
                bpd bpdVar = ((EditImage) obj2).g;
                i97 i97Var = (i97) bpdVar.c;
                if (i97Var.c((EditImage) bpdVar.b)) {
                    xtb[] xtbVarArr = EditImage.s;
                    bflVar.d(i97Var);
                    break;
                }
                break;
            default:
                knh knhVar = (knh) obj2;
                OperaBottomSheetBehavior operaBottomSheetBehavior = (OperaBottomSheetBehavior) obj;
                if (i4 - i2 != i8 - i6) {
                    knhVar.H0(operaBottomSheetBehavior);
                    break;
                }
                break;
        }
    }
}
