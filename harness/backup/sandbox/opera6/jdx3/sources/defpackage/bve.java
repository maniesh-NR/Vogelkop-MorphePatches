package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class bve extends cve {
    public final /* synthetic */ byte h;
    public final kf i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bve(View view, ro9 ro9Var, uqe uqeVar, vue vueVar, vue vueVar2, dmg dmgVar, final x5f x5fVar, byte b) {
        super(view, ro9Var, uqeVar, vueVar, vueVar2, dmgVar);
        this.h = b;
        switch (b) {
            case 1:
                super(view, ro9Var, uqeVar, vueVar, vueVar2, dmgVar);
                this.i = kf.d(view);
                final byte b2 = 1;
                this.e.o(new z6b(new Function0() { // from class: ave
                    public final Object invoke() {
                        byte b3 = b2;
                        x5f x5fVar2 = x5fVar;
                        switch (b3) {
                            case 0:
                                if (x5fVar2.h) {
                                    x5fVar2.w(f90.d, 1);
                                }
                                break;
                            default:
                                if (x5fVar2.h) {
                                    x5fVar2.w(f90.c, 1);
                                }
                                break;
                        }
                        return Unit.a;
                    }
                }));
                break;
            default:
                this.i = kf.d(view);
                final byte b3 = 0;
                this.e.o(new z6b(new Function0() { // from class: ave
                    public final Object invoke() {
                        byte b32 = b3;
                        x5f x5fVar2 = x5fVar;
                        switch (b32) {
                            case 0:
                                if (x5fVar2.h) {
                                    x5fVar2.w(f90.d, 1);
                                }
                                break;
                            default:
                                if (x5fVar2.h) {
                                    x5fVar2.w(f90.c, 1);
                                }
                                break;
                        }
                        return Unit.a;
                    }
                }));
                break;
        }
    }

    @Override // defpackage.cve
    public final View[] f0() {
        byte b = this.h;
        kf kfVar = this.i;
        switch (b) {
            case 0:
                return new View[]{(ConstraintLayout) kfVar.c};
            default:
                return new View[]{(ConstraintLayout) kfVar.c};
        }
    }
}
