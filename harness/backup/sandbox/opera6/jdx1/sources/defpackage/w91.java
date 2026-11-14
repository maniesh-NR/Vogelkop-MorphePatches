package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class w91 {
    public static final hp7 a = new hp7(new lb((byte) 12), (byte) 0);
    public static final hp7 b = new hp7(new be8((byte) 9), (byte) 0);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Type inference failed for: r5v10, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.fog r22, kotlin.jvm.functions.Function0 r23, defpackage.gog r24, defpackage.ue5 r25, defpackage.ih5 r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w91.a(fog, kotlin.jvm.functions.Function0, gog, ue5, ih5, int, int):void");
    }

    public static final void b(td3 td3Var, Function0 function0, gog gogVar, ue5 ue5Var, ih5 ih5Var, int i) {
        ue5 ue5Var2;
        gog gogVar2;
        Function0 function02;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(71005054);
        int i2 = i | 48;
        if (vt9Var.N(i2 & 1, (i2 & 9363) != 9362)) {
            boolean zD = vt9Var.d(gogVar.f) | vt9Var.f(null);
            Object objK = vt9Var.K();
            if (zD || objK == hh5.a) {
                objK = new yz0(td3Var);
                vt9Var.g0(objK);
            }
            a((yz0) objK, function0, gogVar, ue5Var, vt9Var, 3504, 0);
            function02 = function0;
            gogVar2 = gogVar;
            ue5Var2 = ue5Var;
        } else {
            ue5Var2 = ue5Var;
            gogVar2 = gogVar;
            function02 = function0;
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new px0(td3Var, function02, gogVar2, ue5Var2, i);
        }
    }

    public static final boolean c(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}
