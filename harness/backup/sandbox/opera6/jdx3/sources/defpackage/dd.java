package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class dd extends o73 {
    public final fd j;
    public final List k;
    public final LinkedHashMap l;
    public dkf m;
    public Resources n;
    public m66 o;
    public View p;

    public dd(fd fdVar) {
        this(fdVar, Collections.singletonList(new zc(pc.p)));
    }

    public dd(fd fdVar, List list) {
        this.j = fdVar;
        this.k = list;
        this.l = new LinkedHashMap();
    }

    @Override // defpackage.o73
    public final void m(r9i r9iVar, View view) {
        dkf dkfVar = (dkf) r9iVar.b;
        this.m = dkfVar;
        this.n = dkfVar.getResources();
        this.o = (m66) r9iVar.c;
        this.p = view;
        List list = this.k;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            fd fdVar = this.j;
            ad adVar = ad.a;
            if (!zHasNext) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    bd bdVar = (bd) obj;
                    if (bdVar instanceof zc) {
                        pc pcVar = ((zc) bdVar).a;
                        m66 m66Var = this.o;
                        if (m66Var == null) {
                            m66Var = null;
                        }
                        int iOrdinal = pcVar.ordinal();
                        rxh rxhVar = pcVar.a.b;
                        itd itdVar = this.n;
                        ptd ptdVarA = m66Var.a(0, iOrdinal, 0, rxhVar.a(itdVar != null ? itdVar : null));
                        jf jfVarE = fdVar.e(pcVar);
                        if (jfVarE == null) {
                            jfVarE = fd.e;
                        }
                        cd cdVar = new cd(pcVar, jfVarE);
                        q(ptdVarA, cdVar);
                    } else if (!Intrinsics.a(bdVar, adVar)) {
                        h9o.p();
                        return;
                    } else if (!Intrinsics.a(bdVar, CollectionsKt.K(arrayList)) && !Intrinsics.a(bdVar, CollectionsKt.Q(arrayList))) {
                        itd itdVar2 = this.o;
                        ptd ptdVarA2 = (itdVar2 != null ? itdVar2 : null).a(0, 0, 0, "");
                        ptdVarA2.setActionView(2131558670);
                        ptdVarA2.setEnabled(false);
                    }
                }
                a26.V(fdVar, ((o66) r9iVar.d).F, new yc(this, (byte) 0));
                return;
            }
            Object next = it.next();
            bd bdVar2 = (bd) next;
            if (bdVar2 instanceof zc) {
                if (fdVar.e(((zc) bdVar2).a) != null) {
                }
            } else if (!Intrinsics.a(bdVar2, adVar)) {
                h9o.p();
                return;
            }
            arrayList.add(next);
        }
    }

    @Override // defpackage.dog
    public final boolean onMenuItemClick(MenuItem menuItem) {
        cd cdVar = (cd) this.l.get(menuItem);
        if (cdVar == null) {
            return false;
        }
        Function2 function2 = cdVar.b.a;
        View view = this.p;
        if (view == null) {
            view = null;
        }
        function2.invoke(view, new ef(af.a));
        return true;
    }

    public final void q(MenuItem menuItem, cd cdVar) {
        jf jfVar = cdVar.b;
        xc xcVar = jfVar.c;
        if (xcVar == null) {
            xcVar = cdVar.a.a;
        }
        dkf dkfVar = this.m;
        if (dkfVar == null) {
            dkfVar = null;
        }
        int i = xcVar.a;
        rm5 rm5Var = xcVar.f;
        ol7 ol7VarI0 = j14.i0(i, dkfVar);
        if (!rm5Var.equals(uc.m)) {
            if (rm5Var.equals(vc.m)) {
                int i2 = b0j.d;
                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{ol7VarI0});
                layerDrawable.setId(0, 0);
                ol7VarI0 = new b0j(layerDrawable, 0);
            } else if (!(rm5Var instanceof wc)) {
                h9o.p();
                return;
            } else if (ol7VarI0 instanceof LayerDrawable) {
                ol7VarI0 = new b0j((LayerDrawable) ol7VarI0, 2131362631);
            }
        }
        rxh rxhVar = xcVar.b;
        Resources resources = this.n;
        menuItem.setTitle(rxhVar.a(resources != null ? resources : null));
        menuItem.setIcon((Drawable) ol7VarI0);
        menuItem.setEnabled(jfVar.d);
    }
}
