package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import com.opera.android.autofill.Address;
import com.opera.android.menu.CustomMenuItemView;
import com.opera.android.undo.UndoBar;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class xw extends o73 {
    public final /* synthetic */ byte j;
    public Object k;
    public final Object l;

    public /* synthetic */ xw(byte b, Object obj, Object obj2, boolean z) {
        this.j = b;
        this.k = obj;
        this.l = obj2;
    }

    public xw(Context context, jbn jbnVar) {
        this.j = (byte) 11;
        this.k = jbnVar;
        ArrayList arrayListB = jbnVar.b();
        ywc.d();
        Set<String> setKeySet = ywc.a.keySet();
        ArrayList arrayListC = ywc.c();
        ArrayList arrayList = new ArrayList();
        for (String str : setKeySet) {
            if (!arrayListC.contains(str)) {
                arrayList.add(new sbn(sfe.S(str), context.getString(ywc.a(str).b)));
            }
        }
        n95.r(new ta2(arrayListB), arrayList);
        this.l = arrayList;
    }

    public xw(gn3 gn3Var, qhc qhcVar) {
        this.j = (byte) 4;
        this.k = qhcVar;
        this.l = gn3Var;
    }

    public xw(im3 im3Var) {
        this.j = (byte) 3;
        this.l = im3Var;
    }

    public /* synthetic */ xw(Object obj, Address address, byte b) {
        this.j = b;
        this.l = obj;
        this.k = address;
    }

    public /* synthetic */ xw(Object obj, Object obj2, byte b) {
        this.j = b;
        this.k = obj;
        this.l = obj2;
    }

    public xw(m0a m0aVar) {
        this.j = (byte) 7;
        this.k = m0aVar;
        this.l = m0aVar.a;
    }

    public xw(vvj vvjVar, ig7 ig7Var) {
        this.j = (byte) 5;
        this.l = vvjVar;
        this.k = ig7Var;
    }

    @Override // defpackage.o73
    public final boolean l(View view) {
        boolean zW;
        switch (this.j) {
            case 0:
                zW = cs5.W(view);
                break;
            case 1:
                zW = cs5.W(view);
                break;
            case 2:
                zW = cs5.W(view);
                break;
            default:
                return super.l(view);
        }
        return !zW;
    }

    @Override // defpackage.o73
    public final void m(r9i r9iVar, View view) {
        View actionView;
        byte b = this.j;
        byte b2 = 3;
        Object obj = this.l;
        boolean z = false;
        int i = 0;
        z = false;
        switch (b) {
            case 0:
                r9iVar.L(2131755017);
                return;
            case 1:
                r9iVar.L(2131755017);
                return;
            case 2:
                r9iVar.L(2131755018);
                return;
            case 3:
                r9iVar.L(2131755047);
                this.k = (m66) r9iVar.c;
                im3 im3Var = (im3) obj;
                gm3 gm3Var = im3Var.A;
                im3 im3Var2 = gm3Var.a;
                im3Var2.J.getClass();
                if (zwk.e()) {
                    im3Var2.O0(2131362169, false);
                } else {
                    im3Var2.J.F(gm3Var);
                }
                im3Var.P0(im3Var.x.a());
                m66 m66Var = (m66) this.k;
                MenuItem menuItemFindItem = m66Var != null ? m66Var.findItem(2131362162) : null;
                if (menuItemFindItem != null && (actionView = menuItemFindItem.getActionView()) != null) {
                    l5b l5bVar = q9n.c;
                    SwitchCompat switchCompatFindViewById = actionView.findViewById(2131363261);
                    Objects.requireNonNull(switchCompatFindViewById);
                    SwitchCompat switchCompat = switchCompatFindViewById;
                    switchCompat.setChecked(((SharedPreferences) im3Var.x.b.j.get()).getBoolean("show_full_address", false));
                    switchCompat.setOnCheckedChangeListener(new hm3(this, z ? (byte) 1 : (byte) 0));
                }
                im3Var.I0();
                im3Var.O0(2131362162, !im3Var.x.b.d());
                im3Var.O0(2131362155, !((f8f) im3Var.K.getValue()).f());
                im3Var.Q0();
                im3Var.R0();
                boolean zM0 = im3Var.M0(2131362155);
                boolean zM02 = im3Var.M0(2131362154);
                if (!zM0 && !zM02) {
                    z = false;
                }
                im3Var.O0(2131362149, z);
                return;
            case 4:
                r9iVar.L(2131755024);
                m66 m66Var2 = (m66) r9iVar.c;
                MenuItem menuItemFindItem2 = m66Var2.findItem(2131363490);
                qhc qhcVar = (qhc) this.k;
                al3 al3Var = qhcVar.a;
                al3 al3Var2 = qhcVar.a;
                menuItemFindItem2.setVisible(!al3Var.g() && ((gn3) obj).e());
                m66Var2.findItem(2131363476).setVisible(qhcVar.b == 1);
                m66Var2.findItem(2131363473).setVisible(qhcVar.a());
                if (!al3Var2.g() && !z5i.a0(qhcVar.e())) {
                    z = true;
                }
                m66Var2.findItem(2131363470).setVisible(z);
                m66Var2.findItem(2131363489).setVisible(z);
                l5b l5bVar2 = new l5b((byte) 1);
                al3Var2.c(l5bVar2);
                m66Var2.setGroupVisible(2131363479, l5bVar2.b);
                if (al3Var2.g()) {
                    m66Var2.findItem(2131363482).setTitle(view.getContext().getString(2132020201));
                    m66Var2.findItem(2131363481).setTitle(view.getContext().getString(2132019767));
                    return;
                } else {
                    m66Var2.findItem(2131363482).setTitle(view.getContext().getString(2132018428));
                    m66Var2.findItem(2131363481).setTitle(view.getContext().getString(2132018430));
                    return;
                }
            case 5:
                r9iVar.L(2131755032);
                ((m66) r9iVar.c).u(2132018703, (CharSequence) null, 0, (Drawable) null, (View) null);
                m66 m66Var3 = (m66) r9iVar.c;
                int iOrdinal = ((vvj) obj).ordinal();
                if (iOrdinal == 0) {
                    i = 2131362611;
                } else if (iOrdinal == 1) {
                    i = 2131362612;
                } else if (iOrdinal == 2) {
                    i = 2131362610;
                } else if (iOrdinal == 3) {
                    i = 2131362613;
                }
                m66Var3.findItem(i).setChecked(true);
                return;
            case 6:
                r9iVar.L(2131755043);
                ((m66) r9iVar.c).findItem(2131363469).setVisible(r9n.A(((View) this.k).getContext()));
                return;
            case 7:
                r9iVar.L(2131755033);
                a26.T(((m0a) this.k).e, ((o66) r9iVar.d).F, new wj(this, r9iVar, b2));
                MenuItem menuItemFindItem3 = ((m66) r9iVar.c).findItem(2131363047);
                menuItemFindItem3.setActionView(2131558629);
                View actionView2 = menuItemFindItem3.getActionView();
                CustomMenuItemView customMenuItemView = actionView2 instanceof CustomMenuItemView ? (CustomMenuItemView) actionView2 : null;
                if (customMenuItemView != null && customMenuItemView.e) {
                    customMenuItemView.e = false;
                    customMenuItemView.d();
                }
                menuItemFindItem3.setIcon(j14.i0(2131231203, (dkf) r9iVar.b));
                return;
            case 8:
                r9iVar.L(2131755063);
                return;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                r9iVar.L(2131755064);
                return;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                r9iVar.L(2131755057);
                m66 m66Var4 = (m66) r9iVar.c;
                MenuItem menuItemFindItem4 = m66Var4.findItem(2131363471);
                eqi eqiVar = (eqi) this.k;
                menuItemFindItem4.setVisible(eqiVar.a != null);
                m66Var4.findItem(2131363472).setVisible(eqiVar.b != null);
                return;
            case 11:
                m66 m66Var5 = (m66) r9iVar.c;
                ArrayList arrayListB = ((jbn) this.k).b();
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                int i2 = 0;
                int i3 = 0;
                while (i3 < size) {
                    Object obj2 = arrayList.get(i3);
                    i3++;
                    int i4 = i2 + 1;
                    if (i2 < 0) {
                        j95.n();
                        throw null;
                    }
                    ptd ptdVarA = m66Var5.a(0, i4, i4, ((sbn) obj2).b);
                    ptdVarA.setCheckable(true);
                    ptdVarA.setChecked(i2 == 0);
                    i2 = i4;
                }
                ptd ptdVarA2 = m66Var5.a(0, 0, arrayListB.size(), "");
                ptdVarA2.setActionView(2131558670);
                ptdVarA2.setEnabled(false);
                return;
            case 12:
                itd itdVar = (m66) r9iVar.c;
                if (itdVar != null) {
                    itdVar.x = true;
                } else {
                    itdVar.x = true;
                }
                r9iVar.L(2131755014);
                ssn ssnVar = (ssn) this.k;
                osn osnVar = ssnVar.f;
                osn osnVar2 = ssnVar.g;
                osn osnVar3 = ssnVar.e;
                osn osnVar4 = ssnVar.d;
                osn osnVar5 = ssnVar.c;
                osn osnVar6 = ssnVar.b;
                osn osnVar7 = ssnVar.a;
                aoh.f(itdVar, 2131362303, osnVar);
                MenuItem menuItemFindItem5 = itdVar.findItem(2131362987);
                osn osnVar8 = ssnVar.f;
                osn osnVar9 = osn.a;
                menuItemFindItem5.setVisible((osnVar8 == osnVar9 || (osnVar7 == osnVar9 && osnVar6 == osnVar9 && osnVar5 == osnVar9 && osnVar4 == osnVar9 && osnVar3 == osnVar9 && osnVar2 == osnVar9)) ? false : true);
                aoh.f(itdVar, 2131362451, osnVar7);
                aoh.f(itdVar, 2131364411, osnVar6);
                aoh.f(itdVar, 2131362509, osnVar5);
                MenuItem menuItemFindItem6 = itdVar.findItem(2131364178);
                if ((osnVar7 == osnVar9 && osnVar6 == osnVar9 && osnVar5 == osnVar9) || (osnVar4 == osnVar9 && osnVar3 == osnVar9 && osnVar2 == osnVar9)) {
                    z = false;
                }
                menuItemFindItem6.setVisible(z);
                aoh.f(itdVar, 2131364453, osnVar4);
                aoh.f(itdVar, 2131364244, osnVar3);
                MenuItem menuItemFindItem7 = itdVar.findItem(2131362842);
                Context context = view.getContext();
                menuItemFindItem7.setTitle(context.getString(2132017401, context.getString(2132017424)));
                aoh.f(itdVar, 2131362842, osnVar2);
                return;
            default:
                r9iVar.L(2131755043);
                ((m66) r9iVar.c).findItem(2131363469).setVisible(r9n.A(((View) this.k).getContext()));
                return;
        }
    }

    @Override // defpackage.o73, android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        switch (this.j) {
            case 3:
                super.onDismiss();
                this.k = null;
                break;
            case 4:
                super.onDismiss();
                ((gn3) this.l).D = null;
                break;
            default:
                super.onDismiss();
                break;
        }
    }

    @Override // defpackage.dog
    public final boolean onMenuItemClick(MenuItem menuItem) {
        byte b = this.j;
        Object obj = this.l;
        switch (b) {
            case 0:
                Address address = (Address) this.k;
                wth wthVar = (wth) ((yw) obj).e;
                int itemId = menuItem.getItemId();
                if (itemId == 2131363476) {
                    cx cxVarI0 = ((uw) wthVar.b).I0();
                    cxVarI0.d.c(address, new ax(cxVarI0, (byte) 1));
                } else {
                    if (itemId != 2131363473) {
                        return false;
                    }
                    UndoBar undoBar = ((uw) wthVar.b).I0().j;
                    if (undoBar != null) {
                        undoBar.c(Collections.singletonList(address.a));
                    }
                }
                return true;
            case 1:
                Address address2 = (Address) this.k;
                wr2 wr2Var = (wr2) obj;
                if (menuItem.getItemId() == 2131363476) {
                    wr2Var.I0(address2);
                } else {
                    if (menuItem.getItemId() != 2131363473) {
                        return false;
                    }
                    wr2Var.r.H(address2.a);
                }
                return true;
            case 2:
                w3g w3gVar = (w3g) this.k;
                wth wthVar2 = (wth) obj;
                int itemId2 = menuItem.getItemId();
                if (itemId2 == 2131362654) {
                    eu2 eu2Var = (eu2) wthVar2.b;
                    boolean zG = sj2.g(eu2Var.requireContext());
                    ua7 ua7Var = eu2Var.w;
                    if (zG) {
                        ((gjm) ua7Var.c).e(new zv7(w3gVar.a), false);
                    } else {
                        ua7Var.E(new s4g(), new ug(new du2(eu2Var, (byte) 1), (byte) 8));
                    }
                } else {
                    if (itemId2 != 2131365003) {
                        return false;
                    }
                    ((gjm) ((eu2) wthVar2.b).w.c).e(new j8n(w3gVar.a), false);
                }
                return true;
            case 3:
                return ((im3) obj).onMenuItemClick(menuItem);
            case 4:
                gn3 gn3Var = (gn3) obj;
                qhc qhcVar = (qhc) this.k;
                if (menuItem.getItemId() == 2131363490) {
                    gn3Var.m(qhcVar.a);
                    gn3Var.g();
                } else if (menuItem.getItemId() == 2131363482 || menuItem.getItemId() == 2131363481) {
                    al3 al3Var = qhcVar.a;
                    al3 al3Var2 = qhcVar.a;
                    gn3Var.s(alo.r(Arrays.asList(al3Var2)), al3Var.g() ? ((ml3) al3Var2).getTitle() : null, menuItem.getItemId() == 2131363481);
                } else if (menuItem.getItemId() == 2131363476) {
                    gn3Var.r(qhcVar.a);
                } else if (menuItem.getItemId() == 2131363473) {
                    gn3Var.p(Collections.singletonList(qhcVar));
                } else if (menuItem.getItemId() == 2131363470) {
                    lcp.m(gn3Var.p, qhcVar.e());
                } else {
                    if (menuItem.getItemId() != 2131363489) {
                        return false;
                    }
                    new ghf(new i4d(new e5f(qhcVar.e(), qhcVar.d(gn3Var.p.getResources()), (byte) 10))).I(gn3Var.p);
                }
                return true;
            case 5:
                ig7 ig7Var = (ig7) this.k;
                if (menuItem.getItemId() == 2131362611) {
                    ig7Var.b(vvj.c);
                } else if (menuItem.getItemId() == 2131362612) {
                    ig7Var.b(vvj.d);
                } else if (menuItem.getItemId() == 2131362610) {
                    ig7Var.b(vvj.e);
                } else {
                    if (menuItem.getItemId() != 2131362613) {
                        return false;
                    }
                    ig7Var.b(vvj.f);
                }
                return true;
            case 6:
                hd hdVar = ((wt7) obj).g;
                int itemId3 = menuItem.getItemId();
                if (itemId3 == 2131363469) {
                    ((iy1) hdVar.f).f(ux1.a, new dg7(hdVar, (byte) 5));
                } else if (itemId3 == 2131363478) {
                    iy1 iy1Var = (iy1) hdVar.f;
                    ux1 ux1Var = ux1.a;
                    iy1Var.getClass();
                    String strValueOf = String.valueOf(System.currentTimeMillis());
                    b8h.m(iy1Var.d.a, new j12(new xx1((Object) iy1Var, (Object) strValueOf, (Object) iy1Var.c(strValueOf), (Object) ux1Var, (byte) 0), (byte) 1));
                } else if (itemId3 == 2131363475) {
                    iy1 iy1Var2 = (iy1) hdVar.f;
                    iy1Var2.getClass();
                    String strValueOf2 = String.valueOf(System.currentTimeMillis());
                    ny1 ny1Var = iy1Var2.f;
                    wx wxVar = new wx((Object) iy1Var2, (Object) strValueOf2, (byte) 4);
                    Context context = ny1Var.a;
                    try {
                        ny1Var.a(context, wxVar);
                    } catch (ActivityNotFoundException unused) {
                        az0 az0Var = new az0(context);
                        az0Var.a(2132019060);
                        az0Var.setNegativeButton(2132020155, (DialogInterface.OnClickListener) null).c();
                    }
                }
                return true;
            case 7:
                m0a m0aVar = (m0a) this.k;
                tah tahVar = (tah) obj;
                int itemId4 = menuItem.getItemId();
                if (itemId4 == 2131363469) {
                    tahVar.getClass();
                    String strValueOf3 = String.valueOf(System.currentTimeMillis());
                    File fileR = tahVar.r(strValueOf3, "webp");
                    ((LinkedHashSet) tahVar.j).add(fileR);
                    ((q32) tahVar.d).a(fileR, new e0a(tahVar, fileR, strValueOf3));
                } else if (itemId4 == 2131363478) {
                    tahVar.getClass();
                    String strValueOf4 = String.valueOf(System.currentTimeMillis());
                    File fileR2 = tahVar.r(strValueOf4, "webp");
                    ((LinkedHashSet) tahVar.j).add(fileR2);
                    b8h.m(((q32) tahVar.d).a, new j12(new e0a(tahVar, strValueOf4, fileR2), (byte) 1));
                } else if (itemId4 == 2131363475) {
                    ny1 ny1Var2 = (ny1) tahVar.e;
                    dg7 dg7Var = new dg7(tahVar, (byte) 29);
                    Context context2 = ny1Var2.a;
                    try {
                        ny1Var2.a(context2, dg7Var);
                    } catch (ActivityNotFoundException unused2) {
                        az0 az0Var2 = new az0(context2);
                        az0Var2.a(2132019060);
                        az0Var2.setNegativeButton(2132020155, (DialogInterface.OnClickListener) null).c();
                    }
                } else if (itemId4 == 2131363046) {
                    o0a o0aVar = o0a.a;
                    m0aVar.getClass();
                    Set setSingleton = Collections.singleton(o0aVar);
                    if (!Intrinsics.a(m0aVar.d, setSingleton)) {
                        m0aVar.d = setSingleton;
                        m0aVar.b();
                    }
                } else if (itemId4 == 2131363047) {
                    o0a o0aVar2 = o0a.b;
                    m0aVar.getClass();
                    Set setSingleton2 = Collections.singleton(o0aVar2);
                    if (!Intrinsics.a(m0aVar.d, setSingleton2)) {
                        m0aVar.d = setSingleton2;
                        m0aVar.b();
                    }
                }
                return true;
            case 8:
                ArrayList arrayList = (ArrayList) this.k;
                gnh gnhVar = (gnh) obj;
                int itemId5 = menuItem.getItemId();
                if (itemId5 == 2131364012) {
                    gnhVar.d(arrayList);
                } else if (itemId5 == 2131364009) {
                    gnhVar.c(arrayList, false);
                } else {
                    if (itemId5 != 2131364010) {
                        return false;
                    }
                    gnhVar.c(arrayList, true);
                }
                return true;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                enh enhVar = (enh) this.k;
                gnh gnhVar2 = (gnh) obj;
                int itemId6 = menuItem.getItemId();
                if (itemId6 == 2131364011) {
                    gnhVar2.getClass();
                    gnhVar2.d(Collections.singletonList(enhVar));
                } else if (itemId6 == 2131364007) {
                    gnhVar2.getClass();
                    gnhVar2.c(Collections.singletonList(enhVar), false);
                } else if (itemId6 == 2131364008) {
                    gnhVar2.getClass();
                    gnhVar2.c(Collections.singletonList(enhVar), true);
                } else {
                    if (itemId6 != 2131364006) {
                        return false;
                    }
                    lcp.m(gnhVar2.a, enhVar.b);
                }
                return true;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                eqi eqiVar = (eqi) this.k;
                Context context3 = ((View) obj).getContext();
                int itemId7 = menuItem.getItemId();
                if (itemId7 == 2131363471) {
                    String str = eqiVar.a;
                    lcp.m(context3, str != null ? str : "");
                } else if (itemId7 == 2131363472) {
                    String str2 = eqiVar.b;
                    lcp.m(context3, str2 != null ? str2 : "");
                }
                return true;
            case 11:
                ((jbn) this.k).d(((sbn) ((ArrayList) obj).get(menuItem.getItemId() - 1)).a);
                return true;
            case 12:
                return ((Boolean) ((lrk) obj).invoke(menuItem)).booleanValue();
            default:
                krn krnVar = ((mrn) obj).p;
                int itemId8 = menuItem.getItemId();
                if (itemId8 == 2131363469) {
                    krnVar.f(drn.d);
                } else if (itemId8 == 2131363478) {
                    krnVar.f(drn.f);
                } else if (itemId8 == 2131363475) {
                    krnVar.f(drn.e);
                }
                return true;
        }
    }
}
