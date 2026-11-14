package defpackage;

import J.N;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import com.opera.android.browser.passwordmanager.PasswordManagerDialogRequest;

/* loaded from: classes.dex */
public final class v4g extends cej {
    public final /* synthetic */ byte a = 1;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;

    public v4g(p94 p94Var, qsh qshVar, Bitmap bitmap) {
        this.c = p94Var;
        this.d = qshVar;
        this.e = bitmap;
    }

    public v4g(s9i s9iVar, odf odfVar, boolean z, lld lldVar) {
        this.c = s9iVar;
        this.d = odfVar;
        this.b = z;
        this.e = lldVar;
    }

    @Override // defpackage.cej
    public final dej createSheet(mej mejVar, b2l b2lVar) {
        rxh rxhVar;
        eua euaVar;
        rxh rxhVar2;
        eua euaVar2;
        eua euaVar3;
        qxh qxhVar;
        eua euaVar4;
        qxh qxhVar2;
        byte b = 2;
        final byte b2 = 1;
        final byte b3 = 0;
        switch (this.a) {
            case 0:
                final Context context = mejVar.getContext();
                s9i s9iVar = (s9i) this.c;
                eua euaVar5 = new eua(this) { // from class: u4g
                    public final /* synthetic */ v4g b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b4 = b3;
                        Context context2 = context;
                        v4g v4gVar = this.b;
                        switch (b4) {
                            case 0:
                                ((odf) v4gVar.d).l(context2, true);
                                PasswordManagerDialogRequest passwordManagerDialogRequest = (PasswordManagerDialogRequest) ((lld) v4gVar.e).b;
                                if (passwordManagerDialogRequest.d == v4gVar) {
                                    passwordManagerDialogRequest.d = null;
                                    N.M1EqC_CK(passwordManagerDialogRequest.e, true);
                                    break;
                                }
                                break;
                            default:
                                ((odf) v4gVar.d).l(context2, false);
                                PasswordManagerDialogRequest passwordManagerDialogRequest2 = (PasswordManagerDialogRequest) ((lld) v4gVar.e).b;
                                if (passwordManagerDialogRequest2.d == v4gVar) {
                                    passwordManagerDialogRequest2.d = null;
                                    N.M1EqC_CK(passwordManagerDialogRequest2.e, false);
                                    break;
                                }
                                break;
                        }
                    }
                };
                eua euaVar6 = new eua(this) { // from class: u4g
                    public final /* synthetic */ v4g b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b4 = b2;
                        Context context2 = context;
                        v4g v4gVar = this.b;
                        switch (b4) {
                            case 0:
                                ((odf) v4gVar.d).l(context2, true);
                                PasswordManagerDialogRequest passwordManagerDialogRequest = (PasswordManagerDialogRequest) ((lld) v4gVar.e).b;
                                if (passwordManagerDialogRequest.d == v4gVar) {
                                    passwordManagerDialogRequest.d = null;
                                    N.M1EqC_CK(passwordManagerDialogRequest.e, true);
                                    break;
                                }
                                break;
                            default:
                                ((odf) v4gVar.d).l(context2, false);
                                PasswordManagerDialogRequest passwordManagerDialogRequest2 = (PasswordManagerDialogRequest) ((lld) v4gVar.e).b;
                                if (passwordManagerDialogRequest2.d == v4gVar) {
                                    passwordManagerDialogRequest2.d = null;
                                    N.M1EqC_CK(passwordManagerDialogRequest2.e, false);
                                    break;
                                }
                                break;
                        }
                    }
                };
                boolean z = this.b;
                pxh pxhVar = (pxh) s9iVar.c;
                rxh rxhVar3 = (rxh) s9iVar.b;
                rxh rxhVar4 = (rxh) s9iVar.d;
                if (o18.h(context, rxhVar4) == 0) {
                    rxhVar = null;
                    euaVar = null;
                } else {
                    rxhVar = rxhVar4;
                    euaVar = euaVar5;
                }
                rxh rxhVar5 = (rxh) s9iVar.e;
                if (o18.h(context, rxhVar5) == 0) {
                    rxhVar2 = null;
                    euaVar2 = null;
                } else {
                    rxhVar2 = rxhVar5;
                    euaVar2 = euaVar6;
                }
                return new qf(mejVar, new gua(null, new lxh(2131232170), null, null, rxhVar3, pxhVar, null, rxhVar2, euaVar2, rxhVar, euaVar, true, new dxh(2130968821), z, null), b);
            default:
                Context context2 = mejVar.getContext();
                n1 n1Var = (n1) ((qsh) this.d).b;
                qxh qxhVar3 = new qxh(((Resources) n1Var.b).getString(2132020301));
                eua euaVar7 = new eua(this) { // from class: dco
                    public final /* synthetic */ v4g b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b4 = b3;
                        v4g v4gVar = this.b;
                        switch (b4) {
                            case 0:
                                if (!v4gVar.b) {
                                    v4gVar.b = true;
                                    ((qsh) v4gVar.d).e(true);
                                    break;
                                }
                                break;
                            default:
                                if (!v4gVar.b) {
                                    v4gVar.b = true;
                                    ((qsh) v4gVar.d).e(false);
                                    break;
                                }
                                break;
                        }
                    }
                };
                if (qxhVar3.a(context2.getResources()).length() == 0) {
                    qxhVar = null;
                    euaVar3 = null;
                } else {
                    euaVar3 = euaVar7;
                    qxhVar = qxhVar3;
                }
                qxh qxhVar4 = new qxh(n1Var.u());
                eua euaVar8 = new eua(this) { // from class: dco
                    public final /* synthetic */ v4g b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b4 = b2;
                        v4g v4gVar = this.b;
                        switch (b4) {
                            case 0:
                                if (!v4gVar.b) {
                                    v4gVar.b = true;
                                    ((qsh) v4gVar.d).e(true);
                                    break;
                                }
                                break;
                            default:
                                if (!v4gVar.b) {
                                    v4gVar.b = true;
                                    ((qsh) v4gVar.d).e(false);
                                    break;
                                }
                                break;
                        }
                    }
                };
                if (qxhVar4.a(context2.getResources()).length() == 0) {
                    qxhVar2 = null;
                    euaVar4 = null;
                } else {
                    euaVar4 = euaVar8;
                    qxhVar2 = qxhVar4;
                }
                return new qf(mejVar, new gua(((Bitmap) this.e) != null ? new roj(this, context2, (byte) 20) : null, null, null, null, new qxh(((Resources) n1Var.b).getString(2132022706)), null, null, qxhVar2, euaVar4, qxhVar, euaVar3, true, null, false, null), b);
        }
    }

    @Override // defpackage.cej
    public final void onFinished(hjm hjmVar) {
        switch (this.a) {
            case 0:
                if (hjmVar == hjm.b) {
                    PasswordManagerDialogRequest passwordManagerDialogRequest = (PasswordManagerDialogRequest) ((lld) this.e).b;
                    if (passwordManagerDialogRequest.d == this) {
                        passwordManagerDialogRequest.d = null;
                        N.MB6ulApe(passwordManagerDialogRequest.e);
                        break;
                    }
                }
                break;
            default:
                if (!this.b) {
                    this.b = true;
                    ((qsh) this.d).d();
                }
                ((p94) this.c).run();
                break;
        }
    }
}
