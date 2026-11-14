package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.opera.android.settings.SettingsManager;
import com.opera.api.Callback;
import j$.util.stream.Stream;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.chromium.base.PathUtils;

/* loaded from: classes.dex */
public final class qln implements w6f {
    public final Context a;
    public final umi b;
    public final x4i c;
    public final onn d;
    public final SettingsManager e;
    public final ami f;
    public final agm g;
    public final kze h;
    public final qi5 i;
    public final vzk j;
    public final vs8 k;
    public final qs7 l;
    public final rgh m;
    public final ay n;
    public final agm o;
    public final y9e p;
    public final i7f q;
    public boolean r;

    public qln(ndc ndcVar, Context context, umi umiVar, ii iiVar, SettingsManager settingsManager, dll dllVar, z7f z7fVar, onn onnVar, x4i x4iVar) {
        File file;
        List listY;
        rw0 rw0Var = new rw0(this, (byte) 8);
        ezg ezgVar = new ezg(this, (byte) 12);
        this.n = new ay((Object) this, (byte) 13);
        this.q = new i7f();
        this.a = context;
        this.b = umiVar;
        File file2 = new File(PathUtils.a(0), "wallpapers");
        ru9 ru9VarC = ru9.c(context);
        this.e = settingsManager;
        this.d = onnVar;
        this.c = x4iVar;
        this.p = new y9e(z7fVar);
        qi5 qi5Var = new qi5(ru9VarC);
        this.i = qi5Var;
        vzk vzkVar = new vzk();
        vzkVar.a = ru9VarC;
        vzkVar.b = onnVar;
        String string = ru9VarC.a.getString("wallpaper.favorites.list", null);
        if (string != null) {
            file = file2;
            listY = StringsKt.Y(string, new String[]{","}, 0, 6);
        } else {
            file = file2;
            Set setO = w1h.o(ru9VarC.a, "wallpaper.favorites", (Set) null);
            if (setO != null) {
                List listK0 = CollectionsKt.k0(setO);
                nv6 nv6VarB = ru9VarC.b();
                SharedPreferences.Editor editor = (SharedPreferences.Editor) nv6VarB.a;
                editor.putString("wallpaper.favorites.list", CollectionsKt.P(listK0, ",", (CharSequence) null, (String) null, 0, (Function1) null, 62));
                editor.remove("wallpaper.favorites");
                nv6VarB.w();
                listY = listK0;
            } else {
                listY = l08.a;
            }
        }
        ArrayList arrayList = new ArrayList(listY);
        vzkVar.d = arrayList;
        vzkVar.c = new kze(arrayList);
        this.j = vzkVar;
        vs8 vs8Var = new vs8();
        this.k = vs8Var;
        rgh rghVar = new rgh();
        rghVar.a = context;
        rghVar.b = context.getResources();
        this.m = rghVar;
        final byte b = 1;
        wkn[] wknVarArr = {new vs8(settingsManager), new vs8(vzkVar), new y9e(z7fVar), new z4i(x4iVar, ru9VarC), qi5Var, vs8Var};
        File file3 = file;
        ami amiVar = new ami(ndcVar, context, file3, umiVar, iiVar, rghVar, vzkVar, onnVar, new qi5(wknVarArr));
        this.f = amiVar;
        this.g = new agm(file3);
        this.h = new kze(b());
        this.l = qs7.o;
        this.o = new agm(settingsManager, ru9VarC, onnVar, (byte) 6);
        kze kzeVar = (kze) amiVar.g;
        final byte b2 = 0;
        kzeVar.j(ndcVar, new f7f(this) { // from class: pln
            public final /* synthetic */ qln b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b3 = b2;
                qln qlnVar = this.b;
                switch (b3) {
                    case 0:
                        qlnVar.r();
                        break;
                    case 1:
                        if (qlnVar.f().equals("favorites")) {
                            qlnVar.r();
                            break;
                        }
                        break;
                    case 2:
                        if (qlnVar.f().equals("local_dir")) {
                            qlnVar.r();
                            break;
                        }
                        break;
                    default:
                        if (((vq8) qlnVar.f.e).i()) {
                            ava.a.a(new nln(qlnVar, (byte) 1));
                            break;
                        }
                        break;
                }
            }
        });
        ((kze) amiVar.h).j(ndcVar, new f7f(this) { // from class: pln
            public final /* synthetic */ qln b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b3 = b;
                qln qlnVar = this.b;
                switch (b3) {
                    case 0:
                        qlnVar.r();
                        break;
                    case 1:
                        if (qlnVar.f().equals("favorites")) {
                            qlnVar.r();
                            break;
                        }
                        break;
                    case 2:
                        if (qlnVar.f().equals("local_dir")) {
                            qlnVar.r();
                            break;
                        }
                        break;
                    default:
                        if (((vq8) qlnVar.f.e).i()) {
                            ava.a.a(new nln(qlnVar, (byte) 1));
                            break;
                        }
                        break;
                }
            }
        });
        kze kzeVar2 = (kze) ((s14) amiVar.d).f;
        final byte b3 = 2;
        kzeVar2.j(ndcVar, new f7f(this) { // from class: pln
            public final /* synthetic */ qln b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b32 = b3;
                qln qlnVar = this.b;
                switch (b32) {
                    case 0:
                        qlnVar.r();
                        break;
                    case 1:
                        if (qlnVar.f().equals("favorites")) {
                            qlnVar.r();
                            break;
                        }
                        break;
                    case 2:
                        if (qlnVar.f().equals("local_dir")) {
                            qlnVar.r();
                            break;
                        }
                        break;
                    default:
                        if (((vq8) qlnVar.f.e).i()) {
                            ava.a.a(new nln(qlnVar, (byte) 1));
                            break;
                        }
                        break;
                }
            }
        });
        final byte b4 = 3;
        kzeVar.j(ndcVar, new f7f(this) { // from class: pln
            public final /* synthetic */ qln b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b32 = b4;
                qln qlnVar = this.b;
                switch (b32) {
                    case 0:
                        qlnVar.r();
                        break;
                    case 1:
                        if (qlnVar.f().equals("favorites")) {
                            qlnVar.r();
                            break;
                        }
                        break;
                    case 2:
                        if (qlnVar.f().equals("local_dir")) {
                            qlnVar.r();
                            break;
                        }
                        break;
                    default:
                        if (((vq8) qlnVar.f.e).i()) {
                            ava.a.a(new nln(qlnVar, (byte) 1));
                            break;
                        }
                        break;
                }
            }
        });
        byte b5 = 19;
        aib.B(settingsManager, ndcVar, ezgVar, new vme(b5));
        aib.B(dllVar, ndcVar, rw0Var, new vme(b5));
    }

    @Override // defpackage.w6f
    public final void F(Object obj) {
        this.q.b((u4j) obj);
    }

    @Override // defpackage.w6f
    public final void H(Object obj) {
        this.q.c((u4j) obj);
    }

    public final void a(Callback callback, int i) {
        boolean z;
        String strI;
        agm agmVar = this.o;
        agmVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        ru9 ru9Var = (ru9) agmVar.c;
        long j = ru9Var.a.getLong("wallpaper.rotation.timestamp", Long.MAX_VALUE);
        if (j == Long.MAX_VALUE) {
            z = false;
        } else {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(jCurrentTimeMillis);
            int i2 = calendar.get(6);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(j);
            boolean z2 = i2 != calendar2.get(6);
            if (z2) {
                nv6 nv6VarB = ru9Var.b();
                ((SharedPreferences.Editor) nv6VarB.a).putLong("wallpaper.rotation.timestamp", jCurrentTimeMillis);
                nv6VarB.w();
            }
            z = z2;
        }
        if (z) {
            num = agmVar.p() ? 13 : null;
            strI = agmVar.n(i());
        } else {
            strI = i();
        }
        if (this.r) {
            this.r = false;
            if (agmVar.p()) {
                num = 12;
            }
        }
        l(strI, i, new yt3(this, num, z, strI, i, callback));
    }

    public final qjn b() {
        o2c o2cVar = new o2c(false, 0, 0, false);
        return new qjn(this.g, ami.l.c(this.a, o2cVar), new vk2((byte) 25), o2cVar);
    }

    public final Stream c(Stream stream) {
        Map map = (Map) this.c.h.g();
        return (map == null || map.isEmpty()) ? stream : stream.filter(new zx1(map, (byte) 19));
    }

    public final List e() {
        return (List) ((List) ((kze) this.f.g).g()).stream().filter(new zx1(this, (byte) 20)).collect(Collectors.toList());
    }

    public final String f() {
        return this.e.z("wallpaper_rotation_category");
    }

    public final boolean g() {
        return this.e.i("wallpaper_rotation_enabled");
    }

    public final ArrayList h() {
        ArrayList arrayList = new ArrayList();
        ami amiVar = this.f;
        List<aln> list = Stream.-EL.toList(c(((List) ((kze) amiVar.g).g()).stream()));
        List list2 = (List) ((kze) ((s14) amiVar.d).f).g();
        List list3 = (List) ((kze) amiVar.h).g();
        List listE = e();
        int iF = 0;
        if (!listE.isEmpty()) {
            arrayList.add(new bkn((aln) listE.get(0), 22));
        }
        if (!list2.isEmpty()) {
            arrayList.add(new bkn((aln) list2.get(0), 1));
        }
        if (!list3.isEmpty()) {
            arrayList.add(new bkn((aln) list3.get(0), 23));
        }
        for (aln alnVar : list) {
            if (!vep.e(alnVar.f(), iF) && !vep.e(alnVar.f(), 1) && alnVar.getType() == 2) {
                arrayList.add(new bkn(alnVar, alnVar.f()));
            }
            iF = alnVar.f();
        }
        return arrayList;
    }

    public final String i() {
        return this.e.z("wallpaper_current");
    }

    public final ArrayList j() {
        List<aln> listE;
        String strI = i();
        ami amiVar = this.f;
        List list = (List) ((kze) amiVar.g).g();
        ArrayList arrayList = new ArrayList();
        list.stream().filter(new n0h(strI, (byte) 3)).findFirst().ifPresent(new pv1(arrayList, (byte) 9));
        if (f().isEmpty()) {
            listE = e();
        } else {
            int iA = am2.a(f());
            int iA2 = vep.A(iA);
            listE = iA2 != 0 ? iA2 != 21 ? iA2 != 22 ? (List) c(list.stream().filter(new z3g((byte) 2, iA))).collect(Collectors.toList()) : (List) ((kze) amiVar.h).g() : e() : (List) ((kze) ((s14) amiVar.d).f).g();
        }
        for (aln alnVar : listE) {
            if (!alnVar.getId().equals(strI)) {
                arrayList.add(alnVar);
            }
        }
        return arrayList;
    }

    public final ArrayList k(Set set) {
        HashMap map = new HashMap();
        for (aln alnVar : (List) ((kze) this.f.g).g()) {
            map.put(alnVar.getId(), alnVar);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (map.containsKey(str)) {
                arrayList.add((aln) map.get(str));
            }
        }
        return arrayList;
    }

    public final void l(String str, int i, Callback callback) {
        this.f.k(str, i, new iyk(this, callback, (byte) 14));
    }

    public final void m(String str) {
        vzk vzkVar = this.j;
        ((ArrayList) vzkVar.d).remove(str);
        vzkVar.i0();
        if (((List) ((kze) vzkVar.c).g()).isEmpty() && f().equals("favorites")) {
            o(false);
            n("most_popular");
        }
    }

    public final void n(String str) {
        this.o.u(str, new eek((Object) this, (Object) str, (byte) 24));
        ((kze) this.n.get()).r(j());
        if (g()) {
            ava.a.a(new nln(this, (byte) 0));
        }
    }

    public final void o(boolean z) {
        agm agmVar = this.o;
        onn onnVar = (onn) agmVar.d;
        ru9 ru9Var = (ru9) agmVar.c;
        onnVar.a();
        ((SettingsManager) agmVar.b).V(z ? 1 : 0, "wallpaper_rotation_enabled");
        onnVar.d(z, true);
        if (!z) {
            nv6 nv6VarB = ru9Var.b();
            ((SharedPreferences.Editor) nv6VarB.a).putLong("wallpaper.rotation.timestamp", Long.MAX_VALUE);
            nv6VarB.w();
        } else {
            long jCurrentTimeMillis = System.currentTimeMillis();
            nv6 nv6VarB2 = ru9Var.b();
            ((SharedPreferences.Editor) nv6VarB2.a).putLong("wallpaper.rotation.timestamp", jCurrentTimeMillis);
            nv6VarB2.w();
        }
    }

    public final void p(int i, String str) {
        this.l.getClass();
        qs7.p = str;
        boolean z = false;
        this.f.k(str, 0, new tt2((Object) this, i, (byte) 7));
        if (str.equals(i())) {
            a(new vk2((byte) 26), 1);
            return;
        }
        if (i != 7 && i != 13 && i != 16) {
            z = true;
        }
        SettingsManager settingsManager = this.e;
        if (z && !settingsManager.a.contains("manual_wallpaper_first_occurrence")) {
            settingsManager.W(System.currentTimeMillis(), "manual_wallpaper_first_occurrence");
        }
        settingsManager.Y("wallpaper_current", str);
        i7f i7fVar = this.q;
        g7f g7fVarC = u35.c(i7fVar, i7fVar);
        while (g7fVarC.hasNext()) {
            u4j u4jVar = (u4j) g7fVarC.next();
            if (z) {
                ((y3i) u4jVar.a.get()).n(t4j.a);
            } else {
                u4jVar.getClass();
            }
        }
    }

    public final void q(Set set) {
        pde pdeVar = (pde) this.k.b;
        LinkedHashSet linkedHashSetM0 = CollectionsKt.m0((Iterable) pdeVar.g());
        linkedHashSetM0.addAll(set);
        xf8.F0(pdeVar, linkedHashSetM0);
    }

    public final void r() {
        if (((vq8) this.f.e).i()) {
            ((kze) this.n.get()).r(j());
            n(f());
        }
    }
}
