package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.SparseArray;
import android.view.View;
import com.opera.android.favorites.e;
import com.opera.android.settings.SettingsManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class hok extends ns8 {
    public final /* synthetic */ byte B = 0;
    public final Object C;
    public final Object D;
    public final Object E;
    public final Object F;

    public hok(ipk ipkVar, nr8 nr8Var, w6j w6jVar, xok xokVar, gd6 gd6Var, SettingsManager settingsManager, tta ttaVar, x5f x5fVar, qr8 qr8Var, nv2 nv2Var, p6l p6lVar) {
        super(xokVar, settingsManager, false, null, ttaVar, true, false, x5fVar, qr8Var, nv2Var, null, null, p6lVar);
        this.C = ipkVar;
        this.D = nr8Var;
        this.E = w6jVar;
        this.F = gd6Var;
    }

    public hok(xok xokVar, SettingsManager settingsManager, tta ttaVar, w6j w6jVar, cbf cbfVar, x5f x5fVar, qr8 qr8Var, nv2 nv2Var, p6l p6lVar) {
        super(xokVar, settingsManager, false, null, ttaVar, false, false, x5fVar, qr8Var, nv2Var, null, null, p6lVar);
        this.C = new HashSet();
        this.D = w6jVar;
        this.E = cbfVar;
        this.F = x5fVar;
    }

    @Override // defpackage.ns8
    public final vi7 G(int i, o28 o28Var) {
        switch (this.B) {
            case 0:
                if (o28Var == null) {
                    return null;
                }
                gok gokVar = new gok(this, vml.d, i, ((tq8) this.c.b).y(), this);
                gokVar.t = false;
                gokVar.q = false;
                gokVar.n = o28Var;
                return gokVar;
            default:
                return super.G(i, o28Var);
        }
    }

    @Override // defpackage.ns8
    public final List H(final Context context, final hq8 hq8Var) {
        switch (this.B) {
            case 0:
                ArrayList arrayList = new ArrayList();
                if (((qok) hq8Var).e.d != 3) {
                    final byte b = 0;
                    arrayList.add(new gtd(new rxh(2132020488), new lxh(2131232182), new View.OnClickListener(this) { // from class: fok
                        public final /* synthetic */ hok b;

                        {
                            this.b = this;
                        }

                        /* JADX WARN: Type inference failed for: r11v0, types: [mya, sok] */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Bitmap bitmap;
                            byte b2 = b;
                            hq8 hq8Var2 = hq8Var;
                            hok hokVar = this.b;
                            switch (b2) {
                                case 0:
                                    String strH = hq8Var2.h();
                                    String strF = hq8Var2.f();
                                    String strG = hq8Var2.g();
                                    if (strG == null || strG.length() == 0) {
                                        bitmap = null;
                                    } else {
                                        ?? sokVar = new sok();
                                        int iE = nr8.e(context);
                                        nya nyaVarB = oya.b(strG, iE, iE, 0, 0, sokVar);
                                        if (nyaVarB != null) {
                                            oya.a(nyaVarB);
                                        }
                                        bitmap = (Bitmap) sokVar.l;
                                    }
                                    ((nr8) hokVar.D).a(new mzj(strH, strF, bitmap, false));
                                    hokVar.b0(hq8Var2, true);
                                    break;
                                default:
                                    ipk ipkVar = (ipk) hokVar.C;
                                    ook ookVar = ((qok) hq8Var2).e;
                                    i32 i32Var = ipkVar.c;
                                    nxd nxdVarK = i32Var.k(ookVar.d, ookVar.b);
                                    if (!nxdVarK.f) {
                                        nxdVarK.f = true;
                                        i32Var.g(new nxd(nxdVarK));
                                        ipkVar.b.a();
                                    }
                                    hokVar.b0(hq8Var2, false);
                                    break;
                            }
                        }
                    }));
                }
                final byte b2 = 1;
                arrayList.add(new gtd(new rxh(2132020895), new lxh(2131232064), new View.OnClickListener(this) { // from class: fok
                    public final /* synthetic */ hok b;

                    {
                        this.b = this;
                    }

                    /* JADX WARN: Type inference failed for: r11v0, types: [mya, sok] */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Bitmap bitmap;
                        byte b22 = b2;
                        hq8 hq8Var2 = hq8Var;
                        hok hokVar = this.b;
                        switch (b22) {
                            case 0:
                                String strH = hq8Var2.h();
                                String strF = hq8Var2.f();
                                String strG = hq8Var2.g();
                                if (strG == null || strG.length() == 0) {
                                    bitmap = null;
                                } else {
                                    ?? sokVar = new sok();
                                    int iE = nr8.e(context);
                                    nya nyaVarB = oya.b(strG, iE, iE, 0, 0, sokVar);
                                    if (nyaVarB != null) {
                                        oya.a(nyaVarB);
                                    }
                                    bitmap = (Bitmap) sokVar.l;
                                }
                                ((nr8) hokVar.D).a(new mzj(strH, strF, bitmap, false));
                                hokVar.b0(hq8Var2, true);
                                break;
                            default:
                                ipk ipkVar = (ipk) hokVar.C;
                                ook ookVar = ((qok) hq8Var2).e;
                                i32 i32Var = ipkVar.c;
                                nxd nxdVarK = i32Var.k(ookVar.d, ookVar.b);
                                if (!nxdVarK.f) {
                                    nxdVarK.f = true;
                                    i32Var.g(new nxd(nxdVarK));
                                    ipkVar.b.a();
                                }
                                hokVar.b0(hq8Var2, false);
                                break;
                        }
                    }
                }));
                return arrayList;
            default:
                return null;
        }
    }

    @Override // defpackage.ns8
    public final void M(e eVar, hq8 hq8Var) {
        byte b = this.B;
        Object obj = this.E;
        switch (b) {
            case 0:
                ook ookVar = ((qok) hq8Var).e;
                int iK = K(hq8Var);
                if (iK >= 0) {
                    w6j w6jVar = (w6j) obj;
                    w6jVar.f(iK, ookVar);
                    w6jVar.o(iK, hr0.c);
                    w6jVar.p();
                    return;
                }
                return;
            default:
                ook ookVar2 = ((qok) hq8Var).e;
                long jCurrentTimeMillis = System.currentTimeMillis();
                byte b2 = ookVar2.d;
                if (b2 == 7) {
                    String.valueOf(-1);
                    throw null;
                }
                if (b2 == 8) {
                    x5f x5fVar = (x5f) this.F;
                    boolean zM = hq8Var.m();
                    x5fVar.getClass();
                    x5fVar.T0(new c5f(jCurrentTimeMillis, zM, false));
                }
                eVar.k(hq8Var);
                w6j w6jVar2 = (w6j) this.D;
                int iK2 = K(hq8Var);
                SparseArray sparseArray = (SparseArray) w6jVar2.c;
                byte b3 = ookVar2.d;
                if (b3 != 6 && b3 != 11) {
                    ((SparseArray) w6jVar2.d).remove(iK2);
                    if (((ook) sparseArray.get(iK2)) == null) {
                        sparseArray.append(iK2, ookVar2);
                    }
                }
                w6jVar2.n(iK2, xk0.c);
                ((cbf) obj).run();
                return;
        }
    }

    public final void b0(hq8 hq8Var, boolean z) {
        ook ookVar = ((qok) hq8Var).e;
        int iK = K(hq8Var);
        if (iK >= 0) {
            w6j w6jVar = (w6j) this.E;
            if (z) {
                w6jVar.f(iK, ookVar);
                w6jVar.o(iK, hr0.d);
                w6jVar.p();
            } else {
                w6jVar.f(iK, ookVar);
                w6jVar.o(iK, hr0.e);
                w6jVar.p();
            }
            xok xokVar = (xok) ((tq8) this.c.b);
            ArrayList arrayList = xokVar.h;
            ArrayList arrayList2 = xokVar.e;
            arrayList.remove(ookVar);
            xokVar.A(hq8Var);
            if (arrayList2.size() < xokVar.i && xokVar.h.size() >= xokVar.i) {
                xokVar.s(arrayList2.size(), new qok((ook) xokVar.h.get(xokVar.i - 1)));
            }
            gd6 gd6Var = (gd6) this.F;
            if (z) {
                gd6Var.b = true;
                return;
            }
            int itemCount = getItemCount();
            Context context = gd6Var.a;
            int i = gd6Var.c + 1;
            gd6Var.c = i;
            if ((itemCount <= 0 || i >= 3) && !gd6Var.b) {
                ru9 ru9VarC = ru9.c(context);
                if (ru9VarC.a.getBoolean("startpage.disable_suggested_sites_dialog_shown", false)) {
                    return;
                }
                rxh rxhVar = new rxh(2132018561);
                uk6 uk6Var = new uk6(ru9VarC, (byte) 8);
                uk6 uk6Var2 = new uk6(gd6Var, (byte) 9);
                z77 z77VarU = sfe.U(context);
                gkj gkjVar = new gkj(false, false);
                gkjVar.a = null;
                gkjVar.b = null;
                gkjVar.c = null;
                gkjVar.d = null;
                gkjVar.e = uk6Var;
                gkjVar.f = null;
                gkjVar.g = null;
                gkjVar.h = uk6Var2;
                gkjVar.i = null;
                gkjVar.j = null;
                gkjVar.k = 2132018560;
                gkjVar.l = 2132018111;
                gkjVar.m = 0;
                gkjVar.n = true;
                gkjVar.o = rxhVar;
                z77VarU.getClass();
                z77VarU.b(gkjVar, ijm.b);
            }
        }
    }
}
