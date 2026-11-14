package com.leanplum.messagetemplates;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.leanplum.internal.Constants;
import com.leanplum.internal.ResourceQualifiers;
import com.leanplum.messagetemplates.ComposableSingletons;
import com.leanplum.messagetemplates.OperaSubscriptionDialogRequest;
import com.leanplum.messagetemplates.OperaSubscriptionDialogRequestKt;
import defpackage.bif;
import defpackage.c39;
import defpackage.cif;
import defpackage.dg0;
import defpackage.dif;
import defpackage.jof;
import defpackage.nof;
import defpackage.pta;
import defpackage.rmf;
import defpackage.rof;
import defpackage.smf;
import defpackage.vme;
import defpackage.y4h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001aO\u0010\b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0003¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlin/Function0;", "", "onDismissRequest", "Lcom/leanplum/messagetemplates/OperaSubscriptionDialogRequest$Model;", "model", "onPrimaryButtonClicked", "onSecondaryButtonClicked", "onCloseButtonClicked", "SubscriptionDialog", "(Lkotlin/jvm/functions/Function0;Lcom/leanplum/messagetemplates/OperaSubscriptionDialogRequest$Model;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lih5;I)V", "SubscriptionDialogPreview", "(Lih5;I)V", "app"}, k = 2, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OperaSubscriptionDialogRequestKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void SubscriptionDialog(Function0<Unit> function0, OperaSubscriptionDialogRequest.Model model, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, ih5 ih5Var, int i) {
        int i2;
        OperaSubscriptionDialogRequest.Model model2;
        Function0<Unit> function05;
        Function0<Unit> function06;
        Function0<Unit> function07;
        ih5 ih5Var2;
        ih5 ih5Var3 = (vt9) ih5Var;
        ih5Var3.Y(685733228);
        if ((i & 6) == 0) {
            i2 = (ih5Var3.h(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? ih5Var3.f(model) : ih5Var3.h(model) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ih5Var3.h(function02) ? Constants.Crypt.KEY_LENGTH : ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL;
        }
        if ((i & 3072) == 0) {
            i2 |= ih5Var3.h(function03) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ih5Var3.h(function04) ? 16384 : 8192;
        }
        if (ih5Var3.N(i2 & 1, (i2 & 9363) != 9362)) {
            nof nofVar = nof.j;
            model2 = model;
            function07 = function04;
            function05 = function02;
            function06 = function03;
            ue5 ue5VarP = gyg.P(740933383, new c39(function0, model2, function04, function02, function03, (byte) 4), ih5Var3);
            ih5Var2 = ih5Var3;
            rof.c(nofVar, false, ue5VarP, ih5Var2, 390, 2);
        } else {
            model2 = model;
            function05 = function02;
            function06 = function03;
            function07 = function04;
            ih5Var2 = ih5Var3;
            ih5Var2.Q();
        }
        znh znhVarR = ih5Var2.r();
        if (znhVarR != null) {
            znhVarR.d = new lc1(function0, model2, function05, function06, function07, i, (byte) 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SubscriptionDialog$lambda$0(Function0 function0, OperaSubscriptionDialogRequest.Model model, Function0 function02, Function0 function03, Function0 function04, ih5 ih5Var, int i) {
        vt9 vt9Var = (vt9) ih5Var;
        if (vt9Var.N(i & 1, (i & 3) != 2)) {
            yi4.g(function0, (c8e) null, false, false, 0L, (u8i) null, gyg.P(1214675773, new px0(model, function02, function03, function04, (byte) 11), vt9Var), vt9Var, 1573248, 58);
        } else {
            vt9Var.Q();
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SubscriptionDialog$lambda$0$0(final OperaSubscriptionDialogRequest.Model model, Function0 function0, final Function0 function02, final Function0 function03, ih5 ih5Var, int i) {
        ue5 ue5Var;
        ue5 ue5Var2;
        final byte b = 1;
        final byte b2 = 0;
        vt9 vt9Var = (vt9) ih5Var;
        if (vt9Var.N(i & 1, (i & 3) != 2)) {
            tfd tfdVarC = nr3.c(rbe.b, false);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            z7e z7eVar = z7e.b;
            c8e c8eVarP = qyn.P(vt9Var, z7eVar);
            bh5.To.getClass();
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(m3c.S);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, tfdVarC, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            y4h.o(vt9Var, Integer.valueOf(iHashCode), ujp.g);
            y4h.m(vt9Var);
            y4h.o(vt9Var, c8eVarP, ujp.d);
            dif bifVar = null;
            if (model.getPrimaryButton() == null) {
                vt9Var.W(1814010313);
                vt9Var.p(false);
                ue5Var = null;
            } else {
                vt9Var.W(1814010314);
                ue5 ue5VarP = gyg.P(745014683, new Function2() { // from class: iof
                    public final Object invoke(Object obj, Object obj2) {
                        byte b3 = b;
                        Function0 function04 = function02;
                        OperaSubscriptionDialogRequest.Model model2 = model;
                        ih5 ih5Var2 = (ih5) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        switch (b3) {
                            case 0:
                                return OperaSubscriptionDialogRequestKt.SubscriptionDialog$lambda$0$0$0$1$0(model2, function04, ih5Var2, iIntValue);
                            default:
                                return OperaSubscriptionDialogRequestKt.SubscriptionDialog$lambda$0$0$0$0$0(model2, function04, ih5Var2, iIntValue);
                        }
                    }
                }, vt9Var);
                vt9Var.p(false);
                ue5Var = ue5VarP;
            }
            if (model.getSecondaryButton() == null) {
                vt9Var.W(1814569925);
                vt9Var.p(false);
                ue5Var2 = null;
            } else {
                vt9Var.W(1814569926);
                ue5 ue5VarP2 = gyg.P(-1232263410, new Function2() { // from class: iof
                    public final Object invoke(Object obj, Object obj2) {
                        byte b3 = b2;
                        Function0 function04 = function03;
                        OperaSubscriptionDialogRequest.Model model2 = model;
                        ih5 ih5Var2 = (ih5) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        switch (b3) {
                            case 0:
                                return OperaSubscriptionDialogRequestKt.SubscriptionDialog$lambda$0$0$0$1$0(model2, function04, ih5Var2, iIntValue);
                            default:
                                return OperaSubscriptionDialogRequestKt.SubscriptionDialog$lambda$0$0$0$0$0(model2, function04, ih5Var2, iIntValue);
                        }
                    }
                }, vt9Var);
                vt9Var.p(false);
                ue5Var2 = ue5VarP2;
            }
            Bitmap bitmap = model.getResourceWrapper().image;
            Object obj = hh5.a;
            if (bitmap == null) {
                vt9Var.W(1815125352);
                vt9Var.p(false);
            } else {
                vt9Var.W(1815125353);
                boolean zF = vt9Var.f(bitmap);
                Object objK = vt9Var.K();
                if (zF || objK == obj) {
                    objK = new yg3(new j71(bitmap));
                    vt9Var.g0(objK);
                }
                bifVar = new bif((yg3) objK);
                vt9Var.p(false);
            }
            if (bifVar == null) {
                bifVar = cif.a;
            }
            j14.h((c8e) null, bifVar, model.getTitle(), model.getMessage(), ue5Var, ue5Var2, 0L, 0L, 3, 0, 3, model.getFullWidthButtons(), vt9Var, 0, 705);
            if (model.getCloseButtonAction() != null) {
                vt9Var.W(1815753227);
                c8e c8eVarH = mpj.h(i41.U(a26.X(as3.a.a(z7eVar, rbe.d), 14.0f), -2.0f, 2.0f), 20.0f);
                pta ptaVarH = scd.H(vt9Var);
                unf unfVar = pof.a;
                pta ptaVarB = pta.b(ptaVarH, pof.a(vt9Var).a.y(), pof.a(vt9Var).a.w(), 0L, 12);
                boolean zH = vt9Var.h(model) | vt9Var.f(function0);
                Object objK2 = vt9Var.K();
                if (zH || objK2 == obj) {
                    objK2 = new jof(model, function0, b2);
                    vt9Var.g0(objK2);
                }
                f03.a((Function0) objK2, c8eVarH, false, ptaVarB, (paj) null, ComposableSingletons.OperaSubscriptionDialogRequestKt.INSTANCE.getLambda$1670485052$app(), vt9Var, 1572864, 52);
                vt9Var.p(false);
            } else {
                vt9Var.W(1816774367);
                vt9Var.p(false);
            }
            vt9Var.p(true);
        } else {
            vt9Var.Q();
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SubscriptionDialog$lambda$0$0$0$0$0(OperaSubscriptionDialogRequest.Model model, Function0 function0, ih5 ih5Var, int i) {
        byte b = 2;
        vt9 vt9Var = (vt9) ih5Var;
        if (vt9Var.N(i & 1, (i & 3) != 2)) {
            boolean zH = vt9Var.h(model) | vt9Var.f(function0);
            Object objK = vt9Var.K();
            if (zH || objK == hh5.a) {
                objK = new jof(model, function0, b);
                vt9Var.g0(objK);
            }
            scd.f((Function0) objK, model.getPrimaryButton().getLabel(), (c8e) null, false, false, smf.a, (rmf) null, (z14) null, (go3) null, (ez3) null, (hyf) null, (u95) null, (c8e) null, (zvf) null, vt9Var, 196608, 0, 16348);
        } else {
            vt9Var.Q();
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SubscriptionDialog$lambda$0$0$0$0$0$0$0(OperaSubscriptionDialogRequest.Model model, Function0 function0) {
        model.getPrimaryButton().getAction().invoke();
        function0.invoke();
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SubscriptionDialog$lambda$0$0$0$1$0(OperaSubscriptionDialogRequest.Model model, Function0 function0, ih5 ih5Var, int i) {
        byte b = 1;
        vt9 vt9Var = (vt9) ih5Var;
        if (vt9Var.N(i & 1, (i & 3) != 2)) {
            boolean zH = vt9Var.h(model) | vt9Var.f(function0);
            Object objK = vt9Var.K();
            if (zH || objK == hh5.a) {
                objK = new jof(model, function0, b);
                vt9Var.g0(objK);
            }
            scd.f((Function0) objK, model.getSecondaryButton().getLabel(), (c8e) null, false, false, smf.d, (rmf) null, (z14) null, (go3) null, (ez3) null, (hyf) null, (u95) null, (c8e) null, (zvf) null, vt9Var, 196608, 0, 16348);
        } else {
            vt9Var.Q();
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SubscriptionDialog$lambda$0$0$0$1$0$0$0(OperaSubscriptionDialogRequest.Model model, Function0 function0) {
        model.getSecondaryButton().getAction().invoke();
        function0.invoke();
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SubscriptionDialog$lambda$0$0$0$3$0(OperaSubscriptionDialogRequest.Model model, Function0 function0) {
        model.getCloseButtonAction().invoke();
        function0.invoke();
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SubscriptionDialog$lambda$1(Function0 function0, OperaSubscriptionDialogRequest.Model model, Function0 function02, Function0 function03, Function0 function04, int i, ih5 ih5Var, int i2) {
        SubscriptionDialog(function0, model, function02, function03, function04, ih5Var, aoh.m(i | 1));
        return Unit.a;
    }

    private static final void SubscriptionDialogPreview(ih5 ih5Var, int i) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1588348773);
        if (vt9Var.N(i & 1, i != 0)) {
            Object objK = vt9Var.K();
            Object obj = hh5.a;
            if (objK == obj) {
                objK = new vme((byte) 25);
                vt9Var.g0(objK);
            }
            Function0 function0 = (Function0) objK;
            Object objK2 = vt9Var.K();
            if (objK2 == obj) {
                objK2 = new vme((byte) 26);
                vt9Var.g0(objK2);
            }
            OperaSubscriptionDialogRequest.Button button = new OperaSubscriptionDialogRequest.Button("Activate 70% discount", (Function0) objK2);
            Object objK3 = vt9Var.K();
            if (objK3 == obj) {
                objK3 = new vme((byte) 27);
                vt9Var.g0(objK3);
            }
            OperaSubscriptionDialogRequest.Button button2 = new OperaSubscriptionDialogRequest.Button("Not now", (Function0) objK3);
            ResourceWrapper resourceWrapper = new ResourceWrapper(BitmapFactory.decodeResource((Resources) vt9Var.j(j41.c), 2131231359), null, dg0.b);
            Object objK4 = vt9Var.K();
            if (objK4 == obj) {
                objK4 = new vme((byte) 28);
                vt9Var.g0(objK4);
            }
            OperaSubscriptionDialogRequest.Model model = new OperaSubscriptionDialogRequest.Model("test", "Don't browse unprotected", "70% off VPN Pro for one week only.", button, button2, resourceWrapper, true, (Function0) objK4);
            Object objK5 = vt9Var.K();
            if (objK5 == obj) {
                objK5 = new vme((byte) 29);
                vt9Var.g0(objK5);
            }
            Function0 function02 = (Function0) objK5;
            Object objK6 = vt9Var.K();
            if (objK6 == obj) {
                objK6 = new kof((byte) 0);
                vt9Var.g0(objK6);
            }
            Function0 function03 = (Function0) objK6;
            Object objK7 = vt9Var.K();
            if (objK7 == obj) {
                objK7 = new kof((byte) 1);
                vt9Var.g0(objK7);
            }
            SubscriptionDialog(function0, model, function02, function03, (Function0) objK7, vt9Var, (ResourceWrapper.$stable << 3) | 28038);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new gda((byte) 3, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SubscriptionDialogPreview$lambda$7(int i, ih5 ih5Var, int i2) {
        SubscriptionDialogPreview(ih5Var, aoh.m(i | 1));
        return Unit.a;
    }
}
