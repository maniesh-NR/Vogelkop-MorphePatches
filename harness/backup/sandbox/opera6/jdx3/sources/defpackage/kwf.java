package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.SwitchCompat;
import com.leanplum.utils.SizeUtil;
import com.opera.android.browser.UrlMangler;
import com.opera.android.settings.SettingsManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class kwf extends o73 {
    public pgf A;
    public boolean B;
    public tt3 C;
    public kze D;
    public final Context j;
    public final SettingsManager k;
    public final nwf l;
    public final bf9 m;
    public final swf n;
    public final i3j o;
    public final x5f q;
    public final x5f r;
    public final du3 s;
    public final k5o t;
    public final in3 u;
    public k6l v;
    public aal w;
    public s9i x;
    public p8f y;
    public final isd p = new isd((Object) this, (byte) 10);
    public final jwf z = new jwf();

    public kwf(Context context, swf swfVar, bf9 bf9Var, SettingsManager settingsManager, nwf nwfVar, x5f x5fVar, x5f x5fVar2, du3 du3Var, k5o k5oVar, in3 in3Var) {
        this.j = context;
        this.n = swfVar;
        this.k = settingsManager;
        this.l = nwfVar;
        this.m = bf9Var;
        this.q = x5fVar;
        this.r = x5fVar2;
        this.s = du3Var;
        this.t = k5oVar;
        i3j i3jVar = new i3j();
        i3jVar.a = bf9Var;
        i3jVar.b = settingsManager;
        i3jVar.c = swfVar;
        i3jVar.d = null;
        this.o = i3jVar;
        this.u = in3Var;
    }

    public static z16 r(qwf qwfVar) {
        switch (qwfVar.ordinal()) {
            case 0:
                return new z16(2132021945, 2131232212, 0, 2131363287, (byte) 2);
            case 1:
                return new z16(2132021949, 2131232244, 2131559198, 0, (byte) 2);
            case 2:
                return new z16(2132019772, 2131232283, 0, 0, (byte) 2);
            case 3:
                return new z16(2132019756, 2131232084, 0, 2131363275, (byte) 2);
            case 4:
                return new z16(2132019770, 2131232067, 0, 0, (byte) 2);
            case 5:
                return new z16(2132020907, 2131232009, 0, 0, (byte) 2);
            case 6:
                return new z16(2132019757, 2131232099, 0, 0, (byte) 2);
            case 7:
                return new z16(2132018546, 2131232065, 2131559199, 0, (byte) 2);
            case 8:
                return new z16(2132021498, 2131232250, 0, 0, (byte) 2);
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return new z16(2132021494, 2131231970, 0, 2131363272, (byte) 2);
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return new z16(2132021496, 2131232164, 0, 2131363273, (byte) 2);
            case 11:
                return new z16(2132021495, 2131231977, 0, 0, (byte) 2);
            case 12:
                return new z16(2132020640, 2131232211, 2131559199, 0, (byte) 2);
            case 13:
                return new z16(2132021043, 2131232088, 0, 0, (byte) 2);
            case 14:
                return new z16(2132021846, 2131232313, 0, 0, (byte) 2);
            case 15:
                return new z16(2132019768, 2131232188, 0, 0, (byte) 2);
            case 16:
                return new z16(0, 0, 2131559200, 0, (byte) 2);
            case 17:
                return new z16(2132019766, 2131232078, 0, 0, (byte) 2);
            case SizeUtil.textSize0_1 /* 18 */:
                return new z16(2132017493, 2131231782, 0, 0, (byte) 2);
            case 19:
                return new z16(2132019753, 2131231971, 2131559197, 0, (byte) 2);
            case SizeUtil.textSize0 /* 20 */:
                return new z16(2132021916, 2131231990, 0, 0, (byte) 2);
            case 21:
                return new z16(2132017453, 2131232243, 0, 0, (byte) 2);
            case SizeUtil.textSize1 /* 22 */:
                return new z16(2132017628, 2131231724, 0, 0, (byte) 2);
            case 23:
                return new z16(2132022712, 2131232318, 0, 0, (byte) 2);
            case SizeUtil.textSize2 /* 24 */:
                return new z16(2132020487, 2131232181, 0, 0, (byte) 2);
            default:
                hai.d();
                return null;
        }
    }

    public static void u(MenuItem menuItem, b2l b2lVar) {
        if (((d7l) b2lVar).j.isLoading()) {
            menuItem.setTitle(2132021951);
            menuItem.setIcon(2131232034);
        } else {
            menuItem.setTitle(2132021945);
            menuItem.setIcon(2131232212);
        }
    }

    @Override // defpackage.o73
    public final jwf c() {
        return this.z;
    }

    @Override // defpackage.o73
    public final void m(r9i r9iVar, View view) {
        List<pwf> listC0;
        owf owfVar;
        b2l b2lVar;
        String url;
        boolean zJ = j(view);
        this.B = zJ;
        itd itdVar = (m66) r9iVar.c;
        i3j i3jVar = this.o;
        swf swfVar = (swf) i3jVar.c;
        k6l k6lVar = (k6l) i3jVar.d;
        if (k6lVar == null || (b2lVar = k6lVar.o) == null || (url = ((d7l) b2lVar).j.getUrl()) == null || !UrlMangler.isOffline(url)) {
            ArrayList arrayList = swfVar.e;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                switch (((qwf) obj).ordinal()) {
                    case 0:
                    case 1:
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                    case 19:
                    case SizeUtil.textSize0 /* 20 */:
                        owfVar = owf.d;
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                    case 11:
                    case 12:
                    case 14:
                    case 15:
                    case 17:
                    case SizeUtil.textSize0_1 /* 18 */:
                    case SizeUtil.textSize1 /* 22 */:
                    case 23:
                    case SizeUtil.textSize2 /* 24 */:
                        owfVar = owf.c;
                        break;
                    case 13:
                        bf9 bf9Var = (bf9) i3jVar.a;
                        if (!bf9Var.t() || bf9Var.r() < 2 || !((SettingsManager) i3jVar.b).i("my_flow_visible")) {
                            owfVar = owf.c;
                            break;
                        } else {
                            owfVar = owf.d;
                            break;
                        }
                        break;
                    case 16:
                        owfVar = owf.f;
                        break;
                    case 21:
                        owfVar = owf.e;
                        break;
                    default:
                        h9o.p();
                        return;
                }
                Object arrayList2 = linkedHashMap.get(owfVar);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(owfVar, arrayList2);
                }
                ((List) arrayList2).add(obj);
            }
            ArrayList arrayList3 = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                arrayList3.add(new pwf((List) entry.getValue(), (owf) entry.getKey()));
            }
            listC0 = zJ ? CollectionsKt.c0(new au9((byte) 10), arrayList3) : CollectionsKt.c0(new au9((byte) 9), arrayList3);
        } else {
            listC0 = Collections.singletonList(new pwf(swfVar.e, owf.c));
        }
        pwf pwfVar = null;
        for (pwf pwfVar2 : listC0) {
            boolean z = this.B;
            List listY = pwfVar2.a;
            if (pwfVar2.b.b && z) {
                listY = CollectionsKt.Y(listY);
            }
            ArrayList arrayList4 = new ArrayList(listY);
            if (this.B) {
                qwf qwfVar = qwf.s;
                if (t(qwfVar) && arrayList4.remove(qwfVar)) {
                    o66 o66Var = (o66) r9iVar.d;
                    o66Var.E = true;
                    o66Var.D = new kqd((Object) this, (byte) 22);
                }
            }
            int size2 = arrayList4.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList4.get(i2);
                i2++;
                qwf qwfVar2 = (qwf) obj2;
                boolean zT = t(qwfVar2);
                int iOrdinal = qwfVar2.ordinal();
                if (iOrdinal != 8 && iOrdinal != 10 && iOrdinal != 11) {
                    if (zT) {
                        if (pwfVar2 != pwfVar && pwfVar != null) {
                            ptd ptdVarA = itdVar.a(0, 0, 0, "");
                            ptdVarA.setActionView(2131558670);
                            ptdVarA.setEnabled(false);
                        }
                        pwfVar = pwfVar2;
                    }
                    q(r9iVar, itdVar, qwfVar2, zT);
                }
            }
        }
        this.x = new s9i(this);
        r9iVar.S(true);
    }

    @Override // defpackage.o73, android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        super.onDismiss();
        s9i s9iVar = this.x;
        if (s9iVar != null) {
            kwf kwfVar = (kwf) s9iVar.e;
            kwfVar.v.H((f6l) s9iVar.b);
            p8f p8fVar = kwfVar.y;
            ((i7f) p8fVar.b).c((sbf) s9iVar.c);
            kze kzeVar = kwfVar.D;
            if (kzeVar != null) {
                kzeVar.p((d8d) s9iVar.d);
            }
            this.x = null;
        }
    }

    @Override // defpackage.dog
    public final boolean onMenuItemClick(MenuItem menuItem) {
        b2l b2lVar;
        hf0 hf0Var;
        byte b = 1;
        if (menuItem.getItemId() == 2131363812) {
            q9n.y(2131363261, menuItem.getActionView()).toggle();
            return true;
        }
        if (menuItem.getItemId() == 2131363821) {
            q9n.y(2131363261, menuItem.getActionView()).toggle();
            return true;
        }
        int itemId = menuItem.getItemId();
        byte b2 = 0;
        x5f x5fVar = this.q;
        nwf nwfVar = this.l;
        if (itemId == 2131363814) {
            x5fVar.k0(xl0.C);
            nwfVar.u(false);
            return true;
        }
        if (menuItem.getItemId() == 2131363823) {
            if (((d7l) this.v.o).j.isLoading()) {
                nwfVar.getClass();
                new lwf(nwfVar, (byte) 22);
                return true;
            }
            nwfVar.getClass();
            new lwf(nwfVar, (byte) 17);
            return true;
        }
        if (menuItem.getItemId() == 2131363835) {
            nwfVar.getClass();
            new lwf(nwfVar, (byte) 23);
            return true;
        }
        if (menuItem.getItemId() == 2131363813) {
            nwfVar.getClass();
            new lwf(nwfVar, (byte) 9);
            return true;
        }
        if (menuItem.getItemId() == 2131363836) {
            nwfVar.getClass();
            new lwf(nwfVar, (byte) 24);
            return true;
        }
        if (menuItem.getItemId() == 2131363828) {
            nwfVar.getClass();
            new lwf(nwfVar, (byte) 20);
            return true;
        }
        if (menuItem.getItemId() == 2131363832) {
            nwfVar.getClass();
            new lwf(nwfVar, (byte) 3);
            return true;
        }
        if (menuItem.getItemId() == 2131363829) {
            b2l b2lVar2 = this.v.o;
            String url = ((d7l) b2lVar2).j.getUrl();
            String strH0 = ((d7l) b2lVar2).h0();
            in3 in3Var = this.u;
            in3Var.getClass();
            if (!z5i.a0(url)) {
                url = strH0;
            }
            al3 al3VarC = in3Var.a.c(url);
            if (al3VarC == null || in3Var.b.contains(al3VarC)) {
                al3VarC = null;
            }
            if (al3VarC != null) {
                nwfVar.getClass();
                new lwf(nwfVar, (byte) 6);
                return true;
            }
            nwfVar.getClass();
            new lwf(nwfVar, b2);
            return true;
        }
        byte b3 = 2;
        if (menuItem.getItemId() == 2131363831) {
            nwfVar.getClass();
            new lwf(nwfVar, b3);
            return true;
        }
        if (menuItem.getItemId() == 2131363830) {
            nwfVar.getClass();
            new lwf(nwfVar, b);
            return true;
        }
        if (menuItem.getItemId() == 2131363815) {
            nwfVar.getClass();
            new lwf(nwfVar, (byte) 7);
            return true;
        }
        if (menuItem.getItemId() == 2131363824) {
            x5fVar.k0(xl0.j);
            k6l k6lVar = this.v;
            if (k6lVar != null && (b2lVar = k6lVar.o) != null) {
                String url2 = ((d7l) b2lVar).j.getUrl();
                x5f x5fVar2 = this.r;
                zpa zpaVar = x5fVar2.d;
                x56 x56VarF = zpa.F();
                za0 za0Var = new za0(2443, -1, 1);
                String[] strArr = aik.a;
                int iIndexOf = url2.indexOf(63);
                if (iIndexOf >= 0) {
                    url2 = url2.substring(0, iIndexOf);
                }
                String strP = aik.p(url2);
                za0Var.q(0, strP == null ? 0 : 1, strP);
                de0 de0VarC = x56VarF.C(zpaVar);
                List list = (List) de0VarC.n(0);
                if (list == null || list.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    de0VarC.q(0, 1, arrayList);
                    hf0Var = new hf0(de0VarC, 0, arrayList);
                } else {
                    hf0Var = new hf0(de0VarC, 0, list);
                }
                hf0Var.add(za0Var);
                x5fVar2.U0(x56VarF);
                aal aalVar = this.w;
                if (aalVar != null) {
                    aalVar.S(new w0a((byte) 2), b2lVar, false);
                }
            }
            return true;
        }
        if (menuItem.getItemId() == 2131363825) {
            nwfVar.getClass();
            new lwf(nwfVar, (byte) 18);
            return true;
        }
        if (menuItem.getItemId() == 2131363820) {
            nwfVar.getClass();
            new lwf(nwfVar, (byte) 15);
            return true;
        }
        if (menuItem.getItemId() == 2131363827) {
            nwfVar.getClass();
            new lwf(nwfVar, (byte) 19);
            return true;
        }
        if (menuItem.getItemId() == 2131363833) {
            nwfVar.getClass();
            new lwf(nwfVar, (byte) 21);
            return true;
        }
        if (menuItem.getItemId() == 2131363818) {
            nwfVar.getClass();
            new lwf(nwfVar, (byte) 14);
            return true;
        }
        if (menuItem.getItemId() == 2131363817) {
            nwfVar.getClass();
            new lwf(nwfVar, (byte) 4);
            return true;
        }
        if (menuItem.getItemId() == 2131363816) {
            nwfVar.getClass();
            new lwf(nwfVar, (byte) 5);
            return true;
        }
        if (menuItem.getItemId() == 2131363810) {
            nwfVar.getClass();
            new lwf(nwfVar, (byte) 13);
            return true;
        }
        if (menuItem.getItemId() == 2131363809) {
            x5fVar.k0(xl0.A);
            return true;
        }
        if (menuItem.getItemId() != 2131363819) {
            return false;
        }
        nwfVar.getClass();
        new lwf(nwfVar, (byte) 8);
        return true;
    }

    public final void q(r9i r9iVar, Menu menu, qwf qwfVar, boolean z) {
        List<qwf> listUnmodifiableList;
        MenuItem menuItemAdd;
        i4d i4dVar;
        ukh ukhVar;
        ogf ogfVarA;
        z16 z16VarR = r(qwfVar);
        int i = z16VarR.c;
        int i2 = z16VarR.b;
        z = false;
        boolean z2 = false;
        if (qwfVar == qwf.v) {
            Object[] objArr = {qwf.k, qwf.m, qwf.n};
            ArrayList arrayList = new ArrayList(3);
            for (int i3 = 0; i3 < 3; i3++) {
                Object obj = objArr[i3];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        } else {
            listUnmodifiableList = Collections.EMPTY_LIST;
        }
        boolean zIsEmpty = listUnmodifiableList.isEmpty();
        int i4 = qwfVar.a;
        Context context = this.j;
        if (zIsEmpty) {
            menuItemAdd = menu.add(0, i4, 0, i2 != 0 ? context.getString(i2) : "");
        } else {
            SubMenu subMenuAddSubMenu = menu.addSubMenu(0, i4, 0, i2 != 0 ? context.getString(i2) : "");
            subMenuAddSubMenu.clearHeader();
            for (qwf qwfVar2 : listUnmodifiableList) {
                q(r9iVar, subMenuAddSubMenu, qwfVar2, t(qwfVar2));
            }
            menuItemAdd = subMenuAddSubMenu.getItem();
        }
        menuItemAdd.setVisible(z);
        al3 al3Var = null;
        if (qwfVar == qwf.t) {
            pgf pgfVar = this.A;
            Drawable drawable = (pgfVar == null || (ogfVarA = pgfVar.a()) == null) ? null : ogfVarA.c;
            if (drawable != null) {
                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable});
                layerDrawable.setId(0, 0);
                menuItemAdd.setIcon((Drawable) new b0j(layerDrawable, 0));
            } else if (i != 0) {
                menuItemAdd.setIcon(i);
            }
        } else if (i != 0) {
            menuItemAdd.setIcon(i);
        }
        int i5 = z16VarR.d;
        if (i5 != 0) {
            menuItemAdd.setActionView(i5);
        }
        int iOrdinal = qwfVar.ordinal();
        if (iOrdinal == 0) {
            u(menuItemAdd, this.v.o);
            return;
        }
        byte b = 10;
        byte b2 = 1;
        if (iOrdinal == 1) {
            ImageView imageView = (ImageView) menuItemAdd.getActionView().findViewById(2131364416);
            b2l b2lVar = this.v.o;
            if (z5i.a0(((d7l) b2lVar).j.getUrl())) {
                i4dVar = new i4d(new u5f("Fake text", (byte) 11));
            } else {
                d7l d7lVar = (d7l) b2lVar;
                i4dVar = new i4d(new e5f(d7lVar.k0(), d7lVar.l0(), b));
            }
            rmh.a(imageView).b(i4dVar, b2lVar, new eof(this, imageView, b2));
            return;
        }
        if (iOrdinal == 3) {
            menuItemAdd.setEnabled(((d7l) this.v.o).j.R() != null);
            return;
        }
        if (iOrdinal == 4) {
            s(menuItemAdd);
            return;
        }
        if (iOrdinal == 7) {
            boolean zG = ((d7l) this.v.o).j.g();
            SwitchCompat switchCompatY = q9n.y(2131363261, menuItemAdd.getActionView());
            switchCompatY.setChecked(zG);
            switchCompatY.setOnCheckedChangeListener(new iwf(this, menuItemAdd, false ? (byte) 1 : (byte) 0));
            return;
        }
        if (iOrdinal == 9) {
            b2l b2lVar2 = this.v.o;
            String url = ((d7l) b2lVar2).j.getUrl();
            String strH0 = ((d7l) b2lVar2).h0();
            in3 in3Var = this.u;
            in3Var.getClass();
            if (!z5i.a0(url)) {
                url = strH0;
            }
            al3 al3VarC = in3Var.a.c(url);
            if (al3VarC != null && !in3Var.b.contains(al3VarC)) {
                al3Var = al3VarC;
            }
            if (al3Var != null) {
                menuItemAdd.setTitle(2132018739);
                menuItemAdd.setIcon(2131232073);
                return;
            } else {
                menuItemAdd.setTitle(2132021494);
                menuItemAdd.setIcon(2131231970);
                return;
            }
        }
        if (iOrdinal == 12) {
            p8f p8fVar = this.y;
            ukh ukhVar2 = (ukh) p8fVar.c;
            if (!ukhVar2.b && (ukhVar = (ukh) p8fVar.d) != ukh.e) {
                ukhVar2 = ukhVar;
            }
            boolean z3 = ukhVar2.c;
            SwitchCompat switchCompatY2 = q9n.y(2131363261, menuItemAdd.getActionView());
            switchCompatY2.setChecked(z3);
            switchCompatY2.setOnCheckedChangeListener(new iwf(this, menuItemAdd, false ? (byte) 1 : (byte) 0));
            boolean z4 = ukhVar2.b;
            menuItemAdd.setEnabled(z4);
            SwitchCompat switchCompatY3 = q9n.y(2131363261, menuItemAdd.getActionView());
            switchCompatY3.setEnabled(false);
            switchCompatY3.setChecked(ukhVar2.c);
            switchCompatY3.setEnabled(z4);
            return;
        }
        if (iOrdinal == 24) {
            kze kzeVar = this.D;
            if (kzeVar != null && kzeVar.g() == peg.c) {
                z2 = true;
            }
            menuItemAdd.setVisible(z2);
            return;
        }
        if (iOrdinal == 15) {
            s(menuItemAdd);
            return;
        }
        if (iOrdinal == 16) {
            if (menuItemAdd.isVisible()) {
                menuItemAdd.setEnabled(false);
                new igi(this.v, pt1.b(menuItemAdd.getActionView()), new eu3(this, b2), this.l, new vdf(this, b), (kze) null);
                return;
            }
            return;
        }
        if (iOrdinal == 19) {
            ((ImageView) menuItemAdd.getActionView().findViewById(2131361894)).setImageResource(2131232029);
        } else if (iOrdinal == 20) {
            new c37(((o66) r9iVar.d).F, this.v, menuItemAdd);
        }
    }

    public final void s(MenuItem menuItem) {
        b2l b2lVar;
        k6l k6lVar = this.v;
        if (k6lVar == null || (b2lVar = k6lVar.o) == null) {
            return;
        }
        d7l d7lVar = (d7l) b2lVar;
        if (d7lVar.j.a0() != null) {
            if (lyg.c(d7lVar.j.a0()).d()) {
                menuItem.setEnabled(false);
            } else if (d7lVar.o0() || d7lVar.j.r() || d7lVar.j.c0()) {
                menuItem.setEnabled(false);
            } else {
                menuItem.setEnabled(true);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ac A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean t(defpackage.qwf r7) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kwf.t(qwf):boolean");
    }
}
