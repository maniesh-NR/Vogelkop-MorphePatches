package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.leanplum.utils.SizeUtil;
import com.opera.android.OperaApplication;
import com.opera.android.downloads.DownloadProvider;
import com.opera.api.Callback;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class akg extends o73 {
    public final /* synthetic */ byte j;
    public boolean k;
    public final Object l;
    public final Object m;
    public final Object n;
    public Object o;
    public Object p;
    public Object q;
    public Object r;
    public Object s;

    public akg(pde pdeVar, pde pdeVar2, ori oriVar) {
        final byte b = 1;
        this.j = (byte) 1;
        this.l = pdeVar;
        this.m = pdeVar2;
        this.n = oriVar;
        this.o = new he(this, (byte) 3);
        this.p = new isd((Object) this, (byte) 22);
        final byte b2 = 0;
        this.q = new f7f(this) { // from class: nri
            public final /* synthetic */ akg b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b3 = b2;
                r9i r9iVar = null;
                akg akgVar = this.b;
                switch (b3) {
                    case 0:
                        if (!akgVar.k) {
                            r9i r9iVarF = akgVar.f();
                            if (r9iVarF != null && ((o66) r9iVarF.d).j()) {
                                r9iVar = r9iVarF;
                            }
                            if (r9iVar != null) {
                                itd itdVar = (m66) r9iVar.c;
                                itdVar.clear();
                                akgVar.t(itdVar);
                                break;
                            }
                        }
                        break;
                    default:
                        if (!akgVar.k) {
                            r9i r9iVarF2 = akgVar.f();
                            if (r9iVarF2 != null && ((o66) r9iVarF2.d).j()) {
                                r9iVar = r9iVarF2;
                            }
                            if (r9iVar != null) {
                                itd itdVar2 = (m66) r9iVar.c;
                                itdVar2.clear();
                                akgVar.t(itdVar2);
                                break;
                            }
                        }
                        break;
                }
            }
        };
        this.r = new f7f(this) { // from class: nri
            public final /* synthetic */ akg b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b3 = b;
                r9i r9iVar = null;
                akg akgVar = this.b;
                switch (b3) {
                    case 0:
                        if (!akgVar.k) {
                            r9i r9iVarF = akgVar.f();
                            if (r9iVarF != null && ((o66) r9iVarF.d).j()) {
                                r9iVar = r9iVarF;
                            }
                            if (r9iVar != null) {
                                itd itdVar = (m66) r9iVar.c;
                                itdVar.clear();
                                akgVar.t(itdVar);
                                break;
                            }
                        }
                        break;
                    default:
                        if (!akgVar.k) {
                            r9i r9iVarF2 = akgVar.f();
                            if (r9iVarF2 != null && ((o66) r9iVarF2.d).j()) {
                                r9iVar = r9iVarF2;
                            }
                            if (r9iVar != null) {
                                itd itdVar2 = (m66) r9iVar.c;
                                itdVar2.clear();
                                akgVar.t(itdVar2);
                                break;
                            }
                        }
                        break;
                }
            }
        };
    }

    public akg(xbf xbfVar, boolean z, Runnable runnable, ga6 ga6Var) {
        this.j = (byte) 0;
        this.s = new we7(this, new xjg(this), (byte) 6);
        this.l = xbfVar;
        this.k = z;
        this.m = runnable;
        this.n = ga6Var;
    }

    @Override // defpackage.o73
    public final void m(r9i r9iVar, View view) {
        byte b = this.j;
        Object obj = this.l;
        switch (b) {
            case 0:
                this.q = view.getContext();
                r9iVar.L(2131755035);
                this.p = (m66) r9iVar.c;
                w();
                ((we7) this.s).a((xbf) obj);
                this.r = view;
                if (this.k) {
                    int i = (cs5.W(view) ? 1 : 2) | 4;
                    o66 o66Var = (o66) r9iVar.d;
                    o66Var.getClass();
                    int i2 = i & 3;
                    if (i2 != 0 && i2 != 1 && i2 != 2) {
                        hai.d();
                        break;
                    } else {
                        o66Var.r = i;
                        break;
                    }
                }
                break;
            default:
                dkf dkfVar = this.a;
                this.s = dkfVar;
                if (dkfVar == null) {
                    dkfVar = null;
                }
                ((o66) r9iVar.d).u = dkfVar.getResources().getDimensionPixelSize(2131167309);
                r9iVar.S(true);
                t((m66) r9iVar.c);
                dkf dkfVar2 = (dkf) this.s;
                zi4.y(dkfVar2 != null ? dkfVar2 : null).a((he) this.o);
                ((pde) obj).k((nri) this.q);
                ((pde) this.m).k((nri) this.r);
                break;
        }
    }

    @Override // defpackage.o73, android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        byte b = this.j;
        Object obj = this.m;
        Object obj2 = this.l;
        switch (b) {
            case 0:
                ((we7) this.s).b((xbf) obj2);
                super.onDismiss();
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                super.onDismiss();
                dkf dkfVar = (dkf) this.s;
                if (dkfVar == null) {
                    dkfVar = null;
                }
                zi4.y(dkfVar).c((he) this.o);
                ((pde) obj2).p((nri) this.q);
                ((pde) obj).p((nri) this.r);
                ((ori) this.n).d();
                break;
        }
    }

    @Override // defpackage.dog
    public final boolean onMenuItemClick(MenuItem menuItem) {
        i4d i4dVar;
        ikg ikgVar;
        byte b = this.j;
        Object obj = this.n;
        final byte b2 = 1;
        switch (b) {
            case 0:
                ga6 ga6Var = (ga6) obj;
                xbf xbfVar = (xbf) this.l;
                final byte b3 = 0;
                final byte b4 = 2;
                int i = -1;
                if (menuItem.getItemId() == 2131363508) {
                    s(xh0.b);
                    float f = ((gig) ((ode) xbfVar.c).g()).getPlaybackParameters().a;
                    float[] fArr = {0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 1.75f, 2.0f};
                    ArrayList arrayList = new ArrayList(8);
                    for (int i2 = 0; i2 < 8; i2++) {
                        float f2 = fArr[i2];
                        Context context = (Context) this.q;
                        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getInstance();
                        decimalFormat.setMinimumFractionDigits(0);
                        decimalFormat.setMaximumFractionDigits(2);
                        arrayList.add(new ikg(context.getString(2132021622, decimalFormat.format(f2))));
                        if (f2 == f) {
                            i = i2;
                        }
                    }
                    ikg[] ikgVarArr = (ikg[]) arrayList.toArray(new ikg[0]);
                    ikg ikgVar2 = ikgVarArr[i];
                    hk5 hk5Var = new hk5(this, fArr, arrayList);
                    ipe.A((View) this.r);
                    v(new yjg(this, 2132020522, ikgVarArr, ikgVar2, hk5Var));
                    return true;
                }
                if (menuItem.getItemId() == 2131363504) {
                    s(xh0.c);
                    final ArrayList arrayList2 = new ArrayList();
                    int iQ = q(2, arrayList2);
                    zjg zjgVar = iQ >= 0 ? (zjg) arrayList2.get(iQ) : null;
                    Collections.sort(arrayList2, new c9((byte) 26));
                    int iIndexOf = arrayList2.indexOf(zjgVar);
                    final ArrayList arrayList3 = new ArrayList(nb6.W(new xq9(this) { // from class: ujg
                        public final /* synthetic */ akg b;

                        {
                            this.b = this;
                        }

                        public final Object apply(Object obj2) {
                            String string;
                            String string2;
                            byte b5 = b3;
                            akg akgVar = this.b;
                            zjg zjgVar2 = (zjg) obj2;
                            switch (b5) {
                                case 0:
                                    oj9 oj9Var = zjgVar2.a;
                                    int i3 = oj9Var.u;
                                    if (i3 == -1) {
                                        String strR = akgVar.r(oj9Var);
                                        string = TextUtils.isEmpty(strR) ? ((Context) akgVar.q).getString(2132020594) : strR;
                                    } else if (i3 > 3500) {
                                        Locale locale = Locale.ROOT;
                                        string = u35.g((i3 + 999) / 1000, "K");
                                    } else {
                                        int i4 = oj9Var.v;
                                        if (i4 != -1) {
                                            Locale locale2 = Locale.ROOT;
                                            string = u35.g(i4, "p");
                                        } else {
                                            Locale locale3 = Locale.ROOT;
                                            string = String.valueOf(i3);
                                        }
                                    }
                                    return new ikg(string);
                                case 1:
                                    oj9 oj9Var2 = zjgVar2.a;
                                    String strR2 = akgVar.r(oj9Var2);
                                    int i5 = oj9Var2.j;
                                    if (TextUtils.isEmpty(strR2)) {
                                        strR2 = ((Context) akgVar.q).getString(2132017646);
                                    }
                                    int i6 = oj9Var2.F;
                                    if (i6 != -1 && i6 >= 1) {
                                        if (i6 == 1) {
                                            string2 = ((Context) akgVar.q).getString(2132018952);
                                        } else if (i6 == 2) {
                                            string2 = ((Context) akgVar.q).getString(2132018961);
                                        } else if (i6 == 6 || i6 == 7) {
                                            string2 = ((Context) akgVar.q).getString(2132018963);
                                        } else {
                                            Context context2 = (Context) akgVar.q;
                                            string2 = i6 != 8 ? context2.getString(2132018962) : context2.getString(2132018964);
                                        }
                                        Context context3 = (Context) akgVar.q;
                                        strR2 = i5 != -1 ? context3.getString(2132017644, strR2, string2, Float.valueOf(i5 / 1000000.0f)) : context3.getString(2132017645, strR2, string2);
                                    } else if (i5 != -1) {
                                        strR2 = ((Context) akgVar.q).getString(2132017643, strR2, Float.valueOf(i5 / 1000000.0f));
                                    }
                                    return new ikg(strR2);
                                default:
                                    String strR3 = akgVar.r(zjgVar2.a);
                                    if (TextUtils.isEmpty(strR3)) {
                                        strR3 = ((Context) akgVar.q).getString(2132018113);
                                    }
                                    return new ikg(strR3);
                            }
                        }
                    }, arrayList2));
                    ikg[] ikgVarArr2 = (ikg[]) arrayList3.toArray(new ikg[0]);
                    ikgVar = iIndexOf != -1 ? ikgVarArr2[iIndexOf] : null;
                    Callback callback = new Callback(this) { // from class: vjg
                        public final /* synthetic */ akg b;

                        {
                            this.b = this;
                        }

                        @Override // com.opera.api.Callback
                        public final void run(Object obj2) {
                            byte b5 = b3;
                            ArrayList arrayList4 = arrayList2;
                            ArrayList arrayList5 = arrayList3;
                            akg akgVar = this.b;
                            ikg ikgVar3 = (ikg) obj2;
                            switch (b5) {
                                case 0:
                                    zjg zjgVar2 = (zjg) arrayList4.get(arrayList5.indexOf(ikgVar3));
                                    cx6 cx6Var = new cx6(zjgVar2.d, new int[]{zjgVar2.e});
                                    jx6 jx6Var = ((tjg) ((jjg) ((xbf) akgVar.l).e).b).n;
                                    bx6 bx6VarD = jx6Var.d();
                                    bx6VarD.getClass();
                                    ax6 ax6Var = new ax6(bx6VarD);
                                    ax6Var.o(zjgVar2.b, zjgVar2.c, cx6Var);
                                    int i3 = zjgVar2.a.u;
                                    if (i3 == -1) {
                                        ((myl) ax6Var).a = Integer.MAX_VALUE;
                                        ((myl) ax6Var).b = Integer.MAX_VALUE;
                                    } else {
                                        ((myl) ax6Var).a = i3;
                                        ((myl) ax6Var).b = Integer.MAX_VALUE;
                                    }
                                    jx6Var.k(new bx6(ax6Var));
                                    break;
                                case 1:
                                    akgVar.u((zjg) arrayList4.get(arrayList5.indexOf(ikgVar3)), new odf(akgVar, (byte) 20));
                                    break;
                                default:
                                    int iIndexOf2 = arrayList5.indexOf(ikgVar3);
                                    if (iIndexOf2 != 0) {
                                        akgVar.u((zjg) arrayList4.get(iIndexOf2 - 1), new odf(akgVar, (byte) 21));
                                        break;
                                    } else {
                                        jx6 jx6Var2 = ((tjg) ((jjg) ((xbf) akgVar.l).e).b).n;
                                        bx6 bx6VarD2 = jx6Var2.d();
                                        bx6VarD2.getClass();
                                        ax6 ax6Var2 = new ax6(bx6VarD2);
                                        int i4 = 0;
                                        while (true) {
                                            pr prVar = (pr) ((svb) akgVar.o).g;
                                            if (i4 < prVar.a) {
                                                if (((int[]) prVar.b)[i4] == 3) {
                                                    fyl fylVar = ((fyl[]) prVar.c)[i4];
                                                    if (fylVar != null) {
                                                        ax6Var2.o(i4, fylVar, (cx6) null);
                                                    }
                                                } else {
                                                    i4++;
                                                }
                                            }
                                        }
                                        ax6Var2.n((String) null);
                                        jx6Var2.k(new bx6(ax6Var2));
                                        break;
                                    }
                            }
                        }
                    };
                    ipe.A((View) this.r);
                    v(new yjg(this, 2132020521, ikgVarArr2, ikgVar, callback));
                    return true;
                }
                if (menuItem.getItemId() == 2131363460) {
                    s(xh0.d);
                    final ArrayList arrayList4 = new ArrayList();
                    int iQ2 = q(1, arrayList4);
                    final ArrayList arrayList5 = new ArrayList(nb6.W(new xq9(this) { // from class: ujg
                        public final /* synthetic */ akg b;

                        {
                            this.b = this;
                        }

                        public final Object apply(Object obj2) {
                            String string;
                            String string2;
                            byte b5 = b2;
                            akg akgVar = this.b;
                            zjg zjgVar2 = (zjg) obj2;
                            switch (b5) {
                                case 0:
                                    oj9 oj9Var = zjgVar2.a;
                                    int i3 = oj9Var.u;
                                    if (i3 == -1) {
                                        String strR = akgVar.r(oj9Var);
                                        string = TextUtils.isEmpty(strR) ? ((Context) akgVar.q).getString(2132020594) : strR;
                                    } else if (i3 > 3500) {
                                        Locale locale = Locale.ROOT;
                                        string = u35.g((i3 + 999) / 1000, "K");
                                    } else {
                                        int i4 = oj9Var.v;
                                        if (i4 != -1) {
                                            Locale locale2 = Locale.ROOT;
                                            string = u35.g(i4, "p");
                                        } else {
                                            Locale locale3 = Locale.ROOT;
                                            string = String.valueOf(i3);
                                        }
                                    }
                                    return new ikg(string);
                                case 1:
                                    oj9 oj9Var2 = zjgVar2.a;
                                    String strR2 = akgVar.r(oj9Var2);
                                    int i5 = oj9Var2.j;
                                    if (TextUtils.isEmpty(strR2)) {
                                        strR2 = ((Context) akgVar.q).getString(2132017646);
                                    }
                                    int i6 = oj9Var2.F;
                                    if (i6 != -1 && i6 >= 1) {
                                        if (i6 == 1) {
                                            string2 = ((Context) akgVar.q).getString(2132018952);
                                        } else if (i6 == 2) {
                                            string2 = ((Context) akgVar.q).getString(2132018961);
                                        } else if (i6 == 6 || i6 == 7) {
                                            string2 = ((Context) akgVar.q).getString(2132018963);
                                        } else {
                                            Context context2 = (Context) akgVar.q;
                                            string2 = i6 != 8 ? context2.getString(2132018962) : context2.getString(2132018964);
                                        }
                                        Context context3 = (Context) akgVar.q;
                                        strR2 = i5 != -1 ? context3.getString(2132017644, strR2, string2, Float.valueOf(i5 / 1000000.0f)) : context3.getString(2132017645, strR2, string2);
                                    } else if (i5 != -1) {
                                        strR2 = ((Context) akgVar.q).getString(2132017643, strR2, Float.valueOf(i5 / 1000000.0f));
                                    }
                                    return new ikg(strR2);
                                default:
                                    String strR3 = akgVar.r(zjgVar2.a);
                                    if (TextUtils.isEmpty(strR3)) {
                                        strR3 = ((Context) akgVar.q).getString(2132018113);
                                    }
                                    return new ikg(strR3);
                            }
                        }
                    }, arrayList4));
                    ikg[] ikgVarArr3 = (ikg[]) arrayList5.toArray(new ikg[0]);
                    ikgVar = iQ2 != -1 ? ikgVarArr3[iQ2] : null;
                    Callback callback2 = new Callback(this) { // from class: vjg
                        public final /* synthetic */ akg b;

                        {
                            this.b = this;
                        }

                        @Override // com.opera.api.Callback
                        public final void run(Object obj2) {
                            byte b5 = b2;
                            ArrayList arrayList42 = arrayList4;
                            ArrayList arrayList52 = arrayList5;
                            akg akgVar = this.b;
                            ikg ikgVar3 = (ikg) obj2;
                            switch (b5) {
                                case 0:
                                    zjg zjgVar2 = (zjg) arrayList42.get(arrayList52.indexOf(ikgVar3));
                                    cx6 cx6Var = new cx6(zjgVar2.d, new int[]{zjgVar2.e});
                                    jx6 jx6Var = ((tjg) ((jjg) ((xbf) akgVar.l).e).b).n;
                                    bx6 bx6VarD = jx6Var.d();
                                    bx6VarD.getClass();
                                    ax6 ax6Var = new ax6(bx6VarD);
                                    ax6Var.o(zjgVar2.b, zjgVar2.c, cx6Var);
                                    int i3 = zjgVar2.a.u;
                                    if (i3 == -1) {
                                        ((myl) ax6Var).a = Integer.MAX_VALUE;
                                        ((myl) ax6Var).b = Integer.MAX_VALUE;
                                    } else {
                                        ((myl) ax6Var).a = i3;
                                        ((myl) ax6Var).b = Integer.MAX_VALUE;
                                    }
                                    jx6Var.k(new bx6(ax6Var));
                                    break;
                                case 1:
                                    akgVar.u((zjg) arrayList42.get(arrayList52.indexOf(ikgVar3)), new odf(akgVar, (byte) 20));
                                    break;
                                default:
                                    int iIndexOf2 = arrayList52.indexOf(ikgVar3);
                                    if (iIndexOf2 != 0) {
                                        akgVar.u((zjg) arrayList42.get(iIndexOf2 - 1), new odf(akgVar, (byte) 21));
                                        break;
                                    } else {
                                        jx6 jx6Var2 = ((tjg) ((jjg) ((xbf) akgVar.l).e).b).n;
                                        bx6 bx6VarD2 = jx6Var2.d();
                                        bx6VarD2.getClass();
                                        ax6 ax6Var2 = new ax6(bx6VarD2);
                                        int i4 = 0;
                                        while (true) {
                                            pr prVar = (pr) ((svb) akgVar.o).g;
                                            if (i4 < prVar.a) {
                                                if (((int[]) prVar.b)[i4] == 3) {
                                                    fyl fylVar = ((fyl[]) prVar.c)[i4];
                                                    if (fylVar != null) {
                                                        ax6Var2.o(i4, fylVar, (cx6) null);
                                                    }
                                                } else {
                                                    i4++;
                                                }
                                            }
                                        }
                                        ax6Var2.n((String) null);
                                        jx6Var2.k(new bx6(ax6Var2));
                                        break;
                                    }
                            }
                        }
                    };
                    ipe.A((View) this.r);
                    v(new yjg(this, 2132017642, ikgVarArr3, ikgVar, callback2));
                    return true;
                }
                if (menuItem.getItemId() == 2131363462) {
                    s(xh0.e);
                    final ArrayList arrayList6 = new ArrayList();
                    int iQ3 = q(3, arrayList6);
                    final ArrayList arrayList7 = new ArrayList(nb6.W(new xq9(this) { // from class: ujg
                        public final /* synthetic */ akg b;

                        {
                            this.b = this;
                        }

                        public final Object apply(Object obj2) {
                            String string;
                            String string2;
                            byte b5 = b4;
                            akg akgVar = this.b;
                            zjg zjgVar2 = (zjg) obj2;
                            switch (b5) {
                                case 0:
                                    oj9 oj9Var = zjgVar2.a;
                                    int i3 = oj9Var.u;
                                    if (i3 == -1) {
                                        String strR = akgVar.r(oj9Var);
                                        string = TextUtils.isEmpty(strR) ? ((Context) akgVar.q).getString(2132020594) : strR;
                                    } else if (i3 > 3500) {
                                        Locale locale = Locale.ROOT;
                                        string = u35.g((i3 + 999) / 1000, "K");
                                    } else {
                                        int i4 = oj9Var.v;
                                        if (i4 != -1) {
                                            Locale locale2 = Locale.ROOT;
                                            string = u35.g(i4, "p");
                                        } else {
                                            Locale locale3 = Locale.ROOT;
                                            string = String.valueOf(i3);
                                        }
                                    }
                                    return new ikg(string);
                                case 1:
                                    oj9 oj9Var2 = zjgVar2.a;
                                    String strR2 = akgVar.r(oj9Var2);
                                    int i5 = oj9Var2.j;
                                    if (TextUtils.isEmpty(strR2)) {
                                        strR2 = ((Context) akgVar.q).getString(2132017646);
                                    }
                                    int i6 = oj9Var2.F;
                                    if (i6 != -1 && i6 >= 1) {
                                        if (i6 == 1) {
                                            string2 = ((Context) akgVar.q).getString(2132018952);
                                        } else if (i6 == 2) {
                                            string2 = ((Context) akgVar.q).getString(2132018961);
                                        } else if (i6 == 6 || i6 == 7) {
                                            string2 = ((Context) akgVar.q).getString(2132018963);
                                        } else {
                                            Context context2 = (Context) akgVar.q;
                                            string2 = i6 != 8 ? context2.getString(2132018962) : context2.getString(2132018964);
                                        }
                                        Context context3 = (Context) akgVar.q;
                                        strR2 = i5 != -1 ? context3.getString(2132017644, strR2, string2, Float.valueOf(i5 / 1000000.0f)) : context3.getString(2132017645, strR2, string2);
                                    } else if (i5 != -1) {
                                        strR2 = ((Context) akgVar.q).getString(2132017643, strR2, Float.valueOf(i5 / 1000000.0f));
                                    }
                                    return new ikg(strR2);
                                default:
                                    String strR3 = akgVar.r(zjgVar2.a);
                                    if (TextUtils.isEmpty(strR3)) {
                                        strR3 = ((Context) akgVar.q).getString(2132018113);
                                    }
                                    return new ikg(strR3);
                            }
                        }
                    }, arrayList6));
                    arrayList7.add(0, new ikg(((Context) this.q).getString(2132018112)));
                    if (iQ3 >= 0) {
                        iQ3++;
                    } else {
                        bx6 bx6VarD = ((tjg) ((jjg) xbfVar.e).b).n.d();
                        int i3 = 0;
                        while (true) {
                            pr prVar = (pr) ((svb) this.o).g;
                            if (i3 < prVar.a) {
                                if (((int[]) prVar.b)[i3] == 3) {
                                    fyl fylVar = ((fyl[]) prVar.c)[i3];
                                    if (fylVar != null && bx6VarD.d(i3, fylVar)) {
                                        Map map = (Map) bx6VarD.E0.get(i3);
                                        if ((map != null ? (cx6) map.get(fylVar) : null) == null) {
                                            iQ3 = 0;
                                        }
                                    }
                                } else {
                                    i3++;
                                }
                            }
                        }
                    }
                    ikg[] ikgVarArr4 = (ikg[]) arrayList7.toArray(new ikg[0]);
                    ikgVar = iQ3 != -1 ? ikgVarArr4[iQ3] : null;
                    Callback callback3 = new Callback(this) { // from class: vjg
                        public final /* synthetic */ akg b;

                        {
                            this.b = this;
                        }

                        @Override // com.opera.api.Callback
                        public final void run(Object obj2) {
                            byte b5 = b4;
                            ArrayList arrayList42 = arrayList6;
                            ArrayList arrayList52 = arrayList7;
                            akg akgVar = this.b;
                            ikg ikgVar3 = (ikg) obj2;
                            switch (b5) {
                                case 0:
                                    zjg zjgVar2 = (zjg) arrayList42.get(arrayList52.indexOf(ikgVar3));
                                    cx6 cx6Var = new cx6(zjgVar2.d, new int[]{zjgVar2.e});
                                    jx6 jx6Var = ((tjg) ((jjg) ((xbf) akgVar.l).e).b).n;
                                    bx6 bx6VarD2 = jx6Var.d();
                                    bx6VarD2.getClass();
                                    ax6 ax6Var = new ax6(bx6VarD2);
                                    ax6Var.o(zjgVar2.b, zjgVar2.c, cx6Var);
                                    int i32 = zjgVar2.a.u;
                                    if (i32 == -1) {
                                        ((myl) ax6Var).a = Integer.MAX_VALUE;
                                        ((myl) ax6Var).b = Integer.MAX_VALUE;
                                    } else {
                                        ((myl) ax6Var).a = i32;
                                        ((myl) ax6Var).b = Integer.MAX_VALUE;
                                    }
                                    jx6Var.k(new bx6(ax6Var));
                                    break;
                                case 1:
                                    akgVar.u((zjg) arrayList42.get(arrayList52.indexOf(ikgVar3)), new odf(akgVar, (byte) 20));
                                    break;
                                default:
                                    int iIndexOf2 = arrayList52.indexOf(ikgVar3);
                                    if (iIndexOf2 != 0) {
                                        akgVar.u((zjg) arrayList42.get(iIndexOf2 - 1), new odf(akgVar, (byte) 21));
                                        break;
                                    } else {
                                        jx6 jx6Var2 = ((tjg) ((jjg) ((xbf) akgVar.l).e).b).n;
                                        bx6 bx6VarD22 = jx6Var2.d();
                                        bx6VarD22.getClass();
                                        ax6 ax6Var2 = new ax6(bx6VarD22);
                                        int i4 = 0;
                                        while (true) {
                                            pr prVar2 = (pr) ((svb) akgVar.o).g;
                                            if (i4 < prVar2.a) {
                                                if (((int[]) prVar2.b)[i4] == 3) {
                                                    fyl fylVar2 = ((fyl[]) prVar2.c)[i4];
                                                    if (fylVar2 != null) {
                                                        ax6Var2.o(i4, fylVar2, (cx6) null);
                                                    }
                                                } else {
                                                    i4++;
                                                }
                                            }
                                        }
                                        ax6Var2.n((String) null);
                                        jx6Var2.k(new bx6(ax6Var2));
                                        break;
                                    }
                            }
                        }
                    };
                    ipe.A((View) this.r);
                    v(new yjg(this, 2132018114, ikgVarArr4, ikgVar, callback3));
                    return true;
                }
                if (menuItem.getItemId() == 2131363507) {
                    s(xh0.f);
                    byte b5 = 19;
                    if (s29.g((Uri) ((svb) this.o).d)) {
                        Context context2 = (Context) this.q;
                        svb svbVar = (svb) this.o;
                        i4dVar = new i4d(new vvf(DownloadProvider.b(context2, (Uri) svbVar.d, (String) svbVar.f), (String) ((svb) this.o).f, b5));
                    } else {
                        boolean zEquals = "content".equals(((Uri) ((svb) this.o).d).getScheme());
                        svb svbVar2 = (svb) this.o;
                        i4dVar = zEquals ? new i4d(new vvf((Uri) svbVar2.d, (String) svbVar2.f, b5)) : new i4d(new e5f(((Uri) svbVar2.d).toString(), (String) ((svb) this.o).e, (byte) 10));
                    }
                    ghf ghfVar = new ghf(i4dVar);
                    ghfVar.c = new wjg(this);
                    jjm jjmVarI = ghfVar.I((Context) this.q);
                    if (ga6Var == null) {
                        return true;
                    }
                    ((HashSet) ga6Var.b).add(jjmVarI);
                    return true;
                }
                if (menuItem.getItemId() != 2131363464) {
                    return false;
                }
                s(xh0.g);
                rxh rxhVar = new rxh(2132018536);
                wjg wjgVar = new wjg(this);
                r9g r9gVar = ga6Var != null ? new r9g((Object) ga6Var, (byte) 4) : null;
                gkj gkjVar = new gkj(false, false);
                gkjVar.a = null;
                gkjVar.b = null;
                gkjVar.c = null;
                gkjVar.d = null;
                gkjVar.e = null;
                gkjVar.f = r9gVar;
                gkjVar.g = null;
                gkjVar.h = wjgVar;
                gkjVar.i = null;
                gkjVar.j = null;
                gkjVar.k = 2132018535;
                gkjVar.l = 2132018111;
                gkjVar.m = 2132018537;
                gkjVar.n = true;
                gkjVar.o = rxhVar;
                z77 z77VarU = sfe.U((Context) this.q);
                z77VarU.getClass();
                z77VarU.b(gkjVar, ijm.b);
                if (ga6Var == null) {
                    return true;
                }
                ((HashSet) ga6Var.b).add(gkjVar);
                return true;
            default:
                if (!this.k) {
                    this.k = true;
                    ((ori) obj).l((eri) menuItem.getActionView().getTag());
                }
                return true;
        }
    }

    public final int q(int i, ArrayList arrayList) {
        fyl fylVar;
        int i2;
        int i3;
        int i4;
        int i5;
        fyl fylVar2;
        Map map;
        akg akgVar = this;
        int i6 = -1;
        if (((pr) ((svb) akgVar.o).g) == null) {
            return -1;
        }
        bx6 bx6VarD = ((tjg) ((jjg) ((xbf) akgVar.l).e).b).n.d();
        int size = -1;
        int size2 = -1;
        int size3 = -1;
        int i7 = 0;
        while (true) {
            pr prVar = (pr) ((svb) akgVar.o).g;
            if (i7 >= prVar.a) {
                break;
            }
            if (((int[]) prVar.b)[i7] == i && (fylVar = ((fyl[]) prVar.c)[i7]) != null) {
                boolean zD = bx6VarD.d(i7, fylVar);
                cx6 cx6Var = null;
                if (zD && (map = (Map) bx6VarD.E0.get(i7)) != null) {
                    cx6Var = (cx6) map.get(fylVar);
                }
                cx6 cx6Var2 = cx6Var;
                int i8 = 0;
                while (i8 < fylVar.a) {
                    eyl eylVarA = fylVar.a(i8);
                    int i9 = 0;
                    while (i9 < eylVarA.a) {
                        oj9 oj9Var = eylVarA.d[i9];
                        int iO = ((pr) ((svb) akgVar.o).g).o(i7, i8, i9);
                        if (iO == 4 || iO == 3 || (oj9Var.e & 1) != 0) {
                            if (!zD) {
                                if ((oj9Var.e & 1) != 0) {
                                    size3 = arrayList.size();
                                }
                                if ((oj9Var.e & 2) != 0) {
                                    size2 = arrayList.size();
                                }
                            }
                            int i10 = size2;
                            int i11 = size3;
                            if (cx6Var2 != null && cx6Var2.a == i8) {
                                int[] iArr = cx6Var2.b;
                                int length = iArr.length;
                                int i12 = 0;
                                while (true) {
                                    if (i12 >= length) {
                                        break;
                                    }
                                    int i13 = i12;
                                    if (iArr[i13] == i9) {
                                        size = arrayList.size();
                                        break;
                                    }
                                    i12 = i13 + 1;
                                }
                            }
                            i2 = size;
                            fyl fylVar3 = fylVar;
                            int i14 = i8;
                            int i15 = i9;
                            zjg zjgVar = new zjg(oj9Var, i7, fylVar3, i14, i15);
                            i3 = i14;
                            i4 = i15;
                            i5 = i7;
                            fylVar2 = fylVar3;
                            arrayList.add(zjgVar);
                            size2 = i10;
                            size3 = i11;
                        } else {
                            i2 = size;
                            i4 = i9;
                            i3 = i8;
                            fylVar2 = fylVar;
                            i5 = i7;
                        }
                        int i16 = i4 + 1;
                        size = i2;
                        i7 = i5;
                        fylVar = fylVar2;
                        i8 = i3;
                        akgVar = this;
                        i9 = i16;
                    }
                    i7 = i7;
                    fylVar = fylVar;
                    i8++;
                    akgVar = this;
                }
            }
            i7++;
            i6 = -1;
            akgVar = this;
        }
        int i17 = i6;
        return size != i17 ? size : size2 != i17 ? size2 : size3;
    }

    public final String r(oj9 oj9Var) {
        String str = oj9Var.d;
        String str2 = oj9Var.d;
        if (TextUtils.isEmpty(str) || "und".equals(str2)) {
            return oj9Var.b;
        }
        String displayName = Locale.forLanguageTag(str2).getDisplayName();
        if (!TextUtils.isEmpty(displayName)) {
            int i = oj9Var.f;
            String string = (i & 1088) != 0 ? ((Context) this.q).getString(2132018955) : (i & 8) != 0 ? ((Context) this.q).getString(2132018956) : (i & 4) != 0 ? ((Context) this.q).getString(2132018957) : (i & 2) != 0 ? ((Context) this.q).getString(2132018954) : null;
            if (string != null) {
                return ((Context) this.q).getString(2132021969, displayName, string);
            }
        }
        return displayName;
    }

    public final void s(xh0 xh0Var) {
        Context context = (Context) this.q;
        String[] strArr = OperaApplication.K;
        x5f x5fVar = ((OperaApplication) context.getApplicationContext()).L().c;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            wh0 wh0Var = new wh0(2443, -1, 1);
            wh0Var.q(0, 1, xh0Var);
            x56 x56VarF = zpa.F();
            qd0 qd0VarB = x56VarF.B(zpaVar);
            List list = (List) qd0VarB.n(14);
            ((list == null || list.isEmpty()) ? new hf0(qd0VarB, 14, vep.t(qd0VarB, 14, 1)) : new hf0(qd0VarB, 14, list)).add(wh0Var);
            x5fVar.U0(x56VarF);
        }
    }

    public final void t(Menu menu) {
        ori oriVar = (ori) this.n;
        for (eri eriVar : oriVar.x()) {
            if (eriVar.e() || !oriVar.B()) {
                MenuItem menuItemAdd = menu.add(eriVar.getTitle());
                menuItemAdd.setActionView(2131558594);
                View actionView = menuItemAdd.getActionView();
                actionView.setTag(eriVar);
                if (eriVar.b()) {
                    dkf dkfVar = (dkf) this.s;
                    actionView.setOnTouchListener(new uri((dkfVar != null ? dkfVar : null).getResources(), (isd) this.p));
                } else {
                    actionView.setBackground(null);
                }
                menuItemAdd.setCheckable(true);
                menuItemAdd.setChecked(Intrinsics.a((pde) this.m, eriVar));
                q9n.f(menuItemAdd.getActionView(), new vs5(eriVar, this, menuItemAdd, (byte) 4));
            }
        }
    }

    public final void u(zjg zjgVar, odf odfVar) {
        cx6 cx6Var = new cx6(zjgVar.d, new int[]{zjgVar.e});
        jx6 jx6Var = ((tjg) ((jjg) ((xbf) this.l).e).b).n;
        bx6 bx6VarD = jx6Var.d();
        bx6VarD.getClass();
        ax6 ax6Var = new ax6(bx6VarD);
        ax6Var.o(zjgVar.b, zjgVar.c, cx6Var);
        oj9 oj9Var = zjgVar.a;
        switch (odfVar.a) {
            case SizeUtil.textSize0 /* 20 */:
                if (!TextUtils.isEmpty(oj9Var.d)) {
                    String str = oj9Var.d;
                    if (str != null) {
                        ((myl) ax6Var).q = myl.f(new String[]{str});
                        break;
                    } else {
                        ((myl) ax6Var).q = myl.f(new String[0]);
                        break;
                    }
                } else {
                    ((myl) ax6Var).q = myl.f(new String[0]);
                    break;
                }
            default:
                if (!TextUtils.isEmpty(oj9Var.d)) {
                    ax6Var.n(oj9Var.d);
                    break;
                } else {
                    ax6Var.n((String) null);
                    break;
                }
        }
        jx6Var.k(new bx6(ax6Var));
    }

    public final void v(yjg yjgVar) {
        nej nejVarF = a4h.f((Context) this.q);
        nejVarF.getClass();
        nejVarF.b(yjgVar, ijm.b);
        ga6 ga6Var = (ga6) this.n;
        if (ga6Var != null) {
            ((HashSet) ga6Var.b).add(yjgVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w() {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akg.w():void");
    }
}
